# Memoria del Proyecto Intermodular: PayClear

* Asignatura: Proyecto Intermodular
* Curso: 2º Desarrollo de Aplicaciones Multiplataforma (DAM)
  
COEVALUACIÓN SPRINT 2:

| Integrante | Nota (%) |
| :--- | :--- |
| Guillermo Eugui | 80% |
| Jesús Cabeza | 90% | 
| JoseLuís Segura | 85% |

---

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

- Plantilla de excel para ingresos y gastos
  https://www.planillaexcel.com/planilla-de-excel-para-control-de-ingresos-y-egresos

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

## 2.4. Partes interesadas

| Rol | Tipo | Categoría | Expectativas Principales | Nivel de Influencia | Estrategia de Comunicación Recomendada |
| :--- | :---: | :---: | :--- | :---: | :--- |
| **Equipo Scrum** | Interno | Primario | Claridad en los requisitos, reparto tareas y cumplimiento de plazos sin sobrecarga. | **Alto**<br>*(Gestionar el proyecto)* | *Daily Scrums* de 15 min, gestión en tiempo real mediante tablero Kanban y *Sprint Retrospectives*. |
| **Tribunal Evaluador** | Interno | Primario | Cumplimiento de los criterios de los RA, analizar documentación en Git, calidad técnica del código y demostrar la viabilidad del proyecto. | **Alto**<br>*(Gestionar de cerca)* | Presentaciones formales en cada *Sprint Review*, entrega puntual de capítulos en Markdown y seguimiento en tutorías. |
| **Usuarios Finales** | Externo | Primario | Aplicación gratuita, sin anuncios ni registros obligatorios, aplicación *offline* y que liquidación de deudas rápidas. | **Alto**<br>*(Mantener informados)* | Encuestas de validación, pruebas de usabilidad con prototipos interactivos y changelogs. |
| **Organismos Reguladores (AEPD, UE - RGPD / UNE)** | Externo | Secundario | Cumplimiento de privacidad, derechos de autor y accesibilidad WCAG 2.1 AA. | **Medio**<br>*(Mantener satisfechos)* | Auditoría interna de cumplimiento legal en la Memoria Técnica y redacción de políticas de privacidad y licencias en el repositorio. |
| **Proveedores Tecnológicos (GitHub, Flutter, Oracle...)** | Externo | Secundario | Respeto a las licencias de software libre y uso de sus APIs y librerías. | **Bajo**<br>*(Monitorizar)* | Control de licencias en la documentación técnica y seguimiento de *releases* oficiales en repositorios. |
| **Competidores(Splitwise, Tricount, Settle Up)** | Externo | Secundario | Mantener su mercado y rentabilizar sus modelos de suscripción. | **Bajo**<br>*(Monitorizar)* | Análisis de *benchmarking* periódico para vigilar cambios en sus métodos de monetización y mantener la ventaja competitiva de PayClear. |

## Fuentes Utilizadas:

BBVA. (2026, 7 de abril). Qué son los 'stakeholders' y cómo influyen en la estrategia empresarial - BBVA.com. https://www.bbva.com/es/empresas/que-son-los-stakeholders-y-como-influyen-en-la-estrategia-empresarial/

AEPD. (2019, 11 de julio). La AEPD publica un informe sobre el tratamiento de datos y borrado seguro - AEPD.es. https://www.aepd.es/prensa-y-comunicacion/notas-de-prensa/la-aepd-publica-un-informe-sobre-el-tratamiento-de-datos

---

## 2.5. Estudio de viabilidad técnica

### 2.5.1. Pila tecnológica (Tech Stack)

La selección de tecnologías responde a la necesidad de construir una solución desacoplada, ligera y con filosofía **Local-First**:

* **Entorno de Escritorio:** **Java 17 LTS** utilizando **Java Swing** junto con la librería de temas **FlatLaf**, lo que permite modernizar la apariencia gráfica sobre el diseñador visual Matisse de Apache NetBeans sin penalizar el rendimiento ni introducir dependencias pesadas.
* **Persistencia y Seguridad Local:** Almacenamiento local mediante ficheros planos estructurados en formato **JSON**, serializados y parseados con la librería **Gson** de Google. El control de acceso a la bóveda privada se valida mediante la función resumen criptográfica **SHA-256** con sal (*salt*) local, sin requerir servicios de autenticación externos.
* **Calidad y Pruebas Unitarias:** Integración de **JUnit 5** para auditar y verificar matemáticamente la lógica contable del modelo y el correcto funcionamiento de la heurística voraz de liquidación multilateral.
* **Extensión Móvil (Fase posterior):** **Flutter** y **Dart** para compilar binarios nativos en **Android**, reutilizando la arquitectura conceptual de los modelos contables definidos en escritorio.

<img width="1280" height="720" alt="Image" src="https://github.com/user-attachments/assets/f7ef95dd-6880-4ed1-a682-f7a52cac40dc" />


---

### 2.5.2. Requisitos de hardware y despliegue

