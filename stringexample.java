package MyProject;

public class stringexample {
	public static void main(String args[]) {
		String str="hello this is java class";
		String str1="hello";
		String str2="Hello";
		String str3=" hi how are you";
		String str4="hello";
		String str5="1234";
		String str6="java1234";
		String str7="";
		String str8="     hello java    ";
		String str10="hi;how;are;you";
		System.out.println(str.length());
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str3.length());
		System.out.println(str4.length());
		System.out.println(str5.length());
		System.out.println(str6.length());
		System.out.println(str7.length());
		System.out.println(str8.length());
		System.out.println(str.toUpperCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toUpperCase());
		System.out.println(str3.toUpperCase());
		System.out.println(str4.toUpperCase());
		System.out.println(str5.toUpperCase());
		System.out.println(str6.toUpperCase());
		System.out.println(str7.toUpperCase());
		System.out.println(str8.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str3.toLowerCase());
		System.out.println(str4.toLowerCase());
		System.out.println(str5.toLowerCase());
		System.out.println(str6.toLowerCase());
		System.out.println(str7.toLowerCase());
		System.out.println(str8.toLowerCase());
		System.out.println(str.charAt(7));
		System.out.println(str3.charAt(9));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str4));
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.concat(str3));
		System.out.println(str1.concat(str8));
		System.out.println(str1.contains("ell"));
		System.out.println(str1.contentEquals(str4));
		System.out.println(str1.endsWith("lo"));
		System.out.println(str1.equals(str3));
		System.out.println(str1.indexOf('l'));
		System.out.println(str1.matches("[a-zA-Z]+"));
		System.out.println(str6.matches("[a-zA-Z]+\\d+]"));
		System.out.println(str7.isEmpty());
		System.out.println(String.join("|", str2,str3,str4,str5));
		System.out.println(str1.lastIndexOf('l'));
		System.out.println(str1.replace('l','p'));
		System.out.println(str1.replaceFirst("hel","tro"));
		String str9[]=str10.split(",");
		for(String i:str9) {
			System.out.println(i);
		}
		System.out.println(str6.startsWith("J"));
		System.out.println(str.subSequence(5,12));
		char arr[]=str4.toCharArray();
		System.out.println(arr[0]);
		System.out.println(str8.trim());
		System.out.println(String.valueOf(9.8f));
		
		}

}
