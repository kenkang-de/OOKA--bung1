package a1;

import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        HotelRetrieval hotelRetrieval = new HotelRetrieval();
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            input = scanner.next();
            List<Hotel> hotelByName = hotelRetrieval.getHotelByName(input);
            for (Hotel hotel : hotelByName) {
                System.out.println(hotel.toString());
            }

        } while (input != null);

    }
}
