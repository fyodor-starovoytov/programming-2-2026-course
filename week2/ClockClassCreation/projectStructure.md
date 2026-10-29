
Skip to content
DEV Community
Powered by Algolia
Log in
Create account
1 Jump to Comments
1 Save
Boost
Jasper Aurelio Villas
Jasper Aurelio Villas

Posted on Apr 8, 2025
3
Folder structure - backend java

Creating an organized folder structure for your backend project is essential for maintainability, scalability, and ease of collaboration. Here’s an extensive folder structure that would work well for a backend project, particularly if you're using Spring Boot with Java (which is a common setup for enterprise-grade applications). This structure can also be adapted for other Java frameworks.

Suggested Folder Structure for a Backend Project

bash

my-backend-project/
│
├── src/
│   ├── main/
│   │   ├── java/                         # Main Java source code
│   │   │   └── com/
│   │   │       └── futureseed/            # Your root package
│   │   │           ├── controller/        # Controllers for handling API requests
│   │   │           ├── dto/              # Data Transfer Objects (DTOs) for API responses
│   │   │           ├── exception/         # Custom exceptions and exception handlers
│   │   │           ├── model/             # Models representing your database entities
│   │   │           ├── repository/        # Repositories for data access (usually extends JpaRepository)
│   │   │           ├── service/           # Service layer for business logic
│   │   │           ├── config/            # Configuration classes (Security, Swagger, etc.)
│   │   │           ├── util/              # Utility classes (e.g., file handling, validations, etc.)
│   │   │           ├── security/          # Security-related files (JWT, Authentication)
│   │   │           └── Application.java   # Entry point (Spring Boot main class)
│   │   │
│   │   ├── resources/
│   │   │   ├── application.properties     # Main configuration file for Spring Boot
│   │   │   ├── static/                   # Static resources (images, stylesheets, etc.)
│   │   │   ├── templates/                # Templates if using Thymeleaf (not common in APIs)
│   │   │   └── db/                       # Database migration files (Liquibase, Flyway)
│   │   │
│   │   ├── webapp/                       # Contains web-related content (if using servlet container)
│   │   │   └── WEB-INF/                  # Web application configuration files (if needed)
│   │   │
│   ├── test/                             # Unit and integration tests
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── futureseed/
│   │   │           ├── controller/        # Tests for controllers
│   │   │           ├── service/           # Tests for services
│   │   │           ├── repository/        # Tests for repositories
│   │   │           ├── model/             # Tests for models (entities)
│   │   │           ├── config/            # Tests for configuration classes
│   │   │           └── ApplicationTests.java  # Main class for integration tests
│   │   │
│   │   ├── resources/
│   │   │   └── application-test.properties  # Configuration for testing environments
│   │   │
│
├── .gitignore                            # Git ignore file to exclude unnecessary files from version control
├── README.md                             # Project overview and instructions
├── pom.xml                               # Maven build file (or `build.gradle` if using Gradle)
├── docker-compose.yml                    # Docker configuration for multi-container apps
├── Dockerfile                            # Dockerfile for creating the app image
├── .env                                   # Environment variables (for local development)
└── .idea/                                # IDE-specific files (can be excluded from version control)

Breakdown of Each Folder/Directory:

    src/main/java/com/futureseed/: controller/: Contains the classes responsible for handling incoming HTTP requests and returning HTTP responses (equivalent to Django views).

Example: UserController.java, AuthController.java

dto/: Contains Data Transfer Objects used for request and response payloads. These classes are often used to format data before sending it back to clients.

Example: UserDTO.java, LoginRequest.java

exception/: This folder contains custom exceptions and handlers for better error management and handling specific error cases.

Example: ResourceNotFoundException.java, GlobalExceptionHandler.java

model/: Contains the entity classes that represent tables in the database. These are usually annotated with JPA annotations like @Entity, @Table, etc.

Example: User.java, Course.java

repository/: This layer contains the interfaces that allow interaction with the database using Spring Data JPA. They extend JpaRepository, CrudRepository, or PagingAndSortingRepository.

Example: UserRepository.java, CourseRepository.java

service/: This folder contains the business logic and the service layer that works between the controller and repository layers.

Example: UserService.java, AuthService.java

config/: Contains configuration classes that set up application-specific settings such as security, Swagger, or database configuration.

Example: SecurityConfig.java, SwaggerConfig.java

util/: Utility classes that provide helper methods for different tasks across the project (file parsing, string manipulation, validation, etc.).

Example: FileUtils.java, Validator.java

security/: This folder is specifically for security-related concerns, like handling authentication (e.g., JWT), authorization, and user roles.

Example: JwtTokenUtil.java, JwtAuthenticationFilter.java

Application.java: The main class that contains the public static void main(String[] args) method to launch the Spring Boot application.

    src/main/resources/: application.properties: This is where you define most of your configuration, such as database settings, server ports, logging levels, etc.

Example configuration: spring.datasource.url, server.port=8080

