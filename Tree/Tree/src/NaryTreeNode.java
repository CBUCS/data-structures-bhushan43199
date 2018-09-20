import com.data.tree.Tree;

import java.util.ArrayList;

public class NaryTreeNode implements Tree {
    final String
            LABEL;
    final int N;
    private final ArrayList<NaryTreeNode> children;

    public NaryTreeNode(String LABEL, int n) {
        this.LABEL = LABEL;
        this.N = n;
        children = new ArrayList<>(n);
    }

    private boolean addChild(NaryTreeNode node) {
        if (children.size() < N) {
            return children.add(node);
        }

        return false;
    }

    public boolean addChild(String label) {
        return addChild(new NaryTreeNode(label, N));
    }

    public ArrayList<NaryTreeNode> getChildren() {
        return new ArrayList<>(children);
    }

    public NaryTreeNode getChild(int index) {
        if (index < children.size()) {
            return children.get(index);
        }

        return null;
    }

    public static void print(NaryTreeNode rooot) {
        printUtil(rooot, 0);
    }

    private static void printUtil(NaryTreeNode node, int depth) {
        for (int i = 0; i < depth; ++i) {
            System.out.print("   ");
        }

        System.out.println(node.LABEL);

        for (NaryTreeNode child : node.getChildren()) {
            printUtil(child, depth + 1);
        }
    }


    public void add(Node parent, Node child, String orientation) {

    }

    @Override
    public int add(Object item) {
        return 0;
    }

    @Override
    public int remove(Object item) {
        return 0;
    }

    @Override
    public int contains(Object item) {
        return 0;
    }

    @Override
    public int numItems() {
        return 0;
    }

    @Override
    public int height() {
        return 0;
    }

    @Override
    public void print() {

    }
}

