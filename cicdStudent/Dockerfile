FROM adoptopenjdk/openjdk14:alpine-slim
COPY target/cicdStudent-0.0.1-SNAPSHOT.jar cicdStudent-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "cicdStudent-0.0.1-SNAPSHOT.jar"]
