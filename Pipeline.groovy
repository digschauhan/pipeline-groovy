
class Pipeline implements Serializable {

    boolean doCheckout(){
        println "Checking out code...."
        return true
    }

    boolean doBuild(){
        println "Doing build ....."
        return true
    }

    boolean publishArtifact(){
        println "Publishing artifacts ....."
        return true
    }

    boolean createReleases(){
        println "Create releases ....."
        return true
    }

    boolean deploy(){
        println "Deploying the code ....."
        return true
    }


    static void main(String[] args) {
        println "Main() method called."
    }

}
