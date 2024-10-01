package org.example.backend_api_assignment.Model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

public class PairRequest {

    @NotNull(message = "Numbers array cannot be null")
    @NotEmpty(message = "Numbers array cannot be empty")
    private List<Integer> numbers;

    @NotNull(message = "Target value cannot be null")
    private Integer target;

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Integer getTarget() {
        return target;
    }

    public void setTarget(Integer target) {
        this.target = target;
    }
}
