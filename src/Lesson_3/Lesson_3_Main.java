package Lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Lesson_3_Main {
static Scanner s1 = new Scanner( System.in );
    public static void main(String[] args) {
        System.out.println("Выберите игру: 1-Угадать число, 2-Угадать слово");
        switch (s1.next()) {
            case "1":
                findNumber();
                break;
            case "2":
                findWord();
                break;
            default:
                return;
        }
    }

    static  private void findNumber(){  // Игра "Угадай число"
       int i = generator(); //загаданное число
       int x; //вводимое число
        Scanner scanner = new Scanner( System.in );

        for (int j = 0; j < 3; j++){
            System.out.println("Попытка №" + (j+1) + ": ");
            x = scanner.nextInt();
            if (x < i) System.out.println("Число больше!");
            if (x > i) System.out.println("Число меньше!");
            if (x == i) {System.out.println("Congratulations! Вы угадали! ");
                System.out.println("Играть заного? 1 – да , 0 – нет");
                x = scanner.nextInt();
                if (x == 1) {
                    findNumber();
                }
                else {
                    System.out.println("Спасибо за игру!");
                }
                    System.exit(0);
                }
            }
        System.out.println("Вы не угадали, печаль");
        System.out.println("Играть заного? 1 – да , 0 – нет");
        x = scanner.nextInt();
        if (x == 1) {
            findNumber();
        }
        else {
            System.out.println("Good Bye");
        }
    }

    static private int generator (){  //генератор числа
        Random random = new Random(  );
       return random.nextInt(9);
    }

    static private void findWord(){   // Игра "Угадай слово"
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rn = new Random(  );
        Scanner sc = new Scanner( System.in );
        String secret = words[rn.nextInt(words.length)];
        String input ;
        System.out.println("Угадай слово из следующего списка: apple, orange, lemon, banana, apricot, avocado, broccoli, carrot, cherry, garlic, grape, melon, leak, kiwi, mango, mushroom, nut, olive, pea, peanut, pear, pepper, pineapple, pumpkin, potato.");
        do {
            System.out.print("Угадай слово: ");
            input = sc.next();
            for (int i = 0; i < 15; i++)
                if (i < secret.length() && i < input.length() && secret.charAt(i) == input.charAt(i)) {
                    System.out.print( secret.charAt( i ) );
                }
                else {
                    System.out.print( (secret.equals( input )) ? "" : "#" );
                }
            System.out.println();
        } while (!secret.equals(input));
        System.out.println("Играть заного? 1 – да , 0 – нет");
        int x1 = sc.nextInt();
        if (x1 == 1) {
            findWord();
        }
        else {
            System.out.println("Good Bye");
        }
    }

    }

