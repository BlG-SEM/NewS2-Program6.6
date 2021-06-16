package ru.vsu.cs;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int s = MapUtils.readNumberFromKeyboard("S");

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        map.put(1, 2);
        map.put(2, 3);
        map.put(3, 4);
        map.put(4, 5);
        map.put(5, 6);
        map.put(6, 7);

        Map<Integer, List<Integer>> result = MapUtils.solution(map, s);
        MapUtils.print(result);
    }
}
