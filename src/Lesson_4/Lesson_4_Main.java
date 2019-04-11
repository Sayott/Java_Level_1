package Lesson_4;

import java.util.Random;
import java.util.Scanner;

public class Lesson_4_Main {

    static final int SIZE_X = 3;
    static final int SIZE_Y = 3;

    static char[][] field = new char[SIZE_Y][SIZE_X];

    static char PLAYER_DOT = 'x';
    static char AI_DOT = 'O';
    static char EMPTY_DOT = '.';

    static Scanner scanner = new Scanner( System.in );
    static Random random = new Random();

    public static void initField() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    public static void printField() {
        System.out.println( "------------------" );
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print( "|" );
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print( field[i][j] + "|" );
            }
            System.out.println();
        }
        System.out.println( "------------------" );
    }

    public static boolean isCellValid(int y, int x) {   //проверка возможности хода

        if (x < 0 || y < 0 || x > SIZE_X - 1 || y > SIZE_Y - 1) {
            return false;
        }

        return field[y][x] == EMPTY_DOT;

    }

    public static void setSym(int y, int x, char sym) {
        field[x][y] = sym;
    }

    public static void playerStep(){   //ход игрока
        int x, y;
        do {
            System.out.println("Введите координаты: X Y (1-3)");
            x=scanner.nextInt()-1;
            y=scanner.nextInt()-1;
        }
        while (!isCellValid( y,x ));
        setSym(y,x,PLAYER_DOT  );
    }
    public static void aiStep(){   //ход AI
        int x, y;
        do {
            System.out.println("Введите координаты: X Y (1-3)");
            x=random.nextInt( SIZE_X );
            y=random.nextInt( SIZE_Y );
        }
        while (!isCellValid( y,x ));
        setSym(y,x,AI_DOT  );
    }

    public static boolean isFieldFull(){   //проверка заполненности поля
        for (int i = 0; i <SIZE_Y ; i++) {
            for (int j = 0; j <SIZE_X ; j++) {
                if(field[i][j]==EMPTY_DOT){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char sym){  //проверка победы
        if (field[0][0]==sym&&field[0][1]==sym&& field[0][2]==sym){
            return  true;
        }
        if (field[1][0]==sym&&field[1][1]==sym&& field[1][2]==sym){
            return  true;
        }
        if (field[2][0]==sym&&field[2][1]==sym&& field[2][2]==sym){
            return  true;
        }
        if (field[0][0]==sym&&field[1][0]==sym&& field[2][0]==sym){
            return  true;
        }
        if (field[0][1]==sym&&field[1][1]==sym&& field[2][1]==sym){
            return  true;
        }
        if (field[0][2]==sym&&field[1][2]==sym&& field[2][2]==sym){
            return  true;
        }
        if (field[0][0]==sym&&field[1][1]==sym&& field[2][2]==sym){
            return  true;
        }
        if (field[2][0]==sym&&field[1][1]==sym&& field[0][2]==sym){
            return  true;
        }
        return false;
    }

}

//    public static void main(String[] args) {
//        initField();
//        printField();
//    }
//}
