package javadatastructures.algorithms.http;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Activity1 {

	public static void main(String[] args) {

		try {
			String path = "http://hc.apache.org";
			Document doc = Jsoup.connect(path).get();
			Elements elements = doc.select("div.section");

			for (Element div : elements) {

				for (Element childrenElement : div.children()) {
					String tag = childrenElement.tagName();

					if (tag.equalsIgnoreCase("h3")) {
						Elements links = childrenElement.getElementsByTag("a");
						for (Element link : links) {
							System.out.println(link.text());
						}
					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
