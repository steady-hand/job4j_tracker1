package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int score = 0;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
                count++;
            }
        }
        return (double) score / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int score = 0;
            int count = 0;
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
                count++;
            }
            double rsl = (double) score / count;
            Label averageScoreByPupil = new Label(pupil.name(), rsl);
            list.add(averageScoreByPupil);
        }
        return list;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<Label> list = new ArrayList<>();
        int count = 0;
        for (Pupil pupil : pupils) {
            count++;
            for (Subject subject : pupil.subjects()) {
                map.merge(subject.name(), subject.score(), Integer::sum);
            }
        }
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            Label label = new Label(m.getKey(), (double) m.getValue() / count);
            list.add(label);
        }
        return list;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int score = 0;
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
                map.put(pupil.name(), score);
            }
        }
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            Label label = new Label(m.getKey(),  m.getValue());
            list.add(label);
            list.sort(Comparator.naturalOrder());
        }
        return list.getLast();
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.merge(subject.name(), subject.score(), Integer::sum);
            }
        }
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            Label label = new Label(m.getKey(),  m.getValue());
            list.add(label);
            list.sort(Comparator.naturalOrder());
        }
        return list.getLast();
    }
}
