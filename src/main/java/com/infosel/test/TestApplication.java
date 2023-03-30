package com.infosel.test;

import com.infosel.daas.data.feed.biva.AvroMxLastTrade;
import com.infosel.md2.Demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		var d = new Demo();
		d.setHello("Hello from Earth to");
		d.setWorld(" --> Mars ❤️");
		SpringApplication.run(TestApplication.class, args);

		System.out.println(d.getHello());
		System.out.println(d.getWorld());

		var x = new AvroMxLastTrade();
		x.setBolsa("BMV");
		System.out.println(x.getBolsa());
	}

}
