## **2.1. SECTOR PROFESIONAL Y PERFIL DE USUARIOS**

### **2.1.1. Caracterización del sector profesional**
PayClear pertenece al sector FinTech (Financial Technology), dentro de la línea de Gestión de Finanzas Personales y de los sistemas de pago P2P no bancarios. El sector se mueve impulsado por la frustración con las aplicaciones SaaS tradicionales (Splitwise, Tricount) por sus barreras de pago (paywalls), cuotas de registro y publicidad invasiva. Como respuesta, PayClear adopta un modelo Local-First, que garantiza la operatividad sin conexión a Internet y respeta de forma nativa el principio de privacidad por diseño.



**Tabla descriptiva del sector y modelo de negocio**
| Criterio | Sector SaaS Comercial (Splitwise, Tricount) | Modelo *Local-First* (PayClear) |
| :--- | :--- | :--- |
| **Ámbito** | Finanzas Personales en la Nube (Cloud PFM) | PFM Local-First y Optimización Algorítmica P2P |
| **Persistencia** | Servidores remotos de terceros | Almacenamiento local en el equipo (JSON) |
| **Conexión** | Conexión obligatoria a Internet | Operatividad 100% offline |
| **Modelo** | Suscripción Premium y banners publicitarios | Gratuito sin anuncios / Licencia Marca Blanca B2B |
| **Privacidad** | Registro de email/teléfono obligatorio | Minimización de datos: cero datos personales |

### **2.1.2. Segmentación de perfiles de usuario (User Personas)**

**Ficha 1: Carlos Gómez – El tesorero del piso (Perfil Gestor / Ordenador)** 

Carlos tiene 23 años, estudia y vive en un piso compartido. Es la persona organizada de la casa que se encarga de llevar al día las facturas de la luz, el agua y el alquiler desde su ordenador portátil. 

-   **Nivel tecnológico:** Maneja bien los ordenadores. Le gusta usar la hoja de cálculo (Excel) y prefiere usar atajos de teclado antes que estar haciendo clic con el ratón para ir más rápido. 
-   **¿Qué necesita?:** Apuntar los gastos de forma rápida, ver en una sola pantalla todos los números claros del piso sin dar vueltas por menús complicados y guardar una copia de seguridad de las cuentas por si acaso. 
-   **¿Cómo responde PayClear en la pantalla?:**
    -   Toda la información del piso se muestra en una única ventana fácil de entender.
    -   Se puede mover por los campos de texto usando solo la tecla Tabulador y confirmar con Enter, sin necesidad de tocar el ratón.
    -   Permite guardar las cuentas directamente como un archivo en su propio ordenador para tenerlo siempre a salvo.

**Ficha 2: Sofía Martínez – La compañera de piso (Perfil Usuario / Móvil)**

Sofía tiene 20 años y comparte piso con Carlos. Usa la aplicación desde su teléfono móvil sobre la marcha (al salir del supermercado o en la cafetería), muchas veces sin internet o sin cobertura.

-   **Nivel tecnológico:** Normal. Usa el móvil a diario para redes sociales y mensajería, por lo que busca cosas visuales, sencillas y directas.
-   **¿Qué necesita?:** Apuntar un ticket de la compra en un par de segundos y saber de un vistazo rápido si le deben dinero o si le toca pagar a ella.
-   **¿Cómo responde PayClear en la pantalla?:**
    -   Usa tarjetas de colores muy claras y fáciles de leer para cualquier persona:
        -   **Verde:** Le deben dinero a ella.
        -   **Rojo:** Ella debe dinero a sus compañeros.
        -   **Gris:** Las cuentas están a cero (saldadas).
    -   Incluye un botón sencillo para abrir una calculadora rápida que divide el ticket en partes iguales o personalizadas sin complicaciones.

**Ficha 3: Javier Ruiz – El gestor del edificio de alquiler (Buyer Persona / Cliente Empresa)**

Javier tiene 38 años y trabaja gestionando una residencia de estudiantes o un edificio con varios pisos compartidos.

