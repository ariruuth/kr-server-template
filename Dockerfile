FROM openjdk:8
ADD target/server-0.0.1-SNAPSHOT.jar /kr/server.jar
RUN sh -c 'touch /kr/server.jar'
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /kr/server.jar" ]
