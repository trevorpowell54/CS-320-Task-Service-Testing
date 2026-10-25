package test;

import task.Task;
import task.TaskService;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskServiceTest {

    private TaskService taskService;

    @BeforeEach
    void setUp() {
        taskService = new TaskService();
    }

    @Test
    void testAddTask() {
        Task task = new Task("12345", "Test Task", "This is a test task.");

        taskService.addTask(task);

        assertEquals(task, taskService.getTask("12345"));
    }

    @Test
    void testCannotAddDuplicateTaskId() {
        Task firstTask = new Task("12345", "First Task", "First description.");
        Task secondTask = new Task("12345", "Second Task", "Second description.");

        taskService.addTask(firstTask);

        assertThrows(IllegalArgumentException.class, () -> {
            taskService.addTask(secondTask);
        });
    }

    @Test
    void testDeleteTask() {
        Task task = new Task("12345", "Test Task", "This is a test task.");

        taskService.addTask(task);
        taskService.deleteTask("12345");

        assertNull(taskService.getTask("12345"));
    }

    @Test
    void testDeleteTaskThatDoesNotExist() {
        assertThrows(IllegalArgumentException.class, () -> {
            taskService.deleteTask("99999");
        });
    }

    @Test
    void testUpdateTaskName() {
        Task task = new Task("12345", "Test Task", "This is a test task.");

        taskService.addTask(task);
        taskService.updateTaskName("12345", "Updated Task");

        assertEquals("Updated Task", taskService.getTask("12345").getName());
    }

    @Test
    void testUpdateTaskDescription() {
        Task task = new Task("12345", "Test Task", "This is a test task.");

        taskService.addTask(task);
        taskService.updateTaskDescription(
            "12345",
            "This is the updated description."
        );

        assertEquals(
            "This is the updated description.",
            taskService.getTask("12345").getDescription()
        );
    }

    @Test
    void testUpdateTaskThatDoesNotExist() {
        assertThrows(IllegalArgumentException.class, () -> {
            taskService.updateTaskName("99999", "Updated Task");
        });
    }

    @Test
    void testUpdatedNameCannotBeLongerThan20Characters() {
        Task task = new Task("12345", "Test Task", "This is a test task.");

        taskService.addTask(task);

        assertThrows(IllegalArgumentException.class, () -> {
            taskService.updateTaskName(
                "12345",
                "This task name is definitely too long"
            );
        });
    }

    @Test
    void testUpdatedDescriptionCannotBeLongerThan50Characters() {
        Task task = new Task("12345", "Test Task", "This is a test task.");

        taskService.addTask(task);

        assertThrows(IllegalArgumentException.class, () -> {
            taskService.updateTaskDescription(
                "12345",
                "This description is definitely longer than fifty characters."
            );
        });
    }
}
