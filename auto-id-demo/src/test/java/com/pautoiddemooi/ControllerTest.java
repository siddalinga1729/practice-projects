package com.pautoiddemooi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.pautoiddemooi.controller.UserController;
import com.pautoiddemooi.entity.User;
import com.pautoiddemooi.repo.UserRepo;
@SpringBootTest
public class ControllerTest {
	@MockBean
     UserRepo userRepo;
	@MockBean
	MockMvc mockMvc;
	@Test
	public void testSaveUser() {
		UserController user=new UserController();
		User build = User.builder().id(UUID.randomUUID()).name("siddu").build();
		when(userRepo.save(build)).thenReturn(build);
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/citizen/vcid/1");
		ResultActions perform = mockMvc.perform(requestBuilder);
		MvcResult andReturn = perform.andReturn();
		MockHttpServletResponse response = andReturn.getResponse();
		String actualResult = user.saveUser(build);
		String expectedResult="Success";
		assertEquals(expectedResult, actualResult);
	}
}
