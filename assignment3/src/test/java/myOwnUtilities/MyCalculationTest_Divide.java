package myOwnUtilities;

import static org.mockito.Mockito.*; // proper way !

import junit.framework.TestCase;

public class MyCalculationTest_Divide extends TestCase {
	
	MyCalculation obj;
	int x,y;
	
	protected void setUp() throws Exception {
		 Calculable calcMock = mock( Calculable.class );	    
		 x=70;
		 y=10;
		    
		 when( calcMock.divide( x, y ) ).thenReturn  ( (double) (x / y) );
		 
		 obj = new MyCalculation();
		 obj.setMyInterfaceObj(  calcMock );		
	}

	protected void tearDown() throws Exception {
		obj= null;
		x = 0;
		y = 0;		
	}
	public void testDivide() {
		assertEquals( 7.0, obj.divide( x, y )  );
	}
	
}
