
FROM eclipse-temurin:17-alpine

COPY /target/*.jar /app.jar

EXPOSE 3333

ENTRYPOINT ["java","-jar","/app.jar"]

