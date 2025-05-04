pipeline {
    agent any

    stages {
        stage('Clonar o código') {
            steps {
                git 'https://github.com/Borrach1nha/pipeline-testes.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Compilando projeto...'
                // Simula um build
                sh 'echo Build simulado'
            }
        }

        stage('Testes') {
            steps {
                echo 'Rodando testes...'
                // Simula teste
                sh 'echo Teste simulado'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploy simulado...'
            }
        }
    }
}
