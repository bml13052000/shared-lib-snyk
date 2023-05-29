def call(def name){
 
    parallel(
        hello: {
            stage("Say hello"){
            agent{
                label 'snyk-agent'
            }
            steps{
                sh "echo hello ${name}"
            }
            
            }
        }
    )
    
}
