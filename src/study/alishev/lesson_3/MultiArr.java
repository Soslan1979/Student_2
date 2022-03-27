package study.alishev.lesson_3;

public class MultiArr {
    public static void main(String[] args) {
        int[][] numbers = {{1,2,3}, {4,5,6,4,}, {7,8,9}}; // двухмерный массив с данными
        String[][] strings = new String[4][5]; // двухмерный массив с размером
        System.out.println(numbers[1][2]); // вывод - 6
        for (int i = 0; i < numbers.length; i++) { // Полный вывод двухмерного массива путем влож. циклов
            for (int j = 0; j < numbers[i].length; j++){
                System.out.print(numbers[i][j] + " "); // print вывод без переноса на новую строку
            }
            System.out.println();
        }

    }
}
