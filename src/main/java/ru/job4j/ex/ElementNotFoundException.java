package ru.job4j.ex;

public class ElementNotFoundException extends Exception {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                result = i;
                return result;
            }
            throw new ElementNotFoundException();
        }
        /* цикл fori, поскольку нам надо найти индекс искомого элемента в массиве */
        return result;
    }

    public static void main(String[] args) {
        String[] value = {"Vlad", "Petya", "Sasha"};
        try {
            int index = indexOf(value, "Vlad");
            System.out.println("Элемент найден на индексе: " + index);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
