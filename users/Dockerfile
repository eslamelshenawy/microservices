FROM adoptopenjdk/openjdk11:alpine-jre

WORKDIR /app

COPY target/users-1.1.jar /app

ENTRYPOINT ["java", "-jar", "users-1.1.jar"]