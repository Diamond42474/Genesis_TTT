import java.util.ArrayList;
import java.util.List;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYSeries;
 
/**
 * Creates a simple real-time chart
 */

public class Chart {
	public static ArrayList<Integer> x = new ArrayList<Integer>();
	public static ArrayList<Double> y = new ArrayList<Double>();
	public static XYChart chart;
	public static SwingWrapper<XYChart> sw;

public static void Display() throws InterruptedException {
	
	
	chart = QuickChart.getChart("Error Rate", "Itterations", "Error:", "Rate", x, y);
	sw = new SwingWrapper<XYChart>(chart);
	sw.displayChart();
	}

public static void update() {
	chart.updateXYSeries("Rate", x, y, null);
	sw.repaintChart();
}
}