def call(def token){
 
    parallel(
        Snyk Open Source: {
            stage("Snyk test"){
             git branch: 'main', url: 'https://github.com/KmartAU/devsecops-webgoat-test.git',credentialsId: 'fe60baad-0061-4b8c-8851-29b413ba9b3e'
             sh "hostname"
            //  sh "echo hello ${name}"
            sh "snyk auth ${token}"
            try{
                sh "snyk test"
            } catch (Exception e){
                sh "snyk monitor"
            }
  
            }
        }
    )
    
}
