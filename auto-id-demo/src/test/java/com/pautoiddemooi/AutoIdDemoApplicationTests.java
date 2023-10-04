package com.pautoiddemooi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.pautoiddemooi.controller.UserController;
import com.pautoiddemooi.entity.User;

@SpringBootTest
class AutoIdDemoApplicationTests {

	@Test
	void contextLoads() {
		UserController user=new UserController();
		User build = User.builder().id(UUID.randomUUID()).name("siddu").build();
		String actualResult = user.saveUser(build);
		String expectedResult="Success";
		assertEquals(expectedResult, actualResult);
	}
	@Test
	public void testSaveUser() {
		UserController user=new UserController();
		User build = User.builder().id(UUID.randomUUID()).name("siddu").build();
		String actualResult = user.saveUser(build);
		String expectedResult="Success";
		assertEquals(expectedResult, actualResult);
	}

}
