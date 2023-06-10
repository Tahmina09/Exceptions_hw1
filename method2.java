/*
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
 * и возвращающий новый массив, 
 * каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
 * Если длины массивов не равны, необходимо как-то оповестить пользователя. 
 * Важно: При выполнении метода единственное исключение, 
 * которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */

public class method2 {
    public static void main(String[] args) {
        Integer[] a_Integers = new Integer[] {15,26,7,38,19};
        Integer[] b_Integers = new Integer[] {1,2,3,4,5};
        newArrayInteger(a_Integers, b_Integers);
    }

    public static void newArrayInteger (Integer[] array1Integers, Integer[] array2Integers) {
        Integer[] newIntegers = new Integer[5];
        if (array1Integers.length != array2Integers.length) {
            throw new RuntimeException("Длины массивов не равны! Попробуйте ещё раз.");
        }
        
        for (int i = 0; i < newIntegers.length; i++) {
           newIntegers[i] = array1Integers[i] / array2Integers[i];
            System.out.println(newIntegers[i]);
        }
    }
}
