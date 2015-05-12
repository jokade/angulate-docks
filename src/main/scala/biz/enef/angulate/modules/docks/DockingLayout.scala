// -   Project: angulate-docks (https://github.com/jokade/angulate-docks)
// Description: A DockingLayout defines the actual layout grid
//
// Distributed under the MIT License (see included file LICENSE)
package biz.enef.angulate.modules.docks

import scala.scalajs.js

case class DockingLayout(root: DLContainer)

object DockingLayout {
  lazy val default = DockingLayout(DLContainer(js.Array(
    DLBox
  )))

  def apply() : DockingLayout = default
}

sealed trait DLItem

case object DLBox extends DLItem

case class DLContainer(items: Iterable[DLItem], horizontal: Boolean = false) extends DLItem
