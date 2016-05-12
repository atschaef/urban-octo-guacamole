package com.octoguac.algorithms;

/*
# Write a function print_tree that takes in an integer height and a boolean hollow and prints a Christmas tree, example output is below.
#
#
# print_tree(10, false)
# --------X--------
# -------XXX-------
# ------XXXXX------
# -----XXXXXXX-----
# ----XXXXXXXXX----
# ---XXXXXXXXXXX---
# --XXXXXXXXXXXXX--
# -XXXXXXXXXXXXXXX-
# XXXXXXXXXXXXXXXXX
# --------X--------
#
# print_tree(6, false)
# ----X----
# ---XXX---
# --XXXXX--
# -XXXXXXX-
# XXXXXXXXX
# ----X----
#
# print_tree(10, true)
# --------X--------
# -------X-X-------
# ------X---X------
# -----X-----X-----
# ----X-------X----
# ---X---------X---
# --X-----------X--
# -X-------------X-
# XXXXXXXXXXXXXXXXX
# --------X--------
#
*/

public class ChristmasTree {
    static final String TreeValue = "X";
    static final String PaddingValue = "-";

    public void print_tree(int height, boolean hollow) {
        //smallest height for a tree is 4
        if(height <= 3){
            return;
        }

        //tree height (without trunk) is height - 1
        int treeHeight = height - 1;

        //peak and trunk are identical
        //and consistent between full and hollow tree
        String trunkAndPeakValue = getTreeLineAtIndex(treeHeight, 0);
        System.out.println(trunkAndPeakValue);

        //start at index 1, and go to height - 2 (treeHeight - 1)
        //since peak and trunk are identical
        //and bottom branch is consistent across hollow and full
        String padding;
        for (int i = 1; i < treeHeight - 1; i++) {
            padding = getPadding(treeHeight, i);
            System.out.print(padding);

            System.out.print(getTreeBranch(i, hollow));

            System.out.println(padding);
        }

        //lowest branch is also identical between hollow and full tree
        //and it is always full
        System.out.println(getTreeBranch(treeHeight - 1, false));

        //write Trunk; same as first line (index 0)
        System.out.println(trunkAndPeakValue);
    }

    public String getTreeLineAtIndex(int treeHeight, int index) {
        String padding = getPadding(treeHeight, index);
        return padding + getTreeBranch(index, false) + padding;
    }

    public String getPadding(int treeHeight, int lineIndex) {
        String padding = "";

        //length of padding is treeHeight - currentLineIndex - 1
        for (int i = 0; i < treeHeight - lineIndex - 1; i++) {
            padding += PaddingValue;
        }

        return padding;
    }

    public String getTreeBranch(int lineIndex, boolean hollow) {
        if (hollow) {
            return getHollowTreeBranch(lineIndex);
        } else {
            return getFullTreeBranch(lineIndex);
        }
    }

    private String getHollowTreeBranch(int lineIndex) {
        String tree = TreeValue;

        for (int i = 0; i < lineIndex * 2 - 1; i++) {
            tree += PaddingValue;
        }

        tree += TreeValue;

        return tree;
    }

    private String getFullTreeBranch(int lineIndex) {
        String tree = "";

        for (int i = 0; i < lineIndex * 2 + 1; i++) {
            tree += TreeValue;
        }

        return tree;
    }
}

