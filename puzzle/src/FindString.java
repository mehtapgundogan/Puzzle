import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FindString {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FindString nesnem = new FindString();
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
	    String s = bufferRead.readLine();
 
	    //System.out.println(s);
		nesnem.findString(s);
		//String a = kelime.substring(2, 3);
		//System.out.println(a);
		

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
			//System.out.println("ascii:"+ascii);
			//System.out.println("i:"+i);
			if (i==0){
				temp = ascii;
				startpoint=i;
			}
			else{
				if(ascii>temp){
					 
				   
				    endpoint=i;
				//    System.out.println("endp:"+endpoint);
				     
				     tempWord = word.substring(startpoint, endpoint+1);
				     
				  //   System.out.println("tempWord:"+tempWord);
				     
				     if (tempWord.length() > tempW.length()){
				    	 		 	kelime = tempWord;
				    	 		 	tempW=tempWord;
				    //	 	 	System.out.println(tempWord);
				    	// 	 	System.out.println(tempW);
				     }else{
				    	 tempW = tempWord;
				     }
					 temp=ascii;
				}else{
					temp=ascii;
					startpoint=i;
				//	System.out.println("SP:"+startpoint);
					
				}
				
			}
		}
		
		System.out.println("kelimemiz:"+kelime);
		
	}

}
