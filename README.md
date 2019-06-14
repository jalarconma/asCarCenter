# PASOS DE INSTALACCION:

1. Configurar la base de datos ORACLE
2. Clonar el repositorio
3. En la carpeta raíz clonada ejecutar el comando: gradlew cleanEclipse eclipse compileJava
4. Importar el projecto al IDE como projecto Gradle
5. En el archivo "application.properties" alojado en EXAMPLE-DATA cambiar la URL, usuario y contraseña a la base de datos configurada
6. Ejecutar la clase ExampleApplication.java
7. Instalar Node.js versión > 10
8. Ejecutar el comando: npm install -g @angular/cli
9. Ir a la carpeta EXAMPLE-FRONTEND
10. Estando en la carpeta anteriormente indicada, ejecutar el comando: npm install
11. En EXAMPLE-FRONTEND ejecutar el comando: ng serve, este comando levanta el servidor de frontend bajo el url que indica 
    al compilar exitosamente
12. ESO ES TODO!! la aplicación debe estar corriendo y debe verse la interfaz en un navegador con dos pestañas, una para crear mecánicos y la
    otra para asignarlos.
    

# SOLUCIÓN DE LOS EJERCICIOS:

## Base de Datos:
   
   Para expandir la base de datos con lo solicitudo en facturas se debe ejecutar el siguiente script:
   
    CREATE TABLE FACTURAS(
         ID INTEGER NOT NULL,
         CLI_DOCUMENTO INTEGER NOT NULL,
         CLI_TIPO_DOCUMENTO VARCHAR(2) NOT NULL,
         VEH_PLACA VARCHAR(6) NOT NULL,
         MEC_DOCUMENTO INTEGER NOT NULL,
        MEC_TIPO_DOCUMENTO VARCHAR(2) NOT NULL,
        VALOR_NETO NUMBER NOT NULL,
        VALOR_CON_IVA NUMBER NOT NULL,
        VALOR_CON_DESCUENTO NUMBER);
    ALTER TABLE FACTURAS ADD CONSTRAINT PK_FACTURAS PRIMARY KEY (ID);
    ALTER TABLE FACTURAS ADD CONSTRAINT FK_CLI Foreign key (CLI_DOCUMENTO, CLI_TIPO_DOCUMENTO) references CLIENTES(DOCUMENTO, TIPO_DOCUMENTO);
    ALTER TABLE FACTURAS ADD CONSTRAINT FK_VEH Foreign key (VEH_PLACA) references VEHICULOS(PLACA);
    ALTER TABLE FACTURAS ADD CONSTRAINT FK_MEC Foreign key (MEC_DOCUMENTO, MEC_TIPO_DOCUMENTO) references MECANICOS(DOCUMENTO, TIPO_DOCUMENTO);
 
 
 ## Java
  * Seguir los pasos de instalación para verificar el desarrollo. Se desarrolló usando Spring Boot para la capa de DATA y SERVICIOS, mientras que la
    capa de presentación se hizo con ANGULAR 8



