package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringJdbcTemplate2PostgreSqlApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcTemplate2PostgreSqlApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "INSERT INTO players (first_name, last_name, email_address, gender, age_group, country, city) VALUES("
				+ "'Aleksej','Babako', 'alexplius764@gmail.com','Male','30-35','Lithuania','Vilnius')";
		
		int rows = jdbcTemplate.update(sql);
		
		if(rows > 0) {
			System.out.println("A new row has been inserted.");
		}
	}

}
