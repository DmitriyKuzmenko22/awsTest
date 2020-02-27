FROM openjdk:8
COPY build/libs/*.jar /app/awsTest.jar
RUN mkdir /app
VOLUME /tmp
ADD target/awsTest.jar awsTest.jar
EXPOSE 5000
ENTRYPOINT ["java","-jar","awsTest.jar"]