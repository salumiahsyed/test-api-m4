pipeline {
  agent any
  tools {
        maven 'maven_3_5_4' 
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
			withMaven(maven : 'maven_3_5_4'){
			  echo 'Compile Stage'
			  bat 'mvn clean compile'
			}
		  }
		}
		stage('Testing Stage') {
		  steps {
			withMaven(maven : 'maven_3_5_4'){
			  echo 'Testing Stage'
			  bat 'mvn test'
			}
		  }
		}
		stage('Deploy Stage') {
		  steps {
			withMaven(maven : 'maven_3_5_4'){
			  echo 'Testing Stage'
			  bat 'mvn clean install'
			}
		  }
		}
	}
	
	
}
