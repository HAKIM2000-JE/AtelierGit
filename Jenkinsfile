pipeline {
    agent any
     tools {
          maven 'MAVEN_HOME'
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