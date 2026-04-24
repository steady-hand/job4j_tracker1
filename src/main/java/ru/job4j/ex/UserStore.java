package ru.job4j.ex;

import com.sun.jdi.Value;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
               return users[i];
            }
        }
        throw new UserNotFoundException("Пользователь " + login + " не найден");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && user.getUsername().length() > 3) {
            return user.isValid();
        }
        throw new UserInvalidException("Пользователь " + user.getUsername() + " не имеет допуска");
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Pepp", true)
        };
        try {
            User user = findUser(users, "Pepp");

            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ui) {
            ui.printStackTrace();
        } catch (UserNotFoundException un) {
            un.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
