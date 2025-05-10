FROM eclipse-temurin:24-jdk AS builder
WORKDIR /app

COPY ./mvnw .
COPY ./.mvn .mvn
COPY ./pom.xml .
COPY ./src ./src
RUN chmod +x mvnw && ./mvnw clean package -DskipTests


FROM eclipse-temurin:24-jdk
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
