import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
public class CircularLinkedListTest {

	 Node root,last;
	  
	 void createLinkedList()
	 {
	     root=last=null;
	 }
	         
	 void insertLeft(int data)
	 {
	     Node n=new Node(data);
	     if(root==null)
	     {
	         root=last=n;
	         last.next=root;
	     }
	     else
	     {
	         n.next=root;//1
	         root=n;//2
	         last.next=root;//3
	     }
	   }
	 void deleteLeft()
	 {    
	     if(root==null)
	     {
	         System.out.println("List Empty");
	     }
	     else
	     {
	         Node t=root;//1
	         if(root.next==root)
	         {
	             root=last=null;//single node deletion
	         }
	         else
	         {
	         root=root.next;//2
	         last.next=root;//3
	         }
	         System.out.println("Deleted:"+t.data);
	     }
	     }
	 void insertRight(int data)
	 {
	     Node n=new Node(data);
	     if(root==null)
	     {
	         root=last=n;
	         last.next=root;
	     }
	     else
	     {
	        last.next=n;//1
	        last=n;//2
	        last.next=root;//3
	     }
	   }
	 void deleteRight()
	 {
	     if(root==null)
	     {
	         System.out.println("List Empty");
	     }
	     else
	     {
	         Node t,t2;
	         t=t2=root;
	         if(root.next==root)
	         {
	             root=last=null;
	         }
	         else
	         {
	            while(t!=last)//2
	            {
	                t2=t;
	                t=t.next;
	            }
	            last=t2;
	            last.next=root;//re ref root
	         }
	         System.out.println("Deleted:"+t.data);
	     }
	   }
	 void printList()
	 {
	     if(root==null)
	     {System.out.println("List Empty");
	     }
	     else
	     {
	         Node t;
	         t=root;
	         do
	         {
	             System.out.println(t.data);
	             t=t.next;
	         }  while(t!=root);//2
	     }
	 } 
	public static void main(String[] args) {
		
		int ch,e,key;
		CircularLinkedListTest obj=new  CircularLinkedListTest();
	   Scanner in = new Scanner(System.in);
	       obj.createLinkedList();
	       do
	       {
	            System.out.println("1.Insert Left  2.Delete Left  3.Insert Right  4.Delete Right 5.Print List  0.Exit ");
	            ch=in.nextInt();
	            switch(ch)
	            {
	                case 1:
	                            System.out.println("Enter Data:");
	                            e=in.nextInt();
	                           obj.insertLeft(e);
				    
	                            System.out.println("Inserted");
	                            break;
	                    
	                 case 2:
	                            obj.deleteLeft();
	                            break;
	                    
	                  case 3:
	                            System.out.println("Enter Data:");
	                            e=in.nextInt();
	                            obj.insertRight( e);
	                            System.out.println("Inserted at Right");
	                            break;  
	                            
	                  case 4:
	                            obj.deleteRight();
	                               break;  
	                 
	                  case 5:
	                            obj.printList();
	                            break;

	                 

	               
			  case 0:   System.out.println("Exiting ");
				    break;

	                  default:
	                         System.out.println("Wrong option selected");
	                         break;
	            }
	       }while(ch!=0);
	    }
		
	}

