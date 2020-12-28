/*
 An array is monotonic if it is either monotone increasing or monotone decreasing.

An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].

Return true if and only if the given array A is monotonic.

 

Example 1:

Input: [1,2,2,3]
Output: true
Example 2:

Input: [6,5,4,4]
Output: true
Example 3:

Input: [1,3,2]
Output: false
Example 4:

Input: [1,2,4,5]
Output: true
Example 5:

Input: [1,1,1]
Output: true
 

Note:

1 <= A.length <= 50000
-100000 <= A[i] <= 100000
 */
public class MonotonicArray {
	public boolean Decreasing(int A[]){
        boolean k = true;
        for(int i=0;i<A.length;i++){
            if(i!=A.length-1){
                if(A[i]>=A[i+1]){
                    continue;
                }
                else{
                   k = false;
                   break;
                }      
            }
        }
        return k; 
    }
    public boolean Increasing(int A[]){
        boolean k = true;
        for(int i=0;i<A.length;i++){
            if(i!=A.length-1){
                if(A[i]<=A[i+1]){
                    continue;
                }
                else{
                   k = false;
                   break;
                }      
            }
        }
        return k; 
    }
    
    
    public boolean isMonotonic(int[] A) {
        boolean k = true;
        if(A.length == 1){
            return true;
        }
        else if(A[0]<=A[A.length-1]){
                k = Increasing(A);
            }
        else if(A[0]>=A[A.length-1]){
            k = Decreasing(A);
            }
        return k;
        }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
