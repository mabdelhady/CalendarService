
// Java core packages
import java.util.*;
// Java extension packages
import javax.swing.AbstractListModel;


public class CalendarListModel extends AbstractListModel {
// List of elements in ListModel
private List list;
// no-argument CalendarListModel constructor
public CalendarListModel()
{
// create new List for ScheduelingEvent
list = new ArrayList();
}

// CalendarListModel constructor
public CalendarListModel( List elementList )
{
list = elementList;
}

// CalendarListModel constructor
public CalendarListModel( ScheduelingCalendar calendar )
{
list = calendar.toArrayList();
}

// get size of List
public int getSize()
{
return list.size();
}
// get Object reference to element at given index
public Object getElementAt( int index )
{
return list.get( index );
}
// add element to CalendarListModel
public void add( Object element )
{
list.add( element );
fireIntervalAdded( this, list.size(), list.size() );
}
// remove element from CalendarListModel
public void remove( Object element )
{
int index = list.indexOf( element );
if ( index != -1 ) {
list.remove( element );
fireIntervalRemoved( this, index, index );
}
} // end method remove
// remove all elements from CalendarListModel
public void clear()
{
// get original size of List
int size = list.size();
// clear all elements from List
list.clear();
// notify listeners that content changed
fireContentsChanged( this, 0, size );
}

}