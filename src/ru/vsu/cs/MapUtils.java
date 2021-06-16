package ru.vsu.cs;

import ru.vsu.cs.map.MyMapImpl;

import java.util.*;

public class MapUtils {
    public static int readNumberFromKeyboard(String name) {
        System.out.println("Input " + name + ":");
        Scanner scanner = new Scanner(System.in);
        String row = scanner.nextLine();
        int num = Integer.parseInt(row);
        return num;
    }

    public static Map<Integer, List<Integer>> solution(Map<Integer, Integer> map, int s) {
        Map<Integer, List<Integer>> result = new HashMap<>();

        Map<Integer, List<Integer>> allCombinations = generateAllCombinations(map);

        for (int i = 1; i <= allCombinations.size(); i++) {
            if (calculateSum(allCombinations.get(i)) == s) {
                result.put(result.size() + 1, allCombinations.get(i));
            }
        }
        return result;
    }

    public static Map<Integer, List<Integer>> generateAllCombinations(Map<Integer, Integer> map) {
        Map<Integer, List<Integer>> result = new HashMap<>();

        List<Integer> helper = new ArrayList<>(3);
        for (int i = 0; i < map.size(); i++) {
            helper.add( 0, map.get(i));

            for (int j = i + 1; j < map.size(); j++) {

                helper.add(1, map.get(j));

                for (int k = j + 1; k < map.size(); k++) {

                    helper.add(2, map.get(k));

                    result.put(result.size() + 1, new ArrayList<>(helper));

                    helper.remove(2);
                }

                helper.remove(1);
            }

            helper.remove(0);
        }

        return result;
    }

    public static Map<Integer, List<Integer>> mySolution(MyMapImpl<Integer, Integer> myMap, int s) {
        Map<Integer, List<Integer>> result = new HashMap<>();

        Map<Integer, List<Integer>> allCombinations = myGenerateAllCombinations(myMap);

        for (int i = 1; i <= allCombinations.size(); i++) {
            if (calculateSum(allCombinations.get(i)) == s) {
                result.put(result.size() + 1, allCombinations.get(i));
            }
        }
        return result;
    }

    public static Map<Integer, List<Integer>> myGenerateAllCombinations(MyMapImpl<Integer, Integer> myMap) {
        Map<Integer, List<Integer>> result = new HashMap<>();

        List<Integer> helper = new ArrayList<>(3);
        for (int i = 0; i < myMap.getSize(); i++) {
            helper.add( 0, myMap.get(i));

            for (int j = i + 1; j < myMap.getSize(); j++) {

                helper.add(1, myMap.get(j));

                for (int k = j + 1; k < myMap.getSize(); k++) {

                    helper.add(2, myMap.get(k));

                    result.put(result.size() + 1, new ArrayList<>(helper));

                    helper.remove(2);
                }

                helper.remove(1);
            }

            helper.remove(0);
        }

        return result;
    }

    public static int calculateSum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static void print(Map<Integer, List<Integer>> map) {
        for (int i = 1; i < map.size() + 1; i++) {
            System.out.print("List №" + i + ": ");
            for (int j = 0; j < map.get(i).size(); j++) {
                System.out.print(map.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
