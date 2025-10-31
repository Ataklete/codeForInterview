import java.util.Arrays;

/*
* Java is always pass-by-value. For arrays, the reference to the array is
* passed by value (a copy of the reference). That means a method can
* modify the array's elements (visible to the caller), but reassigning the
* parameter to a new array does not affect the caller's reference.
* */
    static void modifyElement(int[] a) {
        // Modifies the contents — visible to caller
        a[0] = 99;
    }

    static void reassignArray(int[] a) {
        // Reassigning the parameter only changes the local copy of the reference
        a = new int[] {7, 8, 9};
        a[0] = 123;
    }

    void main() {
        int[] arr = {1, 2, 3};
        System.out.println("Before: " + Arrays.toString(arr));
        modifyElement(arr);
        System.out.println("After modifyElement: " + Arrays.toString(arr));
        reassignArray(arr);
        System.out.println("After reassignArray: " + Arrays.toString(arr));
    }
