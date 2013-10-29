

	import java.sql.Connection;
import java.sql.DriverManager;
	import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseOperations {

	
	

	
	
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		
				


		public boolean AddNewCriminal(Criminal c)
		{
			boolean answer = false ;
	       //Class.forName();
			 try {
				 

		           // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		            //con=DriverManager.getConnection("jdbc:odbc:CriminalDB","","");

				 
				Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
						 
			    
					con = DriverManager.getConnection("jdbc:derby://localhost:1527/CriminalRecordDb;");
					String str="insert into Criminal(CriminalID ,CriminalFirstName,PunishmentID,RetinaScan,FingurePrint,DNA,HealthCondition,workassigned ,CellNo) values (" + c.getCriminalID() + ",'" + c.getCriminalName() +"',"+ c.getPunishmentId() +",'" + c.getRetinascan()+ "','"+c.getCriminalFingurePrint() + "','"+c.getCriminalDNA()+"','" + c.getBloodGroup()+ "','" + c.getWorkassigned() + "'," + c.getCellNo()+")";
					
			
					stmt = con.createStatement();
					int i= stmt.executeUpdate(str);
					
					if(i > 0)
					{
						answer = true;
					}
					
					else
					{
						answer = false;
					}
					
					
			 }
			 
			 
			 	catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	       
	       
		  return answer;
		}
	    
		public boolean RemoveCriminal(int criminalid)
		{
			//try{
			  //  Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
			 
		    
			    //  con = DriverManager.getConnection("jdbc:derby://localhost:1527//CriminalRecordDb;");
			//}
			//catch(Exception se)
			//{
				
			//}
			return false;
			
		}
		
		public Criminal SearchCriminal(String name, int CellNo)
		{

		       Criminal c= new Criminal();
			//try{
			//    Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
			 
		    
			  //    con = DriverManager.getConnection("jdbc:derby://localhost:1527//CriminalRecordDb;");
			
			    //   String str="select * from Criminal where CriminalName == '"+ name + "' && CellNo == " + CellNo ;
			       
			      // stmt = con.createStatement();
			       //rs= stmt.executeQuery(str);
			       
			       //while(rs.next())
			       //{
			    	 //  c.setCriminalID(rs.getInt(0));
			    	   //c.setCriminalName(rs.getString(1));
			    	  // c.setPunishmentId(rs.getInt(2));
			    	  // c.setCriminalFingurePrint(rs.getString(4));
			    	   //c.setRetinascan(rs.getString(5));
			    	  // c.setCriminalDNA(rs.getString(6));
			    	   //c.setBloodGroup(rs.getString(7));
			    	   //c.setWorkassigned(rs.getString(8));
			    	  // c.setCellNo(CellNo);
			       //}
			       
			       
			
			
			
			//}
			//catch(Exception se)
			//{
				
			//}
			
			return c;
		}
		
		public boolean ValidateLogin(String UID, String PWD)
		{
			boolean answer = false;
		try{
			
			 //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	           // con=DriverManager.getConnection("jdbc:odbc:CriminalDB","","");
			    Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
			 
		    
			      con = DriverManager.getConnection("jdbc:derby://localhost:1527//CriminalRecordDb;create=true");
			 
		         String str = "select * from UserCredential"; //where UserID == '" + UID + "' && Password == '" + PWD + "'";
			      
			     stmt= con.createStatement();
			      rs = stmt.executeQuery(str);
			      
			      if (rs.first())
			      {
			    	answer = true;  
			      }
			      
			
	     }
			catch(Exception se)
		   {
				answer = false;
			}
			
			return answer;
		}
		
		public boolean AddNewCrime(int criminalID)
		{
			//try{
			  //  Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
			 
		    
			    //  con = DriverManager.getConnection("jdbc:derby://localhost:1527//CriminalRecordDb;");
			//}
			//catch(Exception se)
			//{
				
			//}
			return false;
		}
	}



	
	

