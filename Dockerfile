FROM maven:3.8.6-eclipse-temurin-17-alpine AS MAVEN_BUILD

COPY ./ ./

RUN mvn clean package

FROM eclipse-temurin:17-alpine

COPY --from=MAVEN_BUILD /target/*.jar /app.jar

EXPOSE 3333

ENTRYPOINT ["java","-jar","/app.jar"]

