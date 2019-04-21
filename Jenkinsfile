pipeline {
    agent any
    stages {
        stage('DockerV') {
            steps {
              sh 'docker -v'
          }
        }
        stage('Build-run') {
            agent {
                docker {
                    image 'maven:3-alpine'
                    args '-v /root/.m2:/root/.m2'
                }
            }
            steps {
                sh 'mvn -B -DskipTests clean package'
                sh './jenkins/scripts/deliver.sh'
            }
        }
    }
}