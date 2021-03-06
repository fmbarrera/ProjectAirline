package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Flight {
	public void AdminFlight(int a, ArrayList<Customer> AdminInfo) {
		System.out.println("Welcom Admin "+ AdminInfo.get(a).getcustomerFirstname());
		System.out.println("How can I help you?");
		System.out.println("(1) View my status");
		System.out.println("(2) View customers' status");
		System.out.println("Select your option(1,2) :");
	}
	public void CusFlight(int a, ArrayList<Customer> CusInfo) {
		Scanner in = new Scanner(System.in);
		String MYC = "n";
		do {
		System.out.println("Welcom "+ CusInfo.get(a).getcustomerFirstname());
		System.out.println("How can I help you?");
		System.out.println("(1) View my status");
		System.out.println("(2) Adding flight");
		System.out.println("(3) removing flight");
		System.out.println("(4) Back to Main Menu");
		System.out.println("Select your option(1,2,3) :");
		int Option = in.nextInt();
		if(Option == 1) {
			System.out.println(CusInfo.get(a).toString());
			CusInfo.get(a).FlightString();
			System.out.println("Back to Main Menu? (y/n)");
			MYC = in.next();
		}if(Option == 2) {
			boolean check = false;
			SearchFight();
			System.out.println("Select your Flight to add:");
			int Choose = in.nextInt();
			SearchFight((Choose));
			if(CusInfo.get(a).Flight(SearchFight((Choose))) == true) {
				check = true;
			}if(check == true) {
				CusInfo.get(a).addFlight(SearchFight((Choose)));
			}else {
				System.out.println("Unable to book same flight more than one");
			}
			System.out.println("Back to Main Menu? (y/n)");
			MYC = in.next();		
			}
		if(Option == 3) {
			CusInfo.get(a).FlightString();
			System.out.println("Select your Flight to remove:");
			int Choose = in.nextInt();
			CusInfo.get(a).deletFlight(SearchFight((Choose)));
			System.out.println("Back to Main Menu? (y/n)");
			MYC = in.next();
		}
		if(Option == 4) {	
			MYC = "y";
		}
	}while(MYC.equals("n"));
}public void SearchFight(){
	/* String array example*/
	System.out.println("\n*(1)  Location: ATL to LA" + "\n*  Time: 1 am"+ "\n*  Date: 10/11/2018" + "\n"+
	"\n*(2)  Location: ATL to LA" + "\n*  Time: 2 am"+ "\n*  Date: 10/12/2018" + "\n"+
	"\n*(3)  Location: ATL to LA" + "\n*  Time: 3 am"+ "\n*  Date: 10/13/2018" + "\n"+
	"\n*(4)  Location: ATL to NYC" + "\n*  Time: 1 am"+ "\n*  Date: 10/11/2018" + "\n"+
	"\n*(5)  Location: ATL to NYC" + "\n*  Time: 2 am"+ "\n*  Date: 10/12/2018" + "\n"+
	"\n*(6)  Location: ATL to NYC" + "\n*  Time: 3 am"+ "\n*  Date: 10/13/2018" + "\n"+
	"\n*(7)  Location: ATL to FLL" + "\n*  Time: 1 am"+ "\n*  Date: 10/11/2018" + "\n"+
	"\n*(8)  Location: ATL to FLL" + "\n*  Time: 2 am"+ "\n*  Date: 10/12/2018" + "\n"+
	"\n*(9)  Location: ATL to FLL" + "\n*  Time: 3 am"+ "\n*  Date: 10/13/2018" + "\n");

}public String SearchFight(int a){
/* String array example*/
int count = 1;
String[] FlightList = {
	"\n*("+(count)+")  Location: ATL to LA" + "\n*  Time: 1 am"+ "\n*  Date: 10/11/2018" + "\n",
	"\n*("+(count++)+")  Location: ATL to LA" + "\n*  Time: 2 am"+ "\n*  Date: 10/12/2018" + "\n",
	"\n*("+(count++)+")  Location: ATL to LA" + "\n*  Time: 3 am"+ "\n*  Date: 10/13/2018" + "\n",
	"\n*("+(count++)+")  Location: ATL to NYC" + "\n*  Time: 1 am"+ "\n*  Date: 10/11/2018" + "\n",
	"\n*("+(count++)+")  Location: ATL to NYC" + "\n*  Time: 2 am"+ "\n*  Date: 10/12/2018" + "\n",
	"\n*("+(count++)+")  Location: ATL to NYC" + "\n*  Time: 3 am"+ "\n*  Date: 10/13/2018" + "\n",
	"\n*("+(count++)+")  Location: ATL to FLL" + "\n*  Time: 1 am"+ "\n*  Date: 10/11/2018" + "\n",
	"\n*("+(count++)+")  Location: ATL to FLL" + "\n*  Time: 2 am"+ "\n*  Date: 10/12/2018" + "\n",
	"\n*("+(count++)+")  Location: ATL to FLL" + "\n*  Time: 3 am"+ "\n*  Date: 10/13/2018" + "\n"
	};
return FlightList[a-1];
}
}