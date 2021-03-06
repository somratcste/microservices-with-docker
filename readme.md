Docker Command
==========================================
```
docker container ls 
docker run -p 5001:5000 in28min/todo-rest-api-h2:1.0.0.RELEASE
docker images 

docker container ls -a 
docker container stop <container_id>

docker tag in28min/todo-rest-api-h2:1.0.0.RELEASE in28min/todo-rest-api-h2:latest

docker pull mysql 
docker search mysql 

docker image history <image_id>
docker image inspect <image_id>
docker image remove <image_id>

docker container run -p 5000:5000 in28min/todo-rest-api-h2:0.0.1-SNAPSHOT
docker container pause <container_id>
docker container unpause <container_id>
docker container inspect <container_id>
docker container prune // delete all the stop container 
docker container logs -f <container_id>
docker container stop <container_id> // graceful shutdown
docker container kill <container_id> // immediately terminates the process 
docker container run -p 5000:5000 -d --restart=always in28min/todo-rest-api-h2:0.0.1-SNAPSHOT // restart default no

docker events 
docker top <container_id> // top process
docker stats 

// define memory and cpu per each container 
// total cpu-quota 100000 = 100%, 5000 = 5%; memory = 0.5G, 1G 
docker container run -p 5000:5000 -m 512m --cpu-quota 5000 -d in28min/todo-rest-api-h2:0.0.1-SNAPSHOT
docker system df // docker daemon manages 

// -i=interactive, -t=tty 
// -it allows to run commands on a running container
docker run -dit openjdk:8-jdk-alpine 
docker container exec <container_name> ls /tmp

// docker build from dockerfile
docker build -t in28min/hello-world-rest-api:dockerfile1 .
docker build .

// docker tag name 
docker tag <image_id> in28mn/rest-api-full-stack:2stagebuild

// docker compose 
docker-compose -version
docker-compose up
docker-compose up -d
docker-compose down

docker-compose config
docker-compose images 
docker-compose ps
docker-compose top
docker-compose pause
docker-compose unpause
docker-compose stop 
docker-compose kill 

// remove all the conatiners 
docker-compose rm 

// build all services
docker-compose build 
docker-compose events

// docker compose scale
docker-compose scale currency-exchange-service=2

```

