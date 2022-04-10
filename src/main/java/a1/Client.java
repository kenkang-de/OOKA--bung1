package a1;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        HotelRetrieval hotelRetrieval=new HotelRetrieval();
        Hotel[] hotelByName = hotelRetrieval.getHotelByName("m");
        System.out.println(Arrays.toString(hotelByName));
    }
}
