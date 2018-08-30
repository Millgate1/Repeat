
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/RepeatCA1/repeat/conf/routes
// @DATE:Thu Aug 30 06:02:32 IST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def addClientSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addClientSubmit")
    }
  
    // @LINE:13
    def deleteClient(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delClient/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:7
    def about(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "aboutUs")
    }
  
    // @LINE:14
    def updateClient(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateClient/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:9
    def addClient(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addClient")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:18
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
