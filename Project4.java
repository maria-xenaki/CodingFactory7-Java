package gr.aueb.cf.challenges;

import java.util.Scanner;

public class Project4 {

    static int [][] triliza = new int[3][3];
    static boolean playerA = true;

    public static void main(String[] args) {

        Scanner move = new Scanner(System.in);
        while (true){
            if (playerA){
                System.out.println("Player A, please insert row (1-3) and column (1-3) e.g. 1 2");

                int row = move.nextInt();
                int col = move.nextInt();
                if (row<1 || row>3 || col<1 ||col>3){
                    System.out.println("Wrong input. Rows and columns should be 1, 2 or 3.");
                }
                else if (triliza[row-1][col-1]>0) {
                    System.out.println("Position already filled. Play again.");
                }
                else{
                    triliza[row-1][col-1] = 1;
                    printArray(triliza);
                    playerA = false;

                    if (triliza[0][0] == 1 && triliza[0][1] == 1 && triliza[0][2] == 1 ||
                            triliza[1][0] == 1 && triliza[1][1] == 1 && triliza[1][2] == 1 ||
                            triliza[2][0] == 1 && triliza[2][1] == 1 && triliza[2][2] == 1 ||
                            triliza[0][0] == 1 && triliza[1][0] == 1 && triliza[2][0] == 1 ||
                            triliza[0][1] == 1 && triliza[1][1] == 1 && triliza[2][1] == 1 ||
                            triliza[0][2] == 1 && triliza[1][2] == 1 && triliza[2][2] == 1 ||
                            triliza[0][0] == 1 && triliza[1][1] == 1 && triliza[2][2] == 1 ||
                            triliza[2][0] == 1 && triliza[1][1] == 1 && triliza[0][2] == 1)
                    {
                        System.out.println("Player A wins.");
                        System.exit(0);
                    }
                    if (isBoardFullAndNoWinner()) {
                        System.out.println(("It's a draw."));
                        System.exit(0);
                    }
                }
            }
            else{
                System.out.println("Player B, please insert row (1-3) and column (1-3) e.g. 1 2");
                int row = move.nextInt();
                int col = move.nextInt();
                if (row<1 || row>3 || col<1 ||col>3){
                    System.out.println("Wrong input. Columns and rows should be 1, 2 or 3.");
                }
                else if (triliza[row-1][col-1]>0) {
                    System.out.println("Position already filled. Play again.");
                }
                else
                {
                    triliza[row - 1][col - 1] = 2;
                    printArray(triliza);
                    playerA = true;

                    if (triliza[0][0] == 2 && triliza[0][1] == 2 && triliza[0][2] == 2 ||
                            triliza[1][0] == 2 && triliza[1][1] == 2 && triliza[1][2] == 2 ||
                            triliza[2][0] == 2 && triliza[2][1] == 2 && triliza[2][2] == 2 ||
                            triliza[0][0] == 2 && triliza[1][0] == 2 && triliza[2][0] == 2 ||
                            triliza[0][1] == 2 && triliza[1][1] == 2 && triliza[2][1] == 2 ||
                            triliza[0][2] == 2 && triliza[1][2] == 2 && triliza[2][2] == 2 ||
                            triliza[0][0] == 2 && triliza[1][1] == 2 && triliza[2][2] == 2 ||
                            triliza[2][0] == 2 && triliza[1][1] == 2 && triliza[0][2] == 2)
                    {
                        System.out.println("Player B wins.");
                        System.exit(0);
                    }
                    if (isBoardFullAndNoWinner()) {
                        System.out.println(("It's a draw."));
                        System.exit(0);
                    }
                }
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) { // Loop through rows
            for (int j = 0; j < array[i].length; j++) { // Loop through columns
                System.out.print(array[i][j] + " "); // Print each element in the row
            }
            System.out.println(); 
        }
    }

    public static boolean isBoardFullAndNoWinner() {
        for (int i = 0; i < triliza.length; i++) {
            for (int j = 0; j < triliza[i].length; j++) {
                if (triliza[i][j] == 0) {
                    return false; // Found an empty cell
                }
            }
        }
        return true; // All cells are filled
    }
}



