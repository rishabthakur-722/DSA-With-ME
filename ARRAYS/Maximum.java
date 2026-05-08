
public class Maximum {

    public static void main(String[] args) {
      int arr[] = {2,3,45,-5,34,56};
      int max = arr[0];
      int n = arr.length;
      // compare each element with max and update max if it is greater than max
      for(int i=0; i<n; i++){
          if(arr[i]>max){
              max = arr[i];
          }
      }
        System.out.println(max);
       
       
    }
}
