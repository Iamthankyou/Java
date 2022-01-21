package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void readFileText(String sourcePath, String targetpath) {
        try {
            File file = new File("file/" + sourcePath);

            if (!file.exists()) {
                System.out.println("File source khong ton tai");
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                writeToTarget(targetpath,line);
            }
            br.close();

        } catch (Exception e) {
            System.err.println("Fie không tồn tại c nội dung có lỗi!");
        }
    }

    public static void writeToTarget(String nameFile, String text) {
        File file = new File("file/"+nameFile);
        try {
            FileWriter fw = new FileWriter(file, true);
            fw.write(text + "\n");
            fw.close();
        } catch (Exception e) {
            writeToTarget(nameFile,e.getMessage()+ "\n");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ten file input: ");
        String source = scanner.nextLine();
        System.out.println("Nhap ten file output: ");
        String target = scanner.nextLine();

        readFileText(source, target);
    }
}
