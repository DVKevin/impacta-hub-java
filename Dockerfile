# Etapa 1: Build
FROM eclipse-temurin:21-jdk-alpine AS build

WORKDIR /app
COPY . .

RUN chmod +x mvnw
RUN ./mvnw -B -DskipTests clean package

# Etapa 2: Runtime
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app
COPY --from=build /app/target/quarkus-app/ ./

CMD ["java", "-jar", "quarkus-run.jar"]
