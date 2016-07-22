import java.util.Scanner;
public class Game {

public static void main(String[] args) {

Scanner keyboard = new Scanner (System.in);

int bucketQuarters = 0, playCounter = 0;
System.out.println("Enter the amount of quarters in the jar: ");
bucketQuarters = keyboard.nextInt();

SlotMachine machine1 = new SlotMachine(30, 35, 0);
SlotMachine machine2 = new SlotMachine(60, 100, 0);
SlotMachine machine3 = new SlotMachine(11, 10, 0);

int a;
System.out.println("How many times has the first machine been played since paying out?");
a = keyboard.nextInt();
machine1.setQuarters(a);

int b;
System.out.println("How many times has the second machine been played since paying out?");
b = keyboard.nextInt();
machine2.setQuarters(b);

int c;
System.out.println("How many times has the third machine been played since paying out?");
c = keyboard.nextInt();
machine3.setQuarters(c);



SlotMachine[] slots = new SlotMachine[3];

slots[0] = machine1;
slots[1] = machine2;
slots[2] = machine3;

while(bucketQuarters > 0) {
	for(int i = 0; i < slots.length; i++) {
		if(bucketQuarters == 0) {
			break;
		}
		slots[i].addQuarter();
		--bucketQuarters;
		playCounter++;
		if(slots[i].getQuarters() == slots[i].getPayTime()) {
			bucketQuarters += slots[i].getPayOut();
			slots[i].setQuarters(0);
		}
	}
}

System.out.println("Martha played " + playCounter + " times.");


}

}