package io.github.vuongtw.ssb.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class GreetingControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void noParamsGreetingShouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/greeting")).andDo(print()).andExpect(status().isOk())
                        .andExpect(jsonPath("$.content").value("Hello, World!"));

    }

    @Test
    public void paramsGreetingShouldReturnTailoredMessage() throws Exception {
        this.mockMvc.perform(get("/greeting").param("name", "Spring Community"))
                        .andDo(print()).andExpect(status().isOk())
                        .andExpect(jsonPath("$.content").value("Hello, Spring Community!"));
    }
}
