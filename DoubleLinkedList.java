import java.util.*;
class Link
{
public int data;
public Link prevLink;
public Link nextLink;

public Link(int a)
{
data=a;
}
public void printLink()
{
System.out.print("{" + data + "}");
}

}

class LinkList
{
 Link start;
 LinkList()
 {
 start=null;
 }
 char answer;
 int data;
Link temp;
int pos;
Scanner scr=new Scanner(System.in); 

void reverse()
{
 temp=start;
System.out.print("after reverse");
while(temp.nextLink!=null)
{

temp=temp.nextLink;
}
start=temp;
Link t;
while(temp.prevLink!=null)
{

t=temp.nextLink;
temp.nextLink=temp.prevLink;
temp.nextLink=t;
temp=temp.prevLink;
}

}
void delete()
{
temp=start;
System.out.print("enter the position to be deleted");
pos=scr.nextInt();
while(pos!=1)
{
pos--;
temp=temp.nextLink;
}
(temp.prevLink).nextLink=temp.nextLink;
(temp.nextLink).prevLink=temp.prevLink;

}
void insert_at_n()
{ 
temp= start;
System.out.print("enter the data part");
data=scr.nextInt();
Link link =new Link(data);
System.out.print("enter the position");
pos=scr.nextInt();
System.out.print("data"+data+"pos"+pos);

while(pos!=1)
{
pos--;
System.out.print("data"+temp.data);
temp=temp.nextLink;
}
link.nextLink=temp.nextLink;
link.prevLink=temp;
temp.nextLink=link;
(temp.nextLink).prevLink=link;
}



 void insertFirst()
 {
 do{
System.out.print("enter the data part");
data=scr.nextInt();
Link link = new Link(data);
 
 if(start==null)
 {
 start=link;
}
else
{
link.nextLink=start;
link.prevLink=null;
start=link;
}
 System.out.println("do you want to continue select 'y' or 'n'");
Scanner scr3= new Scanner(System.in);
answer = scr3.next().charAt(0);
}
 while(answer=='y');
 
 }
void insertLast()
{
do
{
System.out.print("enter the data part");
data=scr.nextInt();
Link link = new Link(data);
if(start==null)
{
link.nextLink=null;
link.prevLink=null;
start=link;
temp=start;
}
else
{ 
temp=start;
while(temp.nextLink!=null)
{
temp=temp.nextLink;
}
temp.nextLink=link;
link.prevLink=temp;
link.nextLink=null;

}
System.out.println("do you want to continue select 'y' or 'n'");
Scanner scr3= new Scanner(System.in);
answer = scr3.next().charAt(0);
}
while(answer=='y');
}
void printList()
{
Link temp2,temp3; 
temp2=start;
temp3=start;
while(temp2!=null)
{
temp2.printLink();
temp2=temp2.nextLink;
}
}
}
class DoubleLinkedList
{
public static void main(String s[])
{ 
Scanner scr3=new Scanner(System.in);
System.out.println("select your option: 1-insertion at last, 2-insertion at first, 3-insert at n, 4-printkth element from last,5-reverse,6-minmax");
int choice = scr3.nextInt();
LinkList  link1= new LinkList();

switch(choice)
{
case 1: link1.insertLast();link1.printList();
case 2:link1.insertFirst();link1.printList();
case 3:link1.insertLast();link1.printList();link1.insert_at_n();link1.printList();
case 4:link1.insertLast();link1.printList();link1.delete();link1.printList();
case 5:link1.insertLast();link1.printList();link1.reverse();link1.printList();
} 
}
} 