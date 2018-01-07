package control;

public class XorCrypt {
	public static String xor(String input, String key){
		char[] out = new char[input.length()];
		
		for(int i=0; i<input.length(); i++){
			out[i] = (char) (input.charAt(i)^key.charAt(i));	
		}
		
		return new String(out);
	}
}
