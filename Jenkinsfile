@Library('mukulmj') _
def clean = new CleanWorkspace()
def clone = new CloneRepo(branch, credentialsId, url)
def codecompile = new CodeCompile()
def unittest = new UnitTest() 
def dependencycheck = new DependencyCheck()
def junit = new JunitReports()
def dependencyreport = DependencyCheckReport()
def publish = PublishArtifact()
pipeline {
    agent any {

    env.mavenHome = tool name: 'default', type: 'maven'
    env.mavenCMD = "${mavenHome}/bin/mvn"
    env.parallelStages = [:]
    def url = 'https://github.com/opstree/spring3hibernate.git'
    def branch = 'java7'
    def credentialsId = ''  
     {
        clean.call()
        clone.call(repoUrl, branchName, credentialsId)
        codecompile.call()
        unittest.call()
        dependencycheck.call()
        junit.call()
        dependencyreport.call()
        publish.call()
    }
    }
}
