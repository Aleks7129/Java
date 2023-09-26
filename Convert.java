import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть курс");
        double currency = sc.nextDouble();
        System.out.println("Введіть кількість Ваших грошей ");
        int hryvna = sc.nextInt();
        int amount = (int) (hryvna / currency);
        double change = hryvna - amount * currency;
        System.out.println("Ви можете купити " + amount + "$");
        if (change != 0) {
            System.out.printf("Ваша решта - %.2f", change);
            System.out.println();
        } else {
            System.out.println("Решти немає");
        }

        sc.close();
    }
}

