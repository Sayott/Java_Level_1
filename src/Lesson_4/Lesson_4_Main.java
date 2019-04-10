package Lesson_4;

public class Lesson_4_Main {

    static final int SIZE_X = 3;
    static final int SIZE_Y = 3;

    static char[][] field = new char[SIZE_Y][SIZE_X];

    static char PLAYER_DOT = 'x';
    static char AI_DOT = 'O';
    static char EMPTY_DOT = '.';

    public static void initField(){
        for (int i = 0; i <SIZE_Y; i++) {
            for (int j = 0; j <SIZE_X ; j++) {
                field[i][j]=EMPTY_DOT;
            }
        }
    }
    public static void printField(){
        System.out.println("------------------");
        for (int i = 0; i <SIZE_Y ; i++) {
            System.out.print("|");
            for (int j = 0; j <SIZE_X ; j++) {
                System.out.print(field[i][j]+"|");
            }
            System.out.println();
        }
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        initField();
        printField();
    }
}
