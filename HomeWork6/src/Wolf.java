public class Wolf extends Animal implements WildAnimal{

    public Wolf(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wolf {name} says: Hawoo");
    }

    @Override
    public void hunting() {
        System.out.println("Wolf {name} goes hunting");
    }
}
