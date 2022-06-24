public class Lion extends Animal implements WildAnimal{

    public Lion(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println(super.getName() + " says: Roar");
    }

    @Override
    public void hunting() {
        System.out.println(super.getName() + " goes hunting");
    }
}
