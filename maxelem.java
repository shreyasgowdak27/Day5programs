import java.util.Random;
public class maxelem {
    public static void main(String[] args) {
        Random rd=new Random(100);
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=rd.nextInt(100);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int element=arr[0];
        int j=1;
        while (j<arr.length) {
            if(element<=arr[j]){
                element=arr[j];
                 j++;
                 continue;
            }
            else{
                j++;
                continue;
            }   
        }

        System.out.println("The maximum element is:"+element);

    }
}
