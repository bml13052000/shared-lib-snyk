def call(def name){
 
    parallel{
        stage("Say hello"){
            agent{
                label 'snyk-agent'
            }
            steps{
                sh "echo hello ${name}"
            }
            
        }
    }
    
}
