package classes;

public class Task {
	private static int idCounter = 1;
	private int id;
	private String description;
	private String deadline;
	private boolean isCompleted;
	
	public Task(String description, String deadline) {
		this.id = idCounter++;
		this.description = description;
		this.deadline = deadline;
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
	//Updated method to include logging
	public void markAsCompleted() {
		this.isCompleted = true;
		System.out.println("Task ID " + id + " marked as completed."); // Log completion
	}
	@Override
	public String toString() {
		return "Task ID: " + id +
		", Description: " + description +
		", Deadline: " + deadline +
		", Completed: " + (isCompleted ? "Yes" : "No") ;
	}
}