package a1;

import java.util.HashMap;
import java.util.List;

public class Cache extends Proxy {

    HashMap<String, Hotels> cacheList = new HashMap<String, Hotels>();

    @Override
    public List<Hotel> getHotelByName(String name) {
        Hotels hotels = new Hotels();
        if (cacheList.get(name) != null) {
            hotels = cacheList.get(name);
        }
        if (hotels.list != null) {
            System.out.println("Cache!");
            return hotels.list;
        }
        hotels.list = new HotelRetrieval().fetch.getHotelByName(name);
        cacheList.put(name, hotels);
        return hotels.list;
    }

    class Hotels {
        List<Hotel> list;
    }
}

