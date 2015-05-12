import scalajs.js.annotation.JSExport
import scalajs.js
import biz.enef.angulate._

@JSExport
object Main {
  val module = angular.createModule("demo", js.Array(
    modules.docks.AngulateDocks())
  )
}
