import commands.TaskCommand;
import core.Task;
import handlers.TaskHandler;

import java.util.ArrayList;
import java.util.List;

public class TaskMediator {
    private List<TaskHandler> handlers = new ArrayList<>();
    private List<TaskCommand> commands = new ArrayList<>();

    public void addHandler(TaskHandler handler) {
        handlers.add(handler);
        handler.setMediator(this);
    }

    public void addCommand(TaskCommand command) {
        commands.add(command);
    }

    public void notifyHandlers(Task task) {
        for (TaskHandler handler : handlers) {
            handler.handleTask(task);
        }
    }

    public void executeCommands() {
        for (TaskCommand command : commands) {
            command.execute();
        }
        commands.clear();
    }
}