import java.util.Arrays;

public class SWAP
{

	public static void main(String[] args) {
		Integer [] a = {1,2,3,4,5};
        System.out.println("Before swap, array: "+Arrays.toString(a));

        swap(a, 0, 1,2);      //object, index1, index2
        System.out.println(" After swap, array: "+ Arrays.toString(a));
    }

    public static <T> void swap (T[] a, int i, int j, int h) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
        a[h]=a[i];
    }
}	

	


