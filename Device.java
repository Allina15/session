package session;

public class Device {
    private String name;

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sound(){
        return "sound";
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                '}';
    }
}
