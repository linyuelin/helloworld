public class Node3 {

    public String data;
    private Node3 next;

    public Node3(String data) {
        this.data = data;
        this.next = null;
    }

    public void setNextNode(Node3 node) {
        this.next = node;
    }

    public Node3 getNextNode() {
        return this.next;
    }

    public static void main(String[] args) {
        Node3 strawberry = new Node3("Berry Tasty");
        Node3 banana = new Node3("Banana-rama");
        Node3 coconut = new Node3("Nuts for Coconut");

        strawberry.setNextNode(banana);
        banana.setNextNode(coconut);

        Node3 currentNode = strawberry;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.getNextNode();
        }
    }
}


