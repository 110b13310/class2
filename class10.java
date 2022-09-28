 class CRational // 分數類別
 {
 public  int n;
 public  int d;
 public  void setND(int num, int den)
 {
  n=num;
  d=den;
 }
 public void setN(int num) // 設定分子
 {
 n=num;
 }
 public void setD(int num) // 設定分母
 {
 d=num;
 }
 public void show()
 {
 System.out.println(n+"/"+d); // 顯示分數
 }

 }
 public class eel
 {
 public static void main(String args[])
 {
 CRational aaa=new CRational();
 aaa.setND(3,5);
 aaa.show();
 }
}
