package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemAscByNameTest {

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
        items.sort(compareName);
        List<Item> expected = new ArrayList<>();
        expected.add(item2);
        expected.add(item3);
        expected.add(item1);
        assertEquals(expected, items);
    }
}