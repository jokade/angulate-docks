// -   Project: angulate-docks (https://github.com/jokade/angulate-docks)
// Description:
//
// Distributed under the MIT License (see included file LICENSE)
package biz.enef.angulate.modules.docks

import biz.enef.angulate._

import scala.scalajs.js

@Component(ComponentDef(
  selector = "docks",
  template = """<docks-item></docks-item>""",
  bind = js.Dictionary(
    "layout" -> "="
  )
))
class DockingLayoutComponent {
  var layout: DockingLayout = DockingLayout()
}


@Component(ComponentDef(
  selector = "docksItem",
  template = """<div>ITEM!</div>"""
))
class DLItemComponent {

}
