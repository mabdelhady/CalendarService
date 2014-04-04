
import java.io.*;
import java.util.*;
import java.text.*;

public class MyConvertor implements Serializable
{

	public Date parse(String strDateTime)throws ParseException
	{
		int year=105; //- 1900 = 105
		int month=0;  // 0:11
		int date=0;    // 0:30

		int hrs=0;      // 0:23
		int min=0;      //0:59

		try
		{

			String[] them=strDateTime.split("|") ;

			if(them.length ==2)
			{

			String sDATE=them[0].trim();

			String sTIME=them[1].trim();


			//ArrayList arr=new ArrayList(them);

			String dates[]=sDATE.split(",");

			if(dates.length==3)
			{
				year=Integer.parseInt(dates[0].trim());

				if(year < 2005) year=2005;

				month=Integer.parseInt(dates[1].trim());

				if(month >12) month=1;

				date=Integer.parseInt(dates[2].trim());

				if(date > 31) date=1;

			}

			String times[]=sTIME.split(":");

			if(times.length==2)
			{
				hrs=Integer.parseInt(times[0].trim());

				if(hrs >24)
					hrs=1;

				min=Integer.parseInt(times[1].trim());

				if(min>60)	min=1;
			}

		}
			Date result=new Date(year-1900,month-1,date-1,hrs-1,min-1);

			return result;
		}

	catch(Exception exxx)
	{

	}

	throw new ParseException("",0);

	}

}