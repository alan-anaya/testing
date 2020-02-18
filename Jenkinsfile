pipeline {
	agent any
	stages {
		stage('Clean') {
			steps {
				sh "mvn clean"
			}
		}
		stage('Test'){
			steps {
				sh "mvn test"
			}		
		}
		stage('Package'){
			steps {
				sh "mvn package"
			}
		}
		post {
			always{
				archiveArtifacts artifacts: './target/apptesting-0.0.1-SNAPSHOT.jar', fingerprint: true
				junit './target/surefire-reports/*.xml'
			}
		}
	}
}
