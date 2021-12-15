pipeline {
    agent any
     tools {
          maven 'Apache Maven 3.8.4'
        }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }

        }
        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }
}