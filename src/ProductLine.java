
import java.util.ArrayList;
import java.util.List;

public class ProductLine {
    
    private String lineNumber;
    private String lineName;
    private LineStatus status;
    private List<String>tasks;

    public ProductLine(String lineName, String lineNumber, LineStatus status, List<String> tasks) {
        this.lineName = lineName;
        this.lineNumber = lineNumber;
        this.status = status;
        this.tasks = new ArrayList<>();
    }
    //getter and setter
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

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

   
    
}
