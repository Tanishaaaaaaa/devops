FROM openjdk:17-oracle
ADD target/demo.jar demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/demo.jar"]
