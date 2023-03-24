package $11_Composite;

import java.lang.module.ModuleFinder;
import java.util.ArrayList;

public class CompositeTest
{
    public static void main(String[] args)
    {
        Branch root = new Branch("root");
        Branch branch = new Branch("tree 1");
        Leaf leaf1 = new Leaf("leaf 1");
        Leaf leaf2 = new Leaf("leaf 2");
        branch.addNode(leaf1);
        branch.addNode(leaf2);
        root.addNode(branch);

        root.printName(1);

    }
}


interface Node
{
    void printName(int depth);
}

class Leaf implements Node
{
    private String name;

    public Leaf(String name)
    {
        this.name = name;
    }

    @Override
    public void printName(int depth)
    {
        for (int i = 0; i < depth; i++)
        {
            System.out.print(">>>");
        }
        System.out.println(name);
    }
}

class Branch implements Node
{
    private String name;
    private ArrayList<Node> mNodeList = new ArrayList<>();

    public Branch(String name)
    {
        this.name = name;
    }

    public void addNode(Node node)
    {
        mNodeList.add(node);
    }

    @Override
    public void printName(int depth)
    {
        for (int i = 0; i < depth; i++)
        {
            System.out.print(">>>");
        }

        System.out.println(name);
        for (Node node : mNodeList)
        {
            node.printName(depth + 1);
        }
    }
}