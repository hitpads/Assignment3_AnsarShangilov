import core.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements TaskIterator {
    private List<Task> tasks = new ArrayList<>();
    private int position = 0;

    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public boolean hasNext() {
        return position < tasks.size();
    }

    @Override
    public Task next() {
        if (hasNext()) {
            return tasks.get(position++);
        }
        return null;
    }
}