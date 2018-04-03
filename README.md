# IT Security - Marketplace Lab
ZHAW - IT Security Lab - Application Containerized using Maven's spotify docker plugin.

## Setup
To spin up the project, run:
``` 
  docker-compose up 
```

or, build the images yourself with your own username prefix, which currently are: 
1. database: ademord/marketplace_db
2. glassfish: ademord/glassfish
3. project image with maven: ademord/marketplace

Be careful with the prefixes! Remember to update the project image, since it uses the glassfish image as base.
