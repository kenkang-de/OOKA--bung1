package a1;

public class HotelRetrieval implements Hotelsuche {
    private final Proxy fetch;

    public HotelRetrieval() {

        this.fetch = new Fetch();
    }

    @Override
    public Hotel[] getHotelByName(String name) {
        return fetch.getHotelByName(name);
    }
}
