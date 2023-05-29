def call(def name){
 
    parallel(
        hello: {
            stage("Say hello"){
            agent{
                label 'snyk-agent'
            }

            steps{
                sh "hostname"
                sh "echo hello ${name}"
                }
   
            
            
            
            }
        }
    )
    
}
