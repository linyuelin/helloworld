public class Node2 {

    public String data;
    private Node2 next;

    public Node2(String data) {
        this.data = data;
        this.next = null;
    }

    public void setNextNode(Node2 node) {
        this.next = node;
    }

    public Node2 getNextNode() {
        return this.next;
    }

    public static void main(String[] args) {
        Node2 firstNode = new Node2("I am the first Node!");
        Node2 secondNode = new Node2("I am the second Node!");
        firstNode.setNextNode(secondNode);
        System.out.println(firstNode.getNextNode().data);
    }
}


