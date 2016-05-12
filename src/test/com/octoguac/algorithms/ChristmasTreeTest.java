package com.octoguac.algorithms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aaron on 5/5/2016.
 */
public class ChristmasTreeTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    ChristmasTree christmasTree = new ChristmasTree();
    private final String treeHeightSix =
                    "----X----\r\n" +
                    "---XXX---\r\n" +
                    "--XXXXX--\r\n" +
                    "-XXXXXXX-\r\n" +
                    "XXXXXXXXX\r\n" +
                    "----X----\r\n";

    private final String treeHollowHeightSix =
                    "----X----\r\n" +
                    "---X-X---\r\n" +
                    "--X---X--\r\n" +
                    "-X-----X-\r\n" +
                    "XXXXXXXXX\r\n" +
                    "----X----\r\n";

    private final String treeHeightTen =
                    "--------X--------\r\n" +
                    "-------XXX-------\r\n" +
                    "------XXXXX------\r\n" +
                    "-----XXXXXXX-----\r\n" +
                    "----XXXXXXXXX----\r\n" +
                    "---XXXXXXXXXXX---\r\n" +
                    "--XXXXXXXXXXXXX--\r\n" +
                    "-XXXXXXXXXXXXXXX-\r\n" +
                    "XXXXXXXXXXXXXXXXX\r\n" +
                    "--------X--------\r\n";

    private final String treeHollowHeightTen =
                    "--------X--------\r\n" +
                    "-------X-X-------\r\n" +
                    "------X---X------\r\n" +
                    "-----X-----X-----\r\n" +
                    "----X-------X----\r\n" +
                    "---X---------X---\r\n" +
                    "--X-----------X--\r\n" +
                    "-X-------------X-\r\n" +
                    "XXXXXXXXXXXXXXXXX\r\n" +
                    "--------X--------\r\n";

    private final String treeFullHeightFive =
                    "---X---\r\n" +
                    "--XXX--\r\n" +
                    "-XXXXX-\r\n" +
                    "XXXXXXX\r\n" +
                    "---X---\r\n";

    private final String treeHollowHeightFive =
                    "---X---\r\n" +
                    "--X-X--\r\n" +
                    "-X---X-\r\n" +
                    "XXXXXXX\r\n" +
                    "---X---\r\n";
    @Test
    public void print_tree_test() {
        christmasTree.print_tree(3, false);
        assertEquals("", outContent.toString());

        outContent.reset();

        christmasTree.print_tree(6, false);
        assertEquals(treeHeightSix, outContent.toString());

        outContent.reset();

        christmasTree.print_tree(10, false);
        assertEquals(treeHeightTen, outContent.toString());

        outContent.reset();

        christmasTree.print_tree(5, false);
        assertEquals(treeFullHeightFive, outContent.toString());
    }

    @Test
    public void print_hollow_tree_test() {
        christmasTree.print_tree(6, true);
        assertEquals(treeHollowHeightSix, outContent.toString());

        outContent.reset();

        christmasTree.print_tree(10, true);
        assertEquals(treeHollowHeightTen, outContent.toString());

        outContent.reset();

        christmasTree.print_tree(5, true);
        assertEquals(treeHollowHeightFive, outContent.toString());
    }
}
