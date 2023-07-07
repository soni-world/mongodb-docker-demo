FROM bellsoft/liberica-openjdk-alpine-musl:17
EXPOSE 8080
ADD target/mongodb-docker-demo.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]