import java.io.IOException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Yes24 {
  public static void main(String[] args) throws IOException {
    Connection con = Jsoup.connect("https://www.yes24.com/Product/Search?domain=ALL&query=chat gpt");
    Document doc = con.post();
    Elements eles = doc.select(".info_price .yes_b");
    for(Element e : eles) {
    	System.out.println(e.text());
    }
  }
}
