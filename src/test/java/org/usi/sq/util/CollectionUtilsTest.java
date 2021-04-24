package org.usi.sq.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CollectionUtilsTest {

    // convenience method to create lists for testing, use like
    // List<Integer> = list(1,2,3);
    public List<Integer> list(int... ints){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : ints)
            list.add(i);
        return list;
    }

    @Test
    void binarySearch_Conditions_Result() {
        List<Integer> integers= list(1,2,3,4,4);

        assertEquals(Collections.binarySearch(integers,2),CollectionUtils.binarySearch(integers,2));
        assertEquals(Collections.binarySearch(integers,5),CollectionUtils.binarySearch(integers,5));
        assertEquals(Collections.binarySearch(integers,1),CollectionUtils.binarySearch(integers,1));


    }
}
