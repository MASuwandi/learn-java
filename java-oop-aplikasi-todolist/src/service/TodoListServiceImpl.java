package service;

import entity.TodoList;
import repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService {

    // all data access via Repository
    private TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showTodoList() {
        TodoList[] model = todoListRepository.getAll();

        System.out.print("\n");
        System.out.println("TODOLIST");

        for (int i = 0; i < model.length; i++) {
            var todolist = model[i];
            var no = i + 1;

            if (todolist != null)
                // why need getTodo(), cos of instance object
                System.out.println(no + ". " + todolist.getTodo());
        }
        System.out.print("\n");
    }

    @Override
    public void addTodoList(String todo) {
        TodoList todoList = new TodoList(todo);
        todoListRepository.add(todoList);
        System.out.println("Success Add Stuff Todo: " + todo);
    }

    @Override
    public void removeTodoList(Integer number) {
    boolean success = todoListRepository.remove(number);
    if (success)
        System.out.println("Success Remove Todo Number: " + number);
    else
        System.out.println("Fail to Remove Todo Number: " + number);
    }
}
