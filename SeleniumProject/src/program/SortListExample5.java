package program;
import java.util.*;  
public class SortListExample5  
{  
public static void main(String[] args)   
{  
List<String> sList = new ArrayList<String>();  
sList.add("m");  
sList.add("k");  
sList.add("a");  
sList.add("p");  
sList.add("d");  
Collections.sort(sList);    //sorts array list  
for(String str: sList)   
System.out.print(" "+str);  
}  
}  