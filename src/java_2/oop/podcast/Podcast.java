package java_2.oop.podcast;

class Podcast {
	/*
		Properties
		   - Title
		   - Host
		   - Duration
		 - **A podcast must exist in the Podcast before it can be added to the playlist (so you can only podcasts that you own.)**
	*/

    String title;
    String host;
    int duration;

    public Podcast(String title, String host, int duration) {
        this.title = title;
        this.host = host;
        this.duration = duration;
    }
    @Override
    public String toString() {
        return "Podcast{" +
                "title='" + title + '\'' +
                ", host='" + host + '\'' +
                ", duration=" + duration +
                '}';
    }

}
