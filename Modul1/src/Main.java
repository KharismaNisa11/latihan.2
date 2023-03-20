import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sgt;
        Scanner input = new Scanner(System.in);
        Segitiga<Integer> luasTipeInt = new Segitiga<>();
        Segitiga<Double> luasTipeDouble = new Segitiga<>();

        System.out.println("==== HITUNG LUAS SEGITIGA ====");
        System.out.println("Ingin Menampilkan Hasil Luas dalam Bentuk? : ");
        System.out.println("1. Hasil to Integer");
        System.out.println("2. Hasil to Double");
        System.out.println("Masukkan Pilihan 1/2 : ");
        sgt = input.nextInt();

            switch (sgt) {
            case 1 -> {
                System.out.println("Masukkan Nilai Alas dan Tinggi secara Berurutan :");
                luasTipeInt.segitiga(input.nextInt(), input.nextInt());
                System.out.println("Hasil Luas Segitiga dalam Integer : " + luasTipeInt.getResultAsInt());
            }
            case 2 -> {
                System.out.println("Masukkan Nilai Alas dan Tinggi secara Berurutan : ");
                luasTipeDouble.segitiga(input.nextDouble(), input.nextDouble());
                System.out.println("Hasil Luas Segitiga dalam Double : " + luasTipeDouble.getResultAsDouble());
            }
        }


    }
}


