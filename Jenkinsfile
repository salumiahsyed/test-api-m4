pipeline {
  agent any
  tools {
        maven 'Maven_3.5.4' 
    }
	
  /*parameters {
	string(
		name: 'CICD Pipeline',
		defaultValue:'WB',
		description: 'Wiggle CICD Pipeline')
    }*/
	stages {
		stage('Pipeline Start') {
		  steps {
		   echo 'Pipeline Started'
		  }
		}
		stage('Compile Stage') {
		  steps {
			withMaven(maven : 'maven_3.5.4'){
			  echo 'Compile Stage'
			  sh 'mvn clean compile'
			}
		  }
		}
		stage('Testing Stage') {
		  steps {
			withMaven(maven : 'maven_3.5.4'){
			  echo 'Testing Stage'
			  sh 'mvn test'
			}
		  }
		}
		stage('Deploy Stage') {
		  steps {
			withMaven(maven : 'maven_3.5.4'){
			  echo 'Testing Stage'
			  sh 'mvn deploy'
			}
		  }
		}
	}
	
	
}
