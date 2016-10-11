/**
 * Created by ScorpionOrange on 2016/10/05.
 */
public class maxVolumeTest {
    public static void main(String[] args){
        int[] a = new int[5];

        for(int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random()*100);
            //测试输出，以验证随机数组是否运作正常。
            System.out.print(a[i] + ", ");
        }
        System.out.println();

        new MaxVolume().findMaxVolume(a);
    }
}
