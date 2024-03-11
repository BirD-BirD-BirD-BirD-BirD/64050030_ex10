//64050030 Kitipum Nornua
public class ConsoleLog implements HandleLog { 
    private HandleLog nextLog;
    @Override
    public void setTypeLog(HandleLog nextLoglog) {
        this.nextLog = nextLoglog;
    }

    @Override
    public void processLog(String level, String message) {
        System.out.println("Standard Console::Logger: " + message);
        if (nextLog != null) {
            nextLog.processLog(level, message);
        }
    }
}
