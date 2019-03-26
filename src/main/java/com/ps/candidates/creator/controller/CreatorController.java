package com.ps.candidates.creator.controller;

import com.ps.candidates.creator.model.CandidateDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreatorController {

    @PostMapping("/create")
    void createCandidate(@RequestBody CandidateDto candidateDto) {

    }
}
