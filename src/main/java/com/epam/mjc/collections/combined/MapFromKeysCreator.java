package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {

        Map<Integer, Set<String>> map = new HashMap<>();

        for (String s : sourceMap.keySet()) {

            Set<String> set = sourceMap.keySet().stream()
                    .filter(x -> s.length() == x.length())
                    .collect(Collectors.toSet());

            map.put(s.length(), set);

        }

        return map;
    }
}
