
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
"""),_display_(/*2.2*/main("Welcome to Play")/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""
"""),format.raw/*3.1*/("""<html>
    <head>
        <title>About Us</title>
        <style>
            h1 """),format.raw/*7.16*/("""{"""),format.raw/*7.17*/("""
                """),format.raw/*8.17*/("""color: red;
            """),format.raw/*9.13*/("""}"""),format.raw/*9.14*/("""
        """),format.raw/*10.9*/("""</style>
    </head>
    <body>
        <h1>About Us</h1>
    </body>
</html>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Aug 29 23:57:15 IST 2018
                  SOURCE: /home/wdd/webapps/RepeatCA1/repeat/app/views/about.scala.html
                  HASH: 0c18e87e862cb492e3a30bfc05f2187c5c98957d
                  MATRIX: 1030->0|1072->17|1103->40|1142->42|1169->43|1277->124|1305->125|1349->142|1400->166|1428->167|1464->176
                  LINES: 33->1|34->2|34->2|34->2|35->3|39->7|39->7|40->8|41->9|41->9|42->10
                  -- GENERATED --
              */
          