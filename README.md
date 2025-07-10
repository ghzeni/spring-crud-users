# CRUD com Spring Boot e PostgreSQL

## Setup
1. Create the database
```
createdb database
```

2. Run migrations
```
./mvnw flyway:migrate
```

3. Build the application
```
./mvnw install
```

4. Start the project
```
java -jar target/crud-0.0.1-SNAPSHOT.jar
```

## Making requests

### Create an user
```
curl -X POST -H "Content-Type: application/json" -d '{"username": "João"}' http://localhost:8080/users
```

### Update the user
```
curl -X PUT -H "Content-Type: application/json" -d '{"username": "Novo nome"}' http://localhost:8080/users
```

### List all users
```
GET http://localhost:8080/users
```

### Find user by ID
```
GET http://localhost:8080/users/{id}
```

### Delete user
```
DELETE http://localhost:8080/users/{id}
```