# Demo API Rest
## Requisitos
* Java 1.8
* Maven 3.6
* Tomcat 8 o 9  
* Base de datos Postgresql  

## Clonar Repo
Clonar repo https://github.com/mcacerese/test-api-rest.git 
## Base de datos
Crear una base de datos Postgresql y luego ejecutar el script sql que se encuentra dentro de la carpeta db/
## Configuración inicial
Dentro del archivo application.properties se deben agregar los parametros de configuración del aplicativo:
```java
server.port = # Puerto en el que correra la aplicación (Solo para un contenedor embebido)
spring.application.name = # Nombre del aplicativo
spring.datasource.url= # Url de la base de datos (Host y DB) Ej: jdbc:postgresql://localhost:5432/pedidos
spring.datasource.username= # Usuario de base de datos
spring.datasource.password= # Password del usuario de base de datos
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect # Dialecto SQL con el que trabajara Hibernate de acuerdo a la base de datos.
spring.jpa.show-sql=true # Solo para mostrar las querys por consola (Debug)
spring.jpa.hibernate.ddl-auto=update # Opción para actualizar la base de datos al levantar la aplicación 
urlUf=https://mindicador.cl/api/uf # Url para obtener el valor de la uf
```
### Despliegue
Para desplegar el aplicativo se debe crear el .war ejecutando el siguiente comando en la raiz del proyecto:  
```bash
mvn clean package
```
Una vez creado el .war se debe desplegar en el manager app del servidor Tomcat, o de lo contrario, copiar el .war en el directorio tomcat/webapps/ y reiniciar el servidor.

Otra manera de levantar el proyecto es desde un IDE y sobre el archivo src\main\java\com\example\demo\DemoApplication.java correr el proyecto, esto hará que se levante el servidor web embebido que trae spring boot.
### Servicios 
Los servicios que posee la API son:
* [url:port]/productos = Lista todos los productos almacenados.
* [url:port]/productos/actualizar-precio-uf/{productoId} = Actualiza el atributo precioValorUf del producto solicitado.