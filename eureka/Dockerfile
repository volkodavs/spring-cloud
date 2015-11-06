FROM java:8
ADD eureka.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8010
ENTRYPOINT ["java", "-jar", "app.jar"]