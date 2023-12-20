package lab21.number5;

import java.util.*;

public class Solution<T, V, K> {
    private T genericVar1;
    private V genericVar2;
    private K genericVar3;

    public Solution(T genericVar1, V genericVar2, K genericVar3) {
        this.genericVar1 = genericVar1;
        this.genericVar2 = genericVar2;
        this.genericVar3 = genericVar3;
    }

    public List<T> newArrayList(T... elements) {
        List<T> list = new ArrayList<>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }

    public Set<V> newHashSet(V... elements) {
        Set<V> set = new HashSet<>();
        for (V element : elements) {
            set.add(element);
        }
        return set;
    }

    public Map<K, V> newHashMap(K[] keys, V[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Количество ключей и значений должно совпадать.");
        }

        Map<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }
        return map;
    }

    public static void main(String[] args) {
        Solution<Integer, String, Character> solution = new Solution<>(1, "str", 'C');

        List<Integer> intList = solution.newArrayList(1, 2, 3);
        System.out.println("ArrayList: " + intList);

        Set<String> stringSet = solution.newHashSet("hi", "hello", "privet");
        System.out.println("HashSet: " + stringSet);

        Character[] keys = {'a', 'b', 'c'};
        String[] values = {"one", "two", "three"};
        Map<Character, String> charStringMap = solution.newHashMap(keys, values);
        System.out.println("HashMap: " + charStringMap);
    }
}
