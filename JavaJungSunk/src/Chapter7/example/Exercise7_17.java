package Chapter7.example;

/*

[7-17] �Ʒ� �� ���� Ŭ�����κ��� ����κ��� �̾Ƽ� Unit�̶�� Ŭ������ �����, ��
Ŭ������ ��ӹ޵��� �ڵ带 �����Ͻÿ�.

*/

class Unit {
	int x, y; // ���� ��ġ

	void move(int x, int y) {
		/* ������ ��ġ�� �̵� */ }

	void stop() {
		/* ���� ��ġ�� ���� */ }
}

class Marine extends Unit { // ����

	void stimPack() {
		/* �������� ����Ѵ�. */}
}

class Tank  extends Unit { // ��ũ

	void changeMode() {
		/* ���ݸ�带 ��ȯ�Ѵ�. */}
}

class Dropship extends Unit { // ���ۼ�

	void load() {
		/* ���õ� ����� �¿��. */ }

	void unload() {
		/* ���õ� ����� ������. */ }
}
