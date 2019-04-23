pipeline{
    agent none
    stages {
        stage('DockerV') {
            steps {
              sh 'docker -v'
          }
        }
        stage('Build-run') {
            steps {
                sh 'mvn -B -DskipTests clean package'
                sh './jenkins/scripts/deliver.sh'
            }
        }
    }
}