package java8.groupingby;
import java.util.TreeSet;
class SortedString implements Comparable<String> 
{
    String string1;
    SortedString(String s)
    {
        this.string1 = s;
    }

    @Override
    public int compareTo(String string2) 
    {
        
        return string1.compareTo(string2);
    } 
    
}
public class ComplarableExample 
{
  public static void main(String arg[])
  {
    TreeSet<String> listOfNames = new TreeSet<String>();
    listOfNames.add("RAVI");
    listOfNames.add("JAVA");
    listOfNames.add("GOAL");
    listOfNames.add("SITE");
    
    for(String name : listOfNames)
    {
      System.out.println(name);
    }
  }
}
