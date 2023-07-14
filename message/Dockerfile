FROM openjdk:17-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=build/libs/message-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} message.jar
ENTRYPOINT ["java","-jar","/message.jar"]