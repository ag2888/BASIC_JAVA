package PACK_1;

public class IntCell {
	
		private int storedValue;

		public IntCell() {
			this(0);
		}

		public IntCell(int initialValue) {
					setStoredValue(initialValue);
		}

		public int getStoredValue() {
			return storedValue;
		}

		public void setStoredValue(int storedValue) {
			this.storedValue = storedValue;
		}
		
		public String toString() { 
			return "IntCell storedValue is " + storedValue; 
		}
		
		public static void main(String [] args) {
			IntCell a = new IntCell(1);
			System.out.println(a);
		}
	
}
