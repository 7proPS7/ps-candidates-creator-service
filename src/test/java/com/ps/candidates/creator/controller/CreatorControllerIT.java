package com.ps.candidates.creator.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(CreatorController.class)
public class CreatorControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldCreateCandidate() throws Exception {
        String candidateJsonFileContent = new String(Files.readAllBytes(Paths.get("src/test/resources/simpleCandidate.json")));

        mockMvc.perform(post("/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(candidateJsonFileContent))
                .andExpect(status().isOk());
    }
}