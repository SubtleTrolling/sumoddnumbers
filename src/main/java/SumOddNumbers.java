public class SumOddNumbers {

    public static int rowSumOddNumbers(int row) {

        int currentOdd = 1;
        int sum = 0;

        for (int currentRow = 1; currentRow <= row; currentRow++) {

            for (int numberInRow = 1; numberInRow <= currentRow; numberInRow++) {

                if (currentRow == row) {
                    sum += currentOdd;
                }

                currentOdd += 2;
            }

        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(rowSumOddNumbers(1));
        System.out.println(rowSumOddNumbers(2));
        System.out.println(rowSumOddNumbers(3));
        System.out.println(rowSumOddNumbers(7));

    }
}