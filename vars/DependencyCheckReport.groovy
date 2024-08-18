def call() {
    stage("Dependency Check Report") {
        steps {
            dependencyCheckPublisher failedNewCritical: 100, failedNewHigh: 30, failedNewLow: 0, failedNewMedium: 50, failedTotalCritical: 100, failedTotalHigh: 30, failedTotalLow: 0, failedTotalMedium: 50, pattern: '', stopBuild: true, unstableNewCritical: 100, unstableNewHigh: 30, unstableNewLow: 0, unstableNewMedium: 50, unstableTotalCritical: 100, unstableTotalHigh: 30, unstableTotalLow: 0, unstableTotalMedium: 50
        }
    }
}