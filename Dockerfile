# Use the official maven image to create a build artifact.
# https://hub.docker.com/_/maven
FROM maven:3.9.6-eclipse-temurin-17 AS build

# Copy the pom.xml and the project's source code to the container.
COPY . /usr/src/app
# Set the working directory to the project's root.
WORKDIR /usr/src/app
# Build the project and create the executable JAR file.
RUN mvn package -DskipTests

# Use the official openjdk image to run the application.
# https://hub.docker.com/_/openjdk
FROM gcr.io/distroless/java17-debian12

# Set the working directory to the project's root.
WORKDIR /usr/src/app

# Copy the executable JAR file from the build stage.
COPY --from=build /usr/src/app/target/demo-0.0.1-SNAPSHOT.jar /usr/src/app/app.jar

# Expose the port that the application will run on.
EXPOSE 8080

# Run the application.
ENTRYPOINT ["java", "-jar", "app.jar"]
