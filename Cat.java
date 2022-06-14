public class Cat extends Animal {

    private String color;

    //Getter

    public String getColor() {
        return color;
    }

    //Setter

    public void setColor(String color) {
        this.color = color;
    }

    //Constructor1

    public Cat(Boolean vegetarian, String eats, int noOfLegs, String color) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }

    //Constructor2

    public Cat(Boolean vegetarian, String eats, int noOfLegs) {
        this(vegetarian, eats, noOfLegs, "black");
    }
}
