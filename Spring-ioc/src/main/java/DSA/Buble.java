package DSA;

public class Buble {
	import java.util.Stack;

	public class BinarySearchOnStack {
	    
	    // Binary search implementation on a sorted stack
	    static int binarySearch(Stack<Integer> stack, int target) {
	        int low = 0;
	        int high = stack.size() - 1;
	        
	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            int midVal = stack.get(mid);
	            
	            if (midVal < target) {
	                low = mid + 1;
	            } else if (midVal > target) {
	                high = mid - 1;
	            } else {
	                return mid; // Element found
	            }
	        }
	        return -1; // Element not found
	    }

	    public static void main(String[] args) {
	        Stack<Integer> stack = new Stack<>();
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.push(40);
	        stack.push(50);

	        int target = 30;
	        int index = binarySearch(stack, target);
	        
	        if (index != -1) {
	            System.out.println("Element " + target + " found at index " + index);
	        } else {
	            System.out.println("Element " + target + " not found");
	        }
	    }
	}

	public static void main(String[] args) {
		
	}

}
