package study.alishev2.JavaCollectionsFramework;

import java.util.Stack;

/**
 * Stack - очередь, принцип LIFO (last-in-first-out) - последний зашел, первый вышел
 *
 *                             Методы
 *          Throws exception            Returns special value
 *    add(e), remove(), element()      offer(e), poll(), peek()
 * */
public class StackLesson {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        System.out.println("Вывод очереди в обратном направлении");
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }


    }
}
