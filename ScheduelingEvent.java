
// Java core packages
import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.*;
// Java extension packages
import javax.swing.*;


public class ScheduelingEvent implements Serializable
{
private TimeInterval TimeInterval; // Time Interval
private String TextDescription; // Text Description
private String AccessControl; // Access Control


	public boolean contains(ScheduelingEvent other)
	{
		return this.TimeInterval.contains(other.TimeInterval);
	}

	public boolean conflicsWith(ScheduelingEvent other)
	{
		return this.TimeInterval.intersectsWith(other.TimeInterval);
	}

private ImageIcon image; // event image

	public static String PRIVATE ="private";
	public static String PUBLIC ="public";
	public static String GROUP ="group";
	public static String OPEN ="open";


// ScheduelingEvent constructor
public ScheduelingEvent( TimeInterval theTimeInterval, String textDescription,
String theAccessControl )
{
this.TimeInterval = theTimeInterval;
this.TextDescription = textDescription.trim();
this.AccessControl = theAccessControl;

if(this.AccessControl=="")
	this.AccessControl= PRIVATE;

//URL url = new URL( "images/"+description+".jpg" );
String url="images/"+this.AccessControl+".jpg";

//System.out.println("imaging");

// get event image name or noinfo.jpg if AccessControl is ""

image = new ImageIcon( url );

//System.out.println(image.toString());

}
// get Time Interval
public TimeInterval getTimeInterval()
{
return this.TimeInterval;
}
// get Text Description
public String getTextDescription()
{
return this.TextDescription;
}
// get Access Control
public String getAccessControl()
{
return this.AccessControl;
}
// get weather image
public ImageIcon getImage()
{
return image;
}


/*
// set Time Interval
public void setTimeInterval(TimeInterval it)
{
	this.TimeInterval=it;
}
// set Text Description
public void setTextDescription(String it)
{
	this.TextDescription=it;
}
// set Access Control
public void setAccessControl(String it)
{
	this.AccessControl=it;
}
// set weather image
public void setImage(ImageIcon it)
{
	this.image=it;
}

*/


}