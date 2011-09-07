package controllers

import play._
import play.mvc._

import play.db.anorm._
import models._

object Application extends Controller {
    
    import views.Application._
    
    def update(item:Item) = {
       Item.update(item)
       Action(index)
    }
    
    def create() = {
       val name = params.get("name")
       Item.insert(Item(name, false))
       Action(index)
    }
    
    def delete(id:Long) = {
       Item.delete("id={id}").onParams(id).executeUpdate()
   
       Action(index)
    }
    
    def index = {
       val items:Seq[Item] = Item.find().list();
    	
        html.index(items)
    }
    
}
