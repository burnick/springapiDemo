package com.example.demo.routes;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloRoutesTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHello() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World!"));
    }

    @Test
    public void testPostHello() throws Exception {
        mockMvc.perform(post("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("POST request to hello"));
    }

    @Test
    public void testPutHello() throws Exception {
        mockMvc.perform(put("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("PUT request to hello"));
    }

    @Test
    public void testDeleteHello() throws Exception {
        mockMvc.perform(delete("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("DELETE request to hello"));
    }
}
