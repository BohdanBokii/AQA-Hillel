public class Cat extends Animal implements Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("Feeding cat {name}");
    }

    @Override
    public void walk() {
        System.out.println("Walking cat {name}");
    }

    @Override
    public void play() {
        System.out.println("Playing with cat {name}");
    }

    @Override
    public void greets() {
        System.out.println("Cat {name} says: Meow");
    }
}
