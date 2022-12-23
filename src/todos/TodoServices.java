package todos;

import java.util.List;

public class TodoServices {
	
	private Repository repository;
	public TodoServices(Repository repository) {
		this.repository = repository;
	}
	
	/*private InMemoryRepository repository;
	public TodoServices(InMemoryRepository repository) {
		this.repository = repository;
	}*/
	
	public List<Todo> getAll() {
		return repository.getAll();
	}
	
	public List<Todo> getAllCointainingInTitle(String word) {
		return repository.getAllCointainingInTitle(word);
	}
	
	public Todo getByIdOrNull(int id) {
		return repository.getByIdOrNull(id);
	}
}
