def call(def name){
 
    parallel(
        hello: {
            stage("Say hello"){
            agent{
                label 'snyk-agent'
            }
   
            sh "hostname"
            sh "echo hello ${name}"
            
            
            }
        }
    )
    
}
