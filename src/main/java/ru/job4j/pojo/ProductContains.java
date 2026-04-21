package ru.job4j.pojo;

import java.util.Objects;

public class ProductContains {
    private String name;
    private int count;

    public ProductContains(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static void main(String[] args) {
        Product first = new Product("Milk", 100);
        Product second = new Product("Milk", 100);
        boolean isEqual = first.equals(second);
        System.out.println(isEqual);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductContains that = (ProductContains) o;
        return count == that.count && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count);
    }
}
