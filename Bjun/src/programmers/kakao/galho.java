package programmers.kakao;

import java.util.Stack;

public class galho {
    public static String solution(String p) {
        return makeCorrect(p);
    }
    
    public static String makeCorrect(String p) {
    	if(p.equals("")) return "";
    	int sub=sub(p);
    	String u = p.substring(0,sub+1);
    	String v = p.substring(sub+1);
    	System.out.println("U : "+u);
    	System.out.println("V : "+v);
    	if(checkGalho(u)) {
    		return u + makeCorrect(v);
    	}else {
    		if(sub>1) u=u.substring(1,sub);
    		else u="";
    		return "("+makeCorrect(v)+")"+ reverse(u);
    	}
    }
    
    public static int sub(String p) {
    	int i=0,check=0;
    	for(;i<p.length();i++) {
    		if(p.charAt(i)=='(') check++;
    		else check--;
    		if(check==0) break;
    	}
    	return i;
    }
    
    public static boolean checkGalho(String u) {
    	Stack<Character> st = new Stack<>();
    	for(int i=0;i<u.length();i++) {
    		if(u.charAt(i)=='(') st.push('(');
    		else if(!st.isEmpty())st.pop();
    	}
    	
    	return st.isEmpty()? true:false;
    }
    
    public static String reverse(String u) {
    	String re="";
    	System.out.println("RE U : "+ u);
    	for(int i=0;i<u.length();i++) {
    		if(u.charAt(i)=='(') re+=")";
    		else re+="(";
    	}
    	System.out.println("Re : "+re);
    	return re;
    }
    
    public static void main(String args[]) {
    	System.out.println(solution(")()("));
    }
}
