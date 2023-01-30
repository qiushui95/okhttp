package okhttp3

import java.net.InetAddress
import java.net.UnknownHostException

interface DynamicDns : Dns {
  override fun lookup(hostname: String): List<InetAddress> {
    return Dns.SYSTEM.lookup(hostname)
  }

  @Throws(UnknownHostException::class)
  fun lookup(hostname: String, url: HttpUrl): List<InetAddress>
}