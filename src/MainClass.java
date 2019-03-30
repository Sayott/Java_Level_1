public class MainClass {
    public static void main(String[] args) {
        System.out.println (mathExpression( 2,2,4,5 ));
        System.out.println (checkingNumLimits( 11,9 ));
        positiveNumCheck( -1 );
        System.out.println (negativeNumCheck( 10 ));
        hello( "Эржан" );
        leapYearCheck(2019);
    }

    char c = 35;
    byte b = 100;
    short s = 30000;
    int i = 500;
    long l = 5000000000L;
    float f = 10000000000.5F;
    double d = 30000000232.412F;
    boolean boo = true;
    String str = "SomeText";

   private static int mathExpression (int a, int b, int c, int d){  //метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат
       return a * (b + (c / d));
    }
    private static boolean checkingNumLimits (int a, int b){   // метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно)
       return (a + b >= 10 && a + b <= 20);
    }
    private static void positiveNumCheck (int a){             // метод который проверяет положительное ли число ему передали
        System.out.println( a>=0 ? "Число положительное" : "Число отрицательное");
    }
    private static boolean negativeNumCheck (int a){            //метод который проверяет отрицательное число ему передали
        return (a < 0);
    }
    private static void hello (String name){
        System.out.println("Привет, " + name+ "!");
    }
    private static void leapYearCheck (int year){               //метод, который определяет является ли год високосным
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)){
            System.out.println(year + " год високосный");
        }
        else {
            System.out.println(year + " год не является високосным");
        }
    }
}
