
// Java core packages
import java.io.*;
import java.net.URL;
import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
import java.rmi.registry.LocateRegistry;

import javax.swing.*;


public class CalendarManager extends UnicastRemoteObject
implements CalendarService
{
private Hashtable calendarInformation; // ScheduelingCalendar object List

// initialize server
public CalendarManager() throws RemoteException
{
super();

init_it();
}

String owner_name="Mohammed";

void init_it()
{
	calendarInformation = new Hashtable(); // create List

	ScheduelingCalendar calendar =new ScheduelingCalendar();

	//ScheduelingEvent event = new ScheduelingEvent
	//(
	//	new TimeInterval("",""),
	//	"Exam du DS",
	//	"private"
	//);
	//calendar.add(event);


		calendar.add
		(
			new ScheduelingEvent
			(
				new TimeInterval
				(
					new Date(105,5,30,15,15)
					,
					new Date(105,5,30,15,30)
				),
				"eating sandwitch",
				"private"
			)
		);

		calendar.add
		(
			new ScheduelingEvent
			(
				new TimeInterval
				(
					new Date(105,5,29,12,01)
					,
					new Date(105,5,29,13,30)
				),
				"praying jomaa",
				"group"
			)
		);
		calendar.add
				(
					new ScheduelingEvent
					(

						new TimeInterval
							(
							//"January 12, 1952 , 3:30:32pm "

							//int year +1900 , int month, int date, int hrs, int min
							new Date(105,5,28,8,30)
							//GregorianCalendar(year + 1900, month, date, hrs,min)
							//GregorianCalendar(105,5,28,8,30)
							,
							//" January 12, 1952 , 3:30:32pm"
							new Date(105,5,28,11,5)
							//GregorianCalendar(105,5,28,8,30)
							),
						"Exam du DS",
						"public"
					)
		);

	calendarInformation.put( owner_name,calendar );


	String another_user_name="Ahmed";

	ScheduelingCalendar anotherCalendar =new ScheduelingCalendar();
	anotherCalendar.add
		(
			new ScheduelingEvent
			(
				new TimeInterval
				(
					new Date(105,5,29,12,01)
					,
					new Date(105,5,29,13,30)
				),
				"praying jomaa",
				"group"
			)
		);

	calendarInformation.put( another_user_name,anotherCalendar );


	System.out.println( "Calendar information initialized." );
}


// implementation for WeatherService interface remote method
public
	Hashtable
	//Object
	getCalendarInformation() throws RemoteException
{
	//System.out.println("You request the data");

	return
	calendarInformation;
	//"123";
}


public ScheduelingCalendar	getCalendar(String user_name) throws RemoteException
	{
		System.out.println("getCalendar");
		if(this.calendarInformation.containsKey(user_name))
			return (ScheduelingCalendar)calendarInformation.get(user_name);


		ScheduelingCalendar calendar =new ScheduelingCalendar();
		calendarInformation.put( owner_name,calendar );

		return calendar;

	}



/*
public void setCalendar(
		String user_name,
		ScheduelingEvent event) throws RemoteException
		{

		}
*/

	public ArrayList
		getAllUsers() throws RemoteException
		{
			ArrayList res=new ArrayList();

			Enumeration  enumer= this.calendarInformation.keys();

			for ( ; enumer.hasMoreElements() ;)
			{
			         res.add(enumer.nextElement());
				 }

			return res;
		}

	public boolean add_Event(
		String user_name,
		ScheduelingEvent event) throws RemoteException
		{
			try
		{
			if(this.calendarInformation.containsKey(user_name))
			{
				do_adding(user_name,event);
				return true;
			}
			else
			{
				ScheduelingCalendar calendar =new ScheduelingCalendar();

				calendar.add(event);

				calendarInformation.put(user_name,calendar);
				return true;

			}
		}
			catch(Exception exxx)
					{

					}

		return false;
		}

	public boolean remove_Event(
		String user_name,
		ScheduelingEvent event) throws RemoteException
		{
			try
		{
			if(this.calendarInformation.containsKey(user_name))
			{
				do_removing(user_name,event);
				return true;
			}
		}
			catch(Exception exxx)
					{

					}

		return false;
		}

	public boolean update_Event(
		String user_name,
		ScheduelingEvent event) throws RemoteException
		{
			try
		{
			if(this.calendarInformation.containsKey(user_name))
				{
					do_updating(user_name,event);
					return true;
				}
				else
				{
					do_adding(user_name,event);
					return true;
			    }
			}
						catch(Exception exxx)
								{

								}

		return false;
		}


	void do_adding(String user_name,ScheduelingEvent event)
	{
		ScheduelingCalendar calendar=(ScheduelingCalendar)calendarInformation.get(user_name);

		calendar.add(event);

		/*
		try
		{
		calendar.add(event);
		}
		catch(Exception exc)
		{
			//throw exc;
		}
		*/
	}

	void do_removing(String user_name,ScheduelingEvent event)
	{
		ScheduelingCalendar calendar=(ScheduelingCalendar)calendarInformation.get(user_name);

		calendar.remove(event);

		/*
		try
		{
		calendar.remove(event);
		}
		catch(Exception exc)
		{
			//throw exc;
		}
		*/
	}

	void do_updating(String user_name,ScheduelingEvent event)
		{
			ScheduelingCalendar calendar=(ScheduelingCalendar)calendarInformation.get(user_name);

			calendar.update(event);

			/*
			try
			{
			calendar.update(event);
			}
			catch(Exception exc)
			{
				//throw exc;
			}
			*/
	}

	public boolean
		isOwner(String user_name) throws RemoteException
		{
			//JOptionPane.showMessageDialog(null,user_name+"   "+owner_name);

			//System.out.println(user_name+"   "+owner_name);

			if(user_name.toUpperCase().equals(owner_name.toUpperCase()))
				return true;
			else
				return false;

		}

	public boolean add_User(String user_name)throws RemoteException
	{
		try
		{
		if(!this.calendarInformation.containsKey(user_name))
		{
		ScheduelingCalendar emptyCalendar =new ScheduelingCalendar();

		calendarInformation.put( user_name,emptyCalendar );

		return true;
		}
		else
		{
			//exist
		}
	}
	catch(Exception exxx)
			{

			}

		return false;
	}

	public boolean remove_User(String user_name)throws RemoteException
	{
		try
		{
		if(this.calendarInformation.containsKey(user_name))
		{
			this.calendarInformation.remove(user_name);
			return true;
		}
		else
		{
			//does not exist
		}

	}
		catch(Exception exxx)
		{

		}

		return false;
	}


// launch CalendarService remote object
public static void main( String args[] ) throws Exception
{
System.out.println( "Initializing CalendarService..." );
// create remote object
CalendarService service = new CalendarManager();
// specify remote object name
LocateRegistry.createRegistry(2020);
String serverObjectName = "rmi://localhost:2020/CalendarService";
// bind WeatherService remote object in RMI registry
Naming.rebind( serverObjectName, service );
System.out.println( "CalendarService running." );
}

}