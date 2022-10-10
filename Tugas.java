import java.util.Scanner;
public class Tugas {

    public static void main(String[] args) {

        //  Input Scanner class
        Scanner sc = new Scanner(System.in);
        char choice;
        int banyakAngka = 0, bedaAngka = 0;


        //  Do repeatation
        do {
            //  PrintOut Input
            System.out.println(" Belajar Deret Aritmatika, Geometri dan menghitung Faktorial");
            System.out.println();
            System.out.print(" Masukan banyak angka yang mau di cetak [2..10] : ");
            try {
                banyakAngka = sc.nextInt();
                if (banyakAngka < 2 || banyakAngka > 10) {
                    System.out.println(" Masukkan hanya angka 2 sampai dengan 10 ");}}
            catch (Exception e) {
                System.out.println(e);}
            while (banyakAngka < 2 || banyakAngka > 10);


            System.out.print(" Masukan beda masing-masing angka [2..9] : ");
            try {
                bedaAngka = sc.nextInt();
                if (bedaAngka < 2 || bedaAngka > 9) {
                    System.out.println(" Masukkan beda angka hanya 2 sampai dengan 9 ");}}
            catch (Exception e) {
                System.out.println(e);}
            while (bedaAngka < 2 || bedaAngka > 9);



            //  Deret Aritmatika
            System.out.println();
            System.out.print( " Deret Aritmatika : " + "\n");
            for (int i = 1; i <= banyakAngka * bedaAngka; i = i + bedaAngka) {
                System.out.print(i + " ");
            }

            //  Deret Geometri
            System.out.print("\n" + " Deret Geometri : " + "\n");
            int a = 1, total = 0;
            for (int i = 1; i <= banyakAngka; i++) {
                System.out.print(a + total);
                a = a * bedaAngka;
                if (i < banyakAngka) {
                    System.out.print(" ");
                } else {
                    System.out.print(" ");
                }
            }

            //  Deret Faktorial
            System.out.print("\n" + " Faktorial dari " + banyakAngka + " : " + "\n");
            for (int i = banyakAngka; i >= 1; i--) {
                System.out.print( i + " ");
            }
            System.out.println(" = " + factorial(banyakAngka));

            //  Repeatation
            System.out.println();
            System.out.println("Anda mau ulang [Y/N] : ");
            choice = sc.next().charAt(0);
        }
        while (choice == 'y' || choice == 'Y');
        sc.close();
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
