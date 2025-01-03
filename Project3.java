package gr.aueb.cf.challenges;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Project3 {

    public static void main(String[] args) {

        int[][] charCount = new int[128][2];

        try (BufferedReader bf = new BufferedReader(new FileReader("C:/tmp/input.txt"))) {
            int character;

            while ((character = bf.read()) != -1){
                if (!Character.isWhitespace(character)){
                    charCount[character][0] = character;
                    charCount[character][1]++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        printArray(charCount);
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            if (row[1] > 0) {
                System.out.println((char) row[0] + ": " + row[1]);
            }
        }
    }
}

