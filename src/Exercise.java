
/**
 * Class to hold exercise information
 * @author Owen Miner
 * @version
 */

public class Exercise {
	private String type;
	private String name;
	private int reps;
	private int weight;
	private int completed;
	
	/**
	 * getters and setters for Exercise
	 * @param paramName
	 * @return
	 */

	public int getCompleted() {
		return completed;
	}
	public void setCompleted(int completed) {
		this.completed = completed;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getReps() {
		return reps;
	}
	public void setReps(int reps) {
		this.reps = reps;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	

}
