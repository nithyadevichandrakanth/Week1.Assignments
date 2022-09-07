package week1.day2;

public class ReverseEven {

	public static void main(String[] args) {
		String text = "I am a software tester"; 
		String[] split = text.split(" ");
		
		
		for(int i=0; i<split.length;i++) {
			
			if(i%2==0) {
				char[] ch = split[i].toCharArray();
				for (int j = ch.length-1; j>=0;j--) {
					System.out.print(ch[j]);
					
				}
				
			}
			else {
				System.out.print(" "+split[i]+" ");
			}
		
		}

	}

}
