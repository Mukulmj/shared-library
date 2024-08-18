def call() {
    stage("Publish Artifact") {
        input {
            message 'Do you want to publish?'
            ok 'Yes, we want to publish'
        }
        steps {
            sh "${mavenCMD} deploy"
        }
    }
}