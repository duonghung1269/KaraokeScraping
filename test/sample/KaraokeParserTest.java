package sample;

import java.io.File;
import java.io.IOException;
import java.util.List;

import model.Page;
import model.Song;

import org.junit.Assert;
import org.junit.Test;

import utils.Constants;

public class KaraokeParserTest {
	
	KaraokeParser parser = new KaraokeParser();
	
	public void testGetPage() throws IOException {
		String url = "http://www.masokaraoke.net/list-karaoke/";
		Page page = parser.getPage(url);
		System.out.print(page);
	}
	
	public void testParse() throws IOException {
		String url = "http://www.masokaraoke.net/bai-hat/order-by-title/'+order+by+Title%3B%23/avn/Title/";
		List<Song> parse = parser.parse(url);
		System.out.print(parse.size());
	}
	
	@Test
	public void testParseFile() throws IOException {
		String filePath = Constants.INPUT_HTML_PATH + Constants.ARIRANG_HTML;
		List<Song> parse = parser.parse(new File(filePath));
		System.out.print(parse.size());
	}
}
