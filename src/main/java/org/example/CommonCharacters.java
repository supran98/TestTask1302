package org.example;

import java.util.*;

public class CommonCharacters {
    public static Map<String, List<Integer>> commonCharacters(String[] strings) {
        Map<String, List<Integer>> resultMap = new HashMap<>();
        List<Integer> counted = new ArrayList<>();

        for (int i=0; i<strings.length-1; i++) {
            for (int j=i+1; j<strings.length; j++) {
                if (Arrays.equals(
                        countCharacters(strings[i]),
                        countCharacters(strings[j])
                )
                        && !counted.contains(i)
                        && !strings[i].isEmpty()
                ) {
                    resultMap.computeIfAbsent(strings[i], v -> new ArrayList<>());
                    var indexes = resultMap.get(strings[i]);
                    if (!indexes.contains(i)) {
                        indexes.add(i);
                    }
                    indexes.add(j);
                    counted.add(j);
                    resultMap.put(strings[i], indexes);
                }
            }
        }

        return resultMap;
    }

    private static int[] countCharacters(String str) {
        int[] count = new int[256];
        for (int i=0; i<256; i++) {
            count[i] = 0;
        }

        for (int i=0; i<str.length(); i++) {
            ++count[str.toCharArray()[i]];
        }

        return count;
    }
}
