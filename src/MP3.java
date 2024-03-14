public abstract class MP3 extends Item{
    int duration;
    public MP3(String name, String description, String id, float price, int duration) {
        super(name, description, id, price);
        this.duration = duration;
    }
}
