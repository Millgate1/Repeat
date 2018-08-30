
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

object addClient extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Client],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(clientForm: Form[models.Client]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/main("Add Client")/*6.20*/{_display_(Seq[Any](format.raw/*6.21*/("""
    """),format.raw/*7.5*/("""<p class="lead"> Add a new client</p>

    """),_display_(/*9.6*/form(action=routes.HomeController.addClientSubmit(), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*9.139*/{_display_(Seq[Any](format.raw/*9.140*/("""

    """),_display_(/*11.6*/CSRF/*11.10*/.formField),format.raw/*11.20*/("""


    """),_display_(/*14.6*/inputText(clientForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*14.80*/("""
    """),_display_(/*15.6*/inputText(clientForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*15.94*/("""
    """),_display_(/*16.6*/inputText(clientForm("address.addName"), '_label -> "Address: ", 'class -> "form-control")),format.raw/*16.96*/("""
    """),_display_(/*17.6*/inputText(clientForm("address.eirCode"), '_label -> "Eircode: ", 'class -> "form-control")),format.raw/*17.96*/("""
    """),_display_(/*18.6*/inputText(clientForm("cv.cvName"), '_label -> "CV Name", 'class -> "form-control")),format.raw/*18.88*/("""
    """),_display_(/*19.6*/inputText(clientForm("cv.objective"), '_label -> "Objective", 'class -> "form-control")),format.raw/*19.93*/("""
    """),_display_(/*20.6*/inputText(clientForm("cv.education"), '_label -> "Education", 'class -> "form-control")),format.raw/*20.93*/("""
    """),_display_(/*21.6*/inputText(clientForm("cv.workExperience"), '_label -> "Work experience", 'class -> "form-control")),format.raw/*21.104*/("""

    """),_display_(/*23.6*/inputText(clientForm("id"),'label -> "", 'hidden -> "hidden")),format.raw/*23.67*/("""

    """),format.raw/*25.5*/("""<div class="actions">
        <input type ="submit" value="add/UpdateClient" class="btn btn-primary">
        <a href=""""),_display_(/*27.19*/routes/*27.25*/.HomeController.index),format.raw/*27.46*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
""")))}),format.raw/*31.2*/("""
""")))}),format.raw/*32.2*/("""
"""))
      }
    }
  }

  def render(clientForm:Form[models.Client]): play.twirl.api.HtmlFormat.Appendable = apply(clientForm)

  def f:((Form[models.Client]) => play.twirl.api.HtmlFormat.Appendable) = (clientForm) => apply(clientForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 30 04:28:39 IST 2018
                  SOURCE: /home/wdd/webapps/RepeatCA1/repeat/app/views/addClient.scala.html
                  HASH: 02f62df1369f3d9a421d022f221e2a53748222d6
                  MATRIX: 965->1|1071->37|1116->34|1144->53|1172->56|1198->74|1236->75|1267->80|1336->124|1478->257|1517->258|1550->265|1563->269|1594->279|1628->287|1723->361|1755->367|1864->455|1896->461|2007->551|2039->557|2150->647|2182->653|2285->735|2317->741|2425->828|2457->834|2565->921|2597->927|2717->1025|2750->1032|2832->1093|2865->1099|3012->1219|3027->1225|3069->1246|3201->1348|3233->1350
                  LINES: 28->1|31->3|34->1|36->4|38->6|38->6|38->6|39->7|41->9|41->9|41->9|43->11|43->11|43->11|46->14|46->14|47->15|47->15|48->16|48->16|49->17|49->17|50->18|50->18|51->19|51->19|52->20|52->20|53->21|53->21|55->23|55->23|57->25|59->27|59->27|59->27|63->31|64->32
                  -- GENERATED --
              */
          