import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int [] nums = {1,1,3,4,5,6,7,7,7,10};
        boolean foundBefore;
        int count;
        boolean foundDup = false;

        //print array
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < nums.length; i++) {
            foundBefore = false;
            count = 0;
            //checks before current position
            for(int j = 0; j < i; j++) {
                if(nums[i] == nums[j]){
                    foundBefore = true;
                }
            }
            if(!foundBefore){
                for(int j = i; j < nums.length; j++){
                    if(nums[i] == nums[j]){
                        count++;
                    }
                }
                if(count > 1){
                    System.out.println("The number " + nums[i] + " occurs " + count + " times.");
                    foundDup = true;
                }
            }
        }
        if(!foundDup){
            System.out.println("There are no duplicates");
        }
    }
}