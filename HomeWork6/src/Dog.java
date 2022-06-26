public class Dog extends Animal implements Pet{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println(super.getName() + " says Woof");
    }

    public void greets (Dog another) {
        System.out.println("Woooof");
    }

    @Override
    public void feed() {
        System.out.println("Feeding " + super.getName());
    }

    @Override
    public void walk() {
        System.out.println("Walking " + super.getName());
    }

    @Override
    public void play() {
        System.out.println("Playing with " + super.getName());
    }
}
