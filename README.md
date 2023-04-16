Starter project to get familiarity with spring boot and mocro services

***Core of spring boot-> starter projects and auto configuration. Helps build production ready applications faster.***

**1. Managing App configuration using profiles**
Applications have different environments. Each environment might be connected to different databases, web-services, etc for the same application. We can do this easily with spring boot.

<img width="522" alt="Screenshot 2023-04-12 at 10 24 34 PM" src="https://user-images.githubusercontent.com/23514932/231661490-378fc95b-3bb7-4eed-89a0-f56cbfaf65ae.png">

E.g:
1. Logging - can add different types of logging for different environments. Can change in application.properties file. Set logging level with ***logging.level.org.springframework=debug*** and profile can be set in application.properties with ***spring.profiles.active = debug***



>##### trace - will show logs for trace, debug, info, warning, error.
>##### debug - will show logs for debug, info, warning, error.
>##### info - will show logs for info, warning, error.
>##### warning - warning, error.
>##### error - error.
>##### off - turn logging off


**2. Managing complex configurations using @ConfigurationProperties and @Autowired
     ***@ConfigurationProperties(prefix = "currency-service")*** is used to set @ConfigurationPropertiesClass and assign prefix to be used in properties file.


**3. Spring boot allows deploying easy. Tomcat web-server is in build in the start-web project. So simply install and follow steps below to deploy

   a. Right click on project and click *** Run As-> maven project-> enter clean install -> run ***
<img width="730" alt="Screenshot 2023-04-15 at 6 54 55 PM" src="https://user-images.githubusercontent.com/23514932/232262009-4be18704-1668-47da-ab59-149475f47a85.png">

   b. It will run and the terminal will show if build is a success and create a JAR file.
     <img width="1326" alt="Screenshot 2023-04-15 at 7 01 07 PM" src="https://user-images.githubusercontent.com/23514932/232262153-a2f987da-52d6-4736-91fc-8f96de816240.png">
     
   c. Now open terminal as shown in the terminal.  *** /Users/nikitha/Downloads/learn-spring-boot/target/ *** 
      Check java version is greater than 18 for this project(java --version). 
      Now run *** learn-spring-boot-0.0.1-SNAPSHOT.jar *** with command : *** java -jar learn-spring-boot-0.0.1-SNAPSHOT.jar ***
      To exit type command+C or ctrl+C 
      
      
**4. Monitor application using spring boot Actuator - monitor and manager application in production.
   
   a. Provides number of end-points
      a.1. beans: complete list of Spring beans in the application
      a.2. health: Application health information
      a.3. metric: metrics about the application (if app is up or down)
      a.4. mapping: details around request mapping
      ....
      
   b. To add actuator to the project. Add dependency in pom file. Now run project (LearnStringBootApplication.java)
        <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
	
   c. In browser *** localhost:8080/actuator *** will show app health and metrics by default.
      add all other end-point by add below line to the application.properties file
      ** management.endpoint.web.exposure.include =* **
    
    
     
     
     

     
     
