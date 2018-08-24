package Cheapter07;

public class InnerEx2 {
	class InstanceInner{}
	static class StaticInner{}
	
	//�ν��Ͻ� �ɹ� ������ ���� ���������� �����ϴ�
	InstanceInner iv = new InstanceInner();
	//static�ɹ� ������ ���� ���������� �����ϴ�
	static StaticInner cv = new StaticInner();
	
	static void staticMethod(){
		// static�ɹ��� �ν��Ͻ� �ɹ��� ���� �����Ҽ� ����
		//InstanceInner obj1 = new InstanceInner():
		StaticInner dbj2 = new StaticInner();
		//���� �����Ϸ��� ��ü�� �����ؾ��Ѵ�
		//�ν��Ͻ�Ŭ������ �ܺ� Ŭ������ ���� �����ؾ߸� �����Ҽ��ִ�.
		InnerEx2 outer = new InnerEx2();
		StaticInner obj2 = new StaticInner();
		//�޼��� ���� ���������� ����� ���� Ŭ������ �ܺο��� ������ �� ����.
		//LocalInner lv = new LocalInner();
	}
	
	void instanceMethod(){
		//�ν��Ͻ��޼��忡���� �ν��Ͻ� �ɹ��� static �ɹ� ��� ���� ����
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		//�޼��� ���� ���������� ����� ���� Ŭ������ �ܺο��� ������ �� ����.
		//LocalInner lv = new LocalInner():
	}
	
	void myMethod(){
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}

}
