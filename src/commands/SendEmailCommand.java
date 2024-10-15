public class SendEmailCommand implements TaskCommand {
    private Task task;

    public SendEmailCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        System.out.println("Sending email about task: " + task.getDescription());
    }
}