import java.util.Arrays;

public class Lesson2Main {
    static int[] mass = new int[]{1, 0, 0, 0, 1, 0, 1, 1, 0, 1};
    static int[] mass2 = new int[8];
    static int[] mass3 = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    static int[] [] mass4 = new int[5] [5];
    static int[] mass5 = new int []{3,2,5,4,9};

    public static void main(String[] args) {
        changingMass();
        System.out.println( Arrays.toString(mass));

        fillMass( );
        System.out.println(Arrays.toString( mass2 ));

        multiplicationMass(  );
        System.out.println(Arrays.toString( mass3 ));

        diagonalFill();

        minmaxelements(mass5);


    }




    private static void changingMass() {              //заменяет число 1 на 0, а на 0 на 1 в массиве
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 1) mass[i] = 0;
            else mass[i] = 1;
        }
    }

    private static void fillMass(){                  //заполняет массив значениями 0 3 6 9 12 15 18 21
        for (int i = 0, j = 0; i <mass2.length; i++ , j+=3){
            mass2[i]=j;

        }
    }

    private static void multiplicationMass (){     //числа меньшие 6 в массиве умножить на 2
        for (int i= 0; i<mass3.length; i++){
            if (mass3[i]<6){
                mass3[i]=mass3[i]*2;
            }
        }
    }
    private static void diagonalFill (){                         //заполнение  диагональные элементы массива единицами
        for (int i = 0; i < mass4.length; i++) {
            for (int j = 0, j2 = mass4[i].length; j < mass4[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) {
                    mass4[i][j] = 1;
                }
                System.out.print(mass4[i][j] + "");
            }
            System.out.println("");
        }
    }

    private static void minmaxelements (int m[]){    //выводит минимальное и максимальное число в массиве
        int max = mass5[0];
        int min = mass5[0];
        for (int x : mass5){
            if (x>max) max=x;
            if (x<min) min=x;
        }
        System.out.println(min + " " + max);
    }

}


