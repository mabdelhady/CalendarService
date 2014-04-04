
 // Java core packages
 import java.awt.*;
 import java.net.*;
 import java.util.*;
 // Java extension packages
import javax.swing.*;


public class MyEventUI extends JPanel
{
private ScheduelingEvent theEvent;
// background ImageIcon
private static ImageIcon backgroundImage;
// static initializer block loads background image when class
// WeatherItem is loaded into memory
static {
// get URL for background image
URL url = MyEventUI.class.getResource( "images/back.jpg" );
// background image for each city's weather info
backgroundImage = new ImageIcon( url );
}
// initialize a MyEventUI
public MyEventUI( ScheduelingEvent event )
{
theEvent = event;
}


// display information for city's weather
public void paintComponent( Graphics g )
{
super.paintComponent( g );
// draw background
backgroundImage.paintIcon( this, g, 0, 0 );

// set font and drawing color,
// then display Time Interval , Text Description and Access Control
Font font = new Font( "SansSerif", Font.BOLD, 12 );
g.setFont( font );

// display the Event image
//theEvent.getImage().paintIcon( this, g, 253, 1 );
theEvent.getImage().paintIcon( this, g, 19, 10);

//g.setColor( Color.white );
//g.drawString( theEvent.getTimeInterval().toString(), 19, 10 );
//g.drawString( theEvent.getTextDescription(), 19, 50 );
//g.drawString( theEvent.getAccessControl(), 19, 90 );

g.setColor( Color.red );
g.drawString( theEvent.getAccessControl(), 140, 30 );

g.setColor( Color.blue );
g.drawString( theEvent.getTimeInterval().toString(), 140, 65 );

g.setColor( Color.blue );
g.drawString( theEvent.getTextDescription(), 140, 100 );



} // end method paintComponent

// make MyEventUI's preferred size the width and height of
// the background image
public Dimension getPreferredSize()
{
return new Dimension( backgroundImage.getIconWidth(),
backgroundImage.getIconHeight() );
}
}