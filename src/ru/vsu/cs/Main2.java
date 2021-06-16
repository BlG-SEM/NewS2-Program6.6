package ru.vsu.cs;

import ru.vsu.cs.map.MyMapImpl;
import java.util.List;
import java.util.Map;

public class Main2 {

    public static void main(String[] args) {
        int s = MapUtils.readNumberFromKeyboard("S");

        MyMapImpl<Integer, Integer> myMap = new MyMapImpl<>();
        myMap.put(0, 1);
        myMap.put(1, 2);
        myMap.put(2, 3);
        myMap.put(3, 4);
        myMap.put(4, 5);
        myMap.put(5, 6);
        myMap.put(6, 7);
        myMap.put(7, 8);
        myMap.put(8, 9);

        Map<Integer, List<Integer>> result = MapUtils.mySolution(myMap, s);
        MapUtils.print(result);
    }
}
