package Tries;

import javax.swing.tree.TreeNode;

public class Implementation {
    private boolean delete(TreeNode current, String word, int index) {
        if (index == word.length()) {
            if (!current.isEndOfWord) {
               
                return false;
            }
            current.isEndOfWord = false;
            return true; 
        }

        