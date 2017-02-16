package Chapter9.example;

/*
[9-2] ������ ���� �������� �򵵷� Point3DŬ������ equals()�� ��������� x, y, z
�� ���� ���ϵ��� �������̵��ϰ�, toString()�� �������� �����ؼ� ������ ��������
���Ͻÿ�.

[������]
[1,2,3]
[1,2,3]
p1==p2?false
p1.equals(p2)?true
		
*/
public class exercise9_2 {

	public static void main(String[] args) {
		Point3D p1 = new Point3D(1, 2, 3);
		Point3D p2 = new Point3D(1, 2, 3);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1==p2?" + (p1 == p2));
		System.out.println("p1.equals(p2)?" + (p1.equals(p2)));
	}
}

class Point3D {
	int x, y, z;

	Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	Point3D() {
		this(0, 0, 0);
	}

	public boolean equals(Object obj) {
		/*
		 * (1) �ν��Ͻ����� x, y, z�� ���ϵ��� �������̵��Ͻÿ�.
		 */
		boolean result = false;
		if(obj instanceof Point3D){
			Point3D p = (Point3D)obj;
			if(this.x == p.x && this.y == p.y && this.z == p.z){
				result = true;
			}
		}
		return result;
	}

	@Override
	public String toString() {
		/*
		 * (2) �ν��Ͻ����� x, y, z�� ������ ����ϵ��� �������̵��Ͻÿ�.
		 */
		return "Point3D [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

	
}
