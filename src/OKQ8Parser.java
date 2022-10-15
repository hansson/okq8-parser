import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class OKQ8Parser {

	public static void main(String[] args) {

		List<PaymentRow> paymentRows = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);

		scanner.nextLine();
		while (scanner.hasNext("\\d.*")) {
			String line = scanner.nextLine();
			String[] columns = line.split(";");
			if (columns[1].startsWith("Köp")) {
				paymentRows.add(new PaymentRow(columns[2], columns[3]));
			}
		}
		scanner.close();

		paymentRows.stream().sorted().forEach(System.out::println);
	}

}
