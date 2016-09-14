package sample;

import java.io.IOException;

import model.Page;

import org.junit.Assert;
import org.junit.Test;

public class KaraokeParserTest {
	
	KaraokeParser parser = new KaraokeParser();
	
	@Test
	public void testGetPage() throws IOException {
		String url = "http://www.masokaraoke.net/list-karaoke/";
		Page page = parser.getPage(url);
		System.out.print(page);
	}
}
