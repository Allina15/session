package session;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("Iphone",1100);
        phone.sound();
        System.out.println(phone+phone.sound());
    }
}
