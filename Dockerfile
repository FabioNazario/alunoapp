FROM openjdk:8-jdk-alpine
COPY target/*.war app.war
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar app.war" ]
