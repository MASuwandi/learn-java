package test.service;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {
    public static void main(String[] args) {
//        testShowTodoList();
//        testAddTodoList();
        testRemoveTodoList();
    }

    public static void testShowTodoList() {
        // create with polymorphism
//        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        // change for testing
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.data[0] = new TodoList("Learn Basics Java");
        todoListRepository.data[1] = new TodoList("Learn Java OOP");
        todoListRepository.data[2] = new TodoList("Learn Java Standard Classes");
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();
    }

    public static void testAddTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();

        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Learn Basics Java");
        todoListService.addTodoList("Learn Java OOP");
        todoListService.addTodoList("Learn Java Standard Classes");

        todoListService.showTodoList();
    }

    public static void testRemoveTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        // add dummy
        todoListService.addTodoList("Learn Basics Java");
        todoListService.addTodoList("Learn Java OOP");
        todoListService.addTodoList("Learn Java Standard Classes");

        todoListService.showTodoList();

        // remove trigger proc
        // fail
        todoListService.removeTodoList(5);

        // success
        todoListService.removeTodoList(3);
        todoListService.showTodoList();

        // fail
        todoListService.removeTodoList(3);
        todoListService.showTodoList();

    }

}
