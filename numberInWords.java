import java.util.Scanner;

public class numberInWords {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numbs;
		String number;
		

		System.out.println("please enter a number: ");
		numbs=sc.nextInt();
		number=numbs+"";
		
		String[] numOnes = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] numTens = {"zero","ten","twenty","thirty", "forty","fifty","sixty","seventy","eighty","ninety"};
		String[] numTeens = {"zero","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"," "};

		int numLen;
		int word;
		boolean isTeen=false;
		
		numLen=number.length();
		
	
		System.out.println("You have entered:"+number);
			int x=0;
			while(numLen>0){
				//System.out.print(number.charAt(x)); 
					
					word=Character.getNumericValue(number.charAt(x));
					//System.out.print(word);
					if(numLen==7||numLen==5||numLen==2){						
							if(word==0){
								//do nothing
								} 	
							else if(word==1) {
								int temp=Character.getNumericValue(number.charAt(x+1));
								if(temp>1){
									isTeen=true;
									System.out.print(numTeens[temp]+" ");
								}
								else{
									System.out.print(numTens[word]+" ");
									isTeen=false;
								}
																
							}
							else {
							System.out.print(numTens[word]+" ");
								isTeen=false;
							}
					}
					if(numLen==9||numLen==6||numLen==3||numLen==1){
						if(word==0){
							//do nothing
						}						
						else if(numLen==1){							
								if(isTeen==true){
									//do nothing
								}
								else{
									System.out.print(numOnes[word]+" ");
									isTeen=false;
								}
						}
						else {
							System.out.print(numOnes[word]+" ");						
							System.out.print("hundred ");
						}		
					}							
																		
					if(numLen==4){
						if(isTeen==true){
							//do nothing
						}
						else if(word==0){
							//do nothing
							isTeen=false;
						}
						else{
							System.out.print(numOnes[word]+" ");
							isTeen=false;
						}						
						System.out.print("thousand ");
					}
					numLen=numLen-1;
					x=x+1;
					
				
						
			}
		
			
	}
}