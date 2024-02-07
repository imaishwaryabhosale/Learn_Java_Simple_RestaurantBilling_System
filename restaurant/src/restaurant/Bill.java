package restaurant;
import java.util.Scanner;
public class Bill {




    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean quit= false;
        int sum=0;
        int Burger=100,cold=50,Pizza=400,Coffee=120;
        String order="";
        int  qty;
        
        do{
            System.out.println("ITEM"+"\t\tPrice");
            System.out.println("1.Burger"+"\t"+"100");
            System.out.println("2.ColdDrink"+"\t"+"50");
            System.out.println("3.Pizza"    +"\t\t"+"325");
            System.out.println("4.coffee"   +"\t"+"120");
            System.out.println("5.Quit");
            
            int choice=sc.nextInt();
           
            switch(choice){
                case 1:System.out.println("How much Burger do you need?:");
                        qty=sc.nextInt();
                       System.out.println(">Burger ");
                       
                        sum=sum+Burger*qty;
                        order=order.concat("> Burger  "+qty);
                        
                    break;
                case 2:
                	System.out.println("How much Cold-Drinks do you need?:");
                     qty=sc.nextInt();
                    System.out.println(">ColdDrink");
                    sum=sum+cold*qty;
                    order=order.concat("> ColdDrink  "+qty);
                    
                       break;
                case 3:
                	System.out.println("How much Pizza do you need?:");
                     qty=sc.nextInt(); 
                    System.out.println("> Pizza");
                    sum=sum+Pizza;
                    order=order.concat("> Pizza  "+qty);
                      break;
                case 4:System.out.println("How much Coffee do you need?:");
                qty=sc.nextInt(); 
                    System.out.println("> Coffee");
                    sum=sum+Coffee;
                    order=order.concat("> Coffee  "+qty);
                    break;
                case 5:
                     quit=true;
                     
                    break;
                default:
                    System.out.println("Wrong input");
            }
        
        }while(!quit);
        sc.close();
        System.out.println("**FOOD MOOD CAFE**");
        System.out.println("-------------------");
        System.out.println("Your Orders are:\n"+order);
        System.out.println("=======================");
        System.out.println("Your total bill="+sum);
        System.out.println("-------------------");
         System.out.println("Thank you-Visit Again");
    
        
        
        
    
    }
    
}




