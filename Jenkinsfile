pipeline {
  agent any
  tools {
        maven 'maven_3_5_4' 
    }
	
	stages {
		stage('Pipeline Start') {
		  steps {
		   echo 'Pipeline Started'
		  }
		}
		
		stage('Deploy Stage') {
		  steps {
			withMaven(maven : 'maven_3_5_4'){
			  echo 'Deploy Stage'
			  bat 'mvn clean package deploy -DmuleDeploy'
			}
		  }
		}
	}
	
	
}
