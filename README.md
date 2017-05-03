# multi-tier-kubernetes
Angular front end on nginx, SpringBoot APIs and MongoDB

### Create the front end
First install `angular cli` gloablly with `npm install -g @angular/cli`.
Now generate a new project with angular cli by executing
`ng new front-end`. We have named our application `front-end`.

Create a `Dockerfile` using `nginx` image to deploy our angular app.


To remove all stopped containers
`docker rm $(docker ps -a -q)`
