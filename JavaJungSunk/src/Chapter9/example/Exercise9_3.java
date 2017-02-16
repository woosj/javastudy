package Chapter9.example;

/*
[9-3] 다음과 같은 실행결과가 나오도록 코드를 완성하시오.

[실행결과]
fullPath:c:\jdk1.5\work\PathSeparateTest.java
path:c:\jdk1.5\work
fileName:PathSeparateTest.java

*/

public class Exercise9_3 {

	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.5\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		/*
		 * (1) 알맞은 코드를 넣어 완성하시오.
		 */

		int pos = fullPath.lastIndexOf("\\");
		if (pos != -1) {
			path = fullPath.substring(0, pos);
			fileName = fullPath.substring(pos + 1);
		}

		System.out.println("fullPath:" + fullPath);
		System.out.println("path:" + path);
		System.out.println("fileName:" + fileName);
	}
}