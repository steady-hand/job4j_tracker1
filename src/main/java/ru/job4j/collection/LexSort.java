package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftArray = left.split("\\.");
        String[] rightArray = right.split("\\.");
        int i1 = Integer.parseInt(leftArray[0]);
        int i2 = Integer.parseInt(rightArray[0]);
        return Integer.compare(i1, i2);
    }
}
