package com.infogrupo.registerproducts;

import com.infogrupo.registerproducts.adapters.model.Category;
import com.infogrupo.registerproducts.adapters.model.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class RegisterproductsApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(RegisterproductsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Product pdt = new Product(1,"Eletro","Geladeira");
		Product pdt1 = new Product(2,"Eletro","Fogão");
		Product pdt2 = new Product(3,"Eletro","Lavadoura");
		Product pdt3 = new Product(4,"Eletro","Ferro passar");

		Category cat = new Category(1, "Eletrodomesticos");
		Category cat1 = new Category(1, "Eletronico");
		Category cat2 = new Category(1, "Pereciveis");
		Category cat3 = new Category(1, "Roupas");
		Category cat4 = new Category(1, "Informática");

		pdt.setCategory(cat);
		pdt1.setCategory(cat1);
		pdt2.setCategory(cat2);
		pdt3.setCategory(cat3);

		List<Product>pds = new ArrayList<>();

		pds.addAll(Arrays.asList(pdt,pdt2,pdt3,pdt1));

		pds.forEach(pd -> System.out.println(pd));

 	}
}
