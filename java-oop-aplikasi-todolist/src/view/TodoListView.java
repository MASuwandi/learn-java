package view;

import entity.TodoList;
import service.TodoListService;
import util.InputUtil;

public class TodoListView {

    private TodoListService todoListService;

    public TodoListView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    public void showTodoList() {
        while (true) {
            todoListService.showTodoList();

            System.out.println("Menu : ");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("x. Exit Program");

            var input = InputUtil.input("Choose");
            if (input.equals("1"))
                // call view method
                 addTodoList();
            else if (input.equals("2"))
                removeTodoList();
            else if (input.equals("x"))
                break;
            else
                System.out.println("Command not found");

        }
    }

    public void addTodoList() {
        System.out.println("Add Todo List");

        var todo = InputUtil.input("Todo (x For Abort Mission)");
        if (todo.equals("x")) {
            // batal
        } else
            todoListService.addTodoList(todo);
    }

    public void removeTodoList() {
        System.out.println("Remove Todolist");

        var number = InputUtil.input("Deleted Number (x For Abort Mission)");

        if (number.equals("x")) {
            // batal
        } else {
            // logic already in Service Impl
            todoListService.removeTodoList(Integer.valueOf(number));
        }
    }

}
