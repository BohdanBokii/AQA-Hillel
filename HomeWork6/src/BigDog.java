public class BigDog extends Dog {

    public BigDog(String name) {
        super(name);
    }
    @Override
    void greets() {
        System.out.println("Woow");
    }
    @Override
    void greets(Dog another) {
        System.out.println("Woooow");
    }
    @Override
    void greets(BigDog another) {
        System.out.println("Woooooooow");
    }
}
