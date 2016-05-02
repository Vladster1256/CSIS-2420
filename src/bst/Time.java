package bst;

public class Time implements Comparable<Time>
{
	private int hours;
	private int minutes;
	private int seconds;

	public Time(int hours, int minutes, int seconds)
	{
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public String toString()
	{
		return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	}

	public int compareTo(Time o)
	{
		Integer thisTime = hours + (minutes * 24) + (seconds * 24 * 60);
		Integer thatTime = o.hours + (o.minutes * 24) + (o.seconds * 24 * 60);
		return Integer.compare(thisTime, thatTime);
	}

}
