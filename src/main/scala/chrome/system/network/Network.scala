package chrome.system.network

import scala.concurrent.{Promise, Future}
import scala.scalajs.js

import bindings._

object Network {

  def getNetworkInterfaces: Future[List[Interface]] = {
    val promise = Promise[List[Interface]]
    bindings.Network.getNetworkInterfaces((interfaces: js.Array[bindings.NetworkInterface]) => {
      promise.complete(chrome.lastErrorOrValue {
        (for ((name, iface) <- interfaces.groupBy(_.name)) yield {
          val configs = iface.map(x => new Interface.Config(x.address, x.prefixLength))
          new Interface(name, configs.toList)
        }).toList
      })
    })
    promise.future
  }
  
}