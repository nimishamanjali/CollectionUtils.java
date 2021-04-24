package org.usi.sq.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

class StringUtilsTest {
    @Test
    void split_Conditions_Result() {
        // hint: use assertArrayEquals for deep checks of array equality
        // assertEquals only checks reference equality, which is generally
        // not intended

        assertArrayEquals("boo:and:foo".split(":",2),StringUtils.split("boo:and:foo",':',2));
        assertArrayEquals("boo:and:foo".split(":",0),StringUtils.split("boo:and:foo",':',0));
        assertArrayEquals("boo:and:foo".split(".",1),StringUtils.split("boo:and:foo",'.',1));
        //Arrays.stream(StringUtils.split("boo:and:foo", 'o', 0)).forEach(a->System.out.println(a + "   "+ a.length()));
        assertArrayEquals("boo:and:foo".split("o", 0),StringUtils.split("boo:and:foo",'o', 0));

    }
}