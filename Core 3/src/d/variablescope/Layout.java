package d.variablescope;

class Layout { 						// class
	
	
	static int s = 343; 			// static variable
	
	int x; 							// instance variable
	
	{ 
		x = 7; 
	
	int x2 = 5;
	
	} 			// initialization block
	
	Layout() 						// constructor
	{ 
		x += 8; int x3 = 6;	
		
		/*System.out.println(x2);*/
	} 					
	
	void doStuff() { 				// method
		
	int y = 0; 						// local variable
	
	for(int z = 0; z < 4; z++) 		// 'for' code block
	{ 								
		y += z + x;
	}
 }
}