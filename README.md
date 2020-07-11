# Automation Tyba Challenge
> Repositorio de Tyba  donde se realiza la creación de Proyecto de Automatización para la plataforma https://www.metrocuadrado.com.
Basada en un patrón de Diseño ScreenPlay el cual nos permite estructurar los paquetes de
>- Models: Se realiza la gestión de los datos a utilizar
>- Questions: Validación de estado de objetos en la interfaz
>- Tasks: Ejecución de Pasos y acciones sobre el navegador
>- UI: Especificación de elementos de la UI
>
>Una estructura Java donde se pueden crear los
>- Navigation: Se relacionan las clases que intervienen al momento de navegar en la Web
>- Runners: Clases ejecutoras de casos de prueba
>- StepsDefinitions: Definición de pasos y órden de ejecución
>
>Y donde tenemos los casos de Pruebas especificados
>- Features: Definición de escenarios y casos de prueba en lenguaje Gherkin
>- WebDrivers: Se relacionan los drivers dinámicos que podrían ser utilizados en la ejecución
>
>Se utilizó SerenityBDD por la integración que tiene con ScreenPlay y el lenguaje Gherkin.

**Pre-requisitos**
- jdk1.8.0_51
- jre1.8.0_241
- IntelliJ
- Driver Chrome

**Para su ejecución**
- mvn clean verify -Dtest=ValidarCalculadoraRunner

**Construido con**
- Maven
- Cucumber
- SerenityBDD
- Java

**Opciones**
- Lenguaje Gherkin
- Config UTF-8
- Especificación de librerías en pom.xml