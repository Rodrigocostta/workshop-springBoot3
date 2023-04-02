package com.rcosta.workShop.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rcosta.workShop.entities.Category;
import com.rcosta.workShop.entities.Orders;
import com.rcosta.workShop.entities.User;
import com.rcosta.workShop.enums.OrderStatus;
import com.rcosta.workShop.repositoryes.CategoryReository;
import com.rcosta.workShop.repositoryes.OrderRepository;
import com.rcosta.workShop.repositoryes.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository useRepository;
	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CategoryReository CategoryReositiry;

	@Override
	public void run(String... args) throws Exception {

		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");

		CategoryReositiry.saveAll(Arrays.asList(cat1, cat2, cat3));

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

		Orders o1 = new Orders(null, Instant.parse("2019-06-20T19:53:07Z"), u1, OrderStatus.PAID);
		Orders o2 = new Orders(null, Instant.parse("2019-07-21T03:42:10Z"), u2, OrderStatus.CANCELED);
		Orders o3 = new Orders(null, Instant.parse("2019-07-22T15:21:22Z"), u1, OrderStatus.SHIPPED);

		useRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));

	}

}
