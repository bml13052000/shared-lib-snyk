def call(Map pipelineParams){

    pipeline{
        agent{
            label 'snyk-agent'
        }

        stages{
            stage("Say hello"){
                sh "echo hello ${pipelineParams.name}"
            }
        }
    }

}