public class DoubleConversion {
    public static void main(String[] args) {
        //THIS IS SCD LAB1
        // int num =10;
        // Integer mynum=num;//autoboxing
        // System.out.println(num);

        // System.out.println(mynum);
        // int ubox=mynum;//unboxing
        // System.out.println(ubox);
        String s1="umar";
        String s2="khan";
        String s3="i am";
        String s4="in software engineering";
        String s5="2024F";
        String concatenated= s1 + s2 + s3 + s4 + s5;
        System.out.println(s1.concat(s2).concat(s3) .concat(s4) .concat(s5));
        System.out.println(concatenated);
        System.out.println(s4.toUpperCase());
        String  substring=concatenated.substring(0,7);
        System.out.println(substring);


    }
}


