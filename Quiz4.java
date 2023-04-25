public class Quiz4 {
    public static void main(String[] args) {

        int i=2,k=1;
        while (i<=9){
            System.out.printf("%d X %d = %d\n",i,k,i*k);
            k++;
            if (k == 9){
                i++;
                k=1;
            }
        }
    }
}