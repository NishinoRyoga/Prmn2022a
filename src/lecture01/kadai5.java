package lecture01;

public class kadai5 {
    public static void main(String[] args) {
        int[] score = new int[]{41,85,72,38,80};
        for(int i=0;i<score.length;i++){
            if(score[i] >= 90 && score[i] <= 100){
                System.out.println(i + "番 " + score[i] + "点 秀");
            }else if(score[i] >= 80){
                System.out.println(i + "番 " + score[i] + "点 優");
            }else if(score[i] >= 70){
                System.out.println(i + "番 " + score[i] + "点 良");
            }else if(score[i] >= 60){
                System.out.println(i + "番 " + score[i] + "点 可");
            }else if(score[i] < 60){
                System.out.println(i + "番 " + score[i] + "点 不可");
            }else{
                System.out.println("error");
                return;
            }
        }

        System.out.println("最高点：" + max(score) + "点");
        System.out.println("最低点：" + min(score) + "点");
        System.out.println("平均点：" + average(score) + "点");
    }
    static int min(int[] array){
        int min = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    static int max(int[] array){
        int max = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    static double average(int[] array){
        double sum = 0;
        for(int i=0;i<array.length;i++){
            sum = sum +array[i];
        }
        return sum/array.length;
    }
}
