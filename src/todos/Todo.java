package todos;

public class Todo {
	private int id;
	private String title;
	private String description;
	
	public Todo(String resume, String description) {
		this.title = resume;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "id: " + id + "\n"
				+ "title: " + title + "\n"
				+ "descrition: " + description + "\n";
	}
}
