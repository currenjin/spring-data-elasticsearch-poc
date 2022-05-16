FROM openjdk:11-jdk-alpine

COPY ./build/libs/elasticsearch.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]