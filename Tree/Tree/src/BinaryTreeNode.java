import com.data.tree.Tree;

public class BinaryTreeNode implements Tree
{
    public static Node root;

    public BinaryTreeNode(int data)
    {
        root = new Node(data);
    }

    public void add(Node parent, Node child, String orientation)
    {
        if (orientation.equals("left"))
        {
            parent.setLeft(child);
        }
        else
        {
            parent.setRight(child);
        }
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