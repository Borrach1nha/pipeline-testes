pipeline {
    agent any

    stages {
        
        stage('Hello') {
            steps {
                echo 'Salve, primeira pipeline'
            }
        }

        stage('Clonar o código') {
            steps {
                git branch: 'main', url: 'https://github.com/Borrach1nha/pipeline-testes.git'
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
