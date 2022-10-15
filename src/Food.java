import java.util.List;

public class Food {

	private static final List<String> FOOD_PLACES = List.of("Hemköp", "Maxi Ica Stormarknad", "Systembolaget",
			"Ica Supermarket", "Hemmakväll", "Willys", "Coop", "Apoteket", "Ica Kvantum", "Hellofresh");

	public static boolean contains(String place) {
		return FOOD_PLACES.stream().anyMatch(place::startsWith);
	}

}
