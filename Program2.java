package Mod14_Exer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)?");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Customs free:");
                double customsFree = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFree));
            } else if (ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY):");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            } else if (ch == 'c') {
                list.add(new Product(name, price));
            }

            System.out.println();
            System.out.print("Price tags: ");

            for (Product pro : list) {
                System.out.println(pro.priceTag());
            }

        }
        sc.close();
    }
}
