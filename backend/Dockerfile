FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/backend-1.0.0.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar", "--server.port=8080"]
