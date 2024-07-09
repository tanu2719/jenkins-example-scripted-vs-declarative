pipleline{
  agent any
  triggers{
    pollSCM('20 21 09 * * *')
  }
  stages{
    stage('Testing-Trigger'){
      steps{
      echo "tetsing trigger via pollSCM"
    }
    }
  }
}
