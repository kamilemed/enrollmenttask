package treeStructureTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import treeStructure.Node;

class NodeTest {

    @Test
    public void checkDepthWhenNoChildIsAdded() {
        Node root = new Node();
        Assertions.assertEquals(Node.treeDepth(root), 1);
    }

    @Test
    public void checkDepthWhenOneChildIsAdded() {
        Node root = new Node();
        root.nodes.add(new Node());
        Assertions.assertEquals(Node.treeDepth(root), 2);
    }

    @Test
    public void checkDepthWhenGrandchildIsAdded() {
        Node root = new Node();

        Node child = new Node();
        root.nodes.add(child);

        child.nodes.add(new Node());

        Assertions.assertEquals(Node.treeDepth(root), 3);
    }

    @Test
    public void checkDepthWhenTwoBrancesAreAdded() {
        Node root = new Node();

        Node child1 = new Node();
        root.nodes.add(child1);

        Node child2 = new Node();
        root.nodes.add(child2);

        child2.nodes.add(new Node());

        Assertions.assertEquals(Node.treeDepth(root), 3);
    }

    @Test
    public void checkDepthWhenMiddleBranchIsTheLongest() {
        Node root = new Node();

        Node child1 = new Node();
        root.nodes.add(child1);

        Node child2 = new Node();
        root.nodes.add(child2);

        Node child3 = new Node();
        root.nodes.add(child3);

        child2.nodes.add(new Node());

        Assertions.assertEquals(Node.treeDepth(root), 3);
    }
}