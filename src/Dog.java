public class Dog {
    private String name;
    private int age;
    private String color;
    private int height;

    // Принимает 4 параметра и устанавливает соотв. значения в поля
    public Dog(String name, int age, String color, int height) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.height = height;
    }

    // Принимает 2 параметра и задает значения по-умолчанию для 2-х других полей
    public Dog(String name, int age) {
        // Call another constructor in constructor
        this(name, age, "brown", 30);
    }

    // Не принимает параметры, лишь печатает в консоль "Creating object of the class Dog."
    public Dog() {
        System.out.println("Creating object of the class Dog.");
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

