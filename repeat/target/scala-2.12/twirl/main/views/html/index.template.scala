
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Client],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(clients: List[models.Client]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),_display_(/*3.2*/main("Client Page")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
  
  """),format.raw/*5.3*/("""<p class="lead">Clients</p>
  
  """),_display_(/*7.4*/if(flash.containsKey("success"))/*7.36*/{_display_(Seq[Any](format.raw/*7.37*/("""
    """),format.raw/*8.5*/("""<div class="alert alert-success">
      """),_display_(/*9.8*/flash/*9.13*/.get("success")),format.raw/*9.28*/("""
    """),format.raw/*10.5*/("""</div>
  """)))}),format.raw/*11.4*/("""
  """),format.raw/*12.3*/("""<table class="table table-bordered table-hover table-condensed">
  
  <thead>
  
  <!-- The header row-->
  
  <tr>
     <th>ID</th>
     <th>Client Name</th>
     <th>Description</th>
     <th>Address</th>
     <th>CV</th>
  </tr>
  
  </thead>
  
  <tbody>
  
  <!-- Client row(s) -->
  
  <tr>
    """),_display_(/*33.6*/for(c<-clients) yield /*33.21*/ {_display_(Seq[Any](format.raw/*33.23*/("""
      """),format.raw/*34.7*/("""<tr>
        <td>"""),_display_(/*35.14*/c/*35.15*/.getId),format.raw/*35.21*/("""</td>
        <td>"""),_display_(/*36.14*/c/*36.15*/.getName),format.raw/*36.23*/("""</td>
        <td>"""),_display_(/*37.14*/c/*37.15*/.getDescription),format.raw/*37.30*/("""</td>
        <td>"""),_display_(/*38.14*/c/*38.15*/.getAddress.getAddressName()),format.raw/*38.43*/("""</td>
        <td>"""),_display_(/*39.14*/c/*39.15*/.getCV.getCVObjective()),format.raw/*39.38*/("""</td>

        <td>
            <a href=""""),_display_(/*42.23*/routes/*42.29*/.HomeController.updateClient(c.getId)),format.raw/*42.66*/("""" class="button-xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
            </a>
        </td>

        <td>
            <a href=""""),_display_(/*48.23*/routes/*48.29*/.HomeController.deleteClient(c.getId)),format.raw/*48.66*/("""" class="btn-xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
            </a>
        </td>
      </tr>
    """)))}),format.raw/*53.6*/("""
  
  """),format.raw/*55.3*/("""</tr>
  
  </tbody>
  
  </table>

  <p>
      <a href=""""),_display_(/*62.17*/routes/*62.23*/.HomeController.addClient()),format.raw/*62.50*/("""">
          <button class="btn btn-primary">Add a client</button>
      </a>
  </p>
  
  """)))}))
      }
    }
  }

  def render(clients:List[models.Client]): play.twirl.api.HtmlFormat.Appendable = apply(clients)

  def f:((List[models.Client]) => play.twirl.api.HtmlFormat.Appendable) = (clients) => apply(clients)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 30 06:10:02 IST 2018
                  SOURCE: /home/wdd/webapps/RepeatCA1/repeat/app/views/index.scala.html
                  HASH: 4092859ad3f93f975a159d7bc5f9b270491c965a
                  MATRIX: 961->1|1086->31|1114->34|1141->53|1180->55|1212->61|1271->95|1311->127|1349->128|1380->133|1446->174|1459->179|1494->194|1526->199|1566->209|1596->212|1924->514|1955->529|1995->531|2029->538|2074->556|2084->557|2111->563|2157->582|2167->583|2196->591|2242->610|2252->611|2288->626|2334->645|2344->646|2393->674|2439->693|2449->694|2493->717|2562->759|2577->765|2635->802|2826->966|2841->972|2899->1009|3101->1181|3134->1187|3218->1244|3233->1250|3281->1277
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|44->12|65->33|65->33|65->33|66->34|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|74->42|74->42|74->42|80->48|80->48|80->48|85->53|87->55|94->62|94->62|94->62
                  -- GENERATED --
              */
          