FROM eclipse-temurin:17.0.8.1_1-jdk-jammy
COPY . .
ENTRYPOINT ["java", "-jar", "target/CardapioWeb-0.0.1-SNAPSHOT.jar"]