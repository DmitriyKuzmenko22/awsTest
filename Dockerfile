FROM openjdk:8
VOLUME /tmp
ADD target/awstest.jar awstest.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","awstest.jar"]