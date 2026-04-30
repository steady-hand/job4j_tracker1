package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        ArrayList<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);
    }

    public void deleteUser(String passport) {
        User foundUser = findByPassport(passport);
        if (foundUser != null) {
            users.remove(foundUser);
        }
    }

    public void addAccount(String passport, Account account) {
        User foundUser = findByPassport(passport);
        List<Account> userAccounts = users.get(foundUser);
        if (foundUser != null && !userAccounts.contains(account)) {
            userAccounts.add(account);
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User foundUser = findByPassport(passport);
        List<Account> userAccounts = users.get(foundUser);
        if (foundUser != null) {
            for (Account account : userAccounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        User foundUser1 = findByPassport(sourcePassport);
        User foundUser2 = findByPassport(destinationPassport);
        Account account1 = findByRequisite(sourcePassport, sourceRequisite);
        Account account2 = findByRequisite(destinationPassport, destinationRequisite);
        boolean result = false;
        if (foundUser1 == foundUser2 && foundUser1 != null
            && account1 != null && account2 != null
            && account1.getBalance() >= amount) {
            double balance1 = account1.getBalance() - amount;
            double balance2 = account2.getBalance() + amount;
            account1.setBalance(balance1);
            account2.setBalance(balance2);
            result = true;
        }
        return result;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
