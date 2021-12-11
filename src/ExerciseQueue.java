
/**
 * Queue to hold each days exercises
 * @author Owen Miner
 * @version
 */

public class ExerciseQueue {
	private int head;
	private int tail;
	private int size;
	private int maxSize;
	private Exercise exercises[];
	
	/**
	 *constructor to start new queue
	 */

	public ExerciseQueue() {
		this.size = 0;
		this.maxSize = 5;
		this.head =0;
		this.tail = 0;
		this.exercises = new Exercise[maxSize];
	}
	/**
	 * returns how many items are in the queue
	 * @param paramName
	 * @return
	 */

	public int size() {
		return size;
	}
	/**
	 * Returns if queue is full or not
	 * @param paramName
	 * @return
	 */

	public boolean isFull() {
		return (size() == maxSize);
		
	}
	/**
	 * returns if items are in queue or not
	 * @param paramName
	 * @return
	 */

	public boolean isEmpty() {
		return (size() == 0);
	}
	/**
	 * returns item at head of queue
	 * @param paramName
	 * @return
	 */

	public Exercise peek() throws ExerciseQueueEmptyException{
		if(!isEmpty()) {
			return exercises[head];
		}else {
			throw new ExerciseQueueEmptyException();
		}
	}
	/**
	 * adds item to queue
	 * @param paramName
	 * @return
	 */

	public void enqueue(Exercise exercise) throws ExerciseQueueFullEmptyException{
		if(!isFull()) {
			exercises[tail] = exercise;
			tail++;
			size++;
		}else {
			throw new ExerciseQueueFullEmptyException();
		}
		
		
	}
	/**
	 * removes item at head of queue
	 * @param paramName
	 * @return
	 */

	public Exercise dequeue() throws ExerciseQueueEmptyException{
		if(!isEmpty()) {
			Exercise out = exercises[head];
			for(int i = 0; i < tail -1; i++) {
				exercises[i] = exercises [i+1];
			}
			size--;
			tail--;
			return out;
		}else {
			throw new ExerciseQueueEmptyException();
		}
		
		
	}
	/**
	 * Prints items in queue
	 * @param paramName
	 * @return
	 */

	public String print() throws ExerciseQueueEmptyException{
		String out = new String();
		if(!isEmpty()) {
			for (int i = head; i < tail; i++) {
				out = out + " " + exercises[i].getName();
			}
			return out;
			
		}else {
			throw new ExerciseQueueEmptyException();
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
}
