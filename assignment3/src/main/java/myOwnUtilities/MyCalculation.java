package myOwnUtilities;

public class MyCalculation {
Calculable myInterfaceObj;
	
	public int add( int a, int b ) {		
		return myInterfaceObj.add( a, b );
	}
	public int subtract( int a, int b ) {		
		return myInterfaceObj.subtract( a, b );
	}
	public double divide( int a, int b ) {		
		return myInterfaceObj.divide( a, b );
	}
	public int multiply( int a, int b ) {		
		return myInterfaceObj.multiply( a, b );
	}

	public Calculable getMyInterfaceObj() {
		return myInterfaceObj;
	}

	public void setMyInterfaceObj(Calculable myInterfaceObj) {
		this.myInterfaceObj = myInterfaceObj;
	}

}
