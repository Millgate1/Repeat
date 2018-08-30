
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>

<html lang="en">
        
        <head>
            <meta charset="utf-8">
            <title>Recruitment Agency - """),_display_(/*15.42*/title),format.raw/*15.47*/("""</title>
            <!-- Bootstrap Core CSS -->
            <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
            <!-- Custom CSS -->
            <link href=""""),_display_(/*19.26*/routes/*19.32*/.Assets.versioned("stylesheets/main.css")),format.raw/*19.73*/("""" rel="stylesheet" />
        </head>
        
        <body>
        
            <nav class="navbar navbar-inverse">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="/">Recruitment Agency</a>
                    </div>
        
                    <ul class="nav navbar-nav">
 
        
                        <li>
                            <a href=""""),_display_(/*34.39*/routes/*34.45*/.HomeController.about()),format.raw/*34.68*/("""">About Us</a>
                        </li>
                       
        
                        

                    </ul>
        
                </div>
        
            </nav>
        
            <container>
                <row>
                    <div class="col-md-12">
                        """),_display_(/*49.26*/content),format.raw/*49.33*/("""
                    """),format.raw/*50.21*/("""</div>
                </row>
            </container>
        <br>
            <container>
                <footer>
                <row>
                    <div class="col-md-12">
                        
                        &copy;
                        <strong>Recruitment Agency</strong>
                    </div>
                </row>
            </footer>
            </container>
            <script src=""""),_display_(/*65.27*/routes/*65.33*/.Assets.versioned("javascripts/main.js")),format.raw/*65.73*/(""""></script>
        </body>
        
        </html>
        """))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 30 06:10:02 IST 2018
                  SOURCE: /home/wdd/webapps/RepeatCA1/repeat/app/views/main.scala.html
                  HASH: eae81297ffab069ed7fe147a5fc39946847d6442
                  MATRIX: 1206->260|1331->290|1359->292|1520->426|1546->431|1790->648|1805->654|1867->695|2349->1150|2364->1156|2408->1179|2749->1493|2777->1500|2826->1521|3275->1943|3290->1949|3351->1989
                  LINES: 33->7|38->7|40->9|46->15|46->15|50->19|50->19|50->19|65->34|65->34|65->34|80->49|80->49|81->50|96->65|96->65|96->65
                  -- GENERATED --
              */
          