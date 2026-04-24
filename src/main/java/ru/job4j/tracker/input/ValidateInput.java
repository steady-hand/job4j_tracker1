package ru.job4j.tracker.input;


import ru.job4j.tracker.output.Output;

public class ValidateInput implements Input {

    private final Output output;
    private final Input input;

    public ValidateInput(Output output, Input input) {
        this.output = output;
        this.input = input;
    }

    @Override
    public String askStr(String question) {
        return input.askStr(question);
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                String result = input.askStr(question);
                value = Integer.parseInt(result);
            } catch (NumberFormatException nfe) {
                System.out.println("Пожалуйста, введите корректные данные");
                continue;
            }
            invalid = false;
        } while (invalid);
        return value;
    }
}
