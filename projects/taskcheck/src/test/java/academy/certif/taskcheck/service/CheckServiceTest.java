package academy.certif.taskcheck.service;

import academy.certif.taskcheck.domain.EntityCheckable;
import academy.certif.taskcheck.domain.Task;
import academy.certif.taskcheck.mock.MockTaskProvider;
import academy.certif.taskcheck.provider.EntityCheckableProvider;
import org.junit.*;
import org.junit.Assert;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CheckServiceTest {

    private static EntityCheckableProvider taskProvider ;
    private static CheckService checkService ;

    @BeforeClass
    public static void init(){
        CheckServiceTest.taskProvider = new MockTaskProvider();
        CheckServiceTest.checkService = new CheckService(taskProvider);
    }

    @Test
    public void testListNotDone() {
        Iterable<EntityCheckable> tab = new ArrayList<>();
        assertEquals(CheckServiceTest.checkService.listNotDone(),tab);
    }

    @Test
    public void testCheck() {
//        Task task = new Task(7, "Mettre des chaussettes");
        EntityCheckable task = taskProvider.find(1);
        assertFalse(task.isDone());
        CheckServiceTest.checkService.check(1);
        assertTrue(task.isDone());
    }
}