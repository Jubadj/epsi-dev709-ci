package academy.certif.taskcheck.mock;

import academy.certif.taskcheck.domain.EntityCheckable;


public class MockTask extends EntityCheckable {

    private String description;

    public MockTask(int id, String description) {
        this.id = id;
        this.description = description;
        this.isDone = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return id + ": " + description;
    }

    @Override
    public void setDone(boolean isDone){
        System.out.println("Yes ! now everything is mocked");
        this.isDone = true;
    }

}
