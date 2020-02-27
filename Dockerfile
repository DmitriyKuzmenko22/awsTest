FROM openjdk:8
VOLUME /tmp
ADD target/awsTest.jar awsTest.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","awsTest.jar"]