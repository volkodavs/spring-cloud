FROM java:8
ADD rest.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8010
ENTRYPOINT ["java", "-jar", "app.jar"]