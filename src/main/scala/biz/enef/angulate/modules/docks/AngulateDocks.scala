// -   Project: angulate-docks (https://github.com/jokade/angulate-docks)
// Description: Module definition object for angulate-docks
//
// Distributed under the MIT License (see included file LICENSE)
package biz.enef.angulate.modules.docks

import biz.enef.angulate._

final object AngulateDocks {

  final val moduleName = "angulate-docks"

  /**
   * Registers this module with Angular and returns the module's name
   */
  def apply() : String = {
    angular.createModule(moduleName).
      componentOf[DockingLayoutComponent].
      componentOf[DLItemComponent]

    moduleName
  }

}
