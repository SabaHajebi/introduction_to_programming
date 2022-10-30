package etest3;

public class LinkedList
{
    private int listCount;
    private Node head;

    public LinkedList() {
        head = new Node();
        listCount = 0;

    }

    // Add a new node with data
    public void add(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(head);
        head = newNode;
        listCount++;
    }

    // Get the node at index
    public Node get(int index) {
        // Error handling
        if(index <= listCount) {
            Node returnNode = head;
            for(int node = 0; node < index; node++) {
                returnNode = returnNode.getNextNode();
            }
            return returnNode;
        }
        else {
            return null;
        }
    }

    // Insert a new node with data into a position
    public void insert(int index, int data) {
        if(index <= listCount) {
            Node indexNode = head;
            for(int node = 0; node < index; node++) {
                indexNode = indexNode.getNextNode();
            }
            Node newNode = new Node(data);
            newNode.setNextNode(indexNode.getNextNode());
            indexNode.setNextNode(newNode);
            listCount++;
        }
        else {
            System.out.println("[ERROR IN INSERTION]: INDEX OUT OF BOUNDS");
        }
    }

    // Remove a node at the specified position
    public void remove(int index) {
        if(index <= listCount) {
            Node indexNode = head;
            for(int node = 0; node < index; node++) {
                indexNode = indexNode.getNextNode();
            }
            // indexNode is now equal to the node just before the one to remove so set its next node to the one after that
            indexNode.setNextNode(get(index + 2));
            listCount--;
        }
        else {
            System.out.println("[ERROR IN REMOVAL]: INDEX OUT OF BOUNDS");
        }
    }

    // Return the size of the list
    public int size() {
        return listCount;
    }
}

package etest3;

public class LLTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // Fill the list with 1-5
        for(int i = 1; i <= 6; i++) {
            list.add(i);
        }

        // Print the list
        for(int i = 1; i <= list.size(); i++) {
            System.out.print(list.get(i).getData() + ", ");
        }
        System.out.print("\n");

        // Place the data 9 at index 3
        list.insert(3, 9);
        // Print the list with the new data
        System.out.println("Placing the number 9 at index 3 produces:");
        for(int i = 1; i <= list.size(); i++) {
            System.out.print(list.get(i).getData() + ", ");
        }
        System.out.print("\n");

        // Remove index 3 (which is 9)
        list.remove(3);

        System.out.println("Remove the number 9 at index 3 produces:");
        for(int i = 1; i <= list.size(); i++) {
            System.out.print(list.get(i).getData() + ", ");
        }
 }
}

package etest3;

public class Node {
    
    private Node nextNode;
    private int data;

    public Node()
    {
	nextNode = null;
    }

    public Node(int nodeData)
    {
        data = nodeData;
	    nextNode = null;
    }

    public Node(int nodeData, Node newNode)
    {
        data=nodeData;
	    nextNode=newNode;
    }

    public int getData()
    {
	return data;
    }

    public void setData(int nodeData)
    {
	data=nodeData;
    }

    public Node getNextNode()
    {
	return nextNode;
    }

    public void setNextNode(Node newNode)
    {
	nextNode=newNode;
    } 
}

package etest3Practice;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> stack = new ArrayList<Integer>();
    private static final int ERROR = -1;

    public void push(int integer) {
        stack.add(integer);
    }

    public int pop() {
        if(!stack.isEmpty()) {
            int topOfStack = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return topOfStack;
        }
        return ERROR;
    }

    public int peek() {
        if(!stack.isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        return ERROR;
    }

    public int search(int element) {
        for(int index = 0; index < stack.size(); index++) {
            if(stack.get(index) == element) {
                return index;
            }
        }
        return ERROR;
    }

    public void move(int element) {
        if(search(element) != ERROR) {
            push(element);
        }
    }
}

package etest3Practice;

public class TestStack {

    public static void main(String[] args) {
        Stack stack = new Stack();
        for(int num = 1; num <= 10; num++) {
            stack.push(num);
        }

        System.out.println("Popping the top element returns: " + stack.pop());
        System.out.println("Peeking at the top element returns: " + stack.peek());
        System.out.println("Searching for 7 returns an index of: " + stack.search(7));
        System.out.println("Moving element 5 to top of stack.");
        stack.move(5);
        System.out.println("Now popping returns: " + stack.pop());
    }
}


public class Line {


    private Point point1;
    private Point point2;



    public Line(Point point1, Point point2) {
        this.point1 = new Point(point1.getX(), point1.getY());
        this.point2 = new Point(point2.getX(), point2.getY());
    }

    public Line( int x1, int y1, int x2, int y2) {
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
    }

    public Point getP1() {
        return this.point1;
    }

    public Point getP2() {
        return this.point2;
    }

    public double getSlope(){
        if (point1.getX() == point2.getX()) {
            throw new ArithmeticException("You cannot divide by 0");
        } else {
        return (((double)point2.getY() - (double)point1.getY()) / (point2.getX() - (double)point1.getX()));
        }

    }


}

public class LineTest {
    public static void main(String[] args) {

        Point point1 = new Point(7, 8);
        Point point2 = new Point(7, 5);
        Line line = new Line(point1, point2);
        System.out.println( toString(line.getP1()));
        System.out.println( toString(line.getP2()));

        Line line2 = new Line(9,11,9,3);
        System.out.println( toString(line2.getP1()) );
        System.out.println( toString(line2.getP2()));
        System.out.printf("the slope is %.2f " ,line2.getSlope());



    }
     public static String toString(Point point) {
        int PointX = point.getX();
        int PointY = point.getY();
        return "(" + PointX + ", " + PointY + ")";
    }

}

public class Point {
    private int x;
    private int y;

    // Constructs a new point at the origin, (0, 0).
    public Point() {
        x = 0;
        y = 0;
    }

    // Constructs a new point with the given (new_x, new_y) location.
    // pre: new_x >= 0 && new_y >= 0
    public Point(int new_x, int new_y) {
        if (new_x < 0 || new_y < 0) {
            throw new IllegalArgumentException();
        }

        x = new_x;
        y = new_y;
    }

    // Returns the x-coordinate of this point.
    public int getX() {
        return x;
    }

    // Returns the y-coordinate of this point.
    public int getY() {
        return y;
    }


}