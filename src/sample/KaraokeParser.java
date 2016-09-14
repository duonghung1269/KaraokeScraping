package sample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import model.Page;
import model.Song;

public class KaraokeParser {

	public List<Song> parse(String url) throws IOException {
		List<Song> songs = new ArrayList<>();

		Document doc = Jsoup.connect(url).get();

		return songs;
	}

	public Page getPage(String url) throws IOException {
		Document doc = Jsoup.connect(url).get();
		Elements elements = doc.select("ul.pagination a");
		int from = 1;
		int to = 0;
		for (int i = elements.size() - 1; i >= 0; i--) {
			Element element = elements.get(i);
			if (element.text().toLowerCase().contains("cuối")) {
				String href = element.attr("href");
				String lastPage = href.substring(href.lastIndexOf("/") + 1);
				to = Integer.parseInt(lastPage);
				break;
			}
		}

		return new Page(from, to, url);
	}

}
