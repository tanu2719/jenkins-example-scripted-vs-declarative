pipeline{
  agent any
  triggers{
    pollSCM('21 21 09 * * *')
  }
  stages{
    stage('Testing-Trigger'){
      steps{
      echo "tetsing trigger via pollSCM"
    }
    }
  }
}
