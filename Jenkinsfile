pipeline {
agent any
tools {
maven "MAVEN"
jdk "JDK"
}
stages {
stage('Initialize'){
steps{
withMaven(maven:'maven_3_5_0')
sh 'mvn clean compile'
}
}
stage('Build') {
steps {
withMaven(maven:'maven_3_5_0')
sh 'mvn test'
}
}
}
}
