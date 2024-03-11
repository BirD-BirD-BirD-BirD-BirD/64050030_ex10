// 64050030 Kitipum Nornua 
public class ErrorLog implements HandleLog { 
    private HandleLog nextLog;
    @Override
    public void setTypeLog(HandleLog nextLog) {
        this.nextLog = nextLog;
    }

    @Override
    public void processLog(String level, String message) {
        if (level.equals("ERROR"))
            System.out.println("Error Console::Logger: " + message);

        if (nextLog != null)
            nextLog.processLog(level, message);
    }
}