public class Main {



    public static void main(String[] args) {


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

//Binary Tree Using BFS


        BinaryTreeNode tree = new BinaryTreeNode();
        tree.root= new Node(1);
        tree.root.left= new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.left.right= new Node(5);

        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrder();

        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrder();

    }
}
