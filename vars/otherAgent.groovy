def call(def name){
 
    parallel(
        hello: {
            stage("Say hello"){
            agent{
                label 'snyk-agent'
            }
         
                sh "echo hello ${name}"
            
            
            }
        }
    )
    
}
