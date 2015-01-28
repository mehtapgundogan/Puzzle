import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class FindString {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    FindString nesnem = new FindString();
	    String s ="";
	    String q="cikis";
	    System.out.println("bastayiz");
	    while(!s.equals(q)){
	    	System.out.println("S:"+s);
	    	s=nesnem.askMe();
	    	nesnem.findString(s);
	    }
	    
		

	}
	
	public String askMe() {
		// TODO Auto-generated method stub
		
		
	
	    System.out.println("Bir kelime girin, biz onun sirali en uzun alt kelimesini bulalim");
    	Scanner sc=new Scanner(System.in);
    	String s = sc.next();
    	return s;
		
	}

	public void findString(String word){
		int temp=0;
		int num ;
		int startpoint=0;
		int endpoint=0;
		String tempWord="";
		String tempW="";
		String kelime="";
		for(int i=0;i<word.length();i++){
			int ascii=String.valueOf(word.charAt(i)).codePointAt(0);
		
			if (i==0){
				temp = ascii;
				startpoint=i;
			}
			else{
				if(ascii>temp){
					 
				   
				    endpoint=i;
			
				     
				     tempWord = word.substring(startpoint, endpoint+1);
				     
				
				     
				     if (tempWord.length() > tempW.length()){
				    	 		 	kelime = tempWord;
				    	 		 	tempW=tempWord;
				 
				     }else{
				    	 tempW = tempWord;
				     }
					 temp=ascii;
				}else{
					temp=ascii;
					startpoint=i;
				
				}
				
			}
		}
		
		System.out.println("kelimemiz:"+kelime); 
		
		
		
	}

}
