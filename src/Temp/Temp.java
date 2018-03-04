package Temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Temp {
    public static void main(String[] args) {

        ConvertList cv = new ConvertList();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(1);
        temp.add(4);
        temp.add(3);
        temp.add(2);
        temp.add(1);
        temp.add(5);
        temp.add(1);
        int[][] m = cv.toArray(temp, 1);
        System.out.println(Arrays.deepToString(m));
    }
}

class ConvertList {
    /**
     * В метод приходит двумерный массив -----> добавляем в list.
     *
     * @param array - int [][] - is needed to add in list.
     * @return - list array.
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> toReturn = new ArrayList<Integer>();
        for (int[] i : array) {
            for (int j : i) {
                toReturn.add(j);
            }
        }
        return toReturn;
    }

    /**
     * метод разбивает лист на количество строк двумерного массива.
     * В методе toArray должна есть проверка - если количество элементов не кратно количеству строк
     * - оставшиеся значения в массиве заполнять нулями.
     *
     * @param list - list.
     * @param rows - number of rows.
     * @return - int [][] array.
     */
    public int[][] toArray(List<Integer> list, int rows) {

        int[][] toReturn = new int[rows][rows];
//        Arrays.fill(toReturn, 0);
        int i = 0;
        for (Integer li : list) {
            if (i < rows * rows) {
                toReturn[i / rows][i % rows] = li;
                i++;
            }
        }

        return toReturn;


    }
}

/**
 * Вам необходимо создать класс ConvertList. Внутри методов использовать foreach.
 * <p>
 * В нём написать 2 метода:
 * <p>
 * public List<Integer> toList (int[][] array) {} - в метод приходит двумерный массив целых чисел, необходимо пройтись
 * по всем элементам массива и добавить их в List<Integer>.
 * <p>
 * public int[][] toArray (List<Integer> list, int rows) {} - метод toArray должен равномерно разбить лист на количество
 * строк двумерного массива. В методе toArray должна быть проверка - если количество элементов не кратно количеству строк
 * - оставшиеся значения в массиве заполнять нулями.
 * <p>
 * Например в результате конвертации листа со значениями (1,2,3,4,5,6,7) с разбиением на 3 строки должен получиться
 * двумерный массив {{1, 2, 3} {4, 5, 6} {7, 0 ,0}}
 */