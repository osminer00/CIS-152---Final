import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**************************************************************
* Name        : Project Name
* Author      : FirstName LastName
* Created     : 4/24/2019
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows XX
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This program overall description here
*               Input:  list and describe
*               Output: list and describe
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/

/**
 * @author Owen
 *
 */
/**
 * GRAPHICS AND DRIVER CLASS
 * @author Owen Miner
 * @version
 */

public class GUI implements ActionListener{

	/**
	 * Desription of method
	 * @param paramName
	 * @return
	 * @throws ExerciseQueueFullEmptyException 
	 * @throws ExerciseQueueEmptyException 
	 * @throws CalendarEmptyException 
	 */
	/**
	 * Driver Method
	 * @param paramName
	 * @return
	 */

	public static void main(String[] args) throws ExerciseQueueFullEmptyException, ExerciseQueueEmptyException, CalendarEmptyException {
		GUI g = new GUI();
		
		
		//testing exercises and exercise queue
		System.out.println("Exercise Queue Test: ");
		ExerciseQueue e1 = new ExerciseQueue();
		Exercise x1 =new Exercise();
		Exercise x2 =new Exercise();
		Exercise x3 =new Exercise();
		Exercise x4 =new Exercise();
		Exercise x5 =new Exercise();
		
		//testing enqueue dequeue
		e1.enqueue(x1);
		e1.enqueue(x2);
		e1.enqueue(x3);
		e1.enqueue(x4);
		e1.enqueue(x5);
			
		e1.dequeue();
		e1.dequeue();
		e1.dequeue();
		
		System.out.println(e1.print());
		
		e1.enqueue(x1);
		e1.enqueue(x2);
		e1.enqueue(x3);
		
		e1.dequeue();
		 
		System.out.println("test print " + e1.print());
		System.out.println("Test peek: " + e1.peek());
		System.out.println("test isEmpty " + e1.isEmpty());
		System.out.println("test isFull " + e1.isFull());
		System.out.println("test size " + e1.size());
		
		//testing calendar
		System.out.println("Calendar Test: ");
		Calendar c1 = new Calendar();
		
		c1.insert("Monday");
		c1.insert("Tuesday");
		c1.insert("Wednesday");
		c1.insert("Thursday");
		c1.insert("Friday");
		c1.insert("Saturday");
		c1.insert("Sunday");
		
		System.out.println(c1.print());
	
		System.out.println("test isEmpty " + c1.isEmpty());
		System.out.println("test size " + c1.size());

		 c1.removeAt(1);
		System.out.println("test removeAt(Saturday): " +c1.print());
		c1.replace("Sunday", "Saturday");
		
		System.out.println("test replace (saturday and sunday): " +c1.print());
		
		
		
		
		
		
		
		
	}
	final static String MAINPANEL = "Main Panel";
	final static String EDITPANEL = "Edit Panel";
	final static String EXPANEL = "Exercise Panel";
	JPanel panels = new JPanel(new CardLayout());
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JFrame frame = new JFrame();
	JPanel editPanel = new JPanel();
	JPanel exPanel = new JPanel();
	private JTextField muscle;
	private JTextField exerciseName;
	private JTextField weightTxt;
	private JTextField repititions;
	
	private JLabel completed = new JLabel();
	private JLabel day = new JLabel();
	private JLabel type = new JLabel();
	private JLabel exertion = new JLabel();
	private JLabel exercises = new JLabel();
	private JLabel currExercise = new JLabel();
	private JButton next = new JButton("Next Exercise");
	private JLabel rep = new JLabel();
	private JLabel repi = new JLabel();
	private JLabel weig = new JLabel();
	
	private JButton menu = new JButton("Menu");
	private JButton menu2 = new JButton("Menu");
	private JButton menu3 = new JButton("Menu");
	
