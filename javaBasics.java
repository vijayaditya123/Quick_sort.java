import java.util.*;
public class javaBasics{
   public static int Partion(int arr[],int si ,int en){
         int piovt = arr[en] ;
         int i=si-1;
         int tem;
         for(int j = si;j<en;j++){
            if(piovt >=arr[j]){
               i++;
               tem =arr[j];
               arr[j]=arr[i];
               arr[i]=tem;
               
            }
            
         }
         i++;
         tem = arr[i];
         arr[i]= arr[en];
         arr[en] = tem;

         return i;
         
         
   }
   public static void  Quick_sort(int arr[],int si ,int en){
      if(si >= en){
         return;
      }
      int pIdx = Partion(arr,si,en);
      Quick_sort(arr, si, pIdx-1);
      Quick_sort(arr,  pIdx+1,en);


         
   }
   
    public static void main(String args[]){
      int arr[] ={6,3,9,8,2,5};
      Quick_sort(arr, 0, arr.length-1);
      for(int i =0;i<arr.length;i++){
         System.out.print(arr[i]);
      }
  }
}  

