node {
  stage ('git ') {
    git url: 'https://github.com/mediboina9/jenkins-integration'
    // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe reports and FindBugs reports
  }
  stage ('output') {
    println "Hello World."
    def mvn_version = '3.8.5'
    withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
  //sh "mvn clean package"
}
  }
   stage ('Build') {
   // git url: 'https://github.com/mediboina9/jenkins-integration'
    withMaven {
      def mvnHome=tool name:'maven', type:'maven'
      sh "${mvnHome}/bin/mvn/package"
        
    } // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe reports and FindBugs reports
  }
}