### Compatibilidad de Sistemas Operativos (Entorno de Ejecución)

| Sistema Operativo | Arquitectura / Procesador | Versiones Compatibles Soportadas |
| :--- | :---: | :--- |
| **Windows** | x86_64 | Windows 10, 11 (y Windows Server 2016 o posterior) |
| **Linux** | x64, AArch64 | Ubuntu 22.04 LTS / 24.04 LTS, Debian 11+, Red Hat / Fedora |
| **macOS** | Intel (x64) / Apple Silicon (ARM64) | macOS 12 Monterey o superior |

### Especificaciones de Hardware

| Recurso | Entorno de Ejecución Cliente (Usuario Final) | Entorno de Desarrollo (Equipo de Trabajo) |
| :--- | :---: | :---: |
| **Procesador (CPU)** | 1.0 GHz (Dual-Core o superior) | 2.0 GHz (Quad-Core o superior) |
| **Memoria RAM** | 512 MB dedicados (mínimo de sistema: 2 GB) | 8 GB de RAM (16 GB recomendado) |
| **Espacio en Disco** | < 100 MB (incluyendo runtime JRE y ficheros .json) | 10 GB (Apache NetBeans, JDK 17, Android Studio) |
| **Pantalla** | Resolución mínima: 1024 × 768 px | Resolución mínima: 1920 × 1080 px (FHD) |

---

### 2.5.3. Curva de aprendizaje y madurez técnica

* **Competencias consolidadas del equipo:** El equipo dispone de una base sólida en programación orientada a objetos (POO), arquitectura modular, colecciones de datos y diseño básico de formularios con Swing y Matisse, adquiridas y afianzadas en el ciclo formativo.
* **Período de autoformación e integración:**
  * **FlatLaf y Gson (Curva mínima, 1-2 días):** La integración de estilos FlatLaf y la serialización JSON con Gson no alteran el flujo clásico de Swing, requiriendo únicamente configurar dependencias y asimilar la sintaxis del parser.
  * **Flutter y Dart (Curva moderada, planificada en PMDM):** La traslación hacia el cliente móvil se aborda de forma escalonada en el tramo final del curso, aprovechando la similitud sintáctica entre Dart y Java junto con el aprendizaje adquirido en el módulo de *Programación Multimedia y Dispositivos Móviles*.

---

### 2.5.4. Ficha técnica y conclusión

| Parámetro | Especificación del Proyecto |
| :--- | :--- |
| **Paradigma y Arquitectura** | Local-First / Patrón Modelo-Vista-Controlador (MVC) |
| **Lenguajes y Entornos** | Java 17 LTS (Apache NetBeans) y Dart 3+ (Flutter / Android Studio) |
| **Capa de Presentación (UI)** | Java Swing + Look and Feel FlatLaf / Componentes visuales desacoplados |
| **Persistencia de Datos** | Ficheros JSON locales mediante Google Gson (sin backend remoto) |
| **Mecanismo de Seguridad** | Hashing criptográfico unidireccional SHA-256 para validación de PIN |
| **Control de Calidad (QA)** | Batería de pruebas unitarias automatizadas con JUnit 5 |
| **Despliegue y Empaquetado** | Ejecutable multiplataforma `.jar` (escritorio) y paquete compilado `.apk` (Android) |

> **Conclusión de viabilidad técnica:** El proyecto resulta plenamente viable. Al apoyarse en herramientas maduras, estándares consolidados del ecosistema Java y prescindir por diseño de infraestructura en la nube, el equipo cuenta con la capacidad técnica requerida para culminar el desarrollo, las pruebas y el despliegue dentro del calendario académico establecido.

## Fuentes Utilizadas:

**Java:** https://docs.oracle.com/es-ww/iaas/jms/doc/system-requirements.html , https://www.igmguru.com/blog/how-to-install-java

**FlatLaf:** https://www.reddit.com/r/java/comments/lsbcwe/flatlaf_10_swing_look_and_feel/?tl=es-es , https://github.com/JFormDesigner/FlatLaf

**Gson:** https://dam.org.es/gson/ , https://ironpdf.com/es/java/blog/java-help/gson-java/

**JUnit5:** https://es.parasoft.com/glossary/junit/ , https://www.arquitecturajava.com/junit-5-novedades-y-buenas-practicas/

---

## 2.6. Estudio de viabilidad económica

### **2.6.1. ¿En qué consiste?**
En este apartado miramos cuánto nos costaría desarrollar, lanzar y mantener PayClear si fuera un trabajo profesional. Queremos comprobar si la aplicación se puede sostener en el tiempo sin ocasionar grandes pérdidas. Como es un programa que guarda todo en local (*Local-First*), los gastos bajan muchísimo porque no tenemos que pagar servidores ni bases de datos en la nube todos los meses.

