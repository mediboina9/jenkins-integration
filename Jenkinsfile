node {
  stage ('Build') {
    git url: 'https://github.com/mediboina9/jenkins-integration'
    withMaven {
      sh "mvn clean package"
    } // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe reports and FindBugs reports
  }
}
