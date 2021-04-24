package org.usi.sq.util;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void max_Conditions_Result() {
        assertEquals(Integer.MAX_VALUE,MathUtils.max(5, 9, 1,Integer.MAX_VALUE));
        assertEquals(9,MathUtils.max(9, 2, 1));
    }
}
