public abstract class Item {
    public String name;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    protected String id;
    float price;
    public abstract void showInfo();
    public Item(String name, String description, String id, float price){
        this.name = name;
        this.description = description;
        this.id = id;
        this.price = price;
    }

}
