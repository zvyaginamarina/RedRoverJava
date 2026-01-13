public class PrimitiveDataTypes {
    /**
     * @param args
     */
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 0xc;
       byte b3 = 0b1100;
      byte b4 = 014;

      short s1 = 1300;
      short s2 = 0x514;
      short s3 = 0b010100010100;
    short s4 = 02424;

    int n1 = 0;
    int n2 = 0x0; 
    int n3 = 0b0;
    int n4 = 00;

    long l1 = 123_456_789L;
    long l2 = 0x75BCD15L;
    long l3 = 0b0111010110111100110100010101L;
    long l4 = 0726746425L;

    System.out.println("First exercise");
    System.out.println();
    System.out.println(b1+" "+Integer.toHexString(b2)+" "+Integer.toBinaryString(b3)+" "+Integer.toOctalString(b4));
    System.out.println(s1+" "+Integer.toHexString(s2)+" "+Integer.toBinaryString(s3)+" "+Integer.toOctalString(s4));
    System.out.println(n1+" "+Integer.toHexString(n2)+" "+Integer.toBinaryString(n3)+" "+Integer.toOctalString(n4));
    System.out.println(l1+" "+Long.toHexString(l2)+" "+Long.toBinaryString(l3)+" "+Long.toOctalString(l4));
    System.out.println();
    System.out.println("Second exercise");
    System.out.println();

    float f1 = 1.1111145F;
    float f2 = 10.00001F;

    double d1 = 0.00000000000000001;
    double d2 = 11345789075.00876;

    boolean bl1 = true;
    boolean bl2 = false;
    
    System.out.println(f1+" "+f2);
    System.out.println(d1+" "+d2);
    System.out.println(bl1+" "+bl2);
    System.out.println();
    System.out.println("Third exercise");
    System.out.println();

    char c1 = 'A';
    char c2 = '\u0041';
    char c3 = '%';
    char c4 = '1';
    char c5 = '\u263A';

    System.out.println(c1+" "+c2+" "+c3+" "+c4+" "+c5);

    
    }
    
}