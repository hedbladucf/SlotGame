public class SlotMachine {

private int payOut;
private int payTime;
private int quarters;
public int getPayOut() {
return payOut;
}
public void setPayOut(int payOut) {
this.payOut = payOut;
}
public SlotMachine(int payOut, int payTime, int quarters) {
super();
this.payOut = payOut;
this.payTime = payTime;
this.quarters = quarters;
}
public int getPayTime() {
return payTime;
}
public void setPayTime(int payTime) {
this.payTime = payTime;
}
public int getQuarters() {
return quarters;
}
public void setQuarters(int quarters) {
this.quarters = quarters;
}

public void addQuarter() {
	quarters++;
}

}