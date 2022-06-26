public class Test {
    public static void main(String[] args) {

        Size size = Size.SMALL;

        switch (size) {

            case LARGE:
            case Medium:
            case SMALL:
            case EXTRA_LARGE:
                System.out.println(size);
                break;
        }
    }
}
