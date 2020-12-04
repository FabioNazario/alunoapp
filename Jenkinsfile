pipeline {
    agent any

    stages {
        stage('Buid') {
            steps {
                git 'https://github.com/FabioNazario/alunoapp.git'
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }
        stage('Quality Analyses') {
            steps {
                echo 'Quality Analyses'
            }
        }
        stage('Repository') {
            steps {
                echo 'Repository'
            }
        }
        stage('Deploy Tomcat') {
            steps {
                echo 'Deploy Tomcat'
            }
        }
    }
}
