FROM openjdk:8
EXPOSE 8080
RUN mkdir -p /app/
ADD /build/libs/kafkaconsumer-0.0.1-SNAPSHOT.jar /app/kafkaconsumer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/app/kafkaconsumer-0.0.1-SNAPSHOT.jar"]