-   **Nivel tecnológico:** Medio-alto. Usa programas de gestión en su trabajo diario.
-   **¿Qué necesita?:** Recomendar a los inquilinos una herramienta para que gestionen sus gastos sin pelearse, pero sin que su empresa tenga que pagar cuotas mensuales de servidores ni responsabilizarse de guardar datos personales (correos, teléfonos o tarjetas de crédito) de los jóvenes.
-   **¿Cómo responde PayClear en la pantalla?:**
    -   Al no guardar datos en internet ni en la nube (todo se guarda dentro del móvil u ordenador de los propios usuarios), la empresa de Javier no gasta dinero en servidores ni se expone a problemas con las leyes de protección de datos.
    -   Permite personalizar la aplicación con la marca o logo del edificio si la empresa quiere ofrecerla como un servicio extra a sus inquilinos.

--- 
 ## 2.2 Análisis de la necesidad

 ### 2.2.1 En que consiste

 - Durante nuestra investigacion hemos llegado a la conclusion de que la problematica principal se encuentra en las personas jovenes que comparten piso y las que necesiten una division de cuentas rapida para determinadas operaciones y asi puedan mejorar su estado financiero poco a poco. 

La carencia a resolver la he encontrado en diversos artículos pero este lo resume muy bien:  https://www.linkedin.com/pulse/d%C3%A9ficit-de-educaci%C3%B3n-financiera-en-los-j%C3%B3venes-un-con-villalobo-w8b5f/
El resto estará en la bibliografía de la memoria

### 2.2.2 Diagnóstico de la situación de partida (As-Is). 

En estos momento la gestion de gastos compartidos entre personas se suele realizar en programas poco adaptados a el publico general y manualmente en hojas fisicas:

1. **Cálculo manual sobre soporte físico:**  
   Recopilación física de tiques de caja y anotaciones en pizarras comunes o blocs de notas. La division de estas cuentas se suele realizar en calculadoras de telefonos moviles y luego se anota en fisico o digital , algo que consume tiempo y esfuerzo innecesario.
2. **Hojas de cálculo:**  
   Personas con mas conocimiento informatico dedica tiempo a crear su propio sistema de deudas en excel, algo funcional pero poco accesible para el dia a dia, una aplicacion dedicada solucionaria tener que crear tu propio sistema de division de cuentas.
 3. **Aplicaciones dedicadas:**  
   Pese a que no seamos los inventores del concepto, si venimos a mejorarlo, y es que aplicaciones como spliwise necesitan de un log previo, contiene anuncios y micropagos, y las funciones que queremos implementar seran accesibles en la pantalla principal, a diferencia de los competidores que tienes que moverte por varios menus.

   ### 2.2.3 Problemas y consecuencias identificadas. 

  - Nos hemos encontrado que las personas encontraban ineficiente el uso de la calculadora al momento de realizar esa clase de divisiones de cuenta ya que consumia tiempo, comeduras de cabeza y la gran cantidad de veces alguien salia pagando mas que los demas. Profundizando un poco hemos encontrado articulos que respaldan la necesidad de una aplicacion que gestione esas deudas y cuentas pendientes y es que en las escuelas no hay la educacion financiera minima que deberian de tener los jovenes no solo para su futuro si no para la gestion de su dinero el dia a dia.

   ### 2.2.4 Propuesta de valor y situación deseada (To-Be) 

  - Nuestra aplicacion pretende solucionar los problemas de las personas anteriormente mencionadas creando una aplicacion cuyo unico objetivo sea ajustar cuentas de forma eficiente y tener un balance de cuanto te deben y depes para saber si en el censo acabaras ganando o perdiendo, sin tener en cuenta tus cuentas de banco.
  ### 2.2.5 Flujo actual VS Flujo propuesto

<img width="532" height="550" alt="Image" src="https://github.com/user-attachments/assets/6b1dae5c-3b35-4493-beec-ee18fb89ad53" />

   ### 2.2.6 Necesidades funcionales y operativas de alto nivel

Para solucionar los fallos detectados en el modelo actual y lograr el flujo propuesto, el desarrollo de la aplicación se fundamenta en los siguientes requerimientos clave:

- **Funcionamiento 100% Local (Local-First):** La herramienta debe ser capaz de ejecutar todas sus funciones sin conexión a internet ni necesidad de registro previo, garantizando la privacidad absoluta de las cuentas del piso y eliminando tiempos de espera por servidores.
- **Registro de gastos en un solo paso:** La opción de añadir un nuevo gasto o tique tiene que estar accesible directamente desde la pantalla principal para evitar navegación innecesaria por menús.
- **Cálculo instantáneo de saldos:** El sistema debe calcular y mostrar de forma clara quién está en estado de "Acreedor" (le deben dinero) y quién de "Deudor" (debe dinero), aplicando etiquetas legibles para cualquier usuario.
- **Optimización del reparto de deudas:** Implementación de una lógica interna que reduzca las transacciones del grupo al mínimo número de pagos posibles entre compañeros.
- **Almacenamiento persistente en equipo:** Guardado automático de los datos de cada grupo en archivos locales para conservar la información intacta al cerrar el programa.


Fuentes: 
- La Razón (Sección Económica)
https://www.larazon.es/economia/parejas-pisos-compartidos-error-financiero-que-mas-conflictos-esta-generando-este-ano-3v3rfin_2026031369b3d47fd489bf782e18a535.html

- Focus Market (ambito)
[Focus Market / Fintech Naranja X. (https://www.ambito.com/finanzas/un-estudio-revela-que-el-manejo-del-dinero-genera-conflictos-mas-del-30-las-parejas-y-familias-n6333874)](https://www.ambito.com/finanzas/un-estudio-revela-que-el-manejo-del-dinero-genera-conflictos-mas-del-30-las-parejas-y-familias-n6333874) 

Resto de fuentes se basa en la encuesta realizada en el sprint1 y experiencias personales que nos ha llevado a pensar en esta aplicación como solución.
---

## 2.3. Estudio de soluciones existentes

###  2.3.1. ¿En qué consiste?
Para saber si de verdad nuestra app vale la pena, hemos hecho un análisis comparativo de mercado (*benchmarking*). El objetivo ha sido probar las aplicaciones reales que usa la gente hoy en día para dividir gastos y ver qué fallos o limitaciones tienen. Así podemos justificar por qué **PayClear** aporta un valor diferencial y resuelve mejor el problema en un entorno de piso compartido.

---

### 2.3.2. Lo que hemos analizado y comparado

### 2.3.2.1. Identificación de software competidor
Hemos seleccionado 3 alternativas reales del mercado que la gente suele utilizar para esto:

- **Splitwise:** Es la aplicación más famosa y usada del mundo para dividir gastos en grupo.
- **Tricount:** Otra alternativa muy conocida, enfocada sobre todo en viajes de grupo y cuentas sencillas.
- **Splid:** Una app móvil pensada para repartir gastos de forma rápida y con opción de funcionar sin internet.

---

###  2.3.2.2. Análisis comparativo de los competidores

- **Splitwise:**
  - *Lo bueno:* La conoce todo el mundo y calcula bien las deudas.
  - *Lo malo:* Su versión gratuita actual limita a meter como máximo 3 o 4 gastos al día, mete anuncios molestos y te obliga a pagar una suscripción mensual para quitar los límites. Además, te exige crearte una cuenta con correo obligatoriamente y depender de sus servidores.
- **Tricount:**
  - *Lo bueno:* No tiene el límite de gastos diarios de Splitwise y es bastante fácil de usar.
  - *Lo malo:* Te pide registro para gestionar varios grupos y su interfaz se centra más en viajes temporales que en la gestión diaria de un piso. Tampoco tiene una app de escritorio nativa orientada al ordenador.
- **Splid:**
  - *Lo bueno:* Deja usarla sin registro previo para empezar y tiene modo sin conexión.
  - *Lo malo:* Está pensada solo para móviles (iOS/Android). Si estás en el ordenador estudiando o trabajando y quieres meter los tiques del piso, no tienes una versión de escritorio cómoda. Además, la versión gratis limita el número de grupos que puedes crear.

---

  ### 2.3.2.3. Matriz comparativa de soluciones de mercado

| Parámetro / Característica | Splitwise | Tricount | Splid | PayClear (Nuestra propuesta) |
| :--- | :---: | :---: | :---: | :---: |
| **Coste / Modelo de negocio** | Gratis con recortes / Suscripción Pro | Gratis con anuncios / Pagos integrados | Gratis limitado / Pago único Plus | **100% Gratuito y sin micropagos** |
| **Límite de registros diarios** |  Máximo 3-4 gastos al día (gratis) | Img / Sin límite | Img / Sin límite | **Sin ningún límite de entradas** |
| **Uso sin registro (Sin cuenta)** |  Obligatorio crear cuenta y correo |  Parcial | Img / Permite uso sin cuenta | **100% Sin registro ni correo** |
| **Privacidad y almacenamiento** | Servidores en la nube (Requiere internet) | Servidores en la nube (Requiere internet) | Almacenamiento local / nube parcial | **100% Local-First (JSON en tu equipo)** |
| **Entorno de uso prioritario** | Móvil / Web | Móvil / Web | Exclusivo Móvil (iOS/Android) | **Escritorio nativo (Windows, Mac, Linux)** |
| **Curva de aprendizaje** | Media (Menús anidados y ajustes) | Fácil (Centrado en viajes) | Muy fácil | **Inmediata (Acciones a 1 clic)** |


###  2.3.2.4. Justificación de la propuesta (Ventaja competitiva)

Al analizar las alternativas del mercado nos dimos cuenta de que las apps actuales están pensadas casi siempre para móviles y enfocadas a sacarte el dinero con suscripciones o anuncios insoportables justo cuando vas a meter la compra del piso. 

La gran ventaja competitiva de **PayClear** es que es una herramienta de escritorio **100% local, gratuita y privada**: no necesitas crearte cuenta de usuario, tus datos no se suben a ningún servidor de internet, no hay límites de tiques diarios y puedes gestionar las cuentas de tu piso en un segundo desde tu propio ordenador mientras estudias o trabajas, sin rodeos ni menús complicados.

---

Fuentes:

- Split Circle (Límites de Splitwise)
https://split-circle.com/en/blog/splitwise-daily-limit

- Público (Comparativa Splitwise, Splid y Tricount)
https://www.publico.es/ahorro-inteligente/splitwise-splid-tricount-mejores-apps-compartir-gastos.html

- La Razón (Apps para compartir gastos)
https://www.larazon.es/tecnologia-consumo/aplicaciones/aplicaciones-dividir-compartir-gastos-cuentas_20210224699470161817b41eb64e05b2.html

---

# 2.4. Partes interesadas

| Rol | Tipo | Categoría | Expectativas Principales | Nivel de Influencia | Estrategia de Comunicación Recomendada |
| :--- | :---: | :---: | :--- | :---: | :--- |
| **Equipo Scrum** | Interno | Primario | Claridad en los requisitos, reparto tareas y cumplimiento de plazos sin sobrecarga. | **Alto**<br>*(Gestionar el proyecto)* | *Daily Scrums* de 15 min, gestión en tiempo real mediante tablero Kanban y *Sprint Retrospectives*. |
| **Tribunal Evaluador** | Interno | Primario | Cumplimiento de los criterios de los RA, analizar documentación en Git, calidad técnica del código y demostrar la viabilidad del proyecto. | **Alto**<br>*(Gestionar de cerca)* | Presentaciones formales en cada *Sprint Review*, entrega puntual de capítulos en Markdown y seguimiento en tutorías. |
| **Usuarios Finales** | Externo | Primario | Aplicación gratuita, sin anuncios ni registros obligatorios, aplicación *offline* y que liquidación de deudas rápidas. | **Alto**<br>*(Mantener informados)* | Encuestas de validación, pruebas de usabilidad con prototipos interactivos y changelogs. |
| **Organismos Reguladores (AEPD, UE - RGPD / UNE)** | Externo | Secundario | Cumplimiento de privacidad, derechos de autor y accesibilidad WCAG 2.1 AA. | **Medio**<br>*(Mantener satisfechos)* | Auditoría interna de cumplimiento legal en la Memoria Técnica y redacción de políticas de privacidad y licencias en el repositorio. |
| **Proveedores Tecnológicos (GitHub, Flutter, Oracle...)** | Externo | Secundario | Respeto a las licencias de software libre y uso de sus APIs y librerías. | **Bajo**<br>*(Monitorizar)* | Control de licencias en la documentación técnica y seguimiento de *releases* oficiales en repositorios. |
| **Competidores(Splitwise, Tricount, Settle Up)** | Externo | Secundario | Mantener su mercado y rentabilizar sus modelos de suscripción. | **Bajo**<br>*(Monitorizar)* | Análisis de *benchmarking* periódico para vigilar cambios en sus métodos de monetización y mantener la ventaja competitiva de PayClear. |


## 2.5. Estudio de viabilidad técnica

### 2.5.1. Pila tecnológica

* **Escritorio:** **Java 17** con **Java Swing** y la librería **FlatLaf** para poder tener una interfaz gráfica en más moderna en NetBeans Matisse.
* **Móvil (penultima fase):** **Flutter (con Dart)** para compilar en Android.
* **Persistencia y Seguridad:** Almacenamiento en local con **ficheros JSON** (usando la librería **Gson**) y proteger el acceso con **SHA-256**.
* **Calidad y Pruebas:** **JUnit 5** para testear la lógica contable y el algoritmo voraz para las liquidaciones. 

<img width="1280" height="720" alt="Image" src="https://github.com/user-attachments/assets/f7ef95dd-6880-4ed1-a682-f7a52cac40dc" />

### 2.5.2. Requisitos de hardware y despliegue

### Sistemas Operativos

| Sistema Operativo | Arquitectura / Procesador | Versiones Compatibles |
| :--- | :--- | :--- |
| **Windows** | x86_64 | Windows 10, 11<br>Server 2016, 2019, 2022, 2025 |
| **Linux** | x64, AArch64 | Red Hat / RHEL 8, 9, 10 |
| **Ubuntu** | x86_64 | 24.04 LTS, 25.04 |
| **macOS** | Intel (x64) / Apple Silicon (ARM64) | macOS 12 Monterey o posterior  |

### Requisitos de Hardware

| Componente | Requisito Mínimo | Recomendado |  
| :--- | :--- | :--- | 
| **Memoria RAM** | 8 GB | 8 GB o más | 
| **Espacio en Disco** | 300 MB *(solo JDK)* | 10 GB – 20 GB+ | 

### 2.5.3. Curva de aprendizaje y madurez técnica
- **Tecnologías dominadas:** Tenemos una base de principiantes en **Java**, POO y diseñar en **Swing/Matisse**.
- **Formación necearia:** Usar **FlatLaf** y **Gson** requiere una curva de aprendizaje pequeñas (entre 1 y 2 días). Adaptarlo a **Flutter/Dart** tiene una curva media que se asume en la fase final gracias a su similitud sintáctica con Java y las clases dadas en la asignatura `Programación Multimedia y Dispositivos Móviles`

### 2.5.4. Ficha técnica y conclusión

| Parámetro | Especificación del Proyecto |
| :--- | :--- |
| **Arquitectura** | Local-First / Patrón Modelo Vista Controlador |
| **Lenguajes y Entornos** | Java 17+ (NetBeans) y Dart (Flutter en Android Studio) |
| **Interfaz Gráfica (UI)** | Java Swing + FlatLaf / Componentes propios (JavaBeans) |
| **Persistencia y Seguridad** | Ficheros locales `.json` (con Gson) + encriptación Hash SHA-256 |
| **Testing y Despliegue** | JUnit 5 / Ejecutable `.jar` (Escritorio) y `.apk` (Android) |

**Conclusión de viabilidad:** El proyecto es **viable**. No necesita de infraestructura en la nube y usa tecnologías conocidas en el equipo, se garantiza el desarrollo y despliegue del software sin costes técnicos externos y dentro de los plazos del curso.

---

## Fuentes:

**Java21:** https://docs.oracle.com/es-ww/iaas/jms/doc/system-requirements.html , https://www.igmguru.com/blog/how-to-install-java

**FlatLaf:** https://www.reddit.com/r/java/comments/lsbcwe/flatlaf_10_swing_look_and_feel/?tl=es-es , https://github.com/JFormDesigner/FlatLaf

**Gson:** https://dam.org.es/gson/ , https://ironpdf.com/es/java/blog/java-help/gson-java/

**JUnit5:** https://es.parasoft.com/glossary/junit/ , https://www.arquitecturajava.com/junit-5-novedades-y-buenas-practicas/

---

## 2.6. Estudio de viabilidad económica

### 2.6.1. ¿En qué consiste?

Este apartado evalúa los costes y recursos financieros necesarios para desarrollar, implantar y mantener la aplicación PayClear. El objetivo es verificar que el proyecto es económicamente sostenible a lo largo de su ciclo de vida. El objetivo es poder verificar que el proyecto sea económicamente sostenible durante el ciclo de vida de esta aplicación. Ya que es una aplicación "Local-First" se reducen los costes drásticamente al no depender de servidores en la nube de pago recurrente.

### 2.6.2. Estimación de costes de desarrollo (Personal)

* **Horas estimadas:** 120 horas totales (aprox. 40 horas por alumno).
* **Tarifa horaria simulada:** 10 €/hora (perfil desarrollador júnior).
* **Coste total de personal:** 120 horas × 10 €/h = 1.200,00 €.

### 2.6.3. Costes de infraestructura, licencias e indirectos

* **Infraestructura (Hardware):** **0 €**. Se han utilizado los ordenadores portátiles personales de los alumnos, por lo que no ha sido necesaria ninguna inversión en equipos.

* **Licencias de Software:** **0 €**. Todo el desarrollo se ha realizado con herramientas de código abierto (Java Swing, FlatLaf, Apache NetBeans) y licencias educativas gratuitas (Figma Education, GitHub Free).

* **Costes indirectos y mantenimiento:** Se asignan **40 €** para cubrir los gastos de electricidad y de internet durante el trabajo en casa. Al funcionar sin internet, el coste de mantenimiento de servidores cuando se lance el producto será inexistente.

### 2.6.4. Presupuesto desglosado

| Partida Presupuestaria | Concepto | Coste Estimado (€) |
| :--- | :--- | :--- |
| **Personal** | 3 alumnos simulando tarifa Júnior (120h a 10 €/h) | 1.200,00 € |
| **Hardware** | Equipos personales de los alumnos | 0,00 € |
| **Software / Servicios** | Licencias educativas y código abierto | 0,00 € |
| **Gastos Indirectos** | Uso de electricidad e internet personal de cada uno | 40,00 € x 3 = 120,00€ |
| **Subtotal** | Costes directos e indirectos | **1.200,00 €** |
| **Imprevistos** | Margen para imprevistos (simulado) | 120,00 € |
| **TOTAL PRESUPUESTO** | Coste total de la simulación del proyecto | **1.320,00 €** |

### 2.6.5. Análisis del Retorno de la Inversión (ROI) y ahorro de costes

Dado que PayClear es un proyecto académico sin fines de lucro, nos enfocaremos en el valor que aportaremos  y el ahorro final (ROI: indicador financiero que mide la rentabilidad de un proyecto comparando el beneficio que se obtiene con el coste que ha supuesto desarrollarlo.) : 
* **Ahorro económico:** Evita al usuario pagar suscripciones (como los aprox. 30-40 € anuales de alternativas comerciales como Splitwise Pro) para tener funciones ilimitadas.
* **Mantenimiento sostenible:** Al guardar toda la información localmente en formato JSON en el equipo del usuario, el proyecto no va a necesitar inversión continua en servidores y servicios en la nube. Una vez entregado el código, la aplicación funciona de forma autónoma y gratuita a largo plazo. 

**Fuentes de referencia (Bibliografía directa):**

* **Precio hora programador: cuánto cobra un desarrollador** (Justificacion de la tarifa de 10 €/hora para un júnior).
  Enlace: https://yeeply.com/blog/partners/precio-hora-programador-cuanto-cobra-desarrollador-de-software/
* **Splitwise Pro: precio, qué incluye y si vale la pena** (Justificacion el coste real de la suscripción anual de hasta 47,99 € en España).
  Enlace: https://www.spliteo.app/blog/es/precio-de-splitwise-pro/
* **Metodo ROI: BBVA** 
  Enlace: https://www.bbva.com/es/empresas/roi-que-es-el-retorno-de-la-inversion-y-cual-es-su-formula/

