package academy.certif.taskcheck.mock;

import academy.certif.taskcheck.domain.EntityCheckable;
import academy.certif.taskcheck.domain.Task;
import academy.certif.taskcheck.provider.EntityCheckableProvider;

import java.util.ArrayList;
import java.util.Collection;

public class MockTaskProvider extends EntityCheckableProvider {

    @Override
    public Iterable<EntityCheckable> searchDone(boolean isDone) {
        Collection<EntityCheckable> results = new ArrayList<EntityCheckable>();
        return results;
    }

    @Override
    public EntityCheckable find(int id) {
        EntityCheckable task = new Task(id, "Mettre des chaussettes");
        return task;
    }

    @Override
    public void setDone(int id, boolean isDone) {
        this.find(id).setDone(isDone);
    }
}