pipeline {
    agent any
    tools {
        maven 'Maven3'
        jdk 'jdk1.8.0_101'
    }
    stages {
	    stage('lekher'){
		    steps {
		      nexusArtifactUploader (
			nexusVersion('nexus2')
			protocol('http')
			nexusUrl('localhost:8081/nexus')
			groupId('com.fboot')
			version('0.0.1-SNAPSHOT')
			repository('\target')
			artifacts: [
				[artifactId: 15ShadesQcm,
				 classifier: '',
				 file: '15ShadesQcm-0.0.1-SNAPSHOT.jar',
				 type: 'jar']
			 ]
      		     )
   	          }
	    }
     }
}
