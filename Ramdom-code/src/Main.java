public class Main {
	private static String code="";
	
	

	public static void main(String[] args) {
		//System.out.println(code);
		generateCode();
		//System.out.println(code);
		code="";
		generateCode();
		//System.out.println(code);
		//System.err.printf("Erroor "+code);
	}
	
	public static void generateCode() {
		char o;
		if(code.equals("")) {
			o = (char)(Math.random()*26+'a');
			code+=o;
			for (int i = 0; i <3 ; i++) {
		          code+= (int)((Math.random())*(i+9)+2+i+1);
		         
		        }	
		}
		
	}

}
