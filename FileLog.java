// 64050030 Kitipum Nornua
public class FileLog implements HandleLog { 
    private HandleLog nextLog;
    @Override
    public void setTypeLog(HandleLog nextLog) {
        this.nextLog = nextLog;
    }

    @Override
    public void processLog(String level, String message) {
        if (!(level.equals("INFO")))
            System.out.println("File::Logger: " + message);

        if (nextLog != null)
            nextLog.processLog(level, message);
    }
}
