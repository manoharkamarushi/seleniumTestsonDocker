# seleniumWithDocker </br>
## Running selenium tests in Docker </br>
### Advantages:</br>
No need to handle browser drivers. </br>
Tests are fast and smooth as they are running virtually in a container. </br>
With docker network, we can create a selenium hub and node environment so that we can run tests parallely. </br>
Here in each container create an image of a different browser and o.s. </br>
With docker compose, we can run multiple containers together using a yml configuration file. </br>

## What is Docker? </br>
Docker is a set of ‘platform as a service’ products that use OS-level virtualization to deliver software in packages called containers. </br>
OR </br>
Developers can package the application along with libraries,dependencies and environment in a single box called containers. </br>
Create a container </br>
Upload the container to a cloud platform (like docker hub) </br>
Download the container (for team members, dev, testers) </br>
Run the container in a virtual machine. </br>
Containers are light weighted virtual machines. </br>
</br>
## Install the Docker for windows </br>
Once installed it can run a few docker images. You can create an image from scratch or pull the images from the docker hub developed by the community. </br>
You can pull the Selenium hosted docker image. </br>
docker pull selenium/standalone-chrome </br>
If you look at multiple selenium docker images for different purposes. </br>
</br>
Once you pull the image start the container </br>
docker run -d -p 4444:4444 -shm-size=2g selenium/standalone-chrome </br>
-d detach mode </br> 
-p use port 4444 where selenium grid uses by default </br>
-shm-size=2g if docker container dont have memory it uses 2g of physical machine </br>
And last imageName. </br>
Once run returns a container Id. </br>

docker ps →lists out all containers created. </br>
Write selenium grid code locally and run it. </br>
