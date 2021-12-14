pipeline {
    agent any

    stages {
        stage ('Clean') {
            steps {
                zsh ' mvn clean'
            }
        }

        stage ('Test') {
            steps {
                zsh 'mvn test'
            }
        }

         stage ('Package') {
                    steps {
                        zsh 'mvn package'
                    }
              }
    }
}