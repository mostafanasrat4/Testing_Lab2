import java.util.ArrayList;

public class Question1 {

    public boolean isEven(int num){
        if( num % 2 == 0)
            return true;
        else
            return false;
    }

    public boolean isOdd(int num){
        if( num % 2 == 1)
            return true;
        else
            return false;
    }

    public Integer max(ArrayList<Integer> arr){
        if(arr.size() == 0){
            return null;
        }

        int maxElement = arr.get(0);
        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i) > maxElement){
                maxElement = arr.get(i);
            }
        }
        return maxElement;
    }

    public Integer min(ArrayList<Integer> arr){
        if(arr.size() == 0){
            return null;
        }

        Integer minElement = arr.get(0);
        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i) < minElement){
                minElement = arr.get(i);
            }
        }
        return minElement;
    }

}
