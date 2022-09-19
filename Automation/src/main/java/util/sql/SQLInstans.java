package util.sql;

public class SQLInstans {
    private static StatemenT instance = null;

    public static synchronized StatemenT getInstance() {
        try {
            if (instance == null) {
                instance = new StatemenT();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
}
