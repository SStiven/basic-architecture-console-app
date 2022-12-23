package todos;

import java.util.LinkedList;

public class InMemoryRepository implements Repository {
	private LinkedList<Todo> todos = new LinkedList();
	
	public InMemoryRepository() {
		//todos.add(new Todo("composicion vs herencia", "estudiar blablablblal"));
		add(new Todo("composicion vs herencia", "estudiar blablablblal"));
		add(new Todo("ocultar vs sobreescritura", "estudiar blablablblal"));
		add(new Todo("alternativa al null", "estudiar blbalblbl"));
	}
	
	public void add(Todo newTodo) {
		newTodo.setId(todos.size() + 1);
		todos.add(newTodo);
	}
	
	//tiene problema, se pueden modificar por el usuario
	public LinkedList<Todo> getAll() {
		return todos;
	}
	
	public Todo getByIdOrNull(int id) {
		for(Todo todo:todos) {
			if(todo.getId() == id)
				return todo;
		}
		return null;
	}
	
	
	//El usuario puede modificar el contenido del repositorio
	public LinkedList<Todo> getAllCointainingInTitle(String word){
		LinkedList<Todo> foundTodos = new LinkedList();
		
		for(Todo todo: todos) {
			if(todo.getTitle().contains(word)) {
				foundTodos.add(todo);
			}
		}
		
		return foundTodos;
	}
}
