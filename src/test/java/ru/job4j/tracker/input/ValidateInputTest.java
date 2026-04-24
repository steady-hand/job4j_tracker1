package ru.job4j.tracker.input;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.StubOutput;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ValidateInputTest {
    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"6"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(6);
    }

    @Test
    void whenManyValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"0", "1", "6"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        int selected1 = input.askInt("Enter menu:");
        int selected2 = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(0);
        assertThat(selected1).isEqualTo(1);
        assertThat(selected2).isEqualTo(6);
    }
}