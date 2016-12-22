
public class CalcEngine {
	static int[] var1 = {100,200,300,400};
	static int[] var2 = {20,50,100,200};
	static char[] opcode = {'a', 's', 'm', 'd'};
	static int[] result = new int[4];
	static int i;
	
	public static void main(String args[]){
		for (i = 0; i< opcode.length; i++  ){
			execute();
		}
		
	}
		
		public static void execute(){
			if (opcode[i] == 'a'){
				result[i] = var1[i] + var2[i];
				System.out.println("Addition" + result[i]);
			}
			else if (opcode[i] == 's'){
				result[i] = var1[i] - var2[i];
				System.out.println("Subtract" + result[i]);
			}
			else if(opcode[i] == 'm') {
				result[i] = var1[i] * var2[i];
				System.out.println("Multiply" + result[i]);
			}
			else if (opcode[i] == 'd'){
				result[i] = var1[i]/var2[i];
				System.out.println("Divide" + result[i]);
			}
		}

	
	

}
