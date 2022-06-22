public class Lion extends Animal implements WildAnimal{

    public Lion(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Lion {name} says: Roar");
    }

    @Override
    public void hunting() {
        System.out.println("Lion {name} goes hunting");
    }
}
