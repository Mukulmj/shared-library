def call() {
    stage("Clone spring3hibernate Repo") {
        steps {
            git branch: 'java7', credentialsId: '', url: 'https://github.com/opstree/spring3hibernate.git'
        }
    }
}