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
        stage('Deploy'){
            steps{
publishHTML([allowMissing: false, alwaysLinkToLastBuild: true, keepAll: true, reportDir: '', reportFiles: 'target/surefire-reports/SReport*.html', reportName: 'SeleniumPipeline', reportTitles: '', useWrapperFileDirectly: true])
            }
        }
        
    }
     post {
        // Clean after build
        always {
            cleanWs(cleanWhenNotBuilt: false,
                    deleteDirs: true,
                    disableDeferredWipeout: true,
                    notFailBuild: true,
                    patterns: [[pattern: '.gitignore', type: 'INCLUDE'],
                               [pattern: '.propsfile', type: 'EXCLUDE']])
        }
    }
}
