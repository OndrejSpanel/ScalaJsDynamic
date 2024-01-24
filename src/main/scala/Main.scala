import scala.language.dynamics
import scala.scalajs.js
import scala.scalajs.js.annotation._

object Main {
  @js.native
  @JSGlobal("MyDynamic")
  class MyDynamic extends js.Any with Dynamic {
    @JSBracketAccess
    def selectDynamic(name: String): js.Any = js.native
    @JSBracketAccess
    def updateDynamic(name: String)(value: js.Any): Unit = js.native
  }

  def main(args: Array[String]): Unit = {
    val d = new MyDynamic
    println(d.one)
    println(d.two)
  }
}
