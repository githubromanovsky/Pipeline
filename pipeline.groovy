pipeline{
    stage("A"){
        steps{
            echo "AA"
        }
        post{
            always{
                echo "====++++always++++===="
            }
            success{
                echo "====++++A executed successfully++++===="
            }
            failure{
                echo "====++++A execution failed++++===="
            }
    
        }
    }
}