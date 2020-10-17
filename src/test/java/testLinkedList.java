import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class testLinkedList
{
    @Test
    public void searchTest()
    {
        LinkedList list=new LinkedList();
        list.addNode(30);
        list.addNode(50);
        list.addNode(70);
        list.display(list.head);
        int pos=list.returnNode(list.head,30);
        System.out.println("Pos is: "+pos);
        list.head=list.InsertPos(list.head,pos,40);
        list.display(list.head);
        //assertTrue(list.searchNode(list.head,50));
    }
}
