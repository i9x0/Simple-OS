package projecto1;
public class Process {
    private int processID;
    private String Status;
    private String ProcessName;
    private int processOrder;
    public Process() {
    }
    public Process(int processID, String Status, String ProcessName, int processOrder) {
        this.processID = processID;
        this.Status = Status;
        this.ProcessName = ProcessName;}
    public void setProcessID(int processID) {
        this.processID = processID;
    }
    public int getProcessID() {
        return this.processID;
    }
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }
    public String getProcessName() {
        return this.ProcessName;
    }
    public void setStatus(String Status) {
        this.Status = Status;
    }
    public String getStatus() {
        return this.Status;
    }
}
