package HotelService;

class Hotel {
    private final String name;
    private final String location;

    public Hotel(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return name + " located in " + location;
    }
}