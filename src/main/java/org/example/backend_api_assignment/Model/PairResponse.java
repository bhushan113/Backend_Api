package org.example.backend_api_assignment.Model;

import java.util.List;

public class PairResponse {
    private List<List<Integer>> solutions;

    public PairResponse(List<List<Integer>> solutions) {
        this.solutions = solutions;
    }

    public List<List<Integer>> getSolutions() {
        return solutions;
    }

    public void setSolutions(List<List<Integer>> solutions) {
        this.solutions = solutions;
    }
}

