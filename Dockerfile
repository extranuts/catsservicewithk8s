FROM openjdk:17-jdk-slim
COPY build/libs/catsservice.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
