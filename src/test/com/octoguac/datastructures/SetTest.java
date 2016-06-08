package com.octoguac.datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Aaron on 5/5/2016.
 */
public class SetTest {

    Set empty = new Set();
    Set one = new Set(1);
    Set many = new Set();

    @Before
    public void setup() {
        one.add("one");

        many.add("one");
        many.add("two");
    }

    @Test
    public void isEmpty_test() {
        assertTrue(empty.isEmpty());
    }

    @Test
    public void add_test() {
        assertFalse(one.isEmpty());

        one.add("two");
        assertTrue(one.contains("two"));
    }

    @Test
    public void contains_test() {
        assertTrue(one.contains("one"));

        assertTrue(many.contains("one"));
        assertTrue(many.contains("two"));

        one.add(null);
        assertFalse(one.contains(null));

        many.add("two");
        assertEquals(2, many.size());
    }

    @Test
    public void remove_test() {
        one.remove("not in set");
        assertTrue(one.contains("one"));
        assertEquals(1, one.size());

        one.remove("one");
        assertFalse(one.contains("one"));
        assertEquals(0, one.size());

        many.remove("one");
        assertFalse(many.contains("one"));
        assertEquals(1, many.size());
    }

    @Test
    public void size_test() {
        assertEquals(0, empty.size());

        one.add(null);
        assertEquals(1, one.size());

        many.add("two");
        assertEquals(2, many.size());
    }
}