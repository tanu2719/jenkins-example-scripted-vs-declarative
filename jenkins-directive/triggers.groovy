pipleline{
  agent any
  triggers{
    pollSCM('17 21 09 * * *)
  }
  stages{
    stage('Testing-Trigger'){
      steps{
      echo "tetsing trigger via pollSCM"
    }
    }
  }
}

    
