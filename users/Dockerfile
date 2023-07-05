FROM openjdk:22-oraclelinux8

WORKDIR /users

COPY target/users-1.1.jar users-1.1.jar
ENTRYPOINT ["java","-jar","/users-1.1.jar"]

#COPY target/users-1.1.jar /app/users-1.1.jar
#
#ENTRYPOINT ["java", "-jar", "users-1.1.jar"]

