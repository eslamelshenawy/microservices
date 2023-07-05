FROM openjdk:22-oraclelinux8

COPY target/users-1.1.jar /users/app/
WORKDIR /users/app

ENTRYPOINT ["java", "-jar", "users-1.1.jar"]

