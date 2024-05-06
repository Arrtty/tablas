package com.example.tablas.Table;

import java.util.Scanner;

import com.example.tablas.TableInterface.ITable;

public class Tables implements ITable{



    @Override
    public void showMenu() {
        System.out.println("Ingrese una opción");
        System.out.println("1.- Mostrar una tabla");
        System.out.println("2.- Mostrar tablas del 2 al 5");
        System.out.println("3.- Salir");
    }

    @Override
    public void readOption() {
        Scanner sc = new Scanner(System.in);
        int op;
        boolean i = false;
        do{
            try {
                op = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Ingrese solo numeros");
                continue;
            }
        switch (op) {
            case 1:
                System.out.println("Ingrese el numero de la tabla que quiere ver");
                int num = sc.nextInt();
                table(num);
                i = true;
                break;
            case 2:
                System.out.println("2:");
                table(2);
                System.out.println();
                System.out.println("3");
                table(3);
                System.out.println();
                System.out.println("4");
                table(4);
                System.out.println();
                System.out.println("5");
                table(5);
                i = true;
                break;
            case 3:
                System.out.println("Adios!");
                System.exit(0);
        
            default:
            System.out.println("Ingrese una opción válida");
                break;
        }
        }while(i!=true);
        
    
    }

    @Override
    public void table(int num) {
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
        
    }
    
}
