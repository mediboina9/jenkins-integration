node {
  stage ('git ') {
    git url: 'https://github.com/mediboina9/jenkins-integration'
    // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe reports and FindBugs reports
  }
  stage('syntax pipeline'){
  
  }
  stage ('output') {
    
    
  }
   stage ('Build') {
   // git url: 'https://github.com/mediboina9/jenkins-integration'
    withMaven {
      def mvnHome=tool name:'maven', type:'maven'
      sh "${mvnHome}/bin/mvn/package"
        
    } // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe reports and FindBugs reports
  }
}
