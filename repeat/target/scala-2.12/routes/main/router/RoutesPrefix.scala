
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/RepeatCA1/repeat/conf/routes
// @DATE:Thu Aug 30 06:02:32 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
