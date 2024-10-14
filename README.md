# Serenity BDD E2E Test Project

Este proyecto contiene una prueba funcional automatizada (E2E) para simular un flujo de compra en el sitio de pruebas [SauceDemo](https://www.saucedemo.com/). 
La prueba incluye autenticación, agregar productos al carrito, visualizar el carrito, completar el formulario de compra y finalizar la compra con la confirmación "THANK YOU FOR YOUR ORDER".

## Requisitos

Antes de ejecutar el proyecto, asegúrate de tener instaladas las siguientes herramientas y configuradas en las variables de entorno:

- **Java Development Kit (JDK)**: Versión 17
- **Gradle**: Versión 7.6.1
- **Maven**: Versión 3.9.1
- **IDE**: IntelliJ IDEA

### Configuración de Variables de Entorno

Asegúrate de que las siguientes variables de entorno estén configuradas:

- `JAVA_HOME`: Debe apuntar al directorio de instalación de JDK 17.
- `GRADLE_HOME`: Debe apuntar al directorio de instalación de Gradle 7.6.1.
- `MAVEN_HOME`: Debe apuntar al directorio de instalación de Maven 3.9.1.
- Asegúrate de que las rutas a `bin` de cada herramienta estén incluidas en la variable de entorno `PATH`.

## Configuración del Proyecto en IntelliJ IDEA

1. Abre IntelliJ IDEA.
2. Importa el proyecto como un proyecto de Gradle.
3. Asegúrate de que el SDK del proyecto esté configurado para usar JDK 17.

## Ejecución de las Pruebas

Para ejecutar las pruebas, sigue estos pasos:

1. Clona el repositorio desde GitHub:
2. bash
git clone https://github.com/DomorQ/SerenityE2E/tree/master
cd serenity-e2e-test


2. Ejecuta las pruebas usando Gradle:

bash
./gradlew clean test

   O, si estás en Windows:

bash
gradlew.bat clean test


## Reportes

Después de ejecutar las pruebas, los reportes de Serenity se generarán automáticamente. Puedes encontrarlos en la siguiente ubicación:

- `target/site/serenity/index.html`

Abre este archivo en un navegador web para ver los resultados detallados de las pruebas.

## Detalles de la Prueba

La prueba automatizada realiza los siguientes pasos en el sitio [SauceDemo](https://www.saucedemo.com/):

1. Autenticarse con el usuario `standard_user` y la contraseña `secret_sauce`.
2. Agregar dos productos al carrito.
3. Visualizar el carrito.
4. Completar el formulario de compra.
5. Finalizar la compra hasta la confirmación: "THANK YOU FOR YOUR ORDER".

## Conclusiones

Por favor, consulta el archivo `conclusiones.txt` para obtener información sobre los hallazgos y conclusiones del ejercicio.

## Contribuciones

Si deseas contribuir a este proyecto, por favor crea un fork del repositorio y envía un pull request con tus cambios.
