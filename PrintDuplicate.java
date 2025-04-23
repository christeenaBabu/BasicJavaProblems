import java.util.HashSet;

public class PrintDuplicate {
    static int[] arr={2,4,5,5,6,8,9,2};

    public static void main(String[] args) {
        findDuplicate(arr);
    }

    private static void findDuplicate(int[] arr) {
        HashSet<Integer> hashSet=new HashSet<>();
        for (int num:arr){
            if(!hashSet.add(num)){
                System.out.println(num);
            }
        }
    }
}
