/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.training.exercise2;

/**
 *
 * @author ASUS
 */
public class Find_Maximum {
    public static Integer[] maximum(Integer[] list) {
        if(list.length<1){
            return null;
        }
        Integer max=list[0];
        Integer secondMax = null;
        for(int i=0;i<list.length;i++){
            for(int j=i+1;j<list.length;j++){
                if(max < list[j]){
                    secondMax = max;
                    max = list[j];
                }
            }
        }
        return new Integer[]{max,secondMax};
    }
    public static void main(String[] args) {
        Integer[] num = new Integer[]{6,2,77,44,88,46,23};
        Integer[] ans = maximum(num);
        int max = ans[0];
        int secondMax = ans[1];
        System.out.println("Maximum of array:"+max);
        System.out.println("Second maximum of array:"+secondMax);
    }
}
