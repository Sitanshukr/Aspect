# select parent image
FROM maven:3.6.0-jdk-8

# copy the source tree and the pom.xml to our new container
COPY ./ ./

# package our application code
RUN mvn clean package

# set the startup command to execute the jar
CMD ["java", "-jar", "target/aspect-0.0.1-SNAPSHOT.jar"]