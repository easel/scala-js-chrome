package chrome.tabs.bindings


import chrome.windows.bindings.Window

import scala.scalajs.js

@js.native
trait MoveInfo extends js.Object {

  def windowId: Window.Id = js.native

  def fromIndex: Int = js.native

  def toIndex: Int = js.native

}
