public interface HandleLog { 
    public void setTypeLog(HandleLog nextLog);
    public void processLog(String level, String message);
}
