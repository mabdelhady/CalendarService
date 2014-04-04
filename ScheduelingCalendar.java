
import java.util.*;

public class ScheduelingCalendar extends ArrayList
{
	public ArrayList toArrayList()
	{
		return (ArrayList) this;
	}

	//public retrieve

	public void update(ScheduelingEvent eve)
	{
		Iterator  iter= this.iterator();

		ScheduelingEvent it_is;

		while (iter.hasNext()  )
		{
			it_is=(ScheduelingEvent)iter.next();

			if(
				(it_is.getTimeInterval() == eve.getTimeInterval())
				&&
				(it_is.getTextDescription() == eve.getTextDescription())
				)

				{
					it_is=eve;

					return ;
				}
		}



	}

}