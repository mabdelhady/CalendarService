
// Java core packages
import java.awt.*;
// Java extension packages
import javax.swing.*;
public class CalendarCellRenderer extends DefaultListCellRenderer {

// returns a MyEventUI object that displays event data
public Component getListCellRendererComponent( JList list,
Object value, int index, boolean isSelected, boolean focus )
{
return new MyEventUI( ( ScheduelingEvent ) value );
}
}