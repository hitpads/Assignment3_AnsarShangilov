import core.Task;

public interface TaskIterator {
    boolean hasNext();
    Task next();
}