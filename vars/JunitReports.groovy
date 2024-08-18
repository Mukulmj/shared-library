def call() {
    stage("Junit Reports") {
        steps {
            recordIssues(tools: [junitParser(pattern: '**/target/surefire-reports/TEST-*.xml')])
        }
    }
}