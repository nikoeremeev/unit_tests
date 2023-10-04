package org.example.homework3.task2;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data;

    public void addUser(User user) {
    }

    public void logsOutUserExceptAdmins(){
        for (int i = 0; i < data.size(); i++) {
            User user = data.get(i);
            if (!user.isAdmin()){
                data.remove(i);
            }
        }
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.getName().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }

}
