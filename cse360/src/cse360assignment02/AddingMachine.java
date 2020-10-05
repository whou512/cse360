//URL：https://github.com/whou512/cse360
//ID of GitHub: whou512
package cse360assignment02;


public class AddingMachine {
  private int total;
  private String trans;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    trans = "0";
  }
  
  public int getTotal () {
	  
    return total;
  }
  
  public void add (int value) {
	  total += value;
	  trans += "+" +value;
	  
  }

  public void subtract (int value) {
	  total -= value;
	  trans += "-" +value;
  }

  public String toString () {
    return trans;
  }

  public void clear() {
	  trans = "0";
  }
 
  
}