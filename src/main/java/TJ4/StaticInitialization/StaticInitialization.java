package TJ4.StaticInitialization;

class Bowl {
Bowl(int marker) {
System.out.println("Bowl(" + marker + ")");
}
void f_Bowl(int marker) {
System.out.println("f_Bowl(" + marker + ")");
}
}

class Table {
	static Bowl bowl1 = new Bowl(1);
	Table() {
		System.out.println("Table()");
		bowl2.f_Bowl(12);
	}

	void f_Table(int marker) {
		System.out.println("f_Table(" + marker + ")");
	}
	
	static Bowl bowl2 = new Bowl(2);
	Bowl bowl7 = new Bowl(7);
}
class Cupboard {
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);
	Cupboard() {
		System.out.println("Cupboard()");
		bowl4.f_Bowl(45);
	}
	void f_C(int marker) {
		System.out.println("f_C(" + marker + ")");
	}
	static Bowl bowl5 = new Bowl(5);
}

public class StaticInitialization {
	public static void main(String[] args) {
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		//table.f2(1);
		Bowl b = Table.bowl1;
		Cupboard cupboard = new Cupboard();
		cupboard.f_C(1);
	}
	//static Table table = new Table();
}