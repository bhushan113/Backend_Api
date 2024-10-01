package org.example.backend_api_assignment.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class PairService {

    public List<List<Integer>> findPairs(List<Integer> numbers, int target) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.size(); i++) {
            int complement = target - numbers.get(i);
            if (map.containsKey(complement)) {
                List<Integer> pair = new ArrayList<>();
                pair.add(map.get(complement));
                pair.add(i);
                result.add(pair);
            }
            map.put(numbers.get(i), i);
        }
        return result;
    }
}

