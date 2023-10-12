/*
 * package com.project.springboot.todoapp.todo;
 * 
 * import java.time.LocalDate; import java.util.ArrayList; import
 * java.util.List; import java.util.function.Predicate;
 * 
 * import org.springframework.stereotype.Service;
 * 
 * import jakarta.validation.Valid;
 * 
 * @Service public class TodoService {
 * 
 * private static List<Todo> todos= new ArrayList<>(); private static int
 * todosCount = 0; static {
 * 
 * todos.add(new Todo(++todosCount, "athar","Learn AWS",
 * LocalDate.now().plusYears(1), false )); todos.add(new Todo(++todosCount,
 * "athar","Learn DevOps", LocalDate.now().plusYears(2), false )); todos.add(new
 * Todo(++todosCount, "athar","Learn Full Stack Dev",
 * LocalDate.now().plusYears(3), false )); }
 * 
 * public List<Todo> findByUsername(String username){ Predicate<? super Todo>
 * prediacte= todo-> todo.getUsername().equalsIgnoreCase(username);
 * 
 * return todos.stream().filter(prediacte).toList();
 * 
 * } public void addTodo(String username, String description, LocalDate
 * targateDate, boolean done) { Todo todo= new Todo(++todosCount, username,
 * description, targateDate, done); todos.add(todo);
 * 
 * } public void deleteById(int id){
 * 
 * Predicate<? super Todo> prediacte= todo-> todo.getId()==id;
 * todos.removeIf(prediacte); } public Todo findById(int id) { // TODO
 * Auto-generated method stub Predicate<? super Todo> prediacte= todo->
 * todo.getId()==id; Todo
 * todo=todos.stream().filter(prediacte).findFirst().get(); return todo; }
 * public void updateTodo(@Valid Todo todo) {
 * 
 * deleteById(todo.getId()); todos.add(todo); }
 * 
 * 
 * }
 */