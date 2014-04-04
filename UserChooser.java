
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;
import java.io.*;
import java.applet.*;

public class UserChooser implements Serializable
{
	public String showSelect(ArrayList arr)
	{
 				Object[]      message = new Object[3];
                message[0] = "Choose the user from the list below";

                final JLabel lll=new JLabel("<User Name Will be here>");
                message[2] = lll;

                final JComboBox cb = new JComboBox();
                //cb.addItem("component_cb1");
                //cb.addItem("component_cb2");
                //cb.addItem("component_cb3");

                for(int i=0; i<arr.size();i++)
                	cb.addItem(arr.get(i));

				cb.addItemListener
				(
					// anonymous inner class to handle JComboBox events
					new ItemListener()
					{
						// handle JComboBox event
						public void itemStateChanged( ItemEvent event )
							{
								// determine whether check box selected
								if ( event.getStateChange() == ItemEvent.SELECTED )
									lll.setText( cb.getSelectedItem().toString() );
							}
					} // end anonymous inner class
				); // end call to addItemListener

                message[1] = cb;

                //message[3] = "componentmessage2";

		// Options
             String[] options = {
		    "Ok",
		    "Cancel"
		};
            int result = JOptionPane.showOptionDialog(
		    null,                             			// the parent that the dialog blocks
		    message,                                    // the dialog message array
		    "User Chooser", 							// the title of the dialog window
		    JOptionPane.DEFAULT_OPTION,                 // option type
		    JOptionPane.INFORMATION_MESSAGE,            // message type
		    null,                                       // optional icon, use null to use the default icon
		    options,                                    // options string array, will be made into buttons
		    options[0]                                  // option that should be made into a default button
		);

		switch(result) {
		   case 0: // Ok
		   		//JLabel lll= (JLabel)message[2];

		   		String str =lll.getText();

		   		if(str.startsWith("<"))
		   			return "";
		   		else
		   			return lll.getText();

		   case 1: // Cancel
		    	return "";
		   default:
		   		return "";
		}

	}
}