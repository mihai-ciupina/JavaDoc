package TJ4.InitialValues;

public class InitialValues {

boolean t;
char c;
long l;

boolean bool = true;
char ch = 'x';
byte b = 127;
short s = 0xff;
int i = 999;
long lng = 1;
float f = 3.14f;
double d = 3.14159;

int k = fk();
int p = fp(k);

private int fk(){
	return 13;
};

private int fp(int i){
	return i;
};

InitialValues reference;
void printInitialValues() {
	System.out.println("Data type Initial value");
	System.out.println("k " + k);
	System.out.println("p " + p);
	System.out.println("boolean " + t);
	System.out.println("char [" + c + "]");
	System.out.println("byte " + b);
	System.out.println("short " + s);
	System.out.println("int " + i);
	System.out.println("long " + l);
	System.out.println("float " + f);
	System.out.println("double " + d);
	System.out.println("reference " + reference);
}
public static void main(String[] args) {
	InitialValues iv = new InitialValues();
	iv.printInitialValues();
/* You could also say:
new InitialValues().printInitialValues();
*/
}
}