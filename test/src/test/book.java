package test;

public class book {
	//status
	private int readed; // member variable
	
	book(){// no argument construcor
		
		this(1); // to set defult value  for cookBook after the manual creation of contructor you need to do this
		// this is used to call the readed value
	}
	
	book(int readed){ //constructur
		
		this.readed = readed;
	}
	
	
	public void setReaded(int readed) {// local variable
		
		if(readed  > 0)
		this.readed = readed;
		//System.out.printf("you are on page number= %d", readed).println();
		//System.out.printf("you are on page number= %d", this.readed).println();
	}
	
	public void increaseReaded(int howMuch) {
		
		setReaded(this.readed + howMuch );
		
		//this.readed = this.readed + howMuch;
	}
	
	public void decreaseReaded(int howMuch) {
		//if(this.readed - howMuch > 0) {
		//this.readed = this.readed - howMuch;
		//}
		
		setReaded(this.readed - howMuch );
		
	}
	
	
	int getReaded() {
		
		return this.readed;
	}

	void bookName() {
		//action or behaovor
		
		String i = "English";
		
		System.out.printf("This book teach you %s", i).println();
	}
	
	void artOfComputerProgramming() {
		//action or behaovor
		
		String j = "Computer Programming";
		
		System.out.printf("This book teach you %s", j).println();
	}
	
	void effectiveJava() {
		//action or behaovor
		
		String k = "Java";
		
		System.out.printf("This book teach you %s", k).println();
	}
	
	void cleanCode() {
		//action or behaovor
		
		String l = "Clean Code";
		
		System.out.printf("This book teach you %s", l).println();
	}
	
	void cookBook() {
		//action or behaovor
		
		String o = "Cook Book";
		
		System.out.printf("This book teach you %s", o).println();
	}

	
	

}
