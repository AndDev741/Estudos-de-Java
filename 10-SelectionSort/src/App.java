import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class App {

    private static int smallestNumber(List<Integer> list){
        int smallest = list.get(0);
        int smallestIndex = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < smallest){
                smallest = list.get(i);
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    private static List<Integer> selectionSort(List<Integer> list){
        List<Integer> newList = new ArrayList<>(list.size());
        int size = list.size();
        for(int i = 0; i < size; i++){
            int smallestIndex = smallestNumber(list);
            newList.add(list.get(smallestIndex));
            list.remove(smallestIndex);
        }
        
        return newList;
    }

    public static void main(String[] args) throws Exception {
        List<Integer> unsortedList = new ArrayList<>(Arrays.asList(10, 5, 2, 45, 3, 22));
        List<Integer> sortedList = selectionSort(unsortedList);
        System.out.println(sortedList);
    }
}
