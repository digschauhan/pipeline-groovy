#!/usr/bin/env groovy

def pipeline

println "XXXX : Build started ..........."

node(){
    pwd()

    checkout([$class: 'GitSCM', branches: [[name: '*/main']],
    userRemoteConfigs: [[url: 'https://github.com/digschauhan/pipeline-groovy.git']]])


    pipeline = load 'Pipeline.groovy'

    pipeline.doCheckout()
    //pipeline.doBuild()
    //pipeline.createReleases()

}

//pipeline.deploy()
