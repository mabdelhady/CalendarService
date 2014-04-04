
// Java core packages
import java.rmi.*;
import java.util.*;
public interface CalendarService extends Remote
{
// obtain List of ScheduelingCalendar objects from server
public
	Hashtable
	getCalendarInformation() throws RemoteException;

	public
		ScheduelingCalendar
	getCalendar(String user_name) throws RemoteException;

/*
	public void setCalendar(
		String user_name,
		ScheduelingCalendar calender) throws RemoteException;
*/

	public boolean add_Event(
		String user_name,
		ScheduelingEvent event) throws RemoteException;

	public boolean remove_Event(
		String user_name,
		 ScheduelingEvent event) throws RemoteException;

	public boolean update_Event(
		String user_name,
		ScheduelingEvent event) throws RemoteException;

	public boolean add_User(String user_name)throws RemoteException;
	public boolean remove_User(String user_name)throws RemoteException;

	public ArrayList
		getAllUsers() throws RemoteException;

	public boolean
		isOwner(String user_name) throws RemoteException;

}