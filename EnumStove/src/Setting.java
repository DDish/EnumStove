
public enum Setting {
		OFF ("---"), LOW ("--+"), MEDIUM ("-++"), HIGH ("+++");
		private String heat;
		
		Setting (String temp) {
			heat = temp;
		}
		
		public String toString() {
			return heat;
		}
		
	}
