public class ArrayAdd {
    public static void main(String[] args){
        int[] arr1={1,2,300,400,4};
        int[] arr2={9,8,0,7,1};
        int[] arr3=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i]+arr2[i];
        }
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }


    }
    
}
