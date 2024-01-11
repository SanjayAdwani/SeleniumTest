pipeline {
    agent any

    stages {
        stage('Get src code') {
            steps {
                git 'https://github.com/SanjayAdwani/SeleniumTest.git'
                echo 'Hello World'
            }
        }
      stage('Build') {
            steps {
              bat 'mvn compile'
            }
        }
        stage('Run test') {
            steps {
               bat 'mvn test -Dbrowser=localchrome'
            }
        }
       
    }
}
