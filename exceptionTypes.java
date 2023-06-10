public class exceptionTypes {
    public static void main(String[] args) {

        String[][] strings = new String[][] {
            {"A", "B", "C"},
            {"3", "4", "5"},
            {"6", "7", "8"}
        };

        System.out.println(sum2d(strings));
    }


    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

}
