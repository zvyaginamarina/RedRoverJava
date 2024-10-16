public class OperatorType {
    
    public static void main(String[] args) {
        int x=1, y=7, z=143;

        int c1 = z/y;
        int c2 = z%y;

        System.out.println(c1+" "+c2);

        double z1 = 143.76, y1 = 7.348;

        double c3 = z1/y1;
        double c4 = z1/y1;

        System.out.println(c3+" "+c4);

        int a1 = 3;
        int a2 = 5;
        int b1 = a1+ a2++ + ++a2;
        System.out.println("b1="+b1);
        System.out.println("a2="+a2);
        

        int a3 = 5;
        int b3 = ++a3 - --a3 - a3-- + a3++;
        System.out.println("b3="+b3);
        System.out.println("a3="+a3);

int h1 = 3;
h1 *= 5;

h1++;

System.out.println("h1="+h1);

short s1 = 10;
int n1 = s1;

int q1 = 10;
int q2 = 2;

boolean q3 = q1>q2;
boolean q4 = q1==q2;
boolean q5 = q1!=q2;

System.out.println(q3);
System.out.println(q4);
System.out.println(q5);

boolean q6 = q3 && q4 && q5;

boolean q7 = q6;

System.out.println(q6);
System.out.println(q7);

boolean q8 = q1 > q2 | ++q2<q1;
System.out.println(q8);
System.out.println(q2);

System.out.println(q1|q2);
System.out.println(q3^q4^q7);;

char w = 'a';
int w2 = 10;

System.out.println(w+w2);
System.out.println();
System.out.println("ДЗ");
System.out.println();

int r1 = 5;
int r2 = 11;
double d1 = 5.5;
double d2 = 1.3;
long l = 20L;

double t = r2/d1+d2%r1-l;


System.out.println(t);

int a = 5;
int b = a-- - --a + ++a + a++ +a;

System.out.println("b="+b);

int u = 8;
int u1 = ++u - u++ + ++u - --u;

System.out.println("u1="+u1);

    }
}