import java.io.*;
import java.util.*;
import java.text.*;

public class TimeInterval implements Serializable
{

	private Date From;
	private Date To ;

	public TimeInterval(Date from, Date to)
	{

		if( from.after(to) )
		{
			this.From =to;
	 		this.To =from;
		}
		else
		{
	  		this.From =from;
	 		this.To =to;
  		}
	}


	public TimeInterval(String strFrom, String strTo)
	{
		//DateFormat convertor= DateFormat.getDateTimeInstance (DateFormat.LONG ,DateFormat.LONG);
		MyConvertor convertor=new MyConvertor();

		Date from;
		Date to;

		try
		{
		  from=convertor.parse(strFrom);
		}
		catch( ParseException excep)
		{
			from=new Date ();
		}

		try
		{
		  to=convertor.parse(strTo);
		}
		catch( ParseException excep)
		{
			to=new Date ();
		}

			if( from.after(to) )
			{
				this.From =to;
		 		this.To =from;
			}
			else
			{
		  		this.From =from;
		 		this.To =to;
	  		}
	}


	public boolean contains(TimeInterval other)
	{
		if
		(
			this.From.equals(other.From)
			&&
			this.To.equals(other.To)
		)
		return true;

		if
		(
			this.From.before(other.From)
			&&
			this.To.after(other.To)
		)
		return true;


		return false;
	}

	public boolean intersectsWith(TimeInterval other)
	{
		if(
			is_in_range(this.From, other)
			||
			is_in_range(this.To ,other)

			||
			is_in_range(other.From, this)
						||
			is_in_range(other.To ,this)
			)
			return true;

		return false;
	}

	public Date getFrom()
	{
		return this.From;
	}

	public Date getTo()
	{
			return this.To;
	}

	public String toString()
	{
		return this.From.toString()+" --> "+this.To.toString();
	}


	public static boolean is_in_range(Date point , TimeInterval range)
	{
		if(
			(point.after(range.From)||point.equals(range.From))
			&&
			(point.before(range.To)||point.equals(range.To))
			)
			return true;

			else return false;
	}

}