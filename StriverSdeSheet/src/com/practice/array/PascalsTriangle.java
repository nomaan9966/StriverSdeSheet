package com.practice.array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(row);

        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> temp = new ArrayList<>();

            // add first element in the new row
            temp.add(1);

            // add middle elements in the new row
            List<Integer> prev = result.get(i - 1);
            for (int j = 1; j < prev.size(); j++) {
                temp.add(prev.get(j - 1) + prev.get(j));
            }

            // add last element in the new row
            temp.add(1);

            result.add(temp);
        }
        return result;
    }
}
