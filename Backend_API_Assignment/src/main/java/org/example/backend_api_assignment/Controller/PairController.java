package org.example.backend_api_assignment.Controller;


import org.example.backend_api_assignment.Model.PairRequest;
import org.example.backend_api_assignment.Model.PairResponse;
import org.example.backend_api_assignment.Service.PairService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/find-pairs")
public class PairController {

    private final PairService pairService;

    public PairController(PairService pairService) {
        this.pairService = pairService;
    }

    @PostMapping
    public ResponseEntity<?> findPairs( @RequestBody PairRequest request) {
        List<List<Integer>> pairs = pairService.findPairs(request.getNumbers(), request.getTarget());

        if (pairs.isEmpty()) {
            return new ResponseEntity<>(new PairResponse(pairs), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new PairResponse(pairs), HttpStatus.OK);
        }
    }
}
