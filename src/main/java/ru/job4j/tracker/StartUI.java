package ru.job4j.tracker;

import ru.job4j.tracker.action.*;
import ru.job4j.tracker.input.ConsoleInput;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.ValidateInput;
import ru.job4j.tracker.output.ConsoleOutput;
import ru.job4j.tracker.output.Output;

import java.util.List;

import static java.lang.System.out;

public class StartUI {
    private final Output output;

    public StartUI(Output output) {
        this.output = output;
    }

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Выбрать: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Неверный ввод, введите число от 0 до " + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        output.println("Меню:");
        for (int i = 0; i < actions.size(); i++) {
            output.println(i + ". " + actions.get(i).name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        List<UserAction> actions = List.of(
                new CreateAction(output),
                new FindAllAction(output),
                new ReplaceAction(output),
                new DeleteAction(output),
                new FindByIdAction(output),
                new FindByNameAction(output),
                new ExitAction(output)
        );
        new StartUI(output).init(input, tracker, actions);
    }

}
