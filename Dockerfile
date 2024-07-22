# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jre

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file from the host to the working directory in the container
COPY target/hotelrating-0.0.1-SNAPSHOT.jar /app/hotelrating.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Define environment variables (if any)
ENV SPRING_PROFILES_ACTIVE=prod

# Run the JAR file
ENTRYPOINT ["java", "-jar", "hotelrating.jar"]

