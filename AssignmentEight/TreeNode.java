package AssignmentEight;

import java.util.ArrayList;

public class TreeNode {
    String data;
    ArrayList<TreeNode> children;

    public TreeNode(String data){
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode node){
        this.children.add(node);
    }

    private String repeat(String str, int count){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<count; i++){
            sb.append(str);
        }
        return sb.toString();
    }

    public String print(int level){
        String ret;
        ret = repeat(" ", level) + data + "\n";
        for (TreeNode node : this.children){
            ret += node.print(level + 1);
        }
        return ret;
    }

    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode nonAlchohol = new TreeNode("Non-Alcohol");
        TreeNode alcohol = new TreeNode("Alcohol");
        TreeNode greenTea = new TreeNode("Green-Tea");
        TreeNode blackTea = new TreeNode("Black-Tea");
        tea.addChild(greenTea);
        tea.addChild(blackTea);
        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(nonAlchohol);
        cold.addChild(alcohol);
        drinks.addChild(hot);
        drinks.addChild(cold);

        System.out.println(drinks.print(0));


    }
}

