pipeline{
    agent any
    triggers{
    pollSCM('28 21 09 * * ')        
    }
    stages{
        stage('test-trigger'){
            steps{
                echo 'jenkinsfile to test pollSCM trigger'
            }
        }
    }
}
