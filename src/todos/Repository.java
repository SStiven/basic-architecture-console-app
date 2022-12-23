package todos;

import java.util.LinkedList;

public interface Repository {
	void add(Todo newTodo);
	LinkedList<Todo> getAll();
	LinkedList<Todo> getAllCointainingInTitle(String word);
	Todo getByIdOrNull(int id);
}
