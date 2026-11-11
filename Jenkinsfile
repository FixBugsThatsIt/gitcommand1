
pipeline {
    agent any

    triggers {
        githubPush()
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Check Java Version') {
            steps {
                bat '''
                    echo Checking Java version...
                    where java
                    where javac
                    java -version
                    javac -version
                '''
            }
        }

        stage('Build') {
            steps {
                bat '''
                    "C:\\Program Files\\Java\\jdk-21\\bin\\javac.exe" App.java AppTest.java
                '''
            }
        }

        stage('Test') {
            steps {
                bat '''
                    "C:\\Program Files\\Java\\jdk-21\\bin\\java.exe" AppTest
                '''
            }
        }
    }

    post {
        success {
            echo 'Build stable'
        }
        failure {
            echo 'Build failed'
        }
    }
}
