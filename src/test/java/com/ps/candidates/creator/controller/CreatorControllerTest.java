package com.ps.candidates.creator.controller;

import com.ps.candidates.creator.model.CandidateDto;
import org.junit.Test;

public class CreatorControllerTest {

    @Test
    public void shouldCreateCandidate() {
        CandidateDto candidateDto = new CandidateDto();

        CreatorController creatorController = new CreatorController();
        creatorController.createCandidate(candidateDto);
    }
}