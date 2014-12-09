//Gio Lapid
//1262354
//CS12B
//07-03-13
//Extrema.java
//Purpose: use recursive methods to find minimum and maximum of an array

class Extrema{

    //maxArray()
    //returns the largest value in int array A
    static int maxArray(int[] A, int p, int r){
	int q = (p+r)/2 ;
	if (r-p <= 0) return A[p];//base case
	int left = maxArray(A, p, q);
        int right = maxArray(A, q+1, r);
	if (left > right) return left;
        else return right; 
     }
    
    //minArray()
    //returns the smallest value in int array A
    static int minArray(int[] A, int p, int r){
	int q = (p+r)/2;
	if(r-p <= 0) return A[p];//base case
	int left = minArray(A, p, q);
	int right = minArray(A, q+1, r);
	if (left > right) return right;
	else return left; 
     }

    //main
    public static void main(String[] args){
       	int [] B = {-1, 2, 6, 3, 9, 2, -3, -2, 11, 5, 7};
	System.out.println( "max = " + maxArray(B, 0, B.length-1));
	System.out.println( "min = " + minArray(B, 0, B.length-1));
    }
}