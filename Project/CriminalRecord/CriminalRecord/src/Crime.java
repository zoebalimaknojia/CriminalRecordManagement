
public class Crime {


		private int CrimeID;
		private String CrimeSummary;
		private String CrimeDecs;
		private Punishment punishment;
		
		
		
		public int getCrimeID() {
			return CrimeID;
		}
		public void setCrimeID(int crimeID) {
			CrimeID = crimeID;
		}
		public String getCrimeSummary() {
			return CrimeSummary;
		}
		public void setCrimeSummary(String crimeSummary) {
			CrimeSummary = crimeSummary;
		}
		public String getCrimeDecs() {
			return CrimeDecs;
		}
		public void setCrimeDecs(String crimeDecs) {
			CrimeDecs = crimeDecs;
		}
		public Punishment getPunishment() {
			return punishment;
		}
		public void setPunishment(Punishment punishment) {
			this.punishment = punishment;
		}
		
	}


