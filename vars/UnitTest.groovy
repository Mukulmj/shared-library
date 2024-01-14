def call() {
    stage("Unit Test") {
        steps {
            sh "${mavenCMD} surefire:test"
        }
    }
}