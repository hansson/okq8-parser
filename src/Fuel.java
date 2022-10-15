import java.util.List;

public class Fuel {

	private static final List<String> FUEL_PLACES = List.of("OKQ8", "Preem", "Circle k");

	public static boolean contains(String place) {
		return FUEL_PLACES.stream().anyMatch(place::startsWith);
	}

}
