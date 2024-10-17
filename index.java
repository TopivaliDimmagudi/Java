import java.util.*;
class index
{
 private  String name;
  private int salary;
  private int no;
  public index(String name,int salary,int no)
  {
    this.name=name;
    this.salary=salary;
    this.no=no;
  }
  static int getSalary(int salary)
  {
    return salary;
  }
  static String getName(String name)
  {
    return name;
  }
  static int getno(int no)
  {
    return no;
  }
   public String toString()
   {
    return salary+","+name+","+no;
   }
   public static void main(String[] args)
    {
      index m=new index("Topivali", 12890, 6300);
      System.out.println(m);
   }
}