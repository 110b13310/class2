class CWin
{
 private static int cnt;
 public static void count()
 {
  cnt=cnt+1; 
  System.out.println(cnt+" objects");
 }
}
public class eel
{
 

public static void main(String args[])
  {
 CWin a=new CWin();
 CWin.count();
 CWin b=new CWin();
 CWin.count();
  }
}
