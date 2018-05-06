import java.util.ArrayList;
import java.util.List;

public class FP {

    public static void main(String args[]){
        ArrayList<String> list = new ArrayList();

        for(int i = 0 ; i <= 300 ; i++){
            list.add(i+"");
        }

        list.parallelStream() // string
                .map(Integer::parseInt)// int
                .filter((num) -> num % 2 == 0)
                .forEach(System.out::println);

//
//        ArrayList<Integer> result = new ArrayList<>();
//
//        for(String i : list){
//            int temp = Integer.parseInt(i);
//            if(temp % 2 == 0){
//                result.add(temp);
//            }
//        }
    }

}
