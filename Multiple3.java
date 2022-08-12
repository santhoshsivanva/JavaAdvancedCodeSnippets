package javaDoc;

public class Multiple3 {
	static void mutiplyfinder(int n) {
		int x = 3;
		for(int i=1;i<=n;i++) {
			int c = i*x;
			System.out.println(c);
		}
	}
public static void main(String[] args) {
	Multiple3.mutiplyfinder(1000);
}
}
