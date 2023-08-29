
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str ="Automation", newstr="";
		char ch;
		
		for(int i=0;i<Str.length();i++) {
			ch=Str.charAt(i);
			newstr=ch+newstr;
		}
		System.out.println(newstr);
	}

}
