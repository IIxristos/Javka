package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        try {
            // Создание таблицы
            userService.createUsersTable();

            // Добавление пользователей
            userService.saveUser("John", "Doe", (byte) 28);
            userService.saveUser("Alice", "Smith", (byte) 24);
            userService.saveUser("Bob", "Johnson", (byte) 35);
            userService.saveUser("Mary", "Brown", (byte) 22);

            // Получение всех пользователей и вывод в консоль
            for (User user : userService.getAllUsers()) {
                System.out.println(user);
            }

            // Очистка таблицы
            userService.cleanUsersTable();

            // Удаление таблицы
            userService.dropUsersTable();
        } finally {
            // Закрытие фабрики сессий
            Util.shutdown();
        }
    }
}