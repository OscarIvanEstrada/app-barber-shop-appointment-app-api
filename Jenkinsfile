pipeline {

  agent any 
  
  stages {
    
    stage("build") {
      steps {
         configFileProvider([configFile(fileId: 'app-barber-shop-appointment-app-api', variable: 'settingsFile')]) {
           echo 'building the applications...'
           
           script {
              def config = readJSON file:"$settingsFile"
              sh "npm install -g @angular/cli"
              sh "npm install"
              sh "ng build --prod"     
           }
        }
        
      }
    }
    
    stage("build-docker-image") {
      steps {
        echo 'building the docker image...'
        sh 'docker build -t oiestradag/app-barber-shop-appointment-app-api .'
      }
    }
    
    stage("push-dockerhub") {
      steps {
          withCredentials([string(credentialsId: 'docker_hub_oiestradag_pass', variable: 'pass')]){
              sh 'docker login -u oiestradag -p "$pass"'
              sh 'docker push oiestradag/app-barber-shop-appointment-app-api'
          }
       }
    }
    
    stage("test") {
      steps {
        echo 'testing the applications...'
      }
    }
    
    
   stage("docker swarm deploy") {
      steps {
        
           configFileProvider([configFile(fileId: 'app-barber-shop-appointment-app-api', variable: 'settingsFile')]) {
           echo 'deploying the applications...'
            script {
              echo "The file $settingsFile"
              def config = readJSON file:"$settingsFile"
              sh 'docker service rm app-barber-shop-appointment-app-api || true'
              sh "docker service create --name app-barber-shop-appointment-app-api --replicas 3 -p 8085:80 -e PORT=${config.PORT} -e APP_VERSION=${config.APP_VERSION} -e SQL_URL_CONECTION=${config.SQL_URL_CONECTION} -e SQL_USERNAME=${config.SQL_USERNAME} -e SQL_PASSWORD=${config.SQL_PASSWORD} oiestradag/app-barber-shop-appointment-app-api"
            }
        }       
      }
    }
  }
}
