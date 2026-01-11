public class Main {
    public static void main(String[] args) {


//        This program for finding 2nd largest element from the sorted array
//        This approach is lengthy

//        Declared array and initialized
        int[] arr={4,2,3,5,8};

//        Declaring temp var for swapping element
        int temp=0;

//        Logic to swap the element in the list

        for(int i=0; i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){


                if (arr[i] < arr[j]) {

                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }

        System.out.println("Second largest Element in Sorted array :"+arr[1]);
    }
}