public class MoreVariablesAndPrinting {
	public static void main(String[] args) {
		String hisName, hisEyes, hisTeeth, hisHair;
		int hisAge, hisWeight;
		double hisHeight;

		hisName = "Trevor Lui";
		hisAge = 16;   // Grade 11 student
		hisHeight= (165 * 0.393701) ; //centimetres (165) converted to inches
		hisWeight = 120; // lbs
		hisEyes = "Brown";
		hisTeeth = "White"; //maybe
		hisHair = "Black";

		System.out.println("Let's talk about " + hisName + ".");
		System.out.println("He's " + hisHeight + " inches tall.");
 		System.out.println("He's " + hisWeight + " pounds heavy.");
        	System.out.println("Actually, that's not too heavy." );
        	System.out.println("He's got " + hisEyes + " eyes and " + hisHair + " hair.");
       		System.out.println("His teeth are usually " + hisTeeth + " depending on what he ate or drank recently.");

   // This line is tricky; try to get it exactly right.
        	System.out.println( "If I add " + hisAge + ", " + hisHeight + ", and " + hisWeight
            	+ " I get " + (hisAge + hisHeight + hisWeight) + "." );}
}
