# Step 1: Build JAR using Maven
FROM maven:3.9.9-eclipse-temurin-17 AS build

WORKDIR /app
COPY . .

RUN mvn clean package -DskipTests

# Step 2: Run the JAR
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app
COPY --from=build /app/target/servicefinder-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]