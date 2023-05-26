package javaoops;

public class insurence extends inherhits {
  public int insurenceId;
  
  public insurence(){
	  super();
	  System.out.println("insurence para defualt");
  }
  
  public void print() {
	  System.out.println("print para const insurence "+ insurenceId);
  }
}
