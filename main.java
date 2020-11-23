package project17;

import java.util.Arrays;
import java.util.ArrayList;
public class main {

	public static void main(String[] args) {
		Platform platform = new Platform();
		platform.name = "Steam";
		Developer a = new Developer();
		a.name = "Angel";
		Developer b = new Developer();
		b.name = "Boris";
		Videogame vg1 = new Videogame();
		vg1.name = "LOL";
		vg1.dev = a;
		Videogame vg2 = new Videogame();
		vg2.name = "WOW";
		vg2.dev = b;
		a.videogames = new ArrayList<Videogame>(Arrays.asList(vg1));
		b.videogames = new ArrayList<Videogame>(Arrays.asList(vg2));
		platform.videogames = new ArrayList<Videogame>(Arrays.asList(vg1,vg2));
		System.out.println("Games in " + platform.name);
		for(Videogame vg : platform.videogames) {
			System.out.println(vg.name + " " + vg.dev.name);
		}
	}

}
