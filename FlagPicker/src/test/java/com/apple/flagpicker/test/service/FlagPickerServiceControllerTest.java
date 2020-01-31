package com.apple.flagpicker.test.service;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.apple.flagpicker.controller.FlagPickerServiceController;
import com.apple.flagpicker.service.FlagPickerService;

@RunWith(SpringRunner.class)
@WebMvcTest(FlagPickerServiceController.class)
public class FlagPickerServiceControllerTest {
	
	@Autowired
	private MockMvc mockMVC;
	
	@MockBean
	private FlagPickerService flagPickerService;

	@Test
	public void getAllContinent() throws Exception {
		mockMVC.perform(MockMvcRequestBuilders.get("/continent")).andExpect(status().isOk());
	}
	
	@Test
	public void getContinentByName() throws Exception {
		mockMVC.perform(MockMvcRequestBuilders.get("/continent/Africa")).andExpect(status().isOk());
	}
	

}
