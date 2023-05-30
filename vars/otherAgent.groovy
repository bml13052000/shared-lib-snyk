def call(def name){
 
    parallel(
        hello: {
            stage("Say hello"){
             git branch: 'main', url: 'https://github.com/KmartAU/devsecops-webgoat-test.git',credentialsId: 'fe60baad-0061-4b8c-8851-29b413ba9b3e'
             sh "hostname"
             sh "echo hello ${name}"
  
            }
        }
    )
    
}
