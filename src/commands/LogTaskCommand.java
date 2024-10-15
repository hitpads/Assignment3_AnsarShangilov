public class LogTaskCommand implements TaskCommand {
    private Task task;

    public LogTaskCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        System.out.println("Logging task: " + task.getDescription());
    }
}