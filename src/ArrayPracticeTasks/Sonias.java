package ArrayPracticeTasks;

public class Sonias {

	String name;
	int roll_no;
	   String getFullInfo() {
		
	return  name.toUpperCase()+" "+roll_no;
	
			
		}
	    public static void main(String[] args) {
	      Sonias stu=new Sonias();
	      stu.name="John";
	      stu.roll_no=8;
	      System.out.println("Name is "+ stu.name+ " and roll number is "+stu.roll_no);
	    }
	}


