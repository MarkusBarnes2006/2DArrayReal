

public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        int row1 = 0;
        int row2 = 0;
        int row3 = 0;
        int column1 = 0;
        int column2 = 0;
        int column3 = 0;
        for (int i = 0; i < array.length; i++) {
            row1 += array[0][i];
            row2 += array[1][i];
            row3 += array[2][i];
            column1 += array[i][0];
            column2 += array[i][1];
            column3 += array[i][2];

        }

        System.out.println("Row 1: " + row1);
        System.out.println("Row 2: " + row2);
        System.out.println("Row 3: " + row3);
        System.out.println("Column 1: " + column1);
        System.out.println("Column 2: " + column2);
        System.out.println("Column 3: " + column3);
    }
}
