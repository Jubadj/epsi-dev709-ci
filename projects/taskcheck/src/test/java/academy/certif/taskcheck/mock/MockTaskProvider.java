package academy.certif.taskcheck.mock;

import academy.certif.taskcheck.domain.EntityCheckable;
import academy.certif.taskcheck.domain.Task;
import academy.certif.taskcheck.provider.EntityCheckableProvider;

import java.util.ArrayList;
import java.util.Collection;

public class MockTaskProvider extends EntityCheckableProvider {

    public MockTaskProvider() {
        this.data = new ArrayList<EntityCheckable>();
        this.data.add(new Task(1, "Developper un robot magique"));
        this.data.add(new Task(2, "Acheter une licorne"));
        this.data.add(new Task(3, "Partir vivre dans une tasse"));
        this.data.add(new Task(4, "Ajouter des enceintes a la bouteille d'eau"));
    }

    @Override
    public Iterable<EntityCheckable> searchDone(boolean isDone) {
        Collection<EntityCheckable> results = new ArrayList<EntityCheckable>();
        return results;
    }

//    @Override
//    public EntityCheckable find(int id) {
//        EntityCheckable task = new Task(id, "Mettre des chaussettes");
//        return task;
//    }

    @Override
    public void setDone(int id, boolean isDone) {
        System.out.println("it fucking here : MockTaskProvider.setDone");
        EntityCheckable entity = this.find(id);
        entity.setDone(true);
    }
}