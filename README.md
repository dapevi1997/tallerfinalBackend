# Backend del taller final

Nota: es necesario montar el backend en el puerto 8080 para
no tener problema con los cors.

Video: https://youtu.be/PCwWnOmzZ7A

# Habilitación del LiveReload cuando sea posible
spring.devtools.livereload.enabled = true
# -------------------- Configuración de conexión a MySQL --------------------
# Configuración para MySQL 8
spring.datasource.url = jdbc:mysql://localhost/finaltask?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrival=true
# Usuario de base de datos
spring.datasource.username = root
# Contraseña para el usuario de la base de datos
spring.datasource.password = d04m07a1997
# Clase a usar para conectar con la base de datos
spring.datasource.driver-class-name = com.mysql.cj.jdbc.Driver
# Dialecto a usar de SQL, en este caso MySQL8
spring.jpa.database-platform = org.hibernate.dialect.MySQL8Dialect
# -------------------- Mostrar en consola el SQL que se está ejecutando --------------------
# Formatear salida del SQL en consola
spring.jpa.properties.hibernate.format_sql = true
# Hacer que se muestre en consola el SQL ejecutado

logging.level.org.hibernate.SQL = DEBUG
# Hacer que se muestre en consola los valores que se inyectan a la sentencia SQL
logging.level.org.hibernate.type.descriptor.sql.BasicBinder = TRACE
