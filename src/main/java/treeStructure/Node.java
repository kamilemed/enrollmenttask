package treeStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Node{
    public List<Node> nodes = new ArrayList<Node>();

    public static int treeDepth(Node node) {
        if (node.nodes.isEmpty()) {
            return 1;
        }

        List<Integer> depths = new ArrayList<>();
        for (Node child: node.nodes) {
            depths.add(treeDepth(child));
        }

        return 1 + Collections.max(depths);
    }
}
