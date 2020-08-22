package com.qa.day8;

public class oracleTest {

        //public String[] args = {"one", "two"};

        public static void main(String[] args) {
            for (int i = 0; i < args.length; i++)
                System.out.print(i == 0 ? args[i] : " " + args[i]);
            System.out.println();

            int p = 0;

            for(;;p++){
                if(p == 5){
                    break;
                }else{
                    System.out.println(p);
                }
            }

            for(int k = 0;;p++) {
                if (p == 10) {
                    break;
                } else {
                    System.out.println(k);
                    k += 100;
                }
            }


            /*for(int i = 0; i < 10; i++){
                char unicode = (char) i;
                System.out.print(unicode);
            }*/
            char a = '\u270D';
            char sun = '\u26a3';
            char i = '\u1f31';
            System.out.println(a);
            System.out.println(sun);
            System.out.println(Character.isLetterOrDigit(i));
            //System.out.println(BinaryIntegerLiteral(19));

            long l = 0x100000000L;
            long l1 = 2_147_483_648L;

            float f = 1.40e-45f;
            float f1 = 3.4028235e38f;

            System.out.println(l);
            System.out.println(l1);

            System.out.println(f);
            System.out.println(f1);
            String zero = "";
            for(i = 0; i < 31; i++){
                zero += "0";
            }
            String bigNumRepresentation = "34028235" + zero;
            System.out.println(bigNumRepresentation);
            String hello = "Hello", lo = "lo";
            System.out.println(hello == ("Hel"+lo).intern());

        }
}
