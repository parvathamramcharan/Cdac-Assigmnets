    //Write a program to calculate the average of a list of numbers.
    public class program17 {
    public static void main(String[] args) {
        Double sum=0.0;
        for(int i = 0; i < args.length;i++){
            Double num = Double.parseDouble(args[i]);
            sum +=num;
        }
        System.out.println(sum/args.length);
    }
}
