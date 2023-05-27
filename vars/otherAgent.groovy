def call(Map pipelineParams){
 
    parallel{
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
