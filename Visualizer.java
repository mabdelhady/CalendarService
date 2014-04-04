
import javax.swing.*;

public class Visualizer extends JFrame
{

	public Visualizer(String text)
	{
		super(text);

		setSize(600,600);
		setResizable( true );
		setVisible( true );

    }

    public void show(java.util.List events)
    {
		// create CalendarListModel
		ListModel calendarListModel =
		new CalendarListModel( events );

		// create JList, set ListCellRenderer and add to layout
		JList calendarJList = new JList( calendarListModel );

		calendarJList.setCellRenderer( new CalendarCellRenderer());

		getContentPane().add(
			new JScrollPane(calendarJList)
		);

		show();
	}


 public void show(ScheduelingCalendar calendar)
    {
		// create CalendarListModel
		ListModel calendarListModel =
		new CalendarListModel( calendar );

		// create JList, set ListCellRenderer and add to layout
		JList calendarJList = new JList( calendarListModel );

		calendarJList.setCellRenderer( new CalendarCellRenderer());

		getContentPane().add(
			new JScrollPane(calendarJList)
		);

		show();
	}


}