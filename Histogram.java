import acm.util.*;
import java.io.*;
import acm.program.*;

public class Histogram extends ConsoleProgram {
	
	public void run() {
		
		initHistogram();
		
		histogramScoreReader();
		
		printTheHistogram();
	}
	
	
	// init of Histogram
	private void initHistogram() {
		
		arrayHistogram = new init[11];
		
		for(int i = 0; i <=10; i++) {
				arrayHistogram[i] = 0;
		}
	}
	
	//gonna read the scores and update the histogram
	private void histogramScoreReader() {
		try {
			BufferedReader read = new BufferedReader(new FileReader(DATAFILE));
			
			while(true) {
				String ln = read.readLine();
				if(ln == null)
				break;
				int exScore = Integer.parseInt(ln);
				if(exScore < 0 || exScore > 100) {
					throw new ErrorException("That score is not in the correct range");
				} else {
					int range = exScore / 10;
					arrayHistogram[range]++;
				}
			}
			
		} catch(IOException e) {
			throw new ErrorException(e);
		}
	}
	
	//Display the Histogram
	private void printTheHistogram() {
	for(int range = 0;; range <= 10; range++) {
			String classification;
			
			swiitch(range) {
				case 0: classification = "00-09"
				break;
				case 10: classification = "100"
				break;
				default:
				classification = (10 * range) + "-" + (10 * range + 9);
				break;
			}
			
			String astk = createAstk(arrayHistogram[range]);
			println(classification + ": " + astk);
		}
	}
	
	//This creates a string with Asteriks
	private String createAstk(int k) {
		String astk = "";
		for (int i = 0; i < k; i++) {
			astk += "*";
		}
		return astk;
	}
	
	private static final String DATAFILE = MidtermScores.txt;
	
	private int[] arrayHistogram;
}