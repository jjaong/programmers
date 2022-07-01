package level2;

public class JadenCase {
	
	public static void main(String[] args) {
		
	}
	
	public String solution(String s) {
        String answer="";
        
        //모든 문자를 소문자로 바꿔 잘라서 배열에 넣는다
        String a[] = s.toLowerCase().split("");
        
        boolean flag =true; 
        
        for(String str : a) {
        	answer += flag? str.toUpperCase() : str;
        	flag = str.equals(" ")? true : false; 
        }
        
        return answer;
    }
}
