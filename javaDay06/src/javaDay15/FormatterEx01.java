package javaDay15;

import java.util.*;

public class FormatterEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter f = new Formatter();
		f.format("%1$b, %3$h, %2$5s",500,'A',false);
		System.out.println(f.toString());
	}

}
