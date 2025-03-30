pipeline {
    agent {
        label 'node1'
    }
    stages {
        stage ('Build') {
            step {
                echo "Building is done"
            }
        }
    }
    stage ('Test') {
        steps {
            echo " Testing is done"
        }
    }
    stage ('Deploy') {
        steps {
            echo " Deployment is done"
        }
    }
}