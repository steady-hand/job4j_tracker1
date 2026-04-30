package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemDescByNameTest {

    @Test
    void compare() {
        List<Item> items = new ArrayList<>();
        ItemAscByName compareName = new ItemAscByName();
        Item item1 = new Item("Vlad");
        Item item2 = new Item("Artem");
        Item item3 = new Item("Semen");
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.sort(compareName.reversed());
        List<Item> expected = new ArrayList<>();
        Item exp1 = new Item("Vlad");
        Item exp2 = new Item("Semen");
        Item exp3 = new Item("Artem");
        expected.add(exp1);
        expected.add(exp2);
        expected.add(exp3);
        assertEquals(expected, items);
    }
}