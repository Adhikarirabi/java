package java_2.oop.podcast;

class PodcastingApp {

/*
	   Properties :
	   - appName (Apple Podcasts, Pocket Casts, Overcast, Google Podcasts, etc.)
       - playlist of Podcasts (with a capital P)

       Methods :
       - loadPlaylist (replace the existing playlist with a new one)
       - addPodcast (add a new podcast to the playlist.  order of the playlist should be maintained.
       - play()
       - stop()
       - next()
       - previous()
       - repeat()
       - showPlaylist()
       - removeFromPlaylist(Podcast)
*/
String appName;
    List<Podcast> playlist = new ArrayList<>();
    int current;

    public PodcastingApp(String appName) {
        this.appName = appName;
        this.current = 0;
    }

    public void loadPodcast(ArrayList<Podcast> playlist) {
        this.playlist = playlist;
    }

    public void addPodcast(Podcast podcast) {
        playlist.add(podcast);
    }

    public void play() {
        System.out.println( playlist.get(current) );
    }

    public void stop() {
        System.out.println("Stop");
    }

    public void next() {
        if (current + 1 > playlist.size()) {
            current = 0;
        } else {
            current += 1;
        }
        System.out.println("NEXT");
        play();
    }

    public void previous() {
        if (current == 0) {
            current = playlist.size();
        } else {
            current -= 1;
        }
        System.out.println("PREV");
        play();
    }

    public void repeat() {
        System.out.println("REPEAT");
        play();
    }

    public void showPlaylist() {
        System.out.println(playlist);
    }

    public void removeFromPlaylist(Podcast podcast) {
        playlist.remove(podcast);
    }

    @Override
    public String toString() {
        return "PodcastingApp{" +
                "appName='" + appName + '\'' +
                ", playlist=" + playlist +
                '}';
    }
}

