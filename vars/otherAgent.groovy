def call(Map pipelineParams){

    stages{
        stage("Say hello"){
            agent{
                label 'snyk-agent'
            }
            steps{
                sh "echo hello ${pipelineParams.name}"
            }
            
        }
    }
    

}