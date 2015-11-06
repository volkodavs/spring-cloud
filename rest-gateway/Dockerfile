FROM java:8
ADD rest-gateway.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8010
ENTRYPOINT ["java", "-jar", "app.jar"]