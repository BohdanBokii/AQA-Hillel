package util;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
/*-----------------------------------HomeWork10--------------------------------------*/
public class UserDataProvider {
    static List <String> ListName = Arrays.asList("Princess", "Shelby", "Rocky", "Sadie", "Boomer", "Milo");

    public static String getRandomName() {
        return ListName.get(new Random().nextInt(ListName.size()));
    }

    public static int getRandomAge() {
        return new Random().nextInt(100);
    }
}
