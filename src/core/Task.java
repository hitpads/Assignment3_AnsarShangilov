public class Task {
    private String description;
    private Priority priority;

    public enum Priority {
        LOW, MEDIUM, HIGH
    }

    public Task(String description, Priority priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public Priority getPriority() {
        return priority;
    }
}