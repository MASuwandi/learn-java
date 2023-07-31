package service;

public interface TodoListService {

    // 3 business logic
    void showTodoList();

    void addTodoList(String todo);

    void removeTodoList(Integer number);

}
