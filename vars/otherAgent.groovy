def call(Map pipelineParams){

    pipeline{
        agent{
            label 'snyk-agent'
        }

        stages{
            stage("Say hello"){
                steps{
                    sh "echo hello ${pipelineParams.name}"
                }
                
            }
        }
    }

}