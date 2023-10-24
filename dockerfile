

FROM openjdk:17-jdk-slim

ARG JAR_FILE=target/Vechile-Project.jar

WORKDIR .

COPY $(JAR_FILE) app.jar

ENTRYPOINT ["java","-jar","app.jar"]