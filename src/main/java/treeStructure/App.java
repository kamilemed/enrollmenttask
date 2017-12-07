package treeStructure;

public class App {
    public static void main(String[] args) {
        Node root = new Node();

        Node child1 = new Node();
        Node child2 = new Node();
        root.nodes.add(child1);
        root.nodes.add(child2);

        child1.nodes.add(new Node());

        Node grandchild1 = new Node();
        Node grandchild2 = new Node();
        child2.nodes.add(grandchild1);
        child2.nodes.add(grandchild2);

        grandchild1.nodes.add(new Node());
        grandchild1.nodes.add(new Node());

        System.out.println(Node.treeDepth(root));
    }
}