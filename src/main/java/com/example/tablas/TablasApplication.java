package com.example.tablas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.tablas.Table.Tables;

@SpringBootApplication
public class TablasApplication {

	public static void main(String[] args) {
		Tables tablas = new Tables();

		tablas.showMenu();
		tablas.readOption();
		
		//SpringApplication.run(TablasApplication.class, args);
	}

}
