package test.view;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoListViewTest {
    public static void main(String[] args) {
//        testShowTodoList();
//        testAddTodoList();
        testRemoveTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Learn Basics Java");
        todoListService.addTodoList("Learn Java OOP");
        todoListService.addTodoList("Learn Java Standard Classes");

        todoListView.showTodoList();
    }

    public static void testAddTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.addTodoList();
        todoListService.showTodoList();

        todoListView.addTodoList();
        todoListService.showTodoList();
    }

    public static void testRemoveTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Learn Basics Java");
        todoListService.addTodoList("Learn Java OOP");
        todoListService.addTodoList("Learn Java Standard Classes");

        todoListService.showTodoList();

        todoListView.removeTodoList();
        todoListService.showTodoList();

        todoListView.removeTodoList();
        todoListService.showTodoList();

        todoListView.removeTodoList();
        todoListService.showTodoList();
    }


}
