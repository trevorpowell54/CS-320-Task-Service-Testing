package test;

import task.Task;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    void testValidTask() {
        Task task = new Task("12345", "Test Task", "This is a test task.");

        assertEquals("12345", task.getTaskId());
        assertEquals("Test Task", task.getName());
        assertEquals("This is a test task.", task.getDescription());
    }

    @Test
    void testTaskIdCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task(null, "Test Task", "This is a test task.");
        });
    }

    @Test
    void testTaskIdCannotBeLongerThan10Characters() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("12345678901", "Test Task", "This is a test task.");
        });
    }

    @Test
    void testNameCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("12345", null, "This is a test task.");
        });
    }

    @Test
    void testNameCannotBeLongerThan20Characters() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("12345", "This task name is too long", "This is a test task.");
        });
    }

    @Test
    void testDescriptionCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("12345", "Test Task", null);
        });
    }

    @Test
    void testDescriptionCannotBeLongerThan50Characters() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task(
                "12345",
                "Test Task",
                "This description is definitely longer than fifty characters."
            );
        });
    }

    @Test
    void testNameCanBeUpdated() {
        Task task = new Task("12345", "Test Task", "This is a test task.");

        task.setName("Updated Task");

        assertEquals("Updated Task", task.getName());
    }

    @Test
    void testDescriptionCanBeUpdated() {
        Task task = new Task("12345", "Test Task", "This is a test task.");

        task.setDescription("Updated description.");

        assertEquals("Updated description.", task.getDescription());
    }

    @Test
    void testTaskIdCannotBeUpdated() {
        Task task = new Task("12345", "Test Task", "This is a test task.");

        assertEquals("12345", task.getTaskId());

        // There is intentionally no setTaskId method.
        // The task ID is final and cannot be changed.
    }
}
