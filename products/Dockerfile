FROM openjdk:22-oraclelinux8

COPY target/products-1.1.jar /products/app/
WORKDIR /products/app

ENTRYPOINT ["java", "-jar", "products-1.1.jar"]