package core.logging;

public class FileLogger implements Logger {
    @Override
    public void logAdd(String data) {
        System.out.println("Dosyaya loglandi : " + data);
    }
}
