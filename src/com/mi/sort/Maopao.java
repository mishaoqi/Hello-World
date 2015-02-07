package com.mi.sort;

public class Maopao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Maopao mp = new Maopao();
		int[] arr = new int[]{20,28,37,15,12,84,26,35,11,95};
		mp.sort(arr);
		for(int i:arr){
			System.out.println(i+"");
		}
		
	}
	
	public void sort(int[] targetArr){//从小到大的顺序
		int temp = 0;
		//定义循环比较的次数
		for (int i = 0; i < targetArr.length; i++) {
			//内循环控制比较后移位
			for (int j = i; j < targetArr.length; j++) {
				if (targetArr[i]>targetArr[j]) {
					temp = targetArr[i];
					targetArr[i] = targetArr[j];
					targetArr[j] = temp;
					
				}
			}
		}
//		第二种输出的方法
//		for (int i = 0; i < targetArr.length; i++) {      
//            System.out.println(targetArr[i]+",");      
//        }   
	}

}
