package com.company;

import com.company.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("1", "Iphone", "Apple", 1000));
        products.add(new Product("2", "Galaxy", "Samsung", 2000));
        products.add(new Product("3", "Galaxy", "Samsung", 2000));
        products.add(new Product("4", "Galaxy", "Samsung", 2000));
        products.add(new Product("5", "Galaxy", "Samsung", 2000));
        products.add(new Product("6", "Galaxy", "Samsung", 2000));
        products.add(new Product("7", "Galaxy", "Samsung", 2000));
        products.add(new Product("8", "Galaxy", "Samsung", 2000));
        products.add(new Product("9", "Galaxy", "Samsung", 2000));
        products.add(new Product("10", "Galaxy", "Samsung", 2000));
        products.add(new Product("11", "Galaxy", "Samsung", 2000));

        writeToFile(products);

        Scanner scanner = new Scanner(System.in);
        int number = 1;
        do {
            System.out.print("Select the menu options (1-add, 2-show, 3-find): ");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    addProduct(products);
                    break;
                case 2:
                    displayProduct();
                    break;
                case 3:
                    findProduct();
                    break;
                default:
                    number = 0;
            }
        } while (number != 0);
    }

    public static List<Product> readDataFromFile() {
        List<Product> products = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream("/home/duy/MyGit/Java/JavaCore/src/file/data.txt"); ObjectInputStream ois = new ObjectInputStream(fis)) {
            products = (List<Product>) ois.readObject();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        return products;
    }

    public static void writeToFile(List<Product> products) {
        try ( FileOutputStream fos = new FileOutputStream("/home/duy/MyGit/Java/JavaCore/src/file/data.txt"); ObjectOutputStream oos = new ObjectOutputStream(fos);){
            oos.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addProduct(List<Product> products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Typing id: ");
        String id = scanner.nextLine();
        System.out.println("Typing name: ");
        String name = scanner.nextLine();
        System.out.println("Typing brand: ");
        String brand = scanner.nextLine();
        System.out.println("Typing price");
        double price = scanner.nextDouble();

        products.add(new Product(id,name,brand,price));
        writeToFile(products);
    }

    public static void displayProduct() {
        List<Product> products = readDataFromFile();
        for (Product i:products) {
            System.out.println(i);
        }
    }

    public static void findProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Typing id: ");
        String id = scanner.nextLine();
        List<Product> products = readDataFromFile();
        for (Product i:products) {
            if (i.getId().equals(id)) {
                System.out.println(i);
                return;
            }
        }

        System.out.println("Not found product!");
    }
}