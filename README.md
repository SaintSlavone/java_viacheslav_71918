# First Project Java Spring

A simple Spring Boot web application with Thymeleaf templating engine.

## Description

This project demonstrates basic Spring MVC concepts including controllers, Thymeleaf templates, and static resources. Created as part of coursework at Vistula University.

## Technologies

- Java
- Spring Boot
- Thymeleaf
- HTML/CSS

## Project Structure

```
src/
├── main/
│   ├── java/pl/edu/vistula/first_project_java_spring/
│   │   ├── FirstProjectJavaSpringApplication.java
│   │   └── controller/
│   │       └── HelloController.java
│   └── resources/
│       ├── templates/
│       │   ├── index.html
│       │   └── greeting.html
│       └── static/
│           ├── styles/
│           │   └── styles.css
│           └── img/
│               └── viacheslav_img.jpg
```

## Endpoints

| Route | Description |
|-------|-------------|
| `/` | Main page with a link to the greeting page |
| `/greeting?name={name}` | Greeting page displaying personalized message |

## Running the Application

1. Make sure you have Java 17+ and Maven installed
2. Clone the repository ```git clone https://github.com/SaintSlavone/java_viacheslav_71918```
3. Switch branch ```git switch project1```
4. Navigate to first-project-java-spring ```cd first-project-java-spring```
5. Run the application:.
   Click the green Run button (▶) next to the main method
   This method is recommended because the IDE automatically handles Java environment configuration, eliminating the need to manually set up JAVA_HOME and other environment variables.
   Using Command Line (Alternative)
   Make sure JAVA_HOME environment variable is configured, then run: ```./mvnw spring-boot:run```

7. Open your browser and navigate to `http://localhost:8080`

## How project is working

On the main page we can see heading "Hello Vistula, in my first Spring controller", and button "Go to Greeting Page" that is navigating us to the next page.
You can see how first main page is looks like on a screenshot here "/screenshots/main_page.png".

After navigating to the greeting page, our gaze is met by a welcoming headline and a portrait of the inimitable Viacheslav. In URL line you can see parameter name, by editing this
parameter (for example name=Vistula or name=hello), after press Enter button you will see different result in headline on greeting page.
"/screenshots/greeting_page.png".

## Author

Viacheslav Kostenko
