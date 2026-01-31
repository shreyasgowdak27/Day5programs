public class rever{
    public static void main(String[] args) {
        int[] array={10,23,43,56,76};
        int[] reversed=new int[array.length];
        for(int i=0;i<array.length;i++){
            reversed[i]=array[array.length-1-i];
        }
        int j=0;
        System.out.print("Reversed Array: ");
        while( j<array.length){
            System.out.print(reversed[j]);
            if(j<array.length-1) System.out.print(" , ");
            j++;
        }
    }
    
}
