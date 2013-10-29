
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DatabaseOperations dbv=new DatabaseOperations();
		boolean ans =dbv.ValidateLogin("admin", "admin");
		
		if(ans == true)
		{
			System.out.println(" Login Successfull ");
		}
		else
		{
			System.out.println("Invalid Login ");
		}
		
		Criminal c = new Criminal();
		c.setCriminalID(1);
		c.setCriminalName("abc");
		c.setPunishmentId(1);
		c.setRetinascan("---");
		c.setCriminalFingurePrint("fingure print");
		c.setCriminalDNA("Dna");
		c.setBloodGroup("b+");
		c.setWorkassigned("Cooking");
		c.setCellNo(200);
		
	boolean answer =	c.addCriminal(c);
	if(answer == true)
	{
		System.out.println("Successfull");
	}
		
	else
	{
		System.out.println("Failure");
	}
	}
		
	}


