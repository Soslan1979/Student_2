package study.alishev2.JavaCollectionsFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetLesson {
    public static void main(String[] args) {

        /**
         * Set уникальные значения, дубли игнорируются
         */

        Set<String> hashSet = new HashSet<>();
        Set<String> LinkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        System.out.println("=Случайный порядок=");

        hashSet.add("Eric");
        hashSet.add("Lucas");
        hashSet.add("Jack");
        hashSet.add("David");
        hashSet.add("Ashley");
        hashSet.add("Brian");

        for (String name:hashSet){
            System.out.println(name);
        }

        System.out.println("=Сохраняется порядок внесения=");

        LinkedHashSet.add("Eric");
        LinkedHashSet.add("Lucas");
        LinkedHashSet.add("Jack");
        LinkedHashSet.add("David");
        LinkedHashSet.add("Ashley");
        LinkedHashSet.add("Brian");

        for (String name:LinkedHashSet){
            System.out.println(name);
        }

        System.out.println("=Сортировка=");

        treeSet.add("Eric");
        treeSet.add("Lucas");
        treeSet.add("Jack");
        treeSet.add("David");
        treeSet.add("Ashley");
        treeSet.add("Brian");

        for (String name:treeSet){
            System.out.println(name);
        }

        System.out.println(hashSet); // [Brian, Eric, David, Lucas, Ashley, Jack]

        System.out.println("=Методы=");
        //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html

        System.out.println(hashSet.contains("Lucas")); // true
        System.out.println(hashSet.contains("Travis")); // false
        System.out.println(hashSet.isEmpty()); // false
        System.out.println(hashSet.size());

        System.out.println("=Множество (union)=");

        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union); // [0, 1, 2, 3, 4, 5, 6, 7]

        System.out.println("=Пересечение множество (intersection)=");
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection); // [2, 3, 4, 5]

        System.out.println("=Разность множеств (difference)=");

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference); // [0, 1]








    }
}
