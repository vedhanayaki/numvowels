package player;
import java.util.Scanner;
public class Numberofvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the String:");
Scanner s=new Scanner(System.in);
String a=s.nextLine();
int count=0;
for(int i=0;i<a.length();i++){
char b=a.charAt(i);
if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U'){
	count++;
}
}
System.out.println("Number of Vowels:"+count);
	}

}
