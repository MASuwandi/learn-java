package repository;

import entity.TodoList;

public class TodoListRepositoryImpl implements TodoListRepository {

    // change to public for testing purpose
//    private TodoList[] data = new TodoList[10];
    public TodoList[] data = new TodoList[10];

    @Override
    public TodoList[] getAll() {
        // implement
        return data;
    }

    // add more function for seperation
    public boolean isFull() {
        // cek apakah data penuh?
        var isFull = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                // data masih ada yg kosong
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    public void resizeIfFull() {
        if (isFull() == true) {
            // jika penuh, resize ukuran array 2x lipat
            var temp = data;
            data = new TodoList[data.length * 2];

            // alokasi data yg sebelumnya di tampung
            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }
    }

    @Override
    public void add(TodoList todoList) {
        resizeIfFull();

        // tambah ke posisi yg data array nya null
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = todoList;
                break;
            }
        }
    }

    @Override
    public boolean remove(Integer number) {
        // get number input from 1
        // check max data
        var idx = number - 1;
        if ((idx) >= data.length)
            return false;

        // check if number assign not already null
        if (data[idx] == null)
            return false;

        // if input valid
        // remove adn readjust position
        for (int i = idx; i < data.length - 1; i++)
            data[i] = data[i + 1];

        data[data.length - 1] = null;

        return true;
    }
}
