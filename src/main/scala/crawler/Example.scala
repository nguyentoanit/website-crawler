package crawler
import org.jsoup.Jsoup

import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

object Hello extends App {
  // var url =
  var doc: Document = Jsoup
    .connect(
      "https://www.google.com/search?q=site:github.com/nguyentoanit&ei=jIATXLOQGJyQvQT79argAw&start=0&sa=N&ved=0ahUKEwizhvmhiZ_fAhUcSI8KHfu6Cjw4FBDy0wMIQQ&biw=1680&bih=869")
    .get();
  var navs: Elements = doc.select("#nav tbody tr td a");
  navs.forEach(
    nav => {
      // Println Attribute of element
      println(nav.attr("href"))
      println
    }
  )
}
