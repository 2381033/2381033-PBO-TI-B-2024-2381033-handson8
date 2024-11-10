package repositories;

import com.sun.jdi.connect.spi.Connection;
import config.Database;
import entities.TodoList;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class TodoListRepositoryDbimpl implements TodoListRepository {
    private final Database database;

    public TodoListRepositoryDbimpl(final Database database) {
        this.database = database;
    }
    @Override
    public TodoList[] getAll() {
        Connection connection = database.getConnection();
        String sqlStatment = "SELECT * FROM todos";
        List<TodoList> todoLists = new ArrayList<>();
        return new TodoList[0];
    }
    try {
        PreparedStatement preparedStatement = conne
    } catch (Exception e){
        System.out.println(e.getMessage());
    }

    @Override
    public void add(TodoList todoList) {

    }

    @Override
    public Boolean remove(Integer id) {
        return null;
    }

    @Override
    public Boolean edit(Integer todolist) {
        return null;
    }
}
