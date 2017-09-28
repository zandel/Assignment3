package myOwnUtilities;

import static org.mockito.Mockito.*; // proper way !

import junit.framework.TestCase;

public class MyCalculationTest_Multiply extends TestCase {
	
	MyCalculation obj;
	int x,y;
	
	protected void setUp() throws Exception {
		 Calculable calcMock = mock( Calculable.class );	    
		 x=7;
		 y=10;
		    
		 when( calcMock.multiply( x, y ) ).thenReturn( x * y );
		 
		 obj = new MyCalculation();
		 obj.setMyInterfaceObj(  calcMock );		
	}

	protected void tearDown() throws Exception {
		obj= null;
		x = 0;
		y = 0;		
	}
	public void testMultiply() {
		assertEquals( 70, obj.multiply( x, y )  );
	}
	
}
