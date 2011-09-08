import play.jobs._
    
import play.db._

@OnApplicationStart class BootStrap extends Job {
    
    override def doJob {
        
        
       // Create the DB
        Evolutions.applyScript(true)
        
    }
    
}