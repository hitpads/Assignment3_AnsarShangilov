import handlers.TaskHandler;

public class HighPriorityHandler extends TaskHandler {
    @Override
    public void handleTask(Task task) {
        if (task.getPriority() == Task.Priority.HIGH) {
            System.out.println("High Priority Handler: Processing task - " + task.getDescription());
            // The mediator can be used here if needed
            // mediator.addCommand(new LogTaskCommand(task));
        } else if (nextHandler != null) {
            nextHandler.handleTask(task);
        }
    }
}