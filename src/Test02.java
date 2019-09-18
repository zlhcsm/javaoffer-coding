import java.util.Scanner;

public class Main3 {

 @SuppressWarnings("resource")
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  String string = scanner.nextLine();
  if(string == null || string.length() <= 2)
  {
   System.out.println("0");
   return;
   
  }
  string = string.substring(1, string.length() - 1);
  
  if(string == null || string.length() == 0)
  {
   System.out.println("0");
   return;
  }
  String[] strings = string.split(", ");
  if(strings.length == 0 || strings == null)
  {
   System.out.println("0");
   return ;
  }
  Long[] arr = new Long[strings.length];
  for(int i = 0; i < arr.length; i++)
  {
   arr[i] = Long.valueOf(strings[i]);
   //System.out.println(arr[i]);
  }
  if(arr == null || arr.length == 0){
   System.out.println("0");
   return;
  }
  long greateResult = Long.MIN_VALUE;
  long tempResult = 0;
  for(int i = 0; i < arr.length; i++){
   if(tempResult <= 0){
    tempResult = arr[i];
   }
   else
   {
    tempResult += arr[i];
   }
   if(greateResult < tempResult)
   {
    greateResult = tempResult;
   }
  }
  System.out.println(greateResult);
 }
}
