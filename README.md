# Restful	Web	Service - Task in progress

## Task description
Build rest web service with	functionality to support User, Role, Resource management.
Data should	be persist in MySql database.Use spring	framework to create	the	project.
Use	Hibernate for commutation with database.
• CRUD user
• CRUD role
• CRUD	resource
• Authentication with JSON web token with username and password
• Security	restrictions for 5 failed login	attempts
• Security restriction based on	user role

### Tasks
1) Create a spring boot project with n-layer architecture
2) Configure the spring boot application to connect to database
3) Create all needed entities to cover all the requirement
4) Create a repositories related to entities
5) Create a REST controllers to handle operations
6) Add a security to entity application

#### Technical Requirements
The system will be REST based. Authentication and authorization will be provided via JWToken.
Products need to be written in Java 11+ with Spring Boot 2+.
1) https://www.oracle.com/java/technologies/javase-jdk11-downloads.html
2) https://spring.io/projects/spring-boot
3) https://spring.io/projects/spring-data
4) https://spring.io/projects/spring-security
5) https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc
