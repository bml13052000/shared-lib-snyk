def call(Map pipelineParams){
 
    paralell{
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