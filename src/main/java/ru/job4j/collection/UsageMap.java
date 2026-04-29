package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("v.gabrus10@gmail.com", "Влад");
        map.put("v.g10@gmail.com", "Артем");
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
