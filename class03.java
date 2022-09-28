// hw9_3, 從某一建構元呼叫另一建構元
class Caaa  // 定義類別Caaa
 {
     private int value;
  
     public Caaa()
    {
           this(10);// 試填寫此處的程式碼，使得呼叫此建構元時，value的值會被設定為10
           System.out.println("value="+value) ;
  }
  public Caaa(int i)
  {
     value=i;
     System.out.println ("value="+value);
  }
}
 public class hw9_3
 {
    public static void main(String args[])
    {
       Caaa obj1=new Caaa();
       Caaa obj2=new Caaa(12);
     }
 }
