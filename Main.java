import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a Number to count down or up from");

  int num = s.nextInt();
  System.out.println("");

  int n;
    for(n=num; n>=0; n--) {
      System.out.println(n);
    }
    int nu;
    for(nu=num; nu<=0; nu++) {
      System.out.println(nu);
    }
    System.out.println("Blast off!");
  
  
 


}

}