static/: This folder holds static files like images, CSS, JavaScript, etc., that are served by the application (useful if you're serving a frontend with Spring Boot).

templates/: This folder is used if you're rendering views on the server-side using a template engine like Thymeleaf. This is typically not needed for API projects.

db/: This is where database migration scripts (Liquibase or Flyway) are stored if you want to manage your database schema versioning and migrations.

application-test.properties: Configuration settings specific for running tests, such as test databases, testing endpoints, etc.

    src/test/java/com/futureseed/: controller/: Unit and integration tests for controllers.

Example: UserControllerTest.java

service/: Tests for the service layer.

Example: UserServiceTest.java

repository/: Tests for the repository layer, typically using in-memory databases or mocks.

Example: UserRepositoryTest.java

model/: Tests for the entity models (if needed).

Example: UserModelTest.java

config/: Tests for your configuration classes, like checking Spring Security configuration.

ApplicationTests.java: Main test class for running integration tests that verify the startup of the entire application (via Spring Boot's test annotations).

    Other Root Files: README.md: A markdown file with documentation about the project, including how to set up, run, and contribute to the project.

pom.xml: This is the Maven build configuration file that includes all dependencies, plugins, and other project settings.

docker-compose.yml: Defines the services (like databases, Redis, etc.) and how they work together in Docker containers.

Dockerfile: Instructions for Docker to package the application into a container image.

.gitignore: A file listing the files and directories that should be excluded from version control, such as IDE files, compiled classes, and environment files.

.env: This file holds environment-specific variables such as database credentials, secret keys, etc.

Conclusion:
This folder structure for your backend project is designed to follow good software engineering practices and is highly scalable. It separates concerns into clearly defined layers (controller, service, repository) and uses standard Spring Boot project conventions. You can modify this structure to fit the specifics of your project as it evolves, but this should give you a great foundation for starting your backend application.
Top comments (1)
Subscribe
pic
Submit
Preview

ganesh_kumar_e4e98249188e profile image
ganesh kumar
•
May 10 '25

Helpful guide on organizing backend Java projects! For those in Coimbatore looking to build solid Java skills, check out this Java Course in Coimbatore with hands-on training and placement support.

Visit - appincoimbatore.com/java-course-in...
1 like Like
Reply
Code of Conduct • Report abuse
Jasper Aurelio Villas
Follow
Aspiring Junior Developer|Passionate about code&learning! Exploring Power Apps, AI & eager to contribute fresh ideas. Ready to dive into transformative projects! Let’s connect & innovate!#EagerLearner

    Location
    Netherlands
    Education
    Fullstack Developer - Bootcamp
    Work
    Student, Developer, Father
    Joined
    Sep 26, 2024

Trending on DEV Community
MT Indie Dev profile image
Free Assets and the Stigma people enforce behind them
#design #gamedev #discuss #unrealengine
Mia Keller profile image
Cutting through the noise: A fresh, no-nonsense resource for GTA 6 info
#webdev #productivity #discuss #gamedev
Sayed Sayeedur Rahman profile image
This needs work” is the most useless feedback you can give a writer.
#management #productivity #writing

my-backend-project/
│
├── src/
│   ├── main/
│   │   ├── java/                         # Main Java source code
│   │   │   └── com/
│   │   │       └── futureseed/            # Your root package
│   │   │           ├── controller/        # Controllers for handling API requests
│   │   │           ├── dto/              # Data Transfer Objects (DTOs) for API responses
│   │   │           ├── exception/         # Custom exceptions and exception handlers
│   │   │           ├── model/             # Models representing your database entities
│   │   │           ├── repository/        # Repositories for data access (usually extends JpaRepository)
│   │   │           ├── service/           # Service layer for business logic
│   │   │           ├── config/            # Configuration classes (Security, Swagger, etc.)
│   │   │           ├── util/              # Utility classes (e.g., file handling, validations, etc.)
│   │   │           ├── security/          # Security-related files (JWT, Authentication)
│   │   │           └── Application.java   # Entry point (Spring Boot main class)
│   │   │
│   │   ├── resources/
│   │   │   ├── application.properties     # Main configuration file for Spring Boot
│   │   │   ├── static/                   # Static resources (images, stylesheets, etc.)
│   │   │   ├── templates/                # Templates if using Thymeleaf (not common in APIs)
│   │   │   └── db/                       # Database migration files (Liquibase, Flyway)
│   │   │
│   │   ├── webapp/                       # Contains web-related content (if using servlet container)
│   │   │   └── WEB-INF/                  # Web application configuration files (if needed)
│   │   │
│   ├── test/                             # Unit and integration tests
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── futureseed/
│   │   │           ├── controller/        # Tests for controllers
│   │   │           ├── service/           # Tests for services
│   │   │           ├── repository/        # Tests for repositories
│   │   │           ├── model/             # Tests for models (entities)
│   │   │           ├── config/            # Tests for configuration classes
│   │   │           └── ApplicationTests.java  # Main class for integration tests
│   │   │
│   │   ├── resources/
│   │   │   └── application-test.properties  # Configuration for testing environments
│   │   │
│
├── .gitignore                            # Git ignore file to exclude unnecessary files from version control
├── README.md                             # Project overview and instructions
├── pom.xml                               # Maven build file (or `build.gradle` if using Gradle)
├── docker-compose.yml                    # Docker configuration for multi-container apps
├── Dockerfile                            # Dockerfile for creating the app image
├── .env                                   # Environment variables (for local development)
└── .idea/                                # IDE-specific files (can be excluded from version control)

DEV Community — A space to discuss and keep up software development and manage your software career

    Home
    DEV Challenges
    DEV++
    Videos
    DEV Education Tracks
    DEV Help
    Advertise on DEV
    Organization Accounts
    DEV Showcase
    About
    Contact
    Free Postgres Database
    DEV Shop
    MLH

    Code of Conduct
    Privacy Policy
    Terms of Use

Built on Forem — the open source software that powers DEV and other inclusive communities.

Made with love and Ruby on Rails. DEV Community © 2016 - 2026.
