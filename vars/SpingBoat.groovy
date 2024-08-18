def call() {
    pipeline {
        agent any
        // ... rest of the pipeline definition with agent, environment, and post sections ...
        stages {
            CloneSalaryRepo()
            CodeCompile()
            UnitTest()                                                              
            DependencyCheck()
            CodeReview()
            QualityGate()
            JunitReports()
            DependencyCheckReport()
            PublishArtifact()
        }
        // ... rest of the pipeline definition with post section ...
    }
}