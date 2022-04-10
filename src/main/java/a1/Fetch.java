package a1;

import java.util.ArrayList;
import java.util.List;

public class Fetch extends Proxy {
    private final DBAccess dbAccess;

    public Fetch() {
        this.dbAccess = new DBAccess();
    }

    public Hotel[] getHotelByName(String name) {
        this.dbAccess.openConnection();
        List<String> result = this.dbAccess.getObjects(DBAccess.HOTEL, name);
        List<Hotel> hotels = new ArrayList<>();
        for (int i = 0; i < result.size(); i++) {
            if (i % 3 == 2) {
                String hotelId = result.get(i - 2);
                String hotelName = result.get(i - 1);
                String hotelLocation = result.get(i);
                hotels.add(new Hotel(hotelId, hotelName, hotelLocation));
            }
        }
        this.dbAccess.closeConnection();
        return hotels.toArray(new Hotel[0]);
    }


}
