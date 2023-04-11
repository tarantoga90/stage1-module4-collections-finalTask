package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();

        for (Map.Entry<String, Set<String>> project : projects.entrySet()) {
            if (project.getValue().contains(developer)) {
                list.add(project.getKey());
            }
        }

        list.sort((x1, x2) -> {
            if (x1.length() == x2.length()) {
                return x2.compareTo(x1);
            } else {
                return Integer.compare(x2.length(), x1.length());
            }
        });

        return list;
    }
}
