FROM openjdk:18.0.1.1-jdk
EXPOSE 80
ARG JAR_FILE=build/libs/ssb-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
CMD ["java", "-Dserver.port=80", "-jar","/app.jar"]