### **2.6.2. Estimación de costes de desarrollo (Personal)**
Para calcular lo que costaría la mano de obra sin inventarnos las horas, hemos mirado el horario de las asignaturas donde desarrollamos la app (Desarrollo de Interfaces y Proyecto Intermodular) durante los dos primeros trimestres:
- **Carga de horas a la semana:** Tenemos 5 horas semanales de DII y 3 de PI, así que cada uno le dedica 8 horas a la semana.
- **Horas reales por trimestre:**
  - *Primer Trimestre (del 16/09 al 27/11):* Nos salen unas 70 horas por alumno, ya quitando los festivos y el tiempo que el profesor explica teoría en clase.
  - *Segundo Trimestre (del 30/11 al 25/02):* Calculamos otras 70 horas por alumno, quitando las vacaciones de Navidad y las clases de nueva teoría.
- **Total de horas trabajadas:** 420 horas entre los tres (140 horas cada uno juntando los dos trimestres).
- **Precio por hora:** Ponemos 10 €/hora, que es lo habitual para un desarrollador júnior que acaba de empezar.
- **Coste de personal:** 420 horas × 10 €/h = 4.200,00 €.

### **2.6.3. Costes de infraestructura, licencias e indirectos**
Los programas nos salen gratis, pero los portátiles se desgastan y gastan luz e internet mientras trabajamos, así que lo calculamos a partir de las 140 horas que dedica cada uno:
- **Equipos (Hardware):** Aunque los portátiles ya eran nuestros, se desgastan al usarlos para el proyecto, así que ponemos la parte de ese desgaste que corresponde al proyecto (amortización):
  - Vida útil contable: según la tabla de Hacienda, un ordenador se amortiza como mucho un 25% al año, así que su vida útil es de 4 años. Contando las 1.800 horas al año del Convenio TIC (las mismas que pusimos en el Sprint 1), son 7.200 horas.
  - Amortización por hora: lo que nos costó el portátil (700 €) entre su vida útil contable: 700 € / 7.200 h = 0,0972 €/h.
  - Coste para el proyecto: amortización por hora × horas echadas al proyecto: 0,0972 €/h × 140 h = 13,61 € por persona. Entre los tres: **40,83 €**.
- **Luz:** Multiplicamos la potencia del portátil por las horas y por el precio medio de la luz en España. Tomamos 65 W, que entra en el rango normal de un portátil (de 30 a 140 W), y 0,2739 €/kWh, que es lo que pagaron de media los hogares españoles en el primer semestre de 2026 con impuestos incluidos.
  - Por persona: 0,065 kW × 140 h = 9,1 kWh.
  - Entre los tres: 27,3 kWh × 0,2739 €/kWh = **7,48 €**.
- **Internet:** Usamos la conexión de casa para buscar documentación, subir los cambios a GitHub y hacer videollamadas, así que solo contamos la parte que corresponde al proyecto. Una tarifa de solo fibra ronda los 20 € al mes, y un mes tiene unas 720 horas (30 días × 24 h).
  - Coste por hora: 20 € / 720 h = 0,0278 €/h.
  - Por persona: 0,0278 €/h × 140 h = 3,89 €. Entre los tres: **11,67 €**.
- **Licencias de programas:** 0 €. Todo lo hemos programado con herramientas libres o gratuitas (Java Swing, FlatLaf y NetBeans). Si fuéramos una empresa, tendríamos que pagar licencias como Figma Pro (unos 144 € al año) o cuentas de GitHub de pago, pero con la cuenta de estudiante y GitHub Free nos sale gratis.
- **Servidores y alojamiento:** 0 €. Al ser un programa que se instala en el ordenador, no pagamos hosting ni bases de datos online. La app se descarga directamente desde la sección de *Releases* del repositorio de GitHub. Por eso, después de entregar la app no habrá ningún gasto de mantenimiento.

### **2.6.4. Presupuesto desglosado**
En esta tabla dejamos las cuentas del proyecto bien organizadas, añadiendo algo de dinero reservado por si surge algún problema:

| Partida Presupuestaria | Concepto | Coste Estimado (€) |
| :--- | :--- | :--- |
| **Personal** | 3 alumnos con tarifa Júnior (420 h efectivas a 10 €/h) | 4.200,00 € |
| **Hardware** | Amortización por hora de los portátiles (0,0972 €/h) × 420 h de proyecto | 40,83 € |
| **Software / Servicios** | Licencias gratis, código libre y GitHub Releases | 0,00 € |
| **Gastos Indirectos (Luz)** | 65 W × 420 h = 27,3 kWh a 0,2739 €/kWh | 7,48 € |
| **Gastos Indirectos (Internet)** | Fibra de 20 €/mes, parte proporcional (0,0278 €/h × 420 h) | 11,67 € |
| **Subtotal** | Costes directos e indirectos | **4.259,98 €** |
| **Imprevistos (Riesgos)** | Un 10% guardado por si nos retrasamos o hay que comprar algo | 426,00 € |
| **TOTAL PRESUPUESTO** | Coste total estimado | **4.685,98 €** |

### **2.6.5. Análisis del Retorno de la Inversión (ROI) y ahorro de costes**
El ROI es la fórmula que calcula si una inversión merece la pena: **ROI = (ingresos − inversión) / inversión × 100**. Para el usuario normal PayClear va a ser siempre gratis, así que los ingresos tienen que salir de otro sitio. En el Sprint 1 ya dejamos apuntadas las vías para ganar dinero con la app, y la más clara es la **licencia de marca blanca** para organizaciones que gestionan grupos de personas, como residencias de estudiantes o edificios de pisos compartidos (el perfil de Javier en el 2.1):
- **Precio de la licencia:** Ponemos 150 € por edificio, sin IVA, en un pago único y sin cuotas mensuales, que es justo lo que pide Javier. Incluye poner el nombre y el logo del edificio. Para comparar, que cuatro inquilinos pagaran Splitwise Pro les costaría al menos 140 € al año (4 × 35 €).
- **Punto de equilibrio:** 4.685,98 € / 150 € = 31,2, así que con **32 licencias** ya recuperamos lo que cuesta hacer la aplicación.
- **ROI con 40 licencias:** 40 × 150 € = 6.000 € de ingresos. ROI = (6.000 € − 4.685,98 €) / 4.685,98 € × 100 = **28 %**.
- **Otras vías que no contamos:** El Sprint 1 también nombra la copia de seguridad o sincronización opcional y el soporte o las aportaciones de usuarios. No las metemos en la cuenta porque son más difíciles de estimar.
- **Ahorro para el usuario:** Quien use PayClear no tiene que pagar Splitwise Pro (entre 35 € y 47,99 € al año) para meter gastos sin límites.
- **Mantenimiento sin gastos:** Como guardamos los datos en un archivo JSON dentro del ordenador del usuario, la aplicación no genera facturas mensuales de servidores, así que cada licencia vendida es casi todo beneficio.

---

### **Fuentes Utilizadas:**
- **Precio hora programador:** cuánto cobra un desarrollador (De aquí sacamos la tarifa de 10 €/hora para un júnior).
  - Enlace: https://yeeply.com/blog/partners/precio-hora-programador-cuanto-cobra-desarrollador-de-software/
- **Splitwise Pro:** precio, qué incluye y si merece la pena (Para justificar los 47,99 € al año que cuesta la competencia).
  - Enlace: https://www.spliteo.app/blog/es/precio-de-splitwise-pro/
- **Método ROI:** BBVA (Para explicar la fórmula del retorno de la inversión).
  - Enlace: https://www.bbva.com/es/empresas/roi-que-es-el-retorno-de-la-inversion-y-cual-es-su-formula/
- **Vías de negocio y horas anuales:** Memoria del Sprint 1, apartados "Oportunidades de negocio previsibles" y 1.6.2 (Convenio Colectivo Estatal TIC, 1.800 horas al año).
- **Tabla de amortización:** Quipu, tabla de amortización del Impuesto sobre Sociedades (De aquí sacamos el 25% anual para equipos informáticos).
  - Enlace: https://getquipu.com/blog/tabla-amortizaciones-impuesto-sociedades/
- **Consumo de un portátil:** Repsol, consumo de un ordenador (Para el rango de 30 a 140 W y la fórmula potencia × horas).
  - Enlace: https://www.repsol.es/particulares/asesoramiento-consumo/cuanto-consume-ordenador/
- **Precio de la luz:** Selectra, con datos de Eurostat (Para los 27,39 céntimos por kWh de media en 2026).
  - Enlace: https://selectra.es/energia/noticias/kwh-luz-2026-consumo-bajo-precio-caro
- **Precio de la fibra:** Rastreator, tarifas de fibra más baratas (Para los unos 20 € al mes de una tarifa de solo fibra).
  - Enlace: https://www.rastreator.com/telefonia/guias/fibra-mas-barata

  ---
  
## 2.7. Estudio de viabilidad legal y normativa

### 2.7.1. Protección de datos personales

El desarrollo y la arquitectura de PayClear se han diseñado garantizando el estricto cumplimiento del marco normativo europeo y español en materia de privacidad, concretamente el **Reglamento General de Protección de Datos (RGPD, Reglamento UE 2016/679)** y la **Ley Orgánica 3/2018, de 5 de diciembre, de Protección de Datos Personales y garantía de los derechos digitales (LOPDGDD)**.

#### 1\. Identificación de los datos de carácter personal recabados

A diferencia de las alternativas comerciales (Splitwise, Tricount) que requieren registros obligatorios y vinculación de perfiles, PayClear aplica de forma estricta el **principio de minimización de datos** (Art. 5.1.c del RGPD):

-   **Datos NO recabados:** La aplicación no solicita, procesa ni almacena ningún dato identificativo real de nivel personal o sensible, tales como correo electrónico, número de teléfono, nombre completo, dirección IP, geolocalización GPS, ni datos financieros o bancarios (números de tarjeta o IBAN).
-   **Datos locales recabados:** Únicamente se gestionan los alias o apodos informales de los participantes del piso (ej. *"Carlos"*, *"Sofía"*) y los conceptos e importes de los gastos introducidos manualmente. Estos datos residen **exclusivamente en el dispositivo local del usuario** dentro de ficheros `.json` y nunca se transmiten a servidores externos ni a terceros.

#### 2\. Definición de la base de legitimación

Atendiendo al modelo de arquitectura *Local-First* de la herramienta:

-   **Exención por ámbito estrictamente personal o doméstico (Art. 2.2.c del RGPD):** El cálculo y división de gastos de un piso compartido constituye una actividad exclusivamente personal o doméstica. Al no existir transferencia ni centralización de datos hacia servidores de la empresa, la responsabilidad sobre el almacenamiento de la información recae en el propio equipo del usuario.
-   **Base de legitimación por ejecución del servicio (Art. 6.1.b del RGPD):** En el ámbito funcional interno de la interfaz, el procesamiento local de los alias e importes se legitima en la ejecución explícita de las acciones solicitadas por el usuario al interactuar con el sistema (crear un grupo, configurar la bóveda o registrar un tique) y la aceptación implícita de las condiciones al abrir la aplicación.

#### 3\. Medidas de diseño orientadas a la privacidad (*Privacy by Design* y *Privacy by Default*)

En cumplimiento del Art. 25 del RGPD y las directrices de la Agencia Española de Protección de Datos (AEPD), PayClear integra la privacidad desde la fase conceptual del software:

-   **Privacidad por defecto (Privacy by Default):** La configuración inicial e inalterable de la aplicación impide la recolección o envío en segundo plano de telemetría, datos de analítica de uso o rastreadores de comportamiento. La aplicación funciona al $100\\%$ sin conexión a Internet.
-   **Control de accesos y seguridad en sesión (Privacy by Design):**
-   -   **Bloqueo seguro de Bóveda:** Implementación de la función de cierre instantáneo de sesión (botón "Bloquear Bóveda" o atajo Ctrl + L), la cual destruye las instancias activas de las pantallas en memoria RAM mediante el método dispose() de Java Swing y redirige a la pantalla de bloqueo (P1). Esto evita que terceros puedan cotillear la información en ordenadores compartidos.
    -   **Almacenamiento seguro de credenciales con Hashing:** La contraseña o PIN de acceso a la bóveda local nunca se almacena en texto plano. Se procesa mediante el algoritmo de cifrado irreversible **SHA-256** (con *salt* local). Al intentar acceder, la aplicación genera el resumen cifrado del PIN introducido y lo compara con el *hash* guardado en el archivo local, garantizando que la clave no sea leída aun si se abre directamente el archivo JSON.
-   **Política de retención y eliminación de datos ("Derecho al olvido" inmediato):**
-   -   Al no existir servidores remotos, el usuario mantiene el control absoluto y directo sobre la persistencia de sus datos.
    -   Si el usuario elimina un gasto o un grupo de la aplicación, el sistema ejecuta la supresión física e irreversible de dichos nodos en el fichero .json local.
    -   Si el usuario desinstala el programa o elimina el fichero .json de su disco duro, la destrucción de la información es inmediata y definitiva, cumpliendo al $100\\%$ el derecho de supresión (Art. 17 del RGPD) sin requerir solicitudes a terceros.

## Fuentes utilizadas

