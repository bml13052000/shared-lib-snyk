def call(def name){
 
    parallel(
        hello: {
            stage("Say hello"){

            sh "hostname"
            sh "echo hello ${name}"
  
            }
        }
    )
    
}
