/**
 * Created by ScorpionOrange on 2016/10/05.
 * 《编程谜题 (Coding Puzzles) P39》
 *  第22题. 能装最多水的容器
 *  给定n个非负的整数a1，a2，a3 ……，an，其中，每个整数表示坐标为（i，ai）的一个点，
 *  从（i，ai）到（i，0）的两点之间，绘制线段i，从而绘制出n条垂直的线段。
 *  找到两条线段，它们与x轴一起行程一个容器，这个容器所能装的水最多。
 *  注意：不能倾斜该容器。
 *
 *  解析：
 *  1、对于任意容器，容积等于底面积乘以高度；
 *  2、在此例子中，底面积即为两条线段之间的距离；
 *  3、高度即为两条线段中较短的一根；
 */
public class MaxVolume {

    public void findMaxVolume(int[] a){
        int volume, maxVolume = 0;
        //int[][] output = new int[a.length][a.length];
        int leftSide = 0, rightSide = 0;

        for(int i = 0; i < a.length / 2 + 1; i++){
            for(int j = a.length - 1; j >= a.length / 2 - 1; j--){
                volume = (Math.abs(j - i)) * (a[i] < a[j] ? a[i] : a[j]);
                if(volume >= maxVolume){
                    maxVolume = volume;
                    leftSide = i;
                    rightSide = j;
                }
                //maxVolume = (maxVolume >= volume ? maxVolume : volume);
                //output[i][j] = volume;
                //输出全部组合，用以验证
                //System.out.println("i = " + i + ", j = " + j + ", volume = " + volume);
            }
        }
        //方法一，遍历两次：第一次遍历出maxVolume，第二次根据maxVolume遍历出i，j；
        /*
        System.out.println("方法一：");
        for(int i = 0; i < a.length / 2 + 1; i++){
            for(int j = a.length - 1; j >= a.length / 2 - 1; j--){
                if(maxVolume == output[i][j]){
                    System.out.println("其一为第 " + (i + 1) + " 位 = " + a[i]);
                    System.out.println("其二为第 " + (j + 1) + " 位 = " + a[j]);
                    System.out.println("最大容积为：" + maxVolume);
                }
            }
        }
        */

        //System.out.println("maxVolume = " + maxVolume);
        //方法二，遍历一次：与maxVolume一样，使用临时变量存储，当发现更大的时候再变更；
        //System.out.println("方法二：");
        System.out.println("其一为第 " + (leftSide+1) + " 位 = " + a[leftSide]);
        System.out.println("其二为第 " + (rightSide+1) + " 位 = " + a[rightSide]);
        System.out.println("最大容积为：" + maxVolume);
    }
}
