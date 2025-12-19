import java.util.List;

public class ProductLine {

    private String lineNumber;
    private String lineName;
    private LineStatus status;
    private List<Task> tasks;
    private float rate;
    private String note;

    public ProductLine(String lineName, String lineNumber , LineStatus status , List <Task> tasks) {
        this.lineName = lineName;
        this.lineNumber = lineNumber;
        this.status = status;
        this.tasks = tasks;

    }

    public ProductLine(String lineName , String lineNumber){
        this.lineName = lineName;
        this.lineNumber = lineNumber;
        this.status = LineStatus.Stopped;
    }

    // getter and setter
    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public LineStatus getStatus() {
        return status;
    }

    public void setStatus(LineStatus status) {
        this.status = status;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

}
