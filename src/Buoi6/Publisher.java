package Buoi6;

public class Publisher {
    private String name;
    private String address;

    public Publisher(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Publisher(){
        this.name = "Unknown";
        this.address = "Unknown";
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
