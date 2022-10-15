import java.util.List;

public class Takeout {
	private static final List<String> TAKEOUT_PLACES = List.of("Galgamarkens Pizzeria", "City Grill", "Pressbyraan",
			"Iz *oh Poke Group", "Subway", "Lee Baguette", "Espresso House", "Max ", "Rest Karlskrona", "Xilinmen",
			"Cafe Karlskrona", "Delivery Hero Sweden Ab", "Munkhtsast", "Stars And Stripes", "Burger King",
			"Kebabhouse", "Sj Ab Ombord", "Starbucks", "Pinchos", "Cafe 3g", "P.m Indian", "Sumo Kitch", "Parken Cafe",
			"Havsvikensrestaurang", "Pizzeria", "Cafe Gelato", "Dilkhush", "Rasta", "McD", "Waynes Coffe",
			"Lennarths Kondi", "Thai Corner", "Olles Korvbar", "Pg I Norrkoping Ab Norrkoping",
			"Hooks Herrgard Hotell Akt Hok", "Cozy Kitchen Karlskrona", "Yame Sushi", "Asian Woking", "Qopla Solna",
			"Art Thaikok Karlskrona");

	public static boolean contains(String place) {
		return TAKEOUT_PLACES.stream().anyMatch(place::startsWith);
	}
}
