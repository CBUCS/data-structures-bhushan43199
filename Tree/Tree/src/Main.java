public class Main {



    public static void main(String[] args, Object root) {


//N ary tree
        int n = 3;
        NaryTreeNode rooot = new NaryTreeNode("Family", n);

        rooot.addChild("Grand Father 1");
        rooot.getChild(0).addChild("Father");
        rooot.getChild(0).getChild(0).addChild("Me");
        rooot.getChild(0).getChild(0).addChild("Brother 1");
        rooot.getChild(0).getChild(0).addChild("Brother 2");
        rooot.getChild(0).addChild("Uncle");
        rooot.getChild(0).getChild(1).addChild("Cousin 1");
        rooot.getChild(0).getChild(1).addChild("Cousin 2");
        rooot.getChild(0).getChild(1).addChild("Cousin 3");
        rooot.getChild(0).getChild(1).addChild("Cousin 4");  // won't add
        rooot.addChild("Grand Father 2");
        rooot.getChild(1).addChild("Uncle");
        rooot.getChild(1).getChild(0).addChild("Cousin 5");
        rooot.getChild(1).getChild(0).addChild("Cousin 6");


        NaryTreeNode.print(rooot);
//Binary Tree

        Node n1 = new Node(1);
        Node n2 = new Node(4);
        Node n3 = new Node(2);
        Node n4 = new Node(5);

        BinaryTreeNode tree = new BinaryTreeNode(3);
        tree.add(root, n1, "left");
        tree.add(root, n2, "right");
        tree.add(n2, n3, "left");
        tree.add(n2, n4, "right");


    }
}
