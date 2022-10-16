package core.logging;

public class MailLogger implements Logger {
    @Override
    public void logAdd(String data) {
        System.out.println("Maile loglandi : " + data);
    }
}
