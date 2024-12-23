import javax.swing.*;
public class Lab508 {
	public static void main(String[] args) {
		int[] nums = {25,78,41,22,36,85,37};
		int index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));
		boolean isIndex = false;
		int currentIndex = 0;
		int previusIndex = 0;
		int nextIndex = 0;
		isIndex = checkIndex(nums,index);
		while(!isIndex) {	
			index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array,again:"));
			isIndex = checkIndex(nums,index);
		}
		currentIndex=currentData(nums,index);
		previusIndex=prevData(nums,index);
		nextIndex=nextData(nums,index);
		
		JOptionPane.showMessageDialog(null, "Current data, nums["+currentIndex+"] is "+nums[currentIndex]+
				(previusIndex<0?"\nNo previous data":"\nPrevious data, nums["+previusIndex+"] is "+nums[previusIndex])+
				(nextIndex>(nums.length-1)?"\nNo next data":"\nNext data, nums["+nextIndex+"] is "+nums[nextIndex]));
	}
	
	public static boolean checkIndex(int[] nums,int index) {
		return index<(nums.length)&&index>=0;
	}
	
	public static int currentData(int[] nums,int index) {
		return index;
	}
	
	public static int prevData(int[] nums,int index) {
		return index-1;
	}

	public static int nextData(int[] nums,int index) {
		return index+1;
}

}
