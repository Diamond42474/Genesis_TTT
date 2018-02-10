import java.util.ArrayList;
import java.util.Arrays;

import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.core.learning.SupervisedLearning;
import org.neuroph.nnet.MultiLayerPerceptron;
import org.neuroph.nnet.Perceptron;
import org.neuroph.nnet.learning.BackPropagation;
import org.neuroph.util.TransferFunctionType;

public class ANN {
	public static ArrayList<Double> level = new ArrayList<Double>();
	public static double output;
	
	public static void learn() {
		Sere s = new Sere();
		s.desere();
       
        
        String inputFileName = "/Users/logan42474/Desktop/TTT.csv";
        DataSet dataSet = DataSet.createFromFile(inputFileName, 9, 9,",", true);
       
        BackPropagation backPropagation = new BackPropagation();
        backPropagation.setMaxIterations(1);
        //backPropagation.setMaxError(0.025);
        Brain.nn.learn(dataSet, backPropagation);
        
        Chart.y.add(backPropagation.getTotalNetworkError());
        Chart.x.add(Chart.y.size());
        System.out.println("Error: "+backPropagation.getTotalNetworkError());
       s.sere(Brain.nn);
           
        }
	public void run(double[] input) {
		
		Sere s = new Sere();
		s.desere();
		
		Brain.nn.setInput(input);
		Brain.nn.calculate();
        output = Brain.nn.getOutput()[0];
        System.out.println(output);
        level.add(output);
        if(output>0.5) {
        System.out.println(1);
        }
        if(output<0.5) {
        	System.out.println(0);
        }
        System.out.println("Full Outputs: "+ Arrays.toString(Brain.nn.getOutput()));
	}
	public void make() {
		
		Brain.nn = new MultiLayerPerceptron(TransferFunctionType.SIGMOID,9,10,9);
		Sere s = new Sere();
		s.sere(Brain.nn);
	}
}

