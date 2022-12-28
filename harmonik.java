public class harmonik {
    public static void main(String[] args) {
        double[] list = {1,2,5, 6};
        double sum = 0;
        for (double i = 1; i <= list.length; i++) {
            System.out.println("" + sum + " ");
            sum = sum + (1 / i);
        }
        double a= (list.length)/(sum);
        System.out.println("toplam=");
        System.out.println(a);
    }
}
