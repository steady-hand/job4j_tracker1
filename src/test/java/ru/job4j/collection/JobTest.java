package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorAscByNameAndAscByPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenCompareDescByName() {
        JobDescByName compareName = new JobDescByName();
        int rsl = compareName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1));
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenCompareAscByName() {
        JobAscByName compareName = new JobAscByName();
        int rsl = compareName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1));
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenCompareAscByPriority() {
        JobAscByPriority compareName = new JobAscByPriority();
        int rsl = compareName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1));
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenCompareDescByPriority() {
        JobDescByPriority compareName = new JobDescByPriority();
        int rsl = compareName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1));
        assertThat(rsl).isGreaterThan(0);
    }
}