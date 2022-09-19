import org.junit.BeforeClass;
import org.junit.Test;
import util.sql.SQLInstans;
import util.sql.StatemenT;

public class DataBaseTest {
    static StatemenT dbDriver;
    @BeforeClass
    public static void start(){
        dbDriver = SQLInstans.getInstance();
    }
    @Test
    public void test(){
        dbDriver.selectByUserNameEmail("Amy", "jandrese@gmail.com");
    }
    @Test
    public void userById(){
        dbDriver.getUserById("6423382");
    }
    @Test
    public void sameEmail(){
        dbDriver.selectSameEmailUser("bulletin@optonline.net");
    }
    @Test
    public void updatePass(){
        dbDriver.updatePasswordById("1488666", "9359447");
    }
}
