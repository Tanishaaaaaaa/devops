pipeline {
    agent any
    
    environment {
        registry = 'https://index.docker.io/v1/'
        dockerImage = 'tanishaaa31/java-quiz-app:latest'
    }
    
    tools {
        // Specify the JDK installation configured in Jenkins
        jdk 'jdk17'
        // Specify the Maven installation configured in Jenkins
        maven 'maven'
       
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the Git repository
                git url: 'https://github.com/Tanishaaaaaaa/devops.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                // Build using Maven
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                // Run tests using Maven
                bat 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                // Build Docker image
                script {
                    dockerImage = docker.build("tanishaaa31/java-quiz-app:latest")
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                // Push Docker image to Docker Hub
                script {
                    docker.withRegistry('https://index.docker.io/v1/', 'docker-hub-credentials-id') {
                        docker.image("tanishaaa31/java-quiz-app:latest").push()
                    }
                }
            }
        }

        // stage('Deploy') {
        //     steps {
        //         // Deploy using kubectl
        //         bat 'kubectl apply -f path/to/deployment.yaml'
        //     }
        // }
    }

    post {
        success {
            echo 'Pipeline successfully executed!'
            // Add further success actions if needed
        }
        failure {
            echo 'Pipeline failed!'
            // Add further failure actions if needed
        }
    }
}
