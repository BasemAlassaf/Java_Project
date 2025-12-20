
import java.time.LocalDate;

public class Task {

    private String taskNumber;
    private String taskName;
    private String productName;
    private int quantityRequest;
    private String customer;
    private LocalDate beginDate;
    private LocalDate endDate;
    private TaskStatus status;
    private ProductLine assignedLine;
    private int quantityCompleted = 0;

    public Task(ProductLine assignedLine, LocalDate beginDate, int quantityCompleted, String customer, LocalDate endDate, String productName, int quantityRequest, TaskStatus status, String taskNumber) {
        this.assignedLine = assignedLine;
        this.beginDate = beginDate;
        this.quantityCompleted = quantityCompleted;
        this.customer = customer;
        this.endDate = endDate;
        this.productName = productName;
        this.quantityRequest = quantityRequest;
        this.status = status;
        this.taskNumber = taskNumber;
    }

    public String getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(String taskNumber) {
        this.taskNumber = taskNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantityRequest() {
        return quantityRequest;
    }

    public void setQuantityRequest(int quantityRequest) {
        this.quantityRequest = quantityRequest;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public ProductLine getAssignedLine() {
        return assignedLine;
    }

    public void setAssignedLine(ProductLine assignedLine) {
        this.assignedLine = assignedLine;
    }

    public double getQuatntityCompleted() {
        return quantityCompleted;
    }

    public void setQuantityCompleted(int quantityCompleted) {
        this.quantityCompleted = quantityCompleted;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public double getCompletedPerCentage() {
        if (quantityRequest == 0) {
            return 0;
        }
        return (quantityCompleted / quantityRequest) * 100.0;
    }

}
