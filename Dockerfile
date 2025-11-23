# Etapa 1: Build (Compilação)
FROM maven:3.9.0-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src

# Compila o projeto e gera o quarkus-app
RUN mvn package -DskipTests

# Etapa 2: Runtime (Execução)
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copia apenas o necessário do estágio de build
COPY --from=build /app/target/quarkus-app/lib/ /app/lib/
COPY --from=build /app/target/quarkus-app/app/ /app/app/
COPY --from=build /app/target/quarkus-app/quarkus/ /app/quarkus/

# Expondo porta
EXPOSE 8080

# Comando para rodar
ENTRYPOINT ["java", "-jar", "/app/quarkus-run.jar"]
