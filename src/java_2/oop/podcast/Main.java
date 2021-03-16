package java_2.oop.podcast;

public class Main {

	public static void main(String[] args) {
		/*	Do the following tasks here in the main method, or in methods on this LambdaMain class.
			Create 9 podcasts.
			Create 3 Podcasting Apps
			Load 3 podcasts in each of the podcasting apps
			 - play and stop a podcast in one of the podcasting apps
			 - go to the next() and previous() podcasts in the 2nd podcasting app
			 - stop() the playing podcast on the 2nd podcasting app
			 - put a podcast on repeat() in the 3rd podcasting app.
       		 - show the playlist in the 3rd podcasting app
       		 - remove a podcast from the playlist in the 3rd podcasting app
		 */

		Podcast podcast1 = new Podcast("The Adventure Zone", "Mark", 61);
		Podcast podcast2 = new Podcast("Chapo Trap House", "Bill", 59);
		Podcast podcast3 = new Podcast("Wait Wait… Don’t Tell Me", "Elon", 28);
		Podcast podcast4 = new Podcast("WTF with Marc Maron", "Jeff", 36);
		Podcast podcast5 = new Podcast("Put Your Hands Together with Cam", "Jack", 66);
		Podcast podcast6 = new Podcast("Revisionist History", "Larry", 60);
		Podcast podcast7 = new Podcast("Stuff You Should Know", "Tony", 63);
		Podcast podcast8 = new Podcast("Getting Curious with Jonathan Van Ness", "Steve", 25);
		Podcast podcast9 = new Podcast("Dan Carlin’s Hardcore History", "Rachel Dolezal", 71);

		PodcastingApp Spotify = new PodcastingApp("Spotify Podcasts");
		PodcastingApp Pandora = new PodcastingApp("Pandora Podcasts");
		PodcastingApp XirusXM = new PodcastingApp("XirusXM Podcasts");

		//Podcast1
		Spotify.addPodcast(podcast8);
		Spotify.addPodcast(podcast7);
		Spotify.addPodcast(podcast9);
		System.out.println(Spotify);
		Spotify.play();
		Spotify.stop();

		//podcast2
		Pandora.addPodcast(podcast4);
		Pandora.addPodcast(podcast5);
		Pandora.addPodcast(podcast6);
		System.out.println(Pandora);
		Pandora.play();
		Pandora.next();
		Pandora.previous();
		Pandora.stop();

		//podacast3
		XirusXM.addPodcast(podcast1);
		XirusXM.addPodcast(podcast2);
		XirusXM.addPodcast(podcast3);
		System.out.println(XirusXM);
		XirusXM.play();
		XirusXM.repeat();
		XirusXM.stop();
		XirusXM.removeFromPlaylist(podcast1);
		XirusXM.showPlaylist();

	}

}
