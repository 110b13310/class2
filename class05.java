class CCount
{
 static int cnt=0;
 public CCount ()
 {
  
  cnt ++;
 }

 public static void count()
 {
  
  System.out.println(cnt+"object(s) created");
 }
}
 public class eel
 {
  public static void main(String args[])
  {
   CCount a=new CCount();
   CCount.count();
   CCount b=new CCount();   
   CCount c=new CCount();
   CCount.count();
   CCount.count();
  }
 }
class CCount
{
 static int cnt=0;
 public CCount ()
 { 
  cnt ++;
 }

 public  void count()
 { 
  System.out.println(cnt+"object(s) created");
 }
 void setValue()
 {
  cnt=0;
 }
}
 public class eel
 {
  public static void main(String args[])
  {
   CCount a=new CCount();
   a.count();
   CCount b=new CCount();   
   CCount c=new CCount();
   b.count();
   a.setValue();
   c.count();
  }
 }
