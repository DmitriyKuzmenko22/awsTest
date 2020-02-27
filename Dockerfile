FROM openjdk:8
VOLUME /tmp
ADD target/awsTest.jar awsTest.jar
EXPOSE 5000
ENTRYPOINT ["java","-jar","awsTest.jar"]