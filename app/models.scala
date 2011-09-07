package models
 
import play.db.anorm._
import play.db.anorm.SqlParser._
import play.db.anorm.defaults._
 

case class Item(
    id: Pk[Long], 
    name: String, isDone: Boolean
)

object Item extends Magic[Item] {
    
    def apply(name: String, isDone: Boolean) = {
        new Item(NotAssigned, name, isDone)
    }  
}