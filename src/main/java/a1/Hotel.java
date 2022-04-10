package a1;

public class Hotel {
    final private String id;
    final private String name;
    final private String location;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public Hotel(String id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }
}
