FROM openjdk:8
COPY target/awstest-0.1.0.jar app.jar
VOLUME /tmp
ADD target/awstest.jar awstest.jar
EXPOSE 5000
ENTRYPOINT ["java","-jar","awstest.jar"]