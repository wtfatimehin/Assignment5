import java.util.*
import acm.program.*

public class UniqueNames extends ConsoleProgram {
	
	public void run() {
		ArrayList<String> list = new ArrayList<string>();
		
		while(true) {
			String yourName = readLine("Enter your Name: ");
			
			if (yourName.equals(""))
				break;
			if(!list.contains(yourName)) {
				list.add(yourName);
			}
		}
		
		println("The unique name list contains: ");
		listPrint(list);
	}
	
	private void listPrint(ArrayList list) {
		for(int k = 0;  k < list.size(); k++ {
			println(list.get(k));
		}
	}
}