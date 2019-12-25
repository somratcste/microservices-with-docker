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
```