package tkssk;
import java.util.Random;

public class TKSSK {

	public static void main(String[] args){
		
		char[] tks_ = {'t','k','s','_'};
		char[] result = new char[7];
		Random random = new Random();
		int count = 0;
		
		while(true){
			for (int i = 0; i < result.length; i++) {
				result[i] = tks_[random.nextInt(tks_.length)];
			}
			String string = String.valueOf(result);
			System.out.println(string);
			count++;
			if(string.equals("_tk_ssk")){
				System.out.println("ŽŽs‰ñ”"+count+"‰ñ");
				break;
			}
		}
	}
}
