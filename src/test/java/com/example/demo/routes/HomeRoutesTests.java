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
public class HomeRoutesTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHome() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string("welcome to apache maven World!"));
    }

    @Test
    public void testPostHome() throws Exception {
        mockMvc.perform(post("/"))
                .andExpect(status().isOk())
                .andExpect(content().string("POST request to home"));
    }

    @Test
    public void testPutHome() throws Exception {
        mockMvc.perform(put("/"))
                .andExpect(status().isOk())
                .andExpect(content().string("PUT request to home"));
    }

    @Test
    public void testDeleteHome() throws Exception {
        mockMvc.perform(delete("/"))
                .andExpect(status().isOk())
                .andExpect(content().string("DELETE request to home"));
    }
}
