package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String text1 : origin) {
            check.add(text1);
        }
        for (String text2 : text) {
            if (!check.contains(text2)) {
                result = false;
                break;
            }
        }
        /* for-each origin -> new HashSet. */
        /* for-each text -> hashSet.contains */
        return result;
    }
}
