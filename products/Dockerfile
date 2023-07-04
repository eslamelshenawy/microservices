FROM adoptopenjdk/openjdk11:alpine-jre

WORKDIR /app

COPY target/products-1.1.jar /app

ENTRYPOINT ["java", "-jar", "products-1.1.jar"]