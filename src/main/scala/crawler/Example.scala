package crawler
import org.jsoup.Jsoup

import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

object Hello extends App {
  val root: String = "https://www.google.com"
  var urls: List[String] = List()
  var doc: Document = Jsoup
    .connect(
      root + "/search?q=site:github.com/nguyentoanit&ei=jIATXLOQGJyQvQT79argAw&start=0&sa=N&ved=0ahUKEwizhvmhiZ_fAhUcSI8KHfu6Cjw4FBDy0wMIQQ&biw=1680&bih=869")
    .get();
  urls = urls :+ "/search?q=site:github.com/nguyentoanit&ei=jIATXLOQGJyQvQT79argAw&start=0&sa=N&ved=0ahUKEwizhvmhiZ_fAhUcSI8KHfu6Cjw4FBDy0wMIQQ&biw=1680&bih=869"
  var navs: Elements = doc.select("#nav tbody tr td a");
  navs.forEach(
    nav => {
      // Println Attribute of element
      urls = urls :+ nav.attr("href")

    }
  )

  // Remove duplicate elements
  println(urls.distinct)
  println

}
