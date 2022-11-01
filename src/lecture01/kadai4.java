package lecture01;

public class kadai4 {
    public static void main(String[] args) {
        int[] array= new int[100];
        int sum = 0;
        //iを用いた計算を行ているため
        for(int i=0;i<array.length;i++){
            array[i] = i+1;
            if(array[i] % 2 == 0){
                sum = sum + array[i];
            }
        }
        System.out.println(sum);
    }
}