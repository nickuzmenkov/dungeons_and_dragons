FROM maven:3.9.6-eclipse-temurin-21 as builder
WORKDIR /app
COPY pom.xml pom.xml
COPY src src
RUN mvn clean install

FROM eclipse-temurin:21-jre
COPY --from=builder '/app/target/dungeons_and_dragons-0.0.1-SNAPSHOT.jar' 'app.jar'
CMD ["java", "-jar", "app.jar"]
