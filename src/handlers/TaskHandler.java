package handlers;

public abstract class TaskHandler {
    protected TaskHandler nextHandler;
    protected TaskMediator mediator;

    public void setNextHandler(TaskHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void setMediator(TaskMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void handleTask(Task task);
}