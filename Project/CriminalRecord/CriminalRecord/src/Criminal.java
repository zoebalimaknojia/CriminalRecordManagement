
public class Criminal {
 
	

	
		
		private int CriminalID;
		private String CriminalName;
		private String LastName;
		private String location;
		private int cellNo;
		private String workassigned;
		private String criminalType;
		private String criminalDNA;
		private String criminalFingurePrint;
		
		private String bloodGroup;
		private String CriminalCurrentImg;
		private String CriminalLeftImg;
		private String CriminalRightImg;
		private int PunishmentId;
		private int RelativeID;
		private String retinascan;
		
		
		
		
		
		public String getRetinascan() {
			return retinascan;
		}
		public void setRetinascan(String retinascan) {
			this.retinascan = retinascan;
		}
		public int getRelativeID() {
			return RelativeID;
		}
		public void setRelativeID(int relativeID) {
			RelativeID = relativeID;
		}
		public int getCriminalID() {
			return CriminalID;
		}
		public void setCriminalID(int criminalID) {
			CriminalID = criminalID;
		}
		public String getCriminalName() {
			return CriminalName;
		}
		public void setCriminalName(String criminalName) {
			CriminalName = criminalName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public int getCellNo() {
			return cellNo;
		}
		public void setCellNo(int cellNo) {
			this.cellNo = cellNo;
		}
		public String getWorkassigned() {
			return workassigned;
		}
		public void setWorkassigned(String workassigned) {
			this.workassigned = workassigned;
		}
		public String getCriminalType() {
			return criminalType;
		}
		public void setCriminalType(String criminalType) {
			this.criminalType = criminalType;
		}
		public String getCriminalDNA() {
			return criminalDNA;
		}
		public void setCriminalDNA(String criminalDNA) {
			this.criminalDNA = criminalDNA;
		}
		public String getCriminalFingurePrint() {
			return criminalFingurePrint;
		}
		public void setCriminalFingurePrint(String criminalFingurePrint) {
			this.criminalFingurePrint = criminalFingurePrint;
		}
		public String getBloodGroup() {
			return bloodGroup;
		}
		public void setBloodGroup(String bloodGroup) {
			this.bloodGroup = bloodGroup;
		}
		public String getCriminalCurrentImg() {
			return CriminalCurrentImg;
		}
		public void setCriminalCurrentImg(String criminalCurrentImg) {
			CriminalCurrentImg = criminalCurrentImg;
		}
		public String getCriminalLeftImg() {
			return CriminalLeftImg;
		}
		public void setCriminalLeftImg(String criminalLeftImg) {
			CriminalLeftImg = criminalLeftImg;
		}
		public String getCriminalRightImg() {
			return CriminalRightImg;
		}
		public void setCriminalRightImg(String criminalRightImg) {
			CriminalRightImg = criminalRightImg;
		}
		public int getPunishmentId() {
			return PunishmentId;
		}
		public void setPunishmentId(int punishmentId) {
			PunishmentId = punishmentId;
		}
		
	    //----add new criminal
		
		DatabaseOperations db=new DatabaseOperations();
		
		public boolean addCriminal(Criminal c)
		{   
			boolean answer = db.AddNewCriminal(c);
			return answer;
		}
		
		public boolean removeCriminal(int criminalId)
		{
			boolean answer = db.RemoveCriminal(criminalId);
		  return answer;
		}

	   
		public Criminal SearchCriminal(String name, int criminalphoto)
		{
			Criminal criminal = db.SearchCriminal(name, criminalphoto);
			return criminal;
		}
		
		public boolean TransferCriminal(int crimnalId, String OldLocation, String newLocation)
		{
			boolean answer =TransferCriminal(crimnalId, OldLocation, newLocation);
		    return answer;	
		}
	}
	     



		
	

