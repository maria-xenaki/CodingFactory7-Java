package gr.aueb.cf.challenges;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Project1 {
    public static void main(String[] args) {

        int[] numbersArray = new int[0];
        int p = 0;
        final int LOTTO_SIZE = 6;
        int pivot = 0;
        int[] result = new int[LOTTO_SIZE];
        int window;

        try (BufferedReader bf = new BufferedReader(new FileReader("C:/tmp/LottoNumbers.txt"));
             PrintStream ps = new PrintStream("C:/tmp/lottoOut.txt", StandardCharsets.UTF_8)) {

            String line;

            while ((line= bf.readLine()) != null){
                String[] numbers = line.split("\\s+");
                numbersArray = new int[numbers.length];
                for (String number : numbers){
                    numbersArray[p] = Integer.parseInt(number);
                    p++;
                }
            }

        Arrays.sort(numbersArray);
        for(int num: numbersArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        pivot = numbersArray.length;
        window = pivot - LOTTO_SIZE;

        for (int i = 0; i <= window; i++) {
            for (int j = i + 1; j <= window + 1; j++) {
                for (int k = j + 1; k <= window + 2; k++) {
                    for (int l = k + 1; l <= window + 3; l++) {
                        for (int m = l + 1; m <= window + 4; m++) {
                            for (int n = m + 1; n <= window + 5; n++) {
                                result[0] = numbersArray[i];
                                result[1] = numbersArray[j];
                                result[2] = numbersArray[k];
                                result[3] = numbersArray[l];
                                result[4] = numbersArray[m];
                                result[5] = numbersArray[n];

                                if (!isEvenGE(result, 4) && !isOddGE(result, 4) && !sameTen(result, 3)
                                        && !sameEnding(result, 3) && !consecutive(result)) {
                                    ps.printf("%d %d %d %d %d %d\n",
                                            result[0], result[1], result[2], result[3], result[4], result[5]);
                                    System.out.printf("%d %d %d %d %d %d\n",
                                            result[0], result[1], result[2], result[3], result[4], result[5]);
                                }

                                for (int num : result) {
                                    System.out.print(num + " ");
                                }
                                System.out.println();
                            }
                        }
                    }
                }
            }
        }}
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isEvenGE(int[] arr, int threshold) {
        long evenCount = 0;

        evenCount = Arrays.stream(arr)
                .filter(num -> num % 2 == 0)
                .count();

        return evenCount >= threshold;
    }


    public static boolean isOddGE(int[] arr, int threshold) {
        long oddsCount = 0;

        oddsCount = Arrays.stream(arr)
                .filter(num -> num % 2 != 0)
                .count();

        return oddsCount >= threshold;
    }

    public static boolean sameTen(int[] arr, int threshold) {
        int[] ten = new int[5];

        for (int num : arr) {
            ten[num/10]++;
        }

        return Arrays.stream(ten).anyMatch(t -> t >= threshold);
    }

    public static boolean consecutive(int[] arr) {
        int consecutiveCount = 0;

        for (int i = 0; i <= 3; i++) {
            if (arr[i] == arr[i + 1] - 1 && arr[i] == arr[i + 2] - 2) {
                consecutiveCount++;
                break;
            }
        }

        return consecutiveCount >= 1;
    }

    public static boolean sameEnding(int[] arr, int threshold) {
        int[] endings = new int[10];

        for (int num : arr) {
            endings[num % 10]++;
        }

        return Arrays.stream(endings).anyMatch(e -> e >= threshold);
    }
}

