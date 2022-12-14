package academy.certif.taskcheck.mock;

import academy.certif.taskcheck.domain.EntityCheckable;
import academy.certif.taskcheck.provider.EntityCheckableProvider;

import java.util.ArrayList;
import java.util.Collection;

public class MockTaskProvider extends EntityCheckableProvider {

    public MockTaskProvider() {
        this.data = new ArrayList<EntityCheckable>();
        this.data.add(new MockTask(1, "Developper un robot magique"));
        this.data.add(new MockTask(2, "Acheter une licorne"));
        this.data.add(new MockTask(3, "Partir vivre dans une tasse"));
        this.data.add(new MockTask(4, "Ajouter des enceintes a la bouteille d'eau"));
    }

    @Override
    public Iterable<EntityCheckable> searchDone(boolean isDone) {
        Collection<EntityCheckable> results = new ArrayList<EntityCheckable>();
        return results;
    }


    @Override
    public void setDone(int id, boolean isDone) {
        EntityCheckable entity = this.find(id);
        entity.setDone(true);
    }
}