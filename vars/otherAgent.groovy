def call(Map pipelineParams){

    
    stage("Say hello"){
        agent{
            label 'snyk-agent'
        }
        steps{
            sh "echo hello ${pipelineParams.name}"
        }
        
    }
    
    

}