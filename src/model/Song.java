package model;

public class Song {
	private String number;
	private String name;
	private String caption;
	private String lyricUrl;
	private String fullLyric;
	private Volume volume;
	private String tags;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getLyricUrl() {
		return lyricUrl;
	}

	public void setLyricUrl(String lyricUrl) {
		this.lyricUrl = lyricUrl;
	}

	public String getFullLyric() {
		return fullLyric;
	}

	public void setFullLyric(String fullLyric) {
		this.fullLyric = fullLyric;
	}

	public Volume getVolume() {
		return volume;
	}

	public void setVolume(Volume volume) {
		this.volume = volume;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

}
