/**
 * threeExceptions
 */
public class threeExceptions {

    public static void main(String[] args) {
        // System.out.println(divider(10, 0));
        // System.out.println(printIndex());
        System.out.println(createarray());
    }

    public static int printIndex() {
        int[] array = new int[10];
        return array[100];
    }

    public static int[] createarray() {
        int len = -10;
        int[] array = new int[len];
        return array;
    }

    public static int divider (int a, int b) {
        return a / b;
    }
    
}