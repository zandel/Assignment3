package myOwnUtilities;

import static org.mockito.Mockito.*; // proper way !

import junit.framework.TestCase;

public class MyCalculationTest_Add extends TestCase {
	
	MyCalculation obj;
	int x,y;
	
	protected void setUp() throws Exception {
		 Calculable calcMock = mock( Calculable.class );	    
		 x=7;
		 y=10;
		    
		 when( calcMock.add( x, y ) ).thenReturn( x + y );
		 
		 obj = new MyCalculation();
		 obj.setMyInterfaceObj(  calcMock );		
	}

	protected void tearDown() throws Exception {
		obj= null;
		x = 0;
		y = 0;		
	}
	public void testAdd() {
		assertEquals( 17, obj.add( x, y )  );
	}
	
}
