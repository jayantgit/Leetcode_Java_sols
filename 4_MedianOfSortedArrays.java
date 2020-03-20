// Objective : To find the median of two sorted arrays
// Author : Jayant Bhopale

class Solution {
     public static float get_result(int[] k) {
        if(k.length%2==0){
            float l= (float)(k[(k.length/2)-1]+k[(k.length/2)])/2;
            return l;
        }
        if(k.length%2>0){
            float l=(float)k[(k.length-1)/2];
            return l;
        }
         return 0;
    }
   
    public double findMedianSortedArrays(int[] a, int[] b) {
        int[] c = new int[a.length+b.length];
        for (int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
        Arrays.sort(c);
       return get_result(c);
    }
}
