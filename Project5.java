package gr.aueb.cf.challenges;

public class Project5 {

    static boolean[][] theater = new boolean[30][12];

    public static void main(String[] args) {
        book('C',2);
        book('A',1);
        book('C',2);
        cancel('A',1);
        cancel('A',1);
    }
    public static void book(char column, int row) {

        int columnIndex;

        switch (column) {
            case 'A':
                columnIndex = 0;
                break;
            case 'B':
                columnIndex = 1;
                break;
            case 'C':
                columnIndex = 2;
                break;
            case 'D':
                columnIndex = 3;
                break;
            case 'E':
                columnIndex = 4;
                break;
            case 'F':
                columnIndex = 5;
                break;
            case 'G':
                columnIndex = 6;
                break;
            case 'H':
                columnIndex = 7;
                break;
            case 'I':
                columnIndex = 8;
                break;
            case 'J':
                columnIndex = 9;
                break;
            case 'K':
                columnIndex = 10;
                break;
            case 'L':
                columnIndex = 11;
                break;
            default:
                System.out.println("Invalid column.");
                return;
        }

        if (!theater[row-1][columnIndex]) {
            theater[row-1][columnIndex] = true;
        }
        else {
            System.out.println("Seat already booked");
        }
    }
    public static void cancel(char column, int row){
        int columnIndex;

        switch (column) {
            case 'A':
                columnIndex = 0;
                break;
            case 'B':
                columnIndex = 1;
                break;
            case 'C':
                columnIndex = 2;
                break;
            case 'D':
                columnIndex = 3;
                break;
            case 'E':
                columnIndex = 4;
                break;
            case 'F':
                columnIndex = 5;
                break;
            case 'G':
                columnIndex = 6;
                break;
            case 'H':
                columnIndex = 7;
                break;
            case 'I':
                columnIndex = 8;
                break;
            case 'J':
                columnIndex = 9;
                break;
            case 'K':
                columnIndex = 10;
                break;
            case 'L':
                columnIndex = 11;
                break;
            default:
                System.out.println("Invalid column.");
                return;
        }
        if (theater[row-1][columnIndex]) {
            theater[row-1][columnIndex] = false;
        }
        else {
            System.out.println("Seat not booked");
        }
    }
}