	private Exercise e1 = new Exercise();
	private WeekDay w1 = new WeekDay();
	private ExerciseQueue eq1 = new ExerciseQueue();
	private String to = "";
	
	
	ExerciseQueue currQue;
	ExerciseQueue monQue = new ExerciseQueue();
	ExerciseQueue tueQue = new ExerciseQueue();
	ExerciseQueue wedQue = new ExerciseQueue();
	ExerciseQueue thuQue = new ExerciseQueue();
	ExerciseQueue friQue = new ExerciseQueue();
	ExerciseQueue satQue = new ExerciseQueue();
	ExerciseQueue sunQue = new ExerciseQueue();
	/**
	 * Constructor to buidl GUI
	 */

	public GUI() {
		
		panels.add(panel, MAINPANEL);
		
		//selectDay.setBounds(left/right, up/down, length, height); FOR REFERENCE
		//select monday-sunday or edit days
		frame.add(panel);
		
		JButton monday = new JButton ("Monday");
		monday.setBounds(10,80,110,25);
		monday.addActionListener(this);
		monday.setActionCommand("monday");
		panel.add(monday);
		
		JButton tuesday = new JButton ("Tuesday");
		tuesday.setBounds(120,80,110,25);
		tuesday.addActionListener(this);
		tuesday.setActionCommand("tuesday");
		panel.add(tuesday);
		
		JButton wednesday = new JButton ("Wednesday");
		wednesday.setBounds(230,80,110,25);
		wednesday.addActionListener(this);
		wednesday.setActionCommand("wednesday");
		panel.add(wednesday);
		
		JButton thursday = new JButton ("Thursday");
		thursday.setBounds(340,80,110,25);
		thursday.addActionListener(this);
		thursday.setActionCommand("thursday");
		panel.add(thursday);
		
		JButton friday = new JButton ("Friday");
		friday.setBounds(450,80,110,25);
		friday.addActionListener(this);
		friday.setActionCommand("friday");
		panel.add(friday);
		
		JButton saturday = new JButton ("Saturday");
		saturday.setBounds(560,80,110,25);
		saturday.addActionListener(this);
		saturday.setActionCommand("saturday");
		panel.add(saturday);
		
		JButton sunday = new JButton ("Sunday");
		sunday.setBounds(670,80,110,25);
		sunday.addActionListener(this);
		sunday.setActionCommand("sunday");
		panel.add(sunday);
		
		JButton edit = new JButton ("Edit A Day");
		edit.setBounds(10,120,770,25);
		edit.addActionListener(this);
		edit.setActionCommand("edit");
		panel.add(edit);
	
		
		
		JLabel selectDay = new JLabel("Select A Day of The Week: ");
		selectDay.setBounds(330,30,200,25);
		panel.add(selectDay);
		
		
		frame.setTitle("Exercise Manager");
		frame.setSize(800,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(null);
		frame.setVisible(true);
		
		//edit day selector page
		
		JLabel selectDay2 = new JLabel("Select A Day of The Week to Edit: ");
		selectDay.setBounds(330,30,200,25);
		panel2.add(selectDay);
		
		JButton monday2 = new JButton ("Monday");
		monday2.setBounds(10,80,110,25);
		monday2.addActionListener(this);
		monday2.setActionCommand("mondayE");
		panel2.add(monday2);
		
		JButton tuesday2 = new JButton ("Tuesday");
		tuesday2.setBounds(120,80,110,25);
		tuesday2.addActionListener(this);
		tuesday2.setActionCommand("tuesdayE");
		panel2.add(tuesday2);
		
		JButton wednesday2 = new JButton ("Wednesday");
		wednesday2.setBounds(230,80,110,25);
		wednesday2.addActionListener(this);
		wednesday2.setActionCommand("wednesdayE");
		panel2.add(wednesday2);
		
		JButton thursday2 = new JButton ("Thursday");
		thursday2.setBounds(340,80,110,25);
		thursday2.addActionListener(this);
		thursday2.setActionCommand("thursdayE");
		panel2.add(thursday2);
		
		JButton friday2 = new JButton ("Friday");
		friday2.setBounds(450,80,110,25);
		friday2.addActionListener(this);
		friday2.setActionCommand("fridayE");
		panel2.add(friday2);
		
		JButton saturday2 = new JButton ("Saturday");
		saturday2.setBounds(560,80,110,25);
		saturday2.addActionListener(this);
		saturday2.setActionCommand("saturdayE");
		panel2.add(saturday2);
		
		JButton sunday2 = new JButton ("Sunday");
		sunday2.setBounds(670,80,110,25);
		sunday2.addActionListener(this);
		sunday2.setActionCommand("sundayE");
		
		menu3.addActionListener(this);
		menu3.setActionCommand("menu");
		menu3.setBounds(10,120,1000,1000);
		panel2.add(menu3);


		//edit days page

		
		JLabel muscleLabel = new JLabel("Muscle Group");
		muscleLabel.setBounds(10,120,770,25);
		editPanel.add(muscleLabel);
		
		muscle = new JTextField(20);
		muscle.addActionListener(this);
		muscle.setBounds(10,120,770,25);
		editPanel.add(muscle);
		
		JLabel exerciseLabel = new JLabel("Exercise Name");
		exerciseLabel.setBounds(10,120,770,25);
		editPanel.add(exerciseLabel);
		 exerciseName = new JTextField(20);
		exerciseName.setBounds(10,120,770,25);
		editPanel.add(exerciseName);
		
		JLabel repsLabel = new JLabel("Repititions");
		repsLabel.setBounds(10,120,770,25);
		editPanel.add(repsLabel);
		 repititions = new JTextField(20);
		repititions.setBounds(10,120,770,25);
		editPanel.add(repititions);
		
		JLabel weightLabel = new JLabel("Weight");
		weightLabel.setBounds(10,120,770,25);
		editPanel.add(weightLabel);
		weightTxt = new JTextField(20);
		weightTxt.setBounds(10,120,770,25);
		editPanel.add(weightTxt);

		menu2.addActionListener(this);
		menu2.setActionCommand("menu");
		menu2.setBounds(10,120,1000,1000);
		editPanel.add(menu2);
		
		JButton confirm = new JButton ("Confirm Edits");
		confirm.setBounds(500,500,500,500);
		confirm.addActionListener(this);
		confirm.setActionCommand("confirm");
		editPanel.add(confirm);
		
		

		//exercise panel
		
		
		completed.setBounds(1,1,1,1);
		exPanel.add(completed);
		
		day.setBounds(50,100,770,25);
		exPanel.add(day);
		
		type.setBounds(10,500,770,00);
		exPanel.add(type);
		
		exertion.setBounds(10,700,770,10);
		exPanel.add(exertion);
		
		
		currExercise.setBounds(10,120,770,100);
		exPanel.add(currExercise);
		
		exercises.setBounds(10,900,770,50);
		exPanel.add(exercises);
		
		rep.setBounds(10,900,770,50);
		exPanel.add(rep);
		repi.setBounds(10,900,770,50);
		exPanel.add(repi);
		

		weig.setBounds(10,900,770,50);
		exPanel.add(weig);
		
		
		menu.addActionListener(this);
		menu.setActionCommand("menu");
		menu.setBounds(10,120,1000,1000);
		exPanel.add(menu);

		next.addActionListener(this);
		next.setActionCommand("next");
		next.setBounds(10,120,1000,1000);
		exPanel.add(next);
		
		
	}
	
	/**
	 * Button Action Commands
	 * @param paramName
	 * @return
	 */

	String currDay ="";
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		Calendar cal = new Calendar();
		cal.insert("Monday");
		String currEday = null;
		
		
		//select day buttons
		if (e.getActionCommand().equals("monday")) {
			cal.insert("Monday");
			System.out.println("monday");
			String co = "-1";
			String c = "||    Times Completed   :   " + co + "        ||";
			completed.setText(c);
			
			String da = cal.getDay();
			String d = "||    Day   :   " + da+"               ||";
			day.setText(d);
			
			String t = " Leg Day ";
			String ty = "||     Exercise Type   :   " + t +"         ||";
			type.setText(ty);
			
			
			String er = "";
			String ertion = er;
			exertion.setText(ertion);
			
			
			String currex= "||    Current Exercise   :   ";
			currExercise.setText(currex);
			
						String r= "||    Repititions   :   ";
			int w = cal.getRep();
			String repit = r+"   " +w+  "   ||";
			repi.setText(repit);
			
			String weigh=" ||    Weight   :       ||";

			weig.setText(weigh);

			frame.setContentPane(exPanel);
			frame.setSize(1100, 150);
			frame.invalidate();
			frame.validate();
			
			currDay = "Monday";
			w1.setDay(currDay);
		}
		if (e.getActionCommand().equals("tuesday")) {
			currDay = "Tuesday";
			w1.setDay(currDay);
			cal.insert("Tuesday");
			
			String co = "-1";
			String c = "||    Times Completed   :   " + co + "        ||";
			completed.setText(c);
			
			String da = cal.getDay();
			String d = "||    Day   :   " + da+"               ||";
			day.setText(d);
			
			String t = " Leg Day ";
			String ty = "||     Exercise Type   :   " + t +"         ||";
			type.setText(ty);
			
			
			String er = "";
			String ertion = er;
			exertion.setText(ertion);
			
			
			String currex= "||    Current Exercise   :   ";
			currExercise.setText(currex);
			
			
			
			String r= "||    Repititions   :   ";
			int w = cal.getRep();
			String repit = r+"   " +w+  "   ||";
			repi.setText(repit);
			
			String weigh=" ||    Weight   :       ||";

			weig.setText(weigh);
			
			
			frame.setContentPane(exPanel);
			frame.setSize(1100, 150);
			frame.invalidate();
			frame.validate();
			
		}
		if (e.getActionCommand().equals("wednesday")) {
			System.out.println("wednesday");
			currDay = "Wednesday";
			w1.setDay(currDay);
			cal.insert("Wednesday");
			System.out.println("wednesday");
			String co = "-1";
			String c = "||    Times Completed   :   " + co + "        ||";
			completed.setText(c);
			
			String da = cal.getDay();
			String d = "||    Day   :   " + da+"               ||";
			day.setText(d);
			
			String t = " Leg Day ";
			String ty = "||     Exercise Type   :   " + t +"         ||";
			type.setText(ty);
			
			
			String er = "";
			String ertion = er;
			exertion.setText(ertion);
			
			
			String currex= "||    Current Exercise   :   ";
			currExercise.setText(currex);
			
			
			
			String r= "||    Repititions   :   ";
			int w = cal.getRep();
			String repit = r+"   " +w+  "   ||";
			repi.setText(repit);
			
			String weigh=" ||    Weight   :       ||";

			weig.setText(weigh);
			
			
			frame.setContentPane(exPanel);
			frame.setSize(1100, 150);
			frame.invalidate();
			frame.validate();
			
			
			
		}
		if (e.getActionCommand().equals("thursday")) {
			System.out.println("thursday");
			currDay = "Thursday";
			w1.setDay(currDay);
			cal.insert("Thursday");
			System.out.println("monday");
			String co = "-1";
			String c = "||    Times Completed   :   " + co + "        ||";
			completed.setText(c);
			String da = cal.getDay();
			String d = "||    Day   :   " + da+"               ||";
			day.setText(d);
			String t = " Leg Day ";
			String ty = "||     Exercise Type   :   " + t +"         ||";
			type.setText(ty);
			String er = "";
			String ertion = er;
			exertion.setText(ertion);
			String currex= "||    Current Exercise   :   ";
			currExercise.setText(currex);
			String r= "||    Repititions   :   ";
			int w = cal.getRep();
			String repit = r+"   " +w+  "   ||";
			repi.setText(repit);
			String weigh=" ||    Weight   :       ||";
			weig.setText(weigh);
			frame.setContentPane(exPanel);
			frame.setSize(1100, 150);
			frame.invalidate();
			frame.validate();
			
		}
		if (e.getActionCommand().equals("friday")) {
			System.out.println("friday");
			currDay = "Friday";
			w1.setDay(currDay);
			cal.insert("Friday");
			System.out.println("monday");
			String co = "-1";
			String c = "||    Times Completed   :   " + co + "        ||";
			completed.setText(c);
			String da = cal.getDay();
			String d = "||    Day   :   " + da+"               ||";
			day.setText(d);
			String t = " Leg Day ";
			String ty = "||     Exercise Type   :   " + t +"         ||";
			type.setText(ty);
			String er = "";
			String ertion = er;
			exertion.setText(ertion);
			String currex= "||    Current Exercise   :   ";
			currExercise.setText(currex);
			String r= "||    Repititions   :   ";
			int w = cal.getRep();
			String repit = r+"   " +w+  "   ||";
			repi.setText(repit);
			String weigh=" ||    Weight   :       ||";
			weig.setText(weigh);
			frame.setContentPane(exPanel);
			frame.setSize(1100, 150);
			frame.invalidate();
			frame.validate();
		}
		if (e.getActionCommand().equals("saturday")) {
			System.out.println("saturday");
			currDay = "Saturday";
			w1.setDay(currDay);
			cal.insert("Saturday");
			String co = "-1";
			String c = "||    Times Completed   :   " + co + "        ||";
			completed.setText(c);
			String da = cal.getDay();
			String d = "||    Day   :   " + da+"               ||";
			day.setText(d);
			String t = " Leg Day ";
			String ty = "||     Exercise Type   :   " + t +"         ||";
			type.setText(ty);
			String er = "";
			String ertion = er;
			exertion.setText(ertion);
			String currex= "||    Current Exercise   :   ";
			currExercise.setText(currex);
			String r= "||    Repititions   :   ";
			int w = cal.getRep();
			String repit = r+"   " +w+  "   ||";
			repi.setText(repit);
			String weigh=" ||    Weight   :       ||";
			weig.setText(weigh);
			frame.setContentPane(exPanel);
			frame.setSize(1100, 150);
			frame.invalidate();
			frame.validate();
		}
		if (e.getActionCommand().equals("sunday")) {
			System.out.println("sunday");
			currDay = "Sunday";
			w1.setDay(currDay);
			cal.insert("Sunday");
			String co = "-1";
			String c = "||    Times Completed   :   " + co + "        ||";
			completed.setText(c);
			String da = cal.getDay();
			String d = "||    Day   :   " + da+"               ||";
			day.setText(d);
			String t = " Leg Day ";
			String ty = "||     Exercise Type   :   " + t +"         ||";
			type.setText(ty);
			String er = "";
			String ertion = er;
			exertion.setText(ertion);
			String currex= "||    Current Exercise   :   ";
			currExercise.setText(currex);
			String r= "||    Repititions   :   ";
			int w = cal.getRep();
			String repit = r+"   " +w+  "   ||";
			repi.setText(repit);
			String weigh=" ||    Weight   :       ||";
			weig.setText(weigh);
			frame.setContentPane(exPanel);
			frame.setSize(1100, 150);
			frame.invalidate();
			frame.validate();
		}
		
		if (e.getActionCommand().equals("edit")) {
			
			frame.setContentPane(panel2); //opens edit select page
			
			frame.invalidate();
			frame.validate();
			frame.setSize(250, 190);
			
			
		}
		
		
		if (e.getActionCommand().equals("confirm")) {
			
				System.out.println("confirm");//gets text from fields when confirm is pressed
				String groupIn = muscle.getText();
				String exIn = exerciseName.getText();
				int repsIn = Integer.parseInt(repititions.getText());
				int weightIn = Integer.parseInt(weightTxt.getText());
				Exercise exerc = cal.getE();
				/*testing get text
				System.out.println(groupIn);
				System.out.println(exIn);
				System.out.println(repsIn);
				System.out.println(weightIn);
				*/
				e1=new Exercise();
				
				e1.setType(groupIn);
				e1.setName(exIn);
				e1.setReps(repsIn);
				e1.setWeight(weightIn);
				try {
					currQue.enqueue(e1);
				} catch (ExerciseQueueFullEmptyException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				frame.setContentPane(editPanel); //opens main menu page
				frame.invalidate();
				frame.validate();
				frame.setSize(800,200);
				
			
			frame.setContentPane(panel); //opens main menu page
			frame.invalidate();
			frame.validate();
			frame.setSize(800,200);
			
			
			
			try {
				System.out.println(currQue.print());
				System.out.println(currQue.size());
			} catch (ExerciseQueueEmptyException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
			
		if (e.getActionCommand().equals("next")) {
			
			Exercise e2 = null;
			try {
				e2 = currQue.dequeue(); 
			} catch (ExerciseQueueEmptyException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			} 
			//applying values to labels from dequeue
			e1.setCompleted(e1.getCompleted()+1) ;
			completed.setText("||    Times Completed   :   " +e2.getCompleted() +  "   || ");
			day.setText("||    Day   :   " + currDay +  "   || ");
			type.setText("||    Exercise Type   :   " +e2.getType() +  "   || ");
			currExercise.setText("||    Current Exercise   :   " +e2.getName() +  "   || ");
;			repi.setText("||    Repititions   :   " +e2.getReps() +  "   || ");	
			weig.setText("||    Weight   :   " +e2.getWeight() +  "   || ");
		}
		

		if (e.getActionCommand().equals("menu")) {
			frame.setContentPane(panel); //opens main menu page
			frame.invalidate();
			frame.validate();
			frame.setSize(800,200);
		}
		//edit day buttons
		if (e.getActionCommand().equals("mondayE")) {
			
			currQue = monQue;
			cal.insert("Monday");
			frame.setContentPane(editPanel); //opens edit page
			frame.invalidate();
			frame.validate();
			frame.setSize(280, 300);
			currEday = "m";
		}
		//edit days buttons
		if (e.getActionCommand().equals("tuesdayE")) {
			currQue = tueQue;
			System.out.println("tuesday");
			cal.insert("Monday");
			frame.setContentPane(editPanel); //opens edit page
			frame.invalidate();
			frame.validate();
			frame.setSize(280, 300);
			
			
		}
		if (e.getActionCommand().equals("wednesdayE")) {
			currQue = wedQue;
			System.out.println("wednesdayE");
			cal.insert("Wednesday");
			frame.setContentPane(editPanel); //opens edit page
			frame.invalidate();
			frame.validate();
			frame.setSize(280, 300);
		}
		if (e.getActionCommand().equals("thursdayE")) {
			currQue = thuQue;
			System.out.println("thursday");
			cal.insert("Thursday");
			frame.setContentPane(editPanel); //opens edit page
			frame.invalidate();
			frame.validate();
			frame.setSize(280, 300);
		}
		if (e.getActionCommand().equals("fridayE")) {
			currQue = friQue;
			System.out.println("friday");
			cal.insert("Friday");
			frame.setContentPane(editPanel); //opens edit page
			frame.invalidate();
			frame.validate();
			frame.setSize(280, 300);
		}
		if (e.getActionCommand().equals("saturdayE")) {
			currQue = satQue;
			System.out.println("saturday");
			cal.insert("Saturday");
			frame.setContentPane(editPanel); //opens edit page
			frame.invalidate();
			frame.validate();
			frame.setSize(280, 300);
		}
		if (e.getActionCommand().equals("sundayE")) {
			currQue = sunQue;
			System.out.println("sunday");
			cal.insert("Sunday");
			
			frame.setContentPane(editPanel); //opens edit page
			frame.invalidate();
			frame.validate();
			frame.setSize(280, 300);
		}
	}

}
