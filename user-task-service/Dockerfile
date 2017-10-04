FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/user-task-service-1.0.0-SNAPSHOT.jar task-service.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /task-service.jar