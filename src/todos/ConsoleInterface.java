package todos;

import java.util.List;
import java.util.Scanner;

public class ConsoleInterface {
	
	

	public static void main(String[] args) {
		//Todo newTodo = askUserForTodoData();
		//int id = askUserForId();
		String word = askUserForWordInTitle();
		
		TodoServices todoService = new TodoServices(new InMemoryRepository());
		var foundTodos = todoService.getAllCointainingInTitle(word);
		
		
		
		//repository.add(newTodo);
		
		/*Todo todo = repository.getByIdOrNull(id);
		if(todo != null)
			System.out.println(todo.getId());*/
		
		//var todos = repository.getAll();
		printTodos(foundTodos);
	}
	
	private static String askUserForWordInTitle() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give the word to find in the title:");
		var word = sc.next();
	
		sc.close();
		
		return word;
	}

	public static void printTodos(List<Todo> todos) {
		System.out.println("\n-------------Printing all");
		for(Todo todo : todos) {
			System.out.println(todo);
		}
	}
	
	public static Todo askUserForTodoData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give the Todo resume:");
		String resume = sc.next();
		System.out.println("Give the Todo description:");
		String description = sc.next();
		
		sc.close();
		
		return new Todo(resume, description);
		
	}
	
	public static int askUserForId() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give the id:");
		int id = sc.nextInt();
	
		sc.close();
		
		return id;
	}

}
