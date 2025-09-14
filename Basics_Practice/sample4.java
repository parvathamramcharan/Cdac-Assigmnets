class sample4 {
    public static void main(String[] args) {
        // System.out.println(10/0); //Arithmatic Exception / zero
        // System.out.println(10%0); //Arithmatic Exception / zero
        // System.out.println(0/0); //Arithmatic Exception / zero

        // Integer / zero is always Arithmatic Exception / zero

        System.out.println(10.0 / 0);   //Infinity
        System.out.println(5.0 / 0);    //Infinity
        System.out.println(0.0 / 0);    //Nan
        System.out.println(10.0 % 0);   //Nan
        System.out.println(0.0 % 0);    //Nan


    }
}