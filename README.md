# AppJboss

Practica en la que se muestra como crear una aplicación web con conexion a base de datos despleglable en un servido WildFly(Jboss). La base
de datos usada en el ejemplo usa motor MySql. Ademas, la aplicacion implementa del uso de colas con ActiveMQ (externo) para simular una aplicacion real
que emplea comunicacion asincrona para guardar datos en la base de datos.

## Instalación/Configuracion 🔧

Para obtener una copia funcional de este proyecto y poder trabajar con el es necesario disponer del servidor 
locale de bases de datos, MySql, crear la base de datos y tabla. En la carpeta doc estan los scripts necesarios.

Por otro lado es necesario descargar el servidor WildFly (v17) y configurar en el la conexión a la base de datos (JDBC Drivers y DataSource)
para que la conexion a la base de datos la realize el servidor.

Ademas se debe descargar el cliente de ActiveMQ y configurarlo para el puerto 61616.

Una vez instalado todo, clonar el repositorio en un IDE (el proyecto fue creado con Intellij), ajustar las configuraciones y generar el .EAR que 
puede ser desplegado en el servidor Wildfly previamente descargado.
