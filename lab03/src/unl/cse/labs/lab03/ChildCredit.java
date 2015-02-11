package unl.cse.labs.lab03;

public class ChildCredit {

	public static void main(String args[]) {
		Child tom = new Child("Tommy", 2);
		Child dick = new Child("Richard", 18);
		Child harry = new Child("Harold", 19);

		Child arr[] = new Child[3];
		arr[0] = tom;
		arr[1] = dick;
		arr[2] = harry;

		//TODO: write a loop to iterate over the elements in the child array 
		//      and output a table as specified
		System.out.println("Child       Amount");
		int counter = 0;
		double credit = 0;
		for(int i=0;i<arr.length;i++){

			if(arr[i].getAge()<18){
				if(counter<1){
					credit =+ 1000;
					System.out.println(arr[i].toString() + " $" + 1000);
					counter++;
				}else {
					credit += 500;

					System.out.println(arr[i].toString() + " $" + 500);
				}
			}else {

				System.out.println(arr[i].toString() + " $" + 0);
			}

			
		}
		System.out.println("Total Credit:    $" + credit);
	}
}