import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        int input1, input2, total, dataAngka;

        while (true) {
            System.out.println("Kalkulator");
            System.out.println("1. Kalkulator Basic");
            System.out.println("2. Kalkulator Scientific");
            System.out.println("3. Keluar Program");
            System.out.print("Pilih Menu : ");
            input1 = masukkan.nextInt();
            if (input1 == 1) {
                System.out.println("Kalkulator Basic");
                System.out.println("1. Penjumlahan(+)");
                System.out.println("2. Pengurangan(-)");
                System.out.println("3. Perkalian(x)");
                System.out.println("4. Pembagian(:)");
                System.out.println("5. Kembali");
                System.out.print("Masukan pilihan anda : ");
                input2 = masukkan.nextInt();

                if (input2 == 1) {
                    BasicCalculator tambah = new BasicCalculator();
                    while (true) {
                        System.out.print("Input angka (input x jika sudah) : ");
                        if (masukkan.hasNextInt()) {
                            dataAngka = masukkan.nextInt();
                            tambah.setNumber(dataAngka);
                        } else {
                            masukkan.next();
                            break;
                        }
                    }
                    total = tambah.add();
                    System.out.printf("Hasil = %d\n", total);
                } else if (input2 == 2) {
                    BasicCalculator kurang = new BasicCalculator();
                    while (true) {
                        System.out.print("Input angka (input x jika sudah) : ");
                        if (masukkan.hasNextInt()) {
                            dataAngka = masukkan.nextInt();
                            kurang.setNumber(dataAngka);
                        } else {
                            masukkan.next();
                            break;
                        }
                    }
                    total = kurang.substract();
                    System.out.printf("Hasil = %d\n", total);
                } else if (input2 == 3) {
                    BasicCalculator kali = new BasicCalculator();
                    while (true) {
                        System.out.print("Input angka (input x jika sudah) : ");
                        if (masukkan.hasNextInt()) {
                            dataAngka = masukkan.nextInt();
                            kali.setNumber(dataAngka);
                        } else {
                            masukkan.next();
                            break;
                        }
                    }
                    total = kali.multiply();
                    System.out.printf("Hasil = %d\n", total);
                } else if (input2 == 4) {
                    BasicCalculator bagi = new BasicCalculator();
                    while (true) {
                        System.out.print("Input angka (input x jika sudah) : ");
                        if (masukkan.hasNextInt()) {
                            dataAngka = masukkan.nextInt();
                            bagi.setNumber(dataAngka);
                        } else {
                            masukkan.next();
                            break;
                        }
                    }
                    total = bagi.divide();
                    System.out.printf("Hasil = %d\n", total);
                } else {
                    continue;
                }

            } else if (input1 == 2) {
                System.out.println("Kalkulator Scientific");
                System.out.println("1. Nilai Akar");
                System.out.println("2. Nilai Pangkat");
                System.out.println("3. Nilai Factorial");
                System.out.println("4. Kembali");
                System.out.print("Pilih Menu : ");
                input2 = masukkan.nextInt();
                if (input2 == 1) {
                    ScientificCalculator root = new ScientificCalculator();
                    System.out.print("Input angka : ");
                    dataAngka = masukkan.nextInt();
                    root.setNumber(dataAngka);
                    double hasil = root.squareroot();
                    System.out.printf("Hasil = %f\n", hasil);

                } else if (input2 == 2) {
                    ScientificCalculator exponent = new ScientificCalculator();
                    System.out.print("Input angka : ");
                    dataAngka = masukkan.nextInt();
                    exponent.setNumber(dataAngka);
                    System.out.print("Input pangkat : ");
                    dataAngka = masukkan.nextInt();
                    exponent.setNumber(dataAngka);
                    total = exponent.exponentiation();
                    System.out.printf("Hasil = %d\n", total);

                } else if (input2 == 3) {
                    ScientificCalculator factor = new ScientificCalculator();
                    System.out.print("Input angka : ");
                    dataAngka = masukkan.nextInt();
                    factor.setNumber(dataAngka);
                    total = factor.factorial();
                    System.out.printf("Hasil = %d\n", total);

                } else {
                    continue;
                }

            } else {
                return;
            }
        }

    }
}
