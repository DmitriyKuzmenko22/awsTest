FROM openjdk:8
VOLUME /tmp
ADD target/awstest.jar awstest.jar
EXPOSE 5000
ENTRYPOINT ["java","-jar","awstest.jar"]