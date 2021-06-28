
def pipeline

println "XXXX : Build started ..........."

node('local'){
    pipeline = load 'Pipeline.groovy'

    pipeline.doCheckout()
    pipeline.doBuild()
    pipeline.createReleases()

}

pipeline.deploy()
