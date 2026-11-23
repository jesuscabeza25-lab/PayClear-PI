
/**
 *
 * @author Equipo PayClear
 */

import com.payclear.componente.TarjetaSaldoParticipante;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class TarjetaSaldoParticipanteTest {

    private static int pasadas = 0;
    private static int falladas = 0;

    public static void main(String[] args) {
        ejecutar("1. Unitaria: Estado inicial por defecto", TarjetaSaldoParticipanteTest::testEstadoInicialPorDefecto);
        ejecutar("2. Unitaria: Estados, colores y tolerancia 0.005", TarjetaSaldoParticipanteTest::testEstadosYColoresConTolerancia);
        ejecutar("3. Unitaria: Eventos PropertyChangeListener", TarjetaSaldoParticipanteTest::testEventosPropertyChange);
        ejecutar("4. Unitaria: Accesibilidad NVDA", TarjetaSaldoParticipanteTest::testAccesibilidadNVDA);
        ejecutar("5. UI Automatizada: Clic izquierdo y hover", TarjetaSaldoParticipanteTest::testAutomatizacionRaton);
        ejecutar("6. UI Automatizada: Pulsacion tecla Enter", TarjetaSaldoParticipanteTest::testAutomatizacionTeclado);
        ejecutar("7. Seguridad y Robustez: Entradas nulas y extremas", TarjetaSaldoParticipanteTest::testSeguridadYRobustez);
        ejecutar("8. Rendimiento y Recursos: Estres 500 tarjetas", TarjetaSaldoParticipanteTest::testUsoDeRecursosYEstres);

        System.out.println("\n========================================");
        System.out.println("RESUMEN QA: " + pasadas + " PASADAS | " + falladas + " FALLADAS");
        System.out.println("========================================");
        if (falladas > 0) {
            System.exit(1);
        }
    }

    @FunctionalInterface
    interface Prueba {
        void run() throws Exception;
    }

    private static void ejecutar(String nombre, Prueba prueba) {
        try {
            prueba.run();
            pasadas++;
            System.out.println("[PASS] " + nombre);
        } catch (Throwable e) {
            falladas++;
            System.out.println("[FAIL] " + nombre + " -> " + e.getMessage());
        }
    }

    private static void verificar(boolean condicion, String mensaje) {
        if (!condicion) {
            throw new AssertionError(mensaje);
        }
    }

    private static void verificarIgual(Object esperado, Object actual, String mensaje) {
        if (!Objects.equals(esperado, actual)) {
            throw new AssertionError(mensaje + " (esperado: " + esperado + ", actual: " + actual + ")");
        }
    }

    private static void testEstadoInicialPorDefecto() {
        TarjetaSaldoParticipante tarjeta = new TarjetaSaldoParticipante();
        verificarIgual("Participante", tarjeta.getNombreParticipante(), "Nombre inicial incorrecto");
        verificar(Math.abs(tarjeta.getSaldoActual() - 0.0) < 0.0001, "Saldo inicial distinto de 0");
        verificarIgual(TarjetaSaldoParticipante.Estado.SALDADO, tarjeta.getEstado(), "Estado inicial incorrecto");
        verificarIgual(new Color(0x59665E), tarjeta.getColorEstado(), "Color inicial incorrecto");
        verificar(tarjeta.isFocusable(), "La tarjeta debe ser focusable");
    }

    private static void testEstadosYColoresConTolerancia() {
        TarjetaSaldoParticipante tarjeta = new TarjetaSaldoParticipante();

        tarjeta.setSaldoActual(25.50);
        verificarIgual(TarjetaSaldoParticipante.Estado.ACREEDOR, tarjeta.getEstado(), "Debe ser ACREEDOR");
        verificarIgual(tarjeta.getColorAcreedor(), tarjeta.getColorEstado(), "Color acreedor incorrecto");

        tarjeta.setSaldoActual(-10.00);
        verificarIgual(TarjetaSaldoParticipante.Estado.DEUDOR, tarjeta.getEstado(), "Debe ser DEUDOR");
        verificarIgual(tarjeta.getColorDeudor(), tarjeta.getColorEstado(), "Color deudor incorrecto");

        tarjeta.setSaldoActual(0.004);
        verificarIgual(TarjetaSaldoParticipante.Estado.SALDADO, tarjeta.getEstado(), "0.004 debe ser SALDADO");

        tarjeta.setSaldoActual(-0.004);
        verificarIgual(TarjetaSaldoParticipante.Estado.SALDADO, tarjeta.getEstado(), "-0.004 debe ser SALDADO");
    }

    private static void testEventosPropertyChange() {
        TarjetaSaldoParticipante tarjeta = new TarjetaSaldoParticipante();
        AtomicReference<PropertyChangeEvent> eventoSaldo = new AtomicReference<>();
        AtomicReference<PropertyChangeEvent> eventoNombre = new AtomicReference<>();

        tarjeta.addPropertyChangeListener(TarjetaSaldoParticipante.PROP_SALDO, eventoSaldo::set);
        tarjeta.addPropertyChangeListener(TarjetaSaldoParticipante.PROP_NOMBRE, eventoNombre::set);

        tarjeta.setNombreParticipante("Ana");
        tarjeta.setSaldoActual(42.75);

        verificar(eventoNombre.get() != null, "No se disparo evento de nombre");
        verificarIgual("Participante", eventoNombre.get().getOldValue(), "Valor antiguo de nombre incorrecto");
        verificarIgual("Ana", eventoNombre.get().getNewValue(), "Valor nuevo de nombre incorrecto");

        verificar(eventoSaldo.get() != null, "No se disparo evento de saldo");
        verificar(Math.abs((double) eventoSaldo.get().getOldValue() - 0.0) < 0.0001, "Valor antiguo de saldo incorrecto");
        verificar(Math.abs((double) eventoSaldo.get().getNewValue() - 42.75) < 0.0001, "Valor nuevo de saldo incorrecto");
    }

    private static void testAccesibilidadNVDA() {
        TarjetaSaldoParticipante tarjeta = new TarjetaSaldoParticipante();
        tarjeta.setNombreParticipante("Carlos");
        tarjeta.setSaldoActual(15.0);

        verificarIgual("Tarjeta de saldo de Carlos", tarjeta.getAccessibleContext().getAccessibleName(), "AccessibleName incorrecto");
        String desc = tarjeta.getAccessibleContext().getAccessibleDescription();
        verificar(desc != null && desc.contains("Carlos") && desc.contains("Le deben"), "AccessibleDescription incompleta");
    }

    private static void testAutomatizacionRaton() throws Exception {
        TarjetaSaldoParticipante tarjeta = new TarjetaSaldoParticipante();
        AtomicBoolean accionDisparada = new AtomicBoolean(false);
        AtomicReference<String> comandoRecibido = new AtomicReference<>();

        tarjeta.setNombreParticipante("Lucia");
        tarjeta.addActionListener(e -> {
            accionDisparada.set(true);
            comandoRecibido.set(e.getActionCommand());
        });

        Color colorBase = tarjeta.getBackground();

        SwingUtilities.invokeAndWait(() -> {
            MouseEvent entrar = new MouseEvent(tarjeta, MouseEvent.MOUSE_ENTERED, System.currentTimeMillis(), 0, 10, 10, 0, false);
            tarjeta.dispatchEvent(entrar);
            verificar(!Objects.equals(colorBase, tarjeta.getBackground()), "Hover no cambio el color de fondo");

            MouseEvent clic = new MouseEvent(tarjeta, MouseEvent.MOUSE_CLICKED, System.currentTimeMillis(), 0, 10, 10, 1, false, MouseEvent.BUTTON1);
            tarjeta.dispatchEvent(clic);

            MouseEvent salir = new MouseEvent(tarjeta, MouseEvent.MOUSE_EXITED, System.currentTimeMillis(), 0, 0, 0, 0, false);
            tarjeta.dispatchEvent(salir);
            verificarIgual(colorBase, tarjeta.getBackground(), "Al salir del hover debe volver al color base");
        });

        verificar(accionDisparada.get(), "El clic izquierdo no disparo ActionEvent");
        verificarIgual("Lucia", comandoRecibido.get(), "ActionCommand incorrecto");
    }

private static void testAutomatizacionTeclado() throws Exception {
        TarjetaSaldoParticipante tarjeta = new TarjetaSaldoParticipante();
        AtomicBoolean accionDisparada = new AtomicBoolean(false);
        tarjeta.addActionListener(e -> accionDisparada.set(true));

        SwingUtilities.invokeAndWait(() -> {
            KeyEvent presionar = new KeyEvent(tarjeta, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_ENTER, '\n');
            KeyEvent soltar = new KeyEvent(tarjeta, KeyEvent.KEY_RELEASED, System.currentTimeMillis(), 0, KeyEvent.VK_ENTER, '\n');
            for (java.awt.event.KeyListener kl : tarjeta.getKeyListeners()) {
                kl.keyPressed(presionar);
                kl.keyReleased(soltar);
            }
        });

        verificar(accionDisparada.get(), "La tecla Enter no disparo ActionEvent");
    }

    private static void testSeguridadYRobustez() {
        TarjetaSaldoParticipante tarjeta = new TarjetaSaldoParticipante();
        tarjeta.setNombreParticipante("Original");
        tarjeta.setNombreParticipante(null);
        tarjeta.setNombreParticipante("   ");
        verificarIgual("Original", tarjeta.getNombreParticipante(), "No debe aceptar nombres nulos ni vacios");

        Color acreedorOriginal = tarjeta.getColorAcreedor();
        tarjeta.setColorAcreedor(null);
        tarjeta.setColorDeudor(null);
        tarjeta.setColorSaldado(null);
        verificarIgual(acreedorOriginal, tarjeta.getColorAcreedor(), "No debe aceptar colores nulos");

        tarjeta.setSaldoActual(Double.MAX_VALUE);
        tarjeta.setSaldoActual(-Double.MAX_VALUE);
        tarjeta.setSaldoActual(Double.NaN);
        tarjeta.setNombreParticipante("<html><h1>Inyeccion</h1></html>");
    }

    private static void testUsoDeRecursosYEstres() {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long memoriaAntes = runtime.totalMemory() - runtime.freeMemory();
        long inicio = System.nanoTime();

        JPanel contenedor = new JPanel();
        for (int i = 0; i < 500; i++) {
            TarjetaSaldoParticipante t = new TarjetaSaldoParticipante();
            t.setNombreParticipante("Usuario " + i);
            t.setSaldoActual((i % 3 - 1) * 12.50);
            contenedor.add(t);
        }

        long duracionMs = (System.nanoTime() - inicio) / 1_000_000;
        long memoriaDespues = runtime.totalMemory() - runtime.freeMemory();
        long consumoKB = Math.max(0, (memoriaDespues - memoriaAntes) / 1024);

        verificarIgual(500, contenedor.getComponentCount(), "Deben existir 500 tarjetas en el panel");
        verificar(duracionMs < 2000, "Tardo demasiado: " + duracionMs + " ms");
        System.out.println("       -> Metricas estres (500 tarjetas): " + duracionMs + " ms | Memoria aprox: " + consumoKB + " KB");
    }
}