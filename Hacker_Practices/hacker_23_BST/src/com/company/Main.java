package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        ArrayDeque<Node> deque = new ArrayDeque(); // use deque as a queue
        deque.add(root);
        while (!deque.isEmpty()) {
            Node n = deque.removeFirst();
            System.out.print(n.data + " ");
            if (n.left != null) {
                deque.addLast(n.left);
            }
            if (n.right != null) {
                deque.addLast(n.right);
            }
        }
    }


}
