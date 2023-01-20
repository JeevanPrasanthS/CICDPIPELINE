FROM openjdk:17
COPY target/cicd-student.jar cicd-student.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "cicd-student.jar"]
