package chrome.extension.bindings

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.JSGlobal

import org.scalajs.dom.Window

@js.native
trait ViewsRequest extends js.Any {
  var `type`: UndefOr[String] = js.native
  var windowId: UndefOr[Int] = js.native
  var tabId: UndefOr[Int] = js.native
}

@js.native
@JSGlobal("chrome.extension")
object Extension extends js.Object {
  def getViews(views: ViewsRequest): js.Array[Window] = js.native
}
