package a1;

import java.util.List;

public class HotelRetrieval implements Hotelsuche {
    public static Proxy fetch;
    public static Proxy cache;

    public HotelRetrieval() {
        if (cache == null) cache = new Cache();
        if (fetch == null) fetch = new Fetch();
    }

    @Override
    public List<Hotel> getHotelByName(String name) {
        return cache.getHotelByName(name);
    }
}
