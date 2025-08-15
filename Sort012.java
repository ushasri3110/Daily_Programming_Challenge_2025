public class Sort012 {
    public static void sort012(int[] arr) {
        int low=0,high=arr.length-1,mid=0;
        while (mid<=high){
            if (arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if (arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
        }
    }
    public static void main(String[] args){
        int[] arr={0, 1, 2, 1, 0, 2, 1, 0};
        sort012(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
