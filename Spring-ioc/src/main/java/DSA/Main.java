package DSA;

public class Main {
	int maxsize;
	int top;
	int[] numarray;
	Main(int size){
		maxsize=size;
		top=-1;
		numarray=new int[maxsize];
	}
	void push (int value) {
	if(top<maxsize-1) {
		numarray[++top]=value;
	}
	else {
		System.out.println("stack is full.");
	}
	}

	public static void main(String args[]) {
	Main numStack=new Main(3);
	numStack.push(22);
	numStack.push(11);
	numStack.push(33);
	numStack.push(3);

	for (int i = 0; i < numStack.maxsize; i++) {
		System.out.println(numStack.numarray[i]);
		
		}
	}

}
