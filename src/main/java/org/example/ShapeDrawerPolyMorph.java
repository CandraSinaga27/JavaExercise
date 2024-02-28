package org.example;
import java.util.InputMismatchException;

import java.util.Scanner;

//define a shape interface

interface Shape {
    void draw(int height, int side);
}

    class drawTriangleSS implements Shape {
    @Override //overriding (mengganti secara paksa content dari function dalam polymorphism)
        public void  draw (int height, int side){
        for (int i = 1; i <=height; i++){ // misal height =4, i=1, 1 <=4
            for (int j=1; j<=i; j++){ //j=1, 1<=1 kalo true
                System.out.print("*"); // print *
            }
            System.out.println();
        }
    }
    }

class drawTriangleSK implements Shape {
    @Override //overriding (mengganti secara paksa content dari function dalam polymorphism)
    public void draw(int height2, int side) {
        for (int i = 1; i <= height2; i++) {
            // Print spaces to center the triangle
            for (int j = height2 - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print stars for the triangle
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

class drawTrianglePR implements Shape {
    @Override //overriding (mengganti secara paksa content dari function dalam polymorphism)
    public void draw(int height3, int side) {
            for (int i = 0; i < height3; i++) {
                for (int j = 0; j < height3; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

class drawRectanglePP implements Shape {
    @Override //overriding (mengganti secara paksa content dari function dalam polymorphism)
    public void draw(int height4, int Long) {
        for (int i = 0; i < height4; i++) {
            // Print spaces to center the triangle
            for (int j = 0; j < Long; j++) { // * * *
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
public class ShapeDrawerPolyMorph {
    Scanner scanner = new Scanner(System.in); //object scanner

    // function displayMenu yang kita panggil
    // public void -> ngga perlu ada return bisa langsng nampilin aja
    public void displayMenu (){
        System.out.println("Selamat data di ASCII draw!");
        System.out.println("pilih bentuk yang mau digambar");
        System.out.println("1. segitiga siku-siku");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.println("4. Rectangle");
        System.out.println("5. Exit\n");
    }

    public void drawShape(int choice){
        try {
            switch(choice){
                case 1:
                    System.out.println("masukan panjang segitiga siku-siku");
                    int height = scanner.nextInt();
                    new drawTriangleSS().draw(height, 1); //fungsi untuk menggambar segitiganya
                    break;
                case 2:
                    System.out.println("masukan panjang segitiga sama kaki");
                    int height2 = scanner.nextInt();
                    new drawTriangleSK().draw(height2, 1); //fungsi untuk menggambar segitiganya
                    break;
                case 3:
                    System.out.println("masukan persegi");
                    int height3 = scanner.nextInt();
                    new drawTrianglePR().draw(height3, 1); //fungsi untuk menggambar segitiganya
                    break;
                case 4:
                    System.out.println("Persegi Panjang");
                    System.out.print("masukkan Tinggi: ");
                    int height4 = scanner.nextInt();
                    System.out.print("masukan Panjang: ");
                    int Long = scanner.nextInt();
                    new drawRectanglePP().draw(height4, Long ); //fungsi untuk menggambar segitiganya
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid input");
            }
        } catch (InputMismatchException ime) {
            System.out.println("Please enter a valid integer.");
            scanner.next(); // to consume the invalid token
        }

    }
    public void run(){
        //loop untuk terus menampilkan Menu
        while (true){
            displayMenu();
            System.out.println("Masukan pilihan menu: ");
            try {
                int choice = scanner.nextInt();
                drawShape (choice);
                System.out.println();
            } catch (InputMismatchException ime){
                System.out.println("Please enter a valid integer.");
                scanner.next();
            }

        }
    }

    public static void main(String[] args) {
        //Program  untuk gambar ASCII shape
        //Runner
        ShapeDrawerPolyMorph drawer = new ShapeDrawerPolyMorph();
        drawer.run();
    }
}
