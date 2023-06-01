FROM maven:3.8.5-openjdk-17 as biuld
WORKDIR /app
COPY . .
RUN mvn clean package

FROM openjdk:21-ea-17
WORKDIR /app
COPY --from=build ./app/target/*.jar ./app.jar
EXPOSE 8761
ENTRYPOINT java -jar app.jar