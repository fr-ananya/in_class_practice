package realtimeinterface;

public interface Scheduleable {
	
//	public abstract void schedule(); methods are automatically public and abstract
// void schedule(); instead of schedule fn we have following
	void scheduleMeeting(String meetingDetails);
	boolean isWithinWorkingHours(String meetingDetails);
//	assignment is write logic for engineering class
}
