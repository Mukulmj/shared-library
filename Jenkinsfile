@Library('shared-library@hello') _
def hello = new Hello()
node {
	stage ('Hello') {
		hello.call()
	}
}
