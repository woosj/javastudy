package javaDay03;

public class OperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Integer 범위: " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("Integer 사이즈: " + Integer.SIZE + " 바이트");
		System.out.println("Byte 범위: " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("Byte 사이즈: " + Byte.SIZE + " 바이트");
		int g = 186;
		System.out.println(g + "의 2 진수     ====>  " + Integer.toBinaryString(g));
		System.out.println(g + "의 8 진수     ====>  " + Integer.toOctalString(g));
		System.out.println(g + "의 16 진수   ====>  " + Integer.toHexString(g));
		System.out.println(g + "의 16 진수 1====>  " + Integer.toHexString(g & 0xff));
		System.out.println(g + "의 16 진수 2====>  " + Integer.toHexString(g & 0xffff));
		System.out.println(g + "의 16 진수 3====>  " + Integer.toHexString(g & 0xffffffff));
		System.out.println(g + "의 1의 보수값====>  " + getOneComplement(g));
		System.out.println(g + "의 1의 보수값====>  " + getOneComplementCal(g));
		//System.out.println(g + "의 1의 보수값 2 진수 ? " + getBit(~g));
		byte v = (byte) g;
		System.out.println("byte v       ====>  " + v);
		System.out.println("byte v & 0xff 0~255 범위: " + (v & 0xff));
	}
	
	private static int getOneComplement(int a) {
		return ~a;
	}
	private static int getOneComplementCal(int h) {
		return h = (1 + h) - 2 * (1 + h);
	}
	/*
	private static String getBit(int n) {
		Integer[] array = new Integer[8];
		int iattr = (int) ((byte) n & 0xFF);
		int bitWise = 1;
		for (int i = 0; i < 8; i++) {
			if ((bitWise & iattr) > 0) array[i] = 1;
			else
				array[i] = 0;
			bitWise = (bitWise << 1) & 0xfe;
		}

		ArrayUtils.reverse(array);
		String str = "";
		for (Integer i : array) 	str += i.toString();
		return str;
	}*/

}
