package session;

public class Phone extends Device{
    private int price;

    public Phone(String name, int price) {
        super(name);
        this.price = price;
}

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String takePhoto(){
        return "Take photo";
    }

    @Override
    public String sound() {
        return super.sound()+" "+takePhoto();
    }
}
