package classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Task {
    private static int idCounter = 1;
    private int id;
    private String description;
    private String deadline;
    private boolean isCompleted;
    private String priority; // New attribute for task priority

    public Task(String description, String priority) {
        this.id = idCounter++;
        this.description = description;
        this.deadline = deadline;
        this.priority = priority; // Set priority
        this.isCompleted = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getDeadline() {
        return deadline;
    }

    public boolean isCompleted() {
        return isCompleted;
    }
    
    public String getPriority() {
    	return priority; // Getter for priority
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return "Task ID: " + id +
               ", Description: " + description +
               ", Deadline: " + deadline +
               ", Completed: " + (isCompleted ? "Yes" : "No") + 
               ", Priority: " + priority; // Include priority in toString
    }
}