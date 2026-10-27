import java.util.Scanner;

     public class IT26102766Lab5Q2{
	 public static void main(String[] args){
	 
	 Scanner input = new Scanner(System.in);
	 
	 int new_members;
	 
	 System.out.print("Enter the number of new members introduced : ");
	 new_members = input.nextInt();
	 
	 switch (new_members){
		 
		 case 0 : System.out.print("No prize");
		 break;
		 
		 case 1 : System.out.print("Prize is a : Pen");
		 break;
		 
		 case 2 : System.out.print("Prize is a : Umbrella");
		 break;
		 
		 case 3 : System.out.print("Prize is a : Bag");
		 break;
		 
		 case 4 : System.out.print("Prize is a : Travelling Chair");
		 break;
		 
		 default:
		 if(new_members >= 5){
			 System.out.println();
			 System.out.println("Prize is a : Headphone");
		    }
		
		 else {
			 System.out.print("Input must be a number 0 or great");
		    } 
	    }	
        
	}
    }	
	 
