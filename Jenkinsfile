pipeline {
    agent any

    tools{ 
        maven "maven3.9.6"
    }

    stages {
    
        stage('clean') {
            steps {
                echo 'Started'
                bat 'mvn clean'
            }
        }
    
        
        stage('compile') {
            steps {
                echo 'compile'
                bat 'mvn compile'
            }
        }
        
        
        stage('test') {
            steps {
                echo 'Test'
                bat 'mvn test'
            }
        }

        
        stage('package') {
            steps {
                echo 'Packaging'
                bat 'mvn package -DskipTests'
            }
        }
    }
    
        post{
            
            always{
                echo "Email related messages"
                emailext attachLog: true, attachmentsPattern: 'reports/*.html', body: 'PharmEasy Test Message',subject: 'PharmEasy - Selenium scripts CI Integration',to: 'kumbamcharan321@gmail.com',mimeType: 'text/html'

            }

            success{
                publishHTML (
                    target: [
                        allowMissing: false,
                        alwaysLinkToLastBuild: false,
                        keepAll: true,
                        reportDir: 'reports/',
                        reportFiles: 'PharmEasy_reports.html',
                        reportName: 'PharmEasy Extent report',
                        reportTitles: 'PharmEasy Report'
                    ])
            }
        }    
    
}