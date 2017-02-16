package Chapter8.example;

import java.util.*;
/*
[8-8] ������ 1~100������ ���ڸ� ���ߴ� ������ �����ϴ� ���߿� ���ڰ� �ƴ� �����ڸ�
�־ �߻��� �����̴�. ����ó���� �ؼ� ���ڰ� �ƴ� ���� �Է����� ���� �ٽ� �Է���
�޵��� �����϶�.
1�� 100������ ���� �Է��ϼ��� :50
�� ���� ���� �Է��ϼ���.
1�� 100������ ���� �Է��ϼ��� :asdf
Exception in thread "main" java.util.InputMismatchException
at java.util.Scanner.throwFor(Scanner.java:819)
at java.util.Scanner.next(Scanner.java:1431)
at java.util.Scanner.nextInt(Scanner.java:2040)
at java.util.Scanner.nextInt(Scanner.java:2000)
at Exercise8_8.main(Exercise8_8.java:16)

[������]
1�� 100������ ���� �Է��ϼ��� :50
�� ���� ���� �Է��ϼ���.
1�� 100������ ���� �Է��ϼ��� :asdf
��ȿ���� ���� ���Դϴ�. �ٽ� ���� �Է����ּ���.
1�� 100������ ���� �Է��ϼ��� :25
�� ū ���� �Է��ϼ���.
1�� 100������ ���� �Է��ϼ��� :38
�� ū ���� �Է��ϼ���.
1�� 100������ ���� �Է��ϼ��� :44
������ϴ�.
�õ�Ƚ���� 5���Դϴ�.
*/
public class Exercise8_8 {
	public static void main(String[] args) {
		// 1~100������ ������ ���� �� answer�� �����Ѵ�.
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0; // ������Է��� ������ ����
		int count = 0; // �õ�Ƚ���� ���� ���� ����
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ��� :");
			try {
				input = new Scanner(System.in).nextInt();
				if (answer > input) {
					System.out.println("�� ū ���� �Է��ϼ���.");
				} else if (answer < input) {
					System.out.println("�� ���� ���� �Է��ϼ���.");
				} else {
					System.out.println("������ϴ�.");
					System.out.println("�õ�Ƚ���� " + count + "���Դϴ�.");
					break; // do-while���� �����
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("��ȿ���� ���� ���Դϴ�. �ٽ� ���� �Է����ּ���.");
			}
			
		} while (true); // ���ѹݺ���
	} // end of main
} // end of class HighLow