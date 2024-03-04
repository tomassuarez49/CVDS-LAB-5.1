# CVDS-LAB-5.1

Laboratorio 5 CVDS
Tomas Suarez
Nicolas Achuri
Sara Castillo


### 3. Creación del Controlador
1.Crea un controlador:

Abre la clase SpringBootHelloWorldApplication.java.
Agrega la anotación @RestController a la clase.
Crea un método llamado home() con la anotación @RequestMapping("/") que devuelve un mensaje "Hello world Spring Boot".
Ejecuta la Aplicación:

2. Ejecuta la aplicación usando el comando mvn spring-boot:run.
Accede a ella desde el navegador en http://localhost:8080/.
![image](https://github.com/tomassuarez49/CVDS-LAB-5.1/assets/157758933/7ec62e10-f60c-42cf-9a29-b0a00e949611)



3.Personalización del Mensaje:

Modifica el método home() para usar etiquetas HTML y agrega otro método con @RequestMapping("/new") que devuelva otro mensaje.

![image](https://github.com/tomassuarez49/CVDS-LAB-5.1/assets/157758933/40bf67eb-3c81-4927-b57b-717be78d3721)

Empaquetado y Ejecución
Empaqueta la Aplicación:

Ejecuta mvn package para crear un archivo JAR ejecutable.

Ejecuta la Aplicación:

Ejecuta la aplicación con el comando java -jar target/SpringBootHelloWorld-0.0.1-SNAPSHOT.jar.



### Capítulo 2: Crear un proyecto para el front end.

1. Configuración Inicial
Antes de comenzar, asegúrate de tener Node.js y npm instalados en tu máquina. Si aún no los tienes, descárgalos e instálalos desde Node.js official website.
![image](https://github.com/tomassuarez49/CVDS-LAB-5.1/assets/157758933/37cecb36-9fba-473a-b3a5-85bfeb4b04bd)


2. Creación del Proyecto React
Genera un nuevo proyecto React:

Abre la terminal y ejecuta el siguiente comando para crear un nuevo proyecto React usando Create React App: bash npx create-react-app react-hello-world
Esto creará una carpeta llamada react-hello-world con la estructura básica de un proyecto React.
Navega al directorio del proyecto: bash cd react-hello-world

### Consumiendo el Servicio Spring Boot
Crea un componente React:

En la carpeta src, crea un nuevo archivo llamado HelloWorld.js.
Dentro de este archivo, crea un componente funcional que renderice un mensaje "Hello World".
Realiza una solicitud HTTP al servicio Spring Boot:

En el mismo archivo HelloWorld.js, utiliza la función fetch o una librería como axios para hacer una solicitud GET al servicio Spring Boot.
La URL de la solicitud debe ser la misma que definimos en nuestro controlador Spring Boot (por ejemplo, http://localhost:8080/clients).

Renderiza la respuesta en tu componente:

Cuando recibas la respuesta del servicio, muestra el mensaje "Hello World" en tu componente React.
4. Ejecución del Proyecto React
Inicia el servidor de desarrollo:

Ejecuta el siguiente comando en la terminal: bash npm start
Esto abrirá automáticamente tu aplicación React en el navegador en http://localhost:3000.
Verifica que el mensaje "Hello World" se muestre correctamente:

Si todo funciona correctamente, deberías ver el mensaje "Hello World" en tu aplicación React.

![image](https://github.com/tomassuarez49/CVDS-LAB-5.1/assets/157758933/00d33d33-e648-4010-bb9d-166691944731)


5. Empaquetado y Despliegue
Empaqueta tu aplicación React:

Cuando estés listo para desplegar tu aplicación, ejecuta: bash npm run build
Esto creará una carpeta build con los archivos optimizados para producción.
Integra tu aplicación React con Spring Boot:

Copia los archivos de la carpeta build generada en el directorio de recursos de tu proyecto Spring Boot (por ejemplo, src/main/resources/static).
Ahora, cuando ejecutes tu aplicación Spring Boot, también servirá la aplicación React.


