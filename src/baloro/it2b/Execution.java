
package baloro.it2b;
import java.util.Scanner;
public class Execution {
   
    Scanner sc = new Scanner();
   
    public void inputOrder(){   
                   
        System.out.print("Customer Order Management\n");
        System.out.println("Enter Number of Orders: ");
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
        System.out.println("Enter detail of order %d: \n"+i++);
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Customer Name: ");
        String cname = sc.next();
        System.out.println("Date Ordered: ");
        int date = sc.nextInt();
        System.out.println("Order Amount: ");
        int amt = sc.nextInt();
        System.out.println("Oder Status: ");
        String status = sc.next();
        
       
}
        System.out.println("%-10d %-20s %-10d %-10d %-10s");
}
}
