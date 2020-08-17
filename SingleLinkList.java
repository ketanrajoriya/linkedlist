import java.util.*;
class Link
{
public int data;
public Link nextLink;

public Link(int a){
data = a;
}

public void printLink(){
System.out.print("{" + data + "}");
}
}

class LinkList
{

private Link first;

public LinkList()
{
first = null;
}

public boolean isEmpty()
{
    return first == null;

}
public void minmax()
{
int i,j,length1=0;
Link currentLink = first;
Link temp=first;
while(temp!=null)
{
length1++;
temp=temp.nextLink;
}
int array[] =new int[length1];
for(i=0;i<length1;i++)
{
array[i]=currentLink.data;
	    currentLink = currentLink.nextLink;
	
}
int temp1;
 j=0;
for(i=0;i<length1;i++)
{
for(j=i+1;j<length1;j++)
{
if(array[i]>array[j])
{
temp1=array[i];
array[i]=array[j];
array[j]=temp1;
}
}	
} 
 System.out.println("");
	
	System.out.print(" second min element is  "+array[1]+" second max element is  "+array[length1-2]);



}
public void reverse()
{
int n;
int i,j,length1=0;
Link temp=first;
while(temp!=null)
{
length1++;

temp=temp.nextLink;
}
temp=first;
j=length1-1;
int arr[] = new int[length1];
int arr2[] = new int[length1];
for(i=arr.length-1; i>=0; i--)
{
arr[i]=temp.data;
temp=temp.nextLink;
j--;
}
temp=first;
for(i=0;i<arr.length-1;  i++)
{
temp.data=arr[i];
temp=temp.nextLink;
}

}

public void delete()
{
int pos;
Scanner scr6= new Scanner(System.in);

System.out.println("enter the pos for insertion");
pos=scr6.nextInt();
Link temp;
temp=first;
while(pos!=2)
{
temp=temp.nextLink;
pos--;}
temp.nextLink=(temp.nextLink).nextLink;

}

public void update()
{
int pos,data;
Scanner scr5= new Scanner(System.in);

System.out.println("enter the data");
data=scr5.nextInt();

Link link=new Link(data);

System.out.println("enter the pos for insertion");
pos=scr5.nextInt();
Link temp;
temp=first;
while(pos!=1)
{
temp=temp.nextLink;
pos--;}
link.nextLink=temp.nextLink;
link.nextLink=temp.nextLink;
link.nextLink=temp.nextLink;
temp.nextLink=link;

}

public void printk()
{
int pos,length=0;
Scanner scr6= new Scanner(System.in);
System.out.println("enter the pos for kth element");
pos=scr6.nextInt();
System.out.println("pos"+pos);
Link temp=first;
while(temp!=null)
{
length++;
temp=temp.nextLink;
}
System.out.println("length"+length);
temp=first;
int left=length-pos;
while(left!=0)
{
temp=temp.nextLink;
left--;
}
System.out.println("data we require"+temp.data);
}

public void insert()
{
int data;
int pos=0;
Link temp;
char answer;
Scanner scr2= new Scanner(System.in);

do{
System.out.println("enter the data part of link");
data = scr2.nextInt();
temp = first;
Link link = new Link(data);

if(first==null)
{
link.nextLink=null;
first=link;
temp=first;
}
else
{
while(temp.nextLink!=null)
{
temp=temp.nextLink;
}
temp.nextLink=link;
}

System.out.println("do you want to continue select 'y' or 'n'");
Scanner scr3= new Scanner(System.in);
answer = scr3.next().charAt(0);

}
while(answer=='y');
}

public void printList() 
{
	    Link currentLink = first;
	    System.out.print("List: ");
	    while(currentLink != null) {
		    currentLink.printLink();
		    currentLink = currentLink.nextLink;
	    }
	
}
}


class SingleLinkList
{
public static void main(String s[])
{

Scanner scr3=new Scanner(System.in);
System.out.println("select your option: 1-insertionatlast, 2-deletion, 3-update, 4-printkth element from last(question no 4),5-reverse,6-minmax(question no 5)");
int choice = scr3.nextInt();

LinkList link1 = new LinkList();

        
switch(choice)
{
case 1:link1.insert();link1.printList();
break;
case 2:link1.insert();link1.printList();link1.delete();link1.printList();
break;
case 3:link1.update();link1.printList();
break;
case 4:link1.insert();link1.printList();link1.printk();
break;
case 5: link1.insert();link1.printList();link1.reverse();link1.printList();
break;
case 6:link1.insert();link1.printList();link1.minmax();
break;
}
}
}
===
test