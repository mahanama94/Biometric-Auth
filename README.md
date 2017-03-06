# Biometric-Auth

Simple Hand Geometry based authentication scheme, capable of being packaged with an application. 

## Installation 

1. Database Configuration
  - MySQL – Use the database.sql file to create the required table structure in the MYSQL database.
  - Derby – Use the database-derby file to generate the table structure in derby embedded

2. Configure the database properties in the src/main/resources/hibernate.cfg.xml ( Follow the example given in hibernate.cfg.example.xml given ) 

3. Build the application using maven ( mvn clean install )

4. Use target/Biometric-Auth-1.0-SNAPSHOT-jar-with-dependencies.jar  to run the application 

## Scheme

The system uses 12 basic measurements on the hand geometry
- Height of fingers
- Width of the Fingers (Measured at the base) 
- Measurements of the palm ( refer the image ) 

<img src="https://raw.githubusercontent.com/mahanama94/Biometric-Auth/master/Hand-biometric-auth.jpg" width="50%">

