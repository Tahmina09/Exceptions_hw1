/*
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
 * и возвращающий новый массив, каждый элемент которого равен разности элементов 
 * двух входящих массивов в той же ячейке. 
 * Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */

public class method1 {
    public static void main(String[] args) {
        Integer[] aIntegers = new Integer[] {15,26,7,38,19};
        Integer[] bIntegers = new Integer[] {1,2,3,4,5};
        newArrayInteger(aIntegers, bIntegers);
    }

    public static void newArrayInteger (Integer[] array1Integers, Integer[] array2Integers) {
        Integer[] newIntegers = new Integer[5];
        if (array1Integers.length != array2Integers.length) {
            System.out.println( "Длины массивов не равны, невозможно продолжить операцию. \nИсправьте ошибку и повторите попытку.");
        }
        
        for (int i = 0; i < newIntegers.length; i++) {
           newIntegers[i] = array1Integers[i] - array2Integers[i];
            System.out.println(newIntegers[i]);
        }
    }
}
