FROM openjdk:22-oraclelinux8

WORKDIR /app

COPY target/products-1.1.jar /app

ENTRYPOINT ["java", "-jar", "products-1.1.jar"]