def call() {
    stage("Dependency Check") {
        steps {
            dependencyCheck additionalArguments: '', odcInstallation: 'DP-Java-Check'
        }
    }
}