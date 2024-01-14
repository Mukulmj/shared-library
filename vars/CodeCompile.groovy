def call() {
    stage("Code Compile") {
        steps {
            sh "${mavenCMD} compile"
        }
    }
}