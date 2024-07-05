package realtimeinterface;

public class Schedule {
	
	private String meetingDetails;

	public Schedule(String meetingDetails) {
		
		this.meetingDetails = meetingDetails;
	}

	public String getMeetingDetails() {
		return meetingDetails;
	}

	public void setMeetingDetails(String meetingDetails) {
		this.meetingDetails = meetingDetails;
	}
	
	
	public void printSchedule() {
		System.out.println("Scheduled meeting: "+ meetingDetails);
	}
	
	
}
