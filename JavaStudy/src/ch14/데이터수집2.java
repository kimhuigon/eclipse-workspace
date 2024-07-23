package ch14;

import java.io.IOException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 데이터수집2 {
	public static void main(String[] args) {
		String url = "https://zdnet.co.kr/newskey/?lstcode=인공지능";
		Connection con = Jsoup.connect(url);
		try {
			Document doc = con.get();
			Elements els = doc.select("h3");
			for (Element el : els) {
				String text = el.text();
				System.out.println(text);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}