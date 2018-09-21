package chrome.extension

import scala.scalajs.js

import org.scalajs.dom

object Extension {
  def getViews(typ: String): Array[dom.Window] =
    bindings.Extension
      .getViews(
        js.Dynamic.literal(`type` = typ).asInstanceOf[bindings.ViewsRequest])
      .toArray
}
