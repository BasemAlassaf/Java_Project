
import java.util.List;

public class ProductLine {

    private String lineNumber;
    private String lineName;
    private LineStatus status;
    private List<Task> tasks;
    private List<Product> products;
    private float rate;
    private String note;

    public ProductLine(String lineName, String lineNumber, LineStatus status, List<Task> tasks, List<Product> products, float rate, String note) {
        this.lineName = lineName;
        this.lineNumber = lineNumber;
        this.status = status;
        this.tasks = tasks;
        this.note = note;
        this.rate = rate;
        this.products = products;
    }

    public ProductLine(String lineName, String lineNumber) {
        this.lineName = lineName;
        this.lineNumber = lineNumber;
        this.status = LineStatus.STOPPED;
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

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
