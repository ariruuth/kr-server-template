# Server

Spring Boot web application. 

## Maven build
You need JDK and Maven to get going.

### Build
```
mvn package
```

### Run
```
java -jar target/server-0.0.1-SNAPSHOT.jar
```

### Test in localhost
```
http://localhost:8080/api/v1/app/now
http://localhost:8080/api/v1/app/now?iam=Santa
```

## Docker build
You need JDK, Docker and Maven to get going.

### Build image
```
mvn package
docker build -t kr-server .
```

### Run the image
```
docker run --rm -it -p 8080:8080 kr-server
```

