package core.logging;

public class DatabaseLogger implements Logger {
    @Override
    public void logAdd(String data) {
        System.out.println("Veritabanına loglandı : " + data);
    }
}
