import java.util.Scanner;

public class IT26102766Lab5Q3{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Enter Start Date (1-31): ");
		int startDate = input.nextInt();
		
		System.out.print("Enter End Date (1-31): ");
		int endDate = input.nextInt();
		
		if (startDate < 1 || startDate > 31 || endDate < 1 || endDate >31){
			System.out.print("Days must be between 1 and 31");
			return;
		}
		
		if (startDate >= endDate){
			System.out.print("Start Date must be less than End Date");
			return;
		}
		
		System.out.println();
		System.out.println("Room Charge Per Day: Rs. 48000.0/=");
		
		int numOfDays = endDate - startDate;
		System.out.println("Number of Days Reserved: " + numOfDays);
		
		final double RoomChargePerDay = 48000.0;
		final double discount10 = 0.1;
		final double discount20 = 0.2;
		double totalAmount;
		
		if (numOfDays < 3){
			totalAmount = RoomChargePerDay*numOfDays;
		}
		
		else if (numOfDays == 3 || numOfDays == 4){
			totalAmount = (RoomChargePerDay*numOfDays)*(1 - discount10);
		}
		
		else {
			totalAmount = (RoomChargePerDay*numOfDays)*(1 - discount20);
		}	 
		
		System.out.print("Total Amount to be paid: " + totalAmount);
		
		
	}
}