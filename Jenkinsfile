pipeline {
    agent any
    tools {
        maven 'Maven3'
        jdk 'jdk1.8.0_101'
    }
    stages {
		
	    stage('lekher'){
		    steps{
			    nexusPublisher (artifactId: 'my-model',
					classifier: '',
					credentialsId: '<id>',
					file: 'target/15ShadesQcm-0.0.1-SNAPSHOT.jar',
					groupId: 'com.fboot',
					nexusUrl: '<nexus-url>',
					nexusVersion: 'nexus3',
					protocol: 'http',
					repository: 'Releases',
					type: 'jar',
					version: '0.0.1-SNAPSHOT')
		    }
	    }
     }
}
