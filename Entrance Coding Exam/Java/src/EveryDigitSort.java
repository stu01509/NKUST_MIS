import java.util.Scanner;

public class EveryDigitSort {

    public static void main(String[] args) {

        System.out.println("29. 各位數字和排序");
        System.out.println("請輸入個數.");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println("請輸入數字.");

        String[] inputValue = scanner.nextLine().split(" ");
        int[][] valueData = new int[Integer.valueOf(input)][2];


        for (int i = 0; i < inputValue.length; i++) {
            valueData[i][0] = Integer.valueOf(inputValue[i]);

            for (int j = 0; j <= 3; j++) {
                valueData[i][1] += Character.getNumericValue(inputValue[i].charAt(j));
            }
        }

        for (int i = 0; i < inputValue.length; i++) {
            for (int j = 0; j < inputValue.length - 1; j++) {
                if (valueData[j][1] > valueData[j + 1][1]) {
                    int tempN;
                    int tempTotal;

                    tempN = valueData[j][0];
                    tempTotal = valueData[j][1];

                    valueData[j][0] = valueData[j + 1][0];
                    valueData[j][1] = valueData[j + 1][1];

                    valueData[j + 1][0] = tempN;
                    valueData[j + 1][1] = tempTotal;

                }
            }
        }

        for (int i = 0; i < inputValue.length; i++) {
            for (int j = 0; j < inputValue.length - 1; j++) {
                if (valueData[j][1] == valueData[j + 1][1]) {
                    if (valueData[j][0] > valueData[j + 1][0]) {
                        int tempN;
                        int tempTotal;

                        tempN = valueData[j][0];
                        tempTotal = valueData[j][1];

                        valueData[j][0] = valueData[j + 1][0];
                        valueData[j][1] = valueData[j + 1][1];

                        valueData[j + 1][0] = tempN;
                        valueData[j + 1][1] = tempTotal;

                    }
                }
            }
        }

        for (int i = 0; i < inputValue.length; i++) {
            System.out.print(valueData[i][0] + " ");

        }

    }

}
