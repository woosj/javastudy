package Chapter9.example;

/*
[9-3] ������ ���� �������� �������� �ڵ带 �ϼ��Ͻÿ�.

[������]
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
		 * (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
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