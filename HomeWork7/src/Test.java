public class Test {
    public static void main(String[] args) {

        Size size = Size.SMALL;

        switch (size) {

            case LARGE:
            case MEDIUM:
            case SMALL:
            case EXTRA_LARGE:
                System.out.println(size);
                break;
        }
    }
}
