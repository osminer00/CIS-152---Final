
//linked list calendar
/**
 * Calendar Linked List to hold days of Week
 * @author FirstName LastName
 * @version
 */

public class Calendar {
	/**
	 * Node class to store data and location of next node
	 * @author FirstName LastName
	 * @version
	 */

	public class Node{
		public String day; //Stores the current day of the week (e.g. Mon, Tues, etc)
		public int accomplished; //Stores how many times a specific day has been accomplished
		public String exType; //Holds the type of exercises for each day (leg day, back day, etc.)
		public Node prevDay; //Stores the location of the previous day 

		/**
		 * Getters and setters for Node
		 * @param paramName
		 * @return
		 */

		public void setDay(String day) {
			this.day = day;
		}


		public void setAccomplished(int accomplished) {
			this.accomplished = accomplished;
		}


		public void setExType(String exType) {
			this.exType = exType;
		}


		public void setPrevDay(Node prevDay) {
			this.prevDay = prevDay;
		}


		public void setExDay(WeekDay exDay) {
			this.exDay = exDay;
		}


		public void setE(Exercise e) {
			this.e = e;
		}


		public WeekDay exDay;
		public Exercise e;
		
		/**
		 * Constructor to create new day on calendar
		 * @param paramName
		 * @param paramName
		 */

		public Node(String day) {
			this.exDay = exDay;
			this.day = day;
			e = new Exercise();

		}
		
	}
	
	public Node head = new Node("N/A");
	public int size;
	
	/**
	 * returns if linked list has any items or not
	 * @param paramName
	 * @return
	 */

	public boolean isEmpty() {
		return(size==0);
	}
	/**
	 *returns how many items in linked list
	 * @param paramName
	 * @return
	 */

	public int size() {
		return size;
	}
	/**
	 * inserts a new day
	 * @param paramName
	 * @return
	 */

	public void insert(String day) {
		Node newDay = new Node(day);
		newDay.prevDay = head;
		head = newDay;
		size++;
	}
	/**
	 * removes a day based on day name
	 * @param paramName
	 * @return
	 */

	public void remove(String removeType) throws CalendarEmptyException{ //remove a day by exercise type
		Node dayl = head;
		Node nextDay = null;
		
		if(!isEmpty()) {
			if (dayl != null && dayl.exType == removeType) {
				head = dayl.prevDay;
			}else {
				while(removeType != null && dayl.exType != removeType) {
					nextDay = dayl;
					dayl = dayl.prevDay;
				}
				size--;
				nextDay.prevDay = nextDay.prevDay;
			}

		}else {
			throw new CalendarEmptyException();
		}

	}
	/**
	 * removes a day based on index
	 * @param paramName
	 * @return
	 */

	public void removeAt(int index) throws CalendarEmptyException{ //remove a day by index in  list
		Node dayl = head;
		if(!isEmpty()) {
			if(index == 0) {
				head = dayl.prevDay;
			}else {
				for (int i = 0; i < index-1; i++) {
					dayl = dayl.prevDay;
				}
				size--;
				Node remove = dayl.prevDay.prevDay;
				dayl.prevDay = remove;
			} 
			
			
			
		}else {
			throw new CalendarEmptyException();
		}
		
		
	}
	/**
	 *replaces one day with another
	 * @param paramName
	 * @return
	 */

	public void replace (String day1, String day2) throws CalendarEmptyException{ //replace day with another day(e.g. replace monday with tuesday)
		Node dayl = head;
		if(!isEmpty()) {
			if(dayl.day == day1) {
				dayl.day = day2;
				
			}else {
				while (dayl != null && dayl.day != day1) {
					dayl = dayl.prevDay;
				}
				dayl.day = day2;
			}

		}else {
			throw new CalendarEmptyException();
		}
		
		
	}
	
	/**
	 * returns last day entered
	 * @param paramName
	 * @return
	 */

	public String getDay() {
		Node dayl = head;
		return dayl.day;
	}
	/**
	 * returns calendar day
	 * @param paramName
	 * @return
	 */

	public Calendar.Node getDay(String day1) {
		Node dayl = head;
		if(dayl.day == day1) {
			return dayl;
			
		}else {
			while (dayl != null && dayl.day != day1) {
				dayl = dayl.prevDay;
			}
			return dayl;
			
			
		}
	}
	/**
	 * Getters and setters for Calendar
	 * @param paramName
	 * @return
	 */

	public String getEx() {
		Node dayl = head;
		return dayl.e.getName();
	}
	public int getRep() {
		Node dayl = head;
		return dayl.e.getReps();
	}
	public int getWeight() {
		Node dayl = head;
		return dayl.e.getWeight();
	}
	public Exercise getE() {
		Node dayl = head;
		return dayl.e;
	}
	public Node getHead() {
		Node dayl = head;
		return dayl;
	}
	public Node getPrevDay() {
		Node dayl = head;
		return dayl.prevDay;
	}
	/**
	 * Prints calendar days
	 * @param paramName
	 * @return
	 */

	public String print() {
		Node dayl = head;
		String out = "";
		while (dayl != null) {
			out = out + " " + dayl.day;
			dayl= dayl.prevDay;
		}
		return out;
	}
	
}
