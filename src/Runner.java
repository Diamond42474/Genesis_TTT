
public class Runner {
public static double i = 0;
	
	public static void main(String[] args) throws InterruptedException {
		
	ANN n = new ANN();
	Chart c = new Chart();
	
	//n.make();
	
	/*
	n.learn();
	c.Display();
	while(i<1000) {
	n.learn();
	c.update();
	i++;
	}
	/*
	  0,0,0,
	  0,0,0,
	  0,0,0
	  */
	double[] input = {
			
				1,0,1,
				2,2,0,
				0,0,1
					  
					  };
	n.run(input);

	}

}
