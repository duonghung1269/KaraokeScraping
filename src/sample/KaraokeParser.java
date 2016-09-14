package sample;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Page;
import model.Song;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class KaraokeParser {

	public List<Song> parse(String url) throws IOException {
		Document doc = Jsoup.connect(url).get();
		return parse(doc);
	}
	
	private static List<Song> parse(Document doc) {
		List<Song> songs = new ArrayList<>();
		
		Elements elements = doc.select("div#resultSong div.song");
		int size = elements.size();
		System.out.print("elements: " + size);
		
		for (int i = 0; i < size; i++) {
			Element element = elements.get(i);
			String songId = element.select(".songId").text();
			String songName = element.select(".songName").text();
			String songLyric = element.select(".SongLyric").text();
			String author = element.select(".author").text();
			
			Song s = new Song(songId, songName, songLyric, author);
			songs.add(s);
		}
		
		return songs;
	}
	
	public List<Song> parse(File file) throws IOException {
		Document doc = Jsoup.parse(file, "utf-8");
		return parse(doc);
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
