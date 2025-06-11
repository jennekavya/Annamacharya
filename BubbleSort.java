import java.util.*;
class BubbleSort{
    static void bubbleSort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            boolean isSwap=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwap=true;
                }
            }
            if(!isSwap){
                break;
            }
        }
        System.out.println("After Bubble sort : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before bubble sort : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubbleSort(arr,n);
        sc.close();
    }
}