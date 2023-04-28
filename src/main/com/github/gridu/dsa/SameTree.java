package com.github.gridu.dsa;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(p);
        queue.offer(q);

        while (!queue.isEmpty()) {
            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();

            if (node1 == null && node2 == null) {
                continue;
            } else if (node1 == null || node2 == null || node1.val != node2.val) {
                return false;
            } else {
                queue.offer(node1.left);
                queue.offer(node2.left);
                queue.offer(node1.right);
                queue.offer(node2.right);
            }
        }

        return true;
    }
}
