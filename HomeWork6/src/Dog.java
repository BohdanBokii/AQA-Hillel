public class Dog extends Animal implements Pet{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Dog {name} says: Woof");
    }

    public void greets (Dog another) {
        System.out.println("Woooof");
    }

    @Override
    public void feed() {
        System.out.println("Feeding dog {name}");
    }

    @Override
    public void walk() {
        System.out.println("Walking dog {name}");
    }

    @Override
    public void play() {
        System.out.println("Playing with dog {name}");
    }
}
