package com.example.tablas.Table;

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
        
    
    }

    @Override
    public void table(int num) {
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
        
    }
    
}