-   **Boletín Oficial del Estado (BOE).** Ley Orgánica 3/2018, de 5 de diciembre, de Protección de Datos Personales y garantía de los derechos digitales (LOPDGDD).[https://www.boe.es/buscar/act.php?id=BOE-A-2018-16673](https://www.boe.es/buscar/act.php?id=BOE-A-2018-16673)
-   **Agencia Española de Protección de Datos (AEPD).** Preguntas Frecuentes: ¿Qué es la protección de datos desde el diseño y por defecto?[https://www.aepd.es/preguntas-frecuentes/2-tus-obligaciones-como-responsable-del-tratamiento/9-analisis-de-riesgos/FAQ-0224-que-es-la-proteccion-de-datos-desde-el-diseno-y-por-defecto](https://www.aepd.es/preguntas-frecuentes/2-tus-obligaciones-como-responsable-del-tratamiento/9-analisis-de-riesgos/FAQ-0224-que-es-la-proteccion-de-datos-desde-el-diseno-y-por-defecto)

### 2.7.2. Propiedad intelectual y licencias

#### 1\. Derechos de autor y licencia del proyecto

Los derechos de autor sobre el software, la arquitectura de componentes y la interfaz desarrollados para PayClear corresponden a sus autores (el equipo de desarrollo), según lo establecido en la legislación española (**Real Decreto Legislativo 1/1996, por el que se aprueba el Texto Refundido de la Ley de Propiedad Intelectual**).

Para la distribución de la aplicación hemos seleccionado la **Licencia MIT**. Se trata de una licencia de código abierto altamente permisiva que encaja de forma directa con los principios técnicos y económicos del proyecto:

-   **Libertad de uso y estudio:** Permite a cualquier usuario o comunidad utilizar, auditar y modificar el código de manera transparente y sin cuotas.
-   **Compatibilidad con el modelo de negocio (B2B Marca Blanca):** La Licencia MIT autoriza de forma explícita la modificación y comercialización del software. Esto permite empaquetar y vender versiones personalizadas de marca blanca a clientes empresa (como residencias estudiantiles o gestoras de alquileres) sin romper la autoría del código original.
-   **Exención de responsabilidad:** Incluye una cláusula explícita que libera al equipo de desarrollo de cualquier garantía o responsabilidad legal derivada de errores o mal uso del programa en los equipos de los usuarios final.
-   **Coherencia con el estudio económico (Coste 0,00 €):** Justifica la partida presupuestaria de software a coste cero descrita en el apartado de viabilidad económica, asegurando la viabilidad del proyecto sin gastos de licencias comerciales.

#### 2\. Inventario de licencias de terceros

El desarrollo de la aplicación se apoya en librerías de código abierto, entornos de ejecución y recursos tipográficos y gráficos libres. En la siguiente tabla se detallan los componentes externos utilizados y sus correspondientes licencias:

| Componente / Recurso          | Tipo / Función                     | Licencia de terceros                 | Compatibilidad con PayClear (MIT)                                                                                                          |
| ----------------------------- | ---------------------------------- | ------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| Java SE / OpenJDK 17          | Lenguaje y plataforma de ejecución | GPLv2 con Classpath Exception        | Compatible. La excepción de Classpath permite ejecutar aplicaciones Swing sin obligar a aplicar la licencia GPL a nuestro código original. |
| FlatLaf                       | Librería visual para Java Swing    | Apache License 2.0                   | Compatible. Licencia permisiva que se integra sin restricciones en proyectos distribuidos bajo MIT.                                        |
| Google Gson                   | Gestión y parseo de archivos JSON  | Apache License 2.0                   | Compatible. Permite el uso, empaquetado y distribución libre junto al ejecutable de la aplicación.                                         |
| JUnit 5                       | Framework para pruebas unitarias   | Eclipse Public License 2.0 (EPL 2.0) | Compatible. Uso acotado a la fase de pruebas y desarrollo (test-scope); no se empaqueta ni afecta al ejecutable final .jar.                |
| Tipografías Manrope y DM Sans | Fuentes de texto de la interfaz    | SIL Open Font License 1.1 (OFL)      | Compatible. Diseñadas e incrustadas específicamente para su uso e inclusión gratuita en aplicaciones de software.                          |
| Iconos SVG                    | Iconografía visual de la interfaz  | Licencia MIT / CC0                   | Compatible. Recursos de uso libre sin restricciones de derechos de autor ni atribuciones complejas.                                        |

#### 3\. Análisis de compatibilidad legal

Tras revisar de forma exhaustiva las licencias de todos los componentes integrados, confirmamos que no existen incompatibilidades ni conflictos legales.

No se ha incorporado ninguna librería sujeta a licencias de copyleft estricto (como GPLv3 pura en componentes enlazados) que obligase a modificar la licencia de PayClear. Por tanto, la aplicación se puede empaquetar y distribuir bajo la Licencia MIT con total seguridad jurídica y plena compatibilidad comercial.

#### Fuentes oficiales de referencia (España)

-   **Boletín Oficial del Estado (BOE) – Ley de Propiedad Intelectual (Real Decreto Legislativo 1/1996):**  
    [https://www.boe.es/buscar/act.php?id=BOE-A-1996-8930](https://www.boe.es/buscar/act.php?id=BOE-A-1996-8930)

### 2.7.3. Accesibilidad y otros requisitos aplicables

Queremos que PayClear la pueda usar cualquiera, también quien ve mal o tiene problemas para manejar el ratón. Para decidir qué hacer nos hemos basado en las pautas **WCAG 2.1 (nivel AA)**, que son las que pide la norma europea **UNE-EN 301 549**. Estas pautas están pensadas sobre todo para webs, pero la mayoría de sus ideas sirven igual para una aplicación de escritorio.

####  2.7.3.1. Adopción de principios de accesibilidad

Las WCAG se basan en cuatro principios, y en PayClear los aplicamos así:

-   **Perceptible:** Los saldos se entienden aunque no se distingan los colores.
-   **Operable:** Se podrá hacer todo con el teclado, sin tocar el ratón.
-   **Comprensible:** Cada campo dice qué hay que escribir y, si algo falla, la aplicación explicará el motivo.
-   **Robusto:** La aplicación tiene que funcionar bien con lectores de pantalla.

#### 2.7.3.2. Justificación de decisiones en la interfaz

Ahora mismo la versión en Java Swing es solo la maquetación, así que los atajos y los textos para el lector de pantalla se programarán cuando conectemos los eventos.

-   **Contraste:** El texto normal necesita un contraste de al menos 4,5:1 con el fondo. Hemos comprobado los colores de la pantalla principal y los importes cumplen de sobra: el verde da 6,39:1 y el rojo 7,36:1. Donde no llegamos es en algunos textos en gris claro, como "Cuota por persona" (4,11:1) o el texto de ejemplo de los campos (2,56:1), así que los vamos a oscurecer.
-   **No depender solo del color:** Una persona con daltonismo puede confundir el verde y el rojo. Por eso las tarjetas también llevan el signo del importe y una etiqueta ("+ ACREEDOR", "− DEUDOR" o "EQUILIBRADO").
-   **Uso con teclado:** Tab para pasar de un campo a otro, en el mismo orden en que aparecen en pantalla, Enter para confirmar y Esc para cerrar las ventanas emergentes. También habrá atajos para lo más habitual, como Ctrl + N para añadir un gasto o Ctrl + L para bloquear la bóveda. FlatLaf recuadra el elemento seleccionado, así que siempre se ve dónde estás.
-   **Tamaño de letra:** Tenemos textos de entre 8 y 10 px, por debajo de los 11 px que fijamos como mínimo en Desarrollo de Interfaces, así que los vamos a agrandar hasta ese mínimo. También comprobaremos que al ampliar al 200% desde la escala de Windows no se corte ningún importe.
-   **Lectores de pantalla:** Una persona ciega puede usar un lector como NVDA, que es gratuito y lee en voz alta lo que hay en pantalla. Por eso las tarjetas de saldo y los botones que son solo un icono, como el ojo de la contraseña, tendrán un texto que el lector pueda leer.

#### 2.7.3.3. Otros requisitos aplicables

-   **Ley 11/2023:** Obliga a hacer accesibles ciertos productos y servicios, como los servicios bancarios, los libros electrónicos o el comercio electrónico. PayClear es gratuita y no mueve dinero real, por lo que entendemos que no nos afecta de forma directa. Si más adelante ofreciéramos la versión de marca blanca, habría que volver a revisarlo.
  
-   **Real Decreto 1112/2018:** Es para las webs y aplicaciones del sector público, así que tampoco nos afecta.

#### Fuentes utilizadas

-   **Universidad Miguel Hernández (UMH).** Guía de accesibilidad web UMH (versión completa). [https://sipt.umh.es/files/2020/07/Gu%C3%ADa-Completa-de-Accesibilidad-Web-UMH.pdf](https://sipt.umh.es/files/2020/07/Gu%C3%ADa-Completa-de-Accesibilidad-Web-UMH.pdf)
-   **Universidad de Alicante.** Contraste. Accesibilidad Digital. [https://web.ua.es/es/accesibilidad/cadua/contraste.html](https://web.ua.es/es/accesibilidad/cadua/contraste.html)
-   **Cuatrecasas.** Claves de la próxima entrada en vigor de la Ley de Accesibilidad en España. [https://www.cuatrecasas.com/es/global/propiedad-intelectual/art/claves-proxima-entrada-vigor-ley-accesibilidad-espana](https://www.cuatrecasas.com/es/global/propiedad-intelectual/art/claves-proxima-entrada-vigor-ley-accesibilidad-espana)
-   **Comunidad de NVDA en español.** [https://www.nvda.es/](https://www.nvda.es/)
  
  ---


## 2.8. Análisis de riesgos inicial

En lugar de esperar a que las cosas nos fallen, hemos identificado los puntos donde **PayClear** puede pararse, para poder tener claro cómo evitarlos y qué hacer si ocurren.

### 2.8.1. Identificación de riesgos en PayClear
* **Riesgos Técnicos y de Interfaz (`R-1`, `R-2`, `R-3`):**
  * **Bloqueos en el diseñador visual y componentes a medida (`R-1`):** En **NetBeans Matisse** usando **FlatLaf** y componentes como son `TarjetaSaldoParticipante`, facilmente un fichero `.form` puede desincronizarse al hacer *merge* en Git.

  * **Descuadres de calculos en el algoritmo voraz (`R-2`):** Al dividir tickets que no dan exacto (`10,00 €` entre 3 personas = `3,333...€`), operar con variables de longitud **double** puede provocar pérdidas de céntimos y que la suma de deudas no cuadre a cero.

  * **Corrupción o pérdida del archivo `.json` local (`R-3`):** Como no hay base de datos en la nube, si el usuario cierra el programa de golpe mientras `Gson` escribe en disco o borra sin querer el archivo `.json`, perderá todas las cuentas del piso o del viaje.


* **Riesgos de Entorno y Empaquetado (`R-4`):**
  * **Versión de Java en otros PCs (`R-4`):** Que el ejecutable `.jar` falle por diferencias en la versión del JDK instalada.

* **Riesgos de Planificación y Alcance (`R-5`):**
  * **Querer abarcar demasiado antes de tiempo (*Scope Creep*) (`R-5`):** Liarnos a meter funciones secundarias o adelantar pantallas de la Fase 3 (móvil en Flutter) cuando todavía quedan entregas de los sprints de escritorio y de otras asignaturas de 2º DAM.

* **Riesgos Operativos y de Equipo (`R-6`):**
  * **Conflictos de Git o baja puntual de un compañero (`R-6`):** Fastidiar el código al tocar la misma clase (`VistaPrincipal` o `ControladorPrincipal`) a última hora, o que uno de los tres no pueda avanzar una semana por problemas personales o enfermedad.

### 2.8.2. Criterios de evaluación (Probabilidad × Impacto)

Para no valorar los riesgos a ojo, usamos dos sencillas variables:

1. **Probabilidad de ocurrencia:** *Baja* (rara vez pasa), *Media* (puede pasar en algún sprint) o *Alta* (muy probable si no tenemos cuidado).

2. **Impacto en el proyecto:** *Bajo* (molestia estética o retraso de un par de horas), *Medio* (nos obliga a rehacer una clase o vista) o *Alto* (rompe las cuentas, impide compilar o bloquea la entrega del sprint).

Del cruce de ambas sale la **Severidad / Criticidad** (*Baja*, *Media*, *Alta* o *Crítica*), que marca a qué le damos prioridad.


### 2.8.3. Matriz de Gestión de Riesgos y Plan de Mitigación

| ID | Descripción del Riesgo | Probabilidad | Impacto | Severidad / Criticidad | Medida de Prevención (Antes) | Plan de Contingencia (Si ocurre) |
| :---: | :--- | :---: | :---: | :---: | :--- | :--- |
| **`R-01`** | Corrupción de ficheros `.form` de NetBeans o fallos al integrar componentes personalizados con `FlatLaf`. | Media | Alto | **Alta** | Separar las vistas en clases limpias y no editar nunca el bloque bloqueado de NetBeans a mano desde fuera del IDE. | Reconstruir el contenedor concreto por código Java puro (`JPanel` con `BorderLayout`/`GridLayout`) sin depender del `.form`. |
| **`R-02`** | Errores de redondeo de coma flotante en repartos inexactos y en el algoritmo voraz de liquidación. | Media | Alto | **Alta** | Operar con `BigDecimal` (redondeo `HALF_UP` a 2 decimales) o trabajar internamente en céntimos enteros (`int`/`long`). | Asignar el céntimo sobrante o faltante de forma automática al pagador inicial del ticket y avisarlo en pantalla. |
| **`R-03`** | Pérdida o corrupción del archivo `.json` local durante el guardado o por borrado accidental del usuario. | Baja | Alto | **Media** | Escribir primero en un fichero temporal (`.tmp`) antes de reemplazar el `.json` y validar la estructura al arrancar. | Generar un `.bak` automático en cada sesión y añadir un botón para restaurar o importar copia de seguridad manual. |
| **`R-04`** | Incompatibilidad de versiones de Java (JDK) o mal escalado visual en monitores con diferente resolución. | Media | Medio | **Media** | Fijar la misma versión LTS de JDK en los 3 equipos del grupo y usar contenedores flexibles con tamaños mínimos definidos. | Empaquetar un *Fat JAR* con todas las librerías incluidas (`FlatLaf`, `Gson`) y forzar propiedades de escalado del sistema al iniciar. |
| **`R-05`** | Desviación del alcance (*Scope Creep*) o falta de tiempo al coincidir entregas de varios módulos de 2º DAM. | Alta | Medio | **Alta** | Cerrar las tarjetas de cada sprint en GitHub Projects y priorizar siempre el flujo principal antes que los extras. | Recortar funciones secundarias (como filtros avanzados o estadísticas extra) y pasarlas al backlog del siguiente sprint. |
| **`R-06`** | Conflictos al unir ramas en GitHub (*merge conflicts*) o indisposición puntual de uno de los tres miembros. | Media | Medio | **Media** | Trabajar cada tarea en su propia rama/issue de GitHub y hacer *pull* antes de tocar `ControladorPrincipal` o la memoria. | Revisar el historial de commits para revertir el choque y reasignar la tarjeta pendiente entre los otros dos compañeros. |

## Fuentes utilizadas

* **Asana.** (2026). *Matriz de riesgos: qué es, cómo crearla y ejemplos*. https://asana.com/es/resources/risk-matrix-template
* **INCIBE (Instituto Nacional de Ciberseguridad).** *¡Fácil y sencillo! Análisis de riesgos en 6 pasos*. https://www.incibe.es/empresas/blog/analisis-riesgos-pasos-sencillo
* **Inforges.** (2026). *Cómo hacer un plan de gestión de riesgos: Guía Completa*. https://inforges.es/blog/guia-plan-de-gestion-de-riesgos/
* **Sinnaps.** *¿Cómo hacer un análisis de riesgos de un proyecto?*. https://sinnaps.com/blog-gestion-proyectos/analisis-riesgos-proyecto
