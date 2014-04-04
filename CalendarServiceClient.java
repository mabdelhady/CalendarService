
// Java core packages
import java.rmi.*;
import java.util.*;

import java.awt.*;
import java.awt.event.*;

// Java extension packages
import javax.swing.*;
public class CalendarServiceClient extends JFrame implements ActionListener // implements MouseListener //implements ActionListener
{
	String user_name="Mohammed";


		  private javax.swing.JButton btnAddEvent;
		  private javax.swing.JButton btnAddUser;
		  private javax.swing.JButton btnDisplayUserCalender;
		  private javax.swing.JButton btnRemoveEvent;
		  private javax.swing.JButton btnRemoveUser;
		  private javax.swing.JButton btnUpdateEvent;
		  private javax.swing.JComboBox cmbAccessControl;
		  private javax.swing.JComboBox cmbUserName;
		  private javax.swing.JLabel jLabel1;
		  private javax.swing.JLabel jLabel2;
		  private javax.swing.JLabel jLabel3;
		  private javax.swing.JLabel jLabel4;
		  private javax.swing.JLabel jLabel5;
		  private javax.swing.JLabel jLabel6;
		  private javax.swing.JLabel jLabel7;
		  private javax.swing.JPanel jPanel1;
		  private javax.swing.JPanel jPanel3;
		  private javax.swing.JButton submitButton;
		  private javax.swing.JPanel timeIntervalPanel;
		  private javax.swing.JTextField txtTextDescription;
		  private javax.swing.JTextField txtTime_From;
   		  private javax.swing.JTextField txtTime_To;


// CalendarServiceClient constructor
public CalendarServiceClient( final String server )
{
//System.out.println("");
super( "RMI CalendarService Client" );

	this.setTitle("User : "+user_name);
 jPanel1 = new javax.swing.JPanel();
         jLabel1 = new javax.swing.JLabel();
         jLabel2 = new javax.swing.JLabel();
         cmbUserName = new javax.swing.JComboBox();
         jLabel3 = new javax.swing.JLabel();
         txtTextDescription = new javax.swing.JTextField();
         jLabel4 = new javax.swing.JLabel();
         cmbAccessControl = new javax.swing.JComboBox();
         timeIntervalPanel = new javax.swing.JPanel();
         jLabel5 = new javax.swing.JLabel();
         jLabel6 = new javax.swing.JLabel();
         txtTime_From = new javax.swing.JTextField();
         jLabel7 = new javax.swing.JLabel();
         txtTime_To = new javax.swing.JTextField();
         btnDisplayUserCalender = new javax.swing.JButton();
         btnAddUser = new javax.swing.JButton();
         btnRemoveUser = new javax.swing.JButton();
         jPanel3 = new javax.swing.JPanel();
         btnAddEvent = new javax.swing.JButton();
         btnRemoveEvent = new javax.swing.JButton();
         btnUpdateEvent = new javax.swing.JButton();
         submitButton = new javax.swing.JButton();

         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
         setTitle("Calendar Tool  For Work Group");
         setLocationByPlatform(true);
         getContentPane().setLayout(null);

         jPanel1.setBackground(new java.awt.Color(255, 255, 255));

         jLabel1.setText("Calendar Tool  For Work Group");

         jLabel2.setText("User Name:");

         jLabel3.setText("Description:");

         jLabel4.setText("Access Control:");

         cmbAccessControl.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Private", "Public" }));

         jLabel5.setText("Time interval");

         jLabel6.setText("From:");

         jLabel7.setText("To:");

         javax.swing.GroupLayout timeIntervalPanelLayout = new javax.swing.GroupLayout(timeIntervalPanel);
         timeIntervalPanel.setLayout(timeIntervalPanelLayout);
         timeIntervalPanelLayout.setHorizontalGroup(
             timeIntervalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timeIntervalPanelLayout.createSequentialGroup()
                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                 .addComponent(jLabel5)
                 .addGap(146, 146, 146))
             .addGroup(timeIntervalPanelLayout.createSequentialGroup()
                 .addGap(30, 30, 30)
                 .addComponent(jLabel6)
                 .addGap(18, 18, 18)
                 .addComponent(txtTime_From, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGap(26, 26, 26)
                 .addComponent(jLabel7)
                 .addGap(18, 18, 18)
                 .addComponent(txtTime_To, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         );
         timeIntervalPanelLayout.setVerticalGroup(
             timeIntervalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(timeIntervalPanelLayout.createSequentialGroup()
                 .addGap(19, 19, 19)
                 .addComponent(jLabel5)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                 .addGroup(timeIntervalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel6)
                     .addComponent(txtTime_From, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel7)
                     .addComponent(txtTime_To, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addContainerGap(39, Short.MAX_VALUE))
         );

         btnDisplayUserCalender.setText("Display User Calendar");

         btnAddUser.setText("Add User");

         btnRemoveUser.setText("Remove User");

         btnAddEvent.setText("Add Event");

         btnRemoveEvent.setText("Remove Event");

         btnUpdateEvent.setText("Update Event");

         submitButton.setText("Update");

         javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
         jPanel3.setLayout(jPanel3Layout);
         jPanel3Layout.setHorizontalGroup(
             jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel3Layout.createSequentialGroup()
                 .addGap(20, 20, 20)
                 .addComponent(btnAddEvent)
                 .addGap(18, 18, 18)
                 .addComponent(btnRemoveEvent)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                 .addComponent(btnUpdateEvent)
                 .addGap(20, 20, 20))
             .addGroup(jPanel3Layout.createSequentialGroup()
                 .addGap(63, 63, 63)
                 .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         );
         jPanel3Layout.setVerticalGroup(
             jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel3Layout.createSequentialGroup()
                 .addContainerGap()
                 .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(btnAddEvent)
                     .addComponent(btnRemoveEvent)
                     .addComponent(btnUpdateEvent))
                 .addGap(18, 18, 18)
                 .addComponent(submitButton)
                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         );

         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
         jPanel1.setLayout(jPanel1Layout);
         jPanel1Layout.setHorizontalGroup(
             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel1Layout.createSequentialGroup()
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                         .addGap(132, 132, 132)
                         .addComponent(jLabel1))
                     .addGroup(jPanel1Layout.createSequentialGroup()
                         .addGap(28, 28, 28)
                         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                     .addComponent(jLabel3)
                                     .addGap(36, 36, 36)
                                     .addComponent(txtTextDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                     .addGap(5, 5, 5))
                                 .addGroup(jPanel1Layout.createSequentialGroup()
                                     .addComponent(jLabel4)
                                     .addGap(23, 23, 23)
                                     .addComponent(cmbAccessControl, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                             .addGroup(jPanel1Layout.createSequentialGroup()
                                 .addComponent(jLabel2)
                                 .addGap(42, 42, 42)
                                 .addComponent(cmbUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                             .addComponent(timeIntervalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                             .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                     .addGroup(jPanel1Layout.createSequentialGroup()
                         .addGap(73, 73, 73)
                         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                             .addGroup(jPanel1Layout.createSequentialGroup()
                                 .addComponent(btnAddUser)
                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                 .addComponent(btnRemoveUser))
                             .addComponent(btnDisplayUserCalender, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                 .addContainerGap(34, Short.MAX_VALUE))
         );
         jPanel1Layout.setVerticalGroup(
             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel1Layout.createSequentialGroup()
                 .addContainerGap()
                 .addComponent(jLabel1)
                 .addGap(27, 27, 27)
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel2)
                     .addComponent(cmbUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGap(18, 18, 18)
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel3)
                     .addComponent(txtTextDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGap(18, 18, 18)
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel4)
                     .addComponent(cmbAccessControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGap(18, 18, 18)
                 .addComponent(timeIntervalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGap(18, 18, 18)
                 .addComponent(btnDisplayUserCalender)
                 .addGap(18, 18, 18)
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(btnAddUser)
                     .addComponent(btnRemoveUser))
                 .addGap(18, 18, 18)
                 .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addContainerGap(41, Short.MAX_VALUE))
         );

         getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 420, 490);





		cmbUserName.addItemListener
						(
							// anonymous inner class to handle JComboBox events
							new ItemListener()
							{
								// handle JComboBox event
								public void itemStateChanged( ItemEvent event )
									{
										// determine whether check box selected
										if ( event.getStateChange() == ItemEvent.SELECTED )
										{
												String ss=cmbUserName.getSelectedItem().toString();
												user_name=ss;
												DisplayUserName();
											}
									}
							} // end anonymous inner class
						); // end call to addItemListener

		btnDisplayUserCalender.addActionListener( this );
		btnAddUser.addActionListener( this );
		btnRemoveUser.addActionListener( this );
		btnAddEvent.addActionListener( this );
		btnRemoveEvent.addActionListener( this );
		btnUpdateEvent.addActionListener( this );
		submitButton.addActionListener( this );





	set_all_users();


} // end ServiceClient constructor

public void actionPerformed( ActionEvent actionEvent )
		{
			// process DisplayUserCalender event
			if ( actionEvent.getSource() == btnDisplayUserCalender )
			DisplayUserCalender("localhost:2020");

			/*
			else if(actionEvent.getSource() == cmbUserName )
			{
				cmbUserName.removeAll();
				set_all_users();

				//JOptionPane.showMessageDialog(null,"hi");
				String ss=cmbUserName.getSelectedItem().toString();

				user_name=ss;
				DisplayUserName();

				//JOptionPane.showMessageDialog(null,user_name);

				//this.setTitle("User : "+ss);

			}
			*/
			else if(actionEvent.getSource() ==  btnDisplayUserCalender )
			{}
			else if(actionEvent.getSource() == btnRemoveUser)
			{
				String his_name=select_user();

				//JOptionPane.showMessageDialog(null,his_name);
				if(his_name !="")
					remove_User(his_name);
			}
			else if(actionEvent.getSource() == btnAddUser)
			{
				add_User(input_user());
			}
			else if(actionEvent.getSource() == btnAddEvent)
			{add_Event();}
			else if(actionEvent.getSource() == btnRemoveEvent)
			{remove_Event();}
			else if(actionEvent.getSource() == btnUpdateEvent)
			{update_Event();}


			// process submitButton event
			/*
			else if ( actionEvent.getSource() == submitButton ) {
			time.setHour(
			Integer.parseInt( actionEvent.getActionCommand() ) );
			hourField.setText( "" );
			}
			*/

		}

void DisplayUserCalender(String server)
{
	// connect to server and get Calendar information
	try {
		// name of remote server object bound to rmi registry
		String remoteName = "rmi://" + server + "/CalendarService";
		// lookup WeatherServiceImpl remote object
		CalendarService calendarService =
		( CalendarService ) Naming.lookup( remoteName );

		System.out.println(calendarService.toString()+"    ji");

		// get Calendar information from server

		ScheduelingCalendar calendarInformation =calendarService.getCalendar(user_name);

		Visualizer vis=new Visualizer("Visualizer");

		vis.show(calendarInformation);

		} // end try
		// handle exception connecting to remote server
		catch ( ConnectException connectionException ) {
		System.err.println( "Connection to server failed. " +
		"Server may be temporarily unavailable." );
		connectionException.printStackTrace();
		}

		// handle exceptions communicating with remote object
		catch ( Exception exception ) {
			exception.printStackTrace();
			//System.out.println("Hi there");
	}
}


void DisplayUserName()//String user_name)
{
	// connect to server and get Calendar information
		try {
			// name of remote server object bound to rmi registry
			String remoteName = "rmi://" + "localhost:2020" + "/CalendarService";
			// lookup WeatherServiceImpl remote object
			CalendarService calendarService =
			( CalendarService ) Naming.lookup( remoteName );

			//System.out.println(calendarService.toString()+"    ji");

			// get Calendar information from server

			boolean is_owner=calendarService.isOwner(user_name);

			if(is_owner)
				this.setTitle("User : "+user_name+" ( Owner )");
			else
				this.setTitle("User : "+user_name);


			} // end try
			// handle exception connecting to remote server
			catch ( ConnectException connectionException ) {
			System.err.println( "Connection to server failed. " +
			"Server may be temporarily unavailable." );
			connectionException.printStackTrace();
			}

			// handle exceptions communicating with remote object
			catch ( Exception exception ) {
				exception.printStackTrace();
				//System.out.println("Hi there");
	}

}

ScheduelingEvent build_event()
{
	return new ScheduelingEvent(//TimeInterval theTimeInterval, String textDescription,String theAccessControl );
			new TimeInterval(this.txtTime_From.getText(),txtTime_To.getText()),
			this.txtTextDescription.getText(),
			this.cmbAccessControl.getSelectedItem().toString());
			}

public void add_Event()
		{
				// connect to server and get Calendar information
					try {
						// name of remote server object bound to rmi registry
						String remoteName = "rmi://" + "localhost:2020" + "/CalendarService";
						// lookup WeatherServiceImpl remote object
						CalendarService calendarService =
						( CalendarService ) Naming.lookup( remoteName );

						//System.out.println(calendarService.toString()+"    ji");

						// get Calendar information from server

						ScheduelingEvent event=build_event();

						if(calendarService.add_Event(user_name,event))
						{


			JOptionPane.showMessageDialog(null,"All ok");
															}
															else
															{
																JOptionPane.showMessageDialog(null,"failed to add " );
				}

						} // end try
						// handle exception connecting to remote server
						catch ( ConnectException connectionException ) {
						System.err.println( "Connection to server failed. " +
						"Server may be temporarily unavailable." );
						connectionException.printStackTrace();
						}

						// handle exceptions communicating with remote object
						catch ( Exception exception ) {
							exception.printStackTrace();
							//System.out.println("Hi there");
				}

		}

	public void remove_Event()
		 {
				// connect to server and get Calendar information
					try {
						// name of remote server object bound to rmi registry
						String remoteName = "rmi://" + "localhost:2020" + "/CalendarService";
						// lookup WeatherServiceImpl remote object
						CalendarService calendarService =
						( CalendarService ) Naming.lookup( remoteName );

						//System.out.println(calendarService.toString()+"    ji");

						ScheduelingEvent event=build_event();


						if(calendarService.remove_Event(user_name,event))
						{
					JOptionPane.showMessageDialog(null,"All ok");
																	}
																	else
																	{
																		JOptionPane.showMessageDialog(null,"failed to rempve " );
					}

						} // end try
						// handle exception connecting to remote server
						catch ( ConnectException connectionException ) {
						System.err.println( "Connection to server failed. " +
						"Server may be temporarily unavailable." );
						connectionException.printStackTrace();
						}

						// handle exceptions communicating with remote object
						catch ( Exception exception ) {
							exception.printStackTrace();
							//System.out.println("Hi there");
				}

		}

	public void update_Event()
		{
				// connect to server and get Calendar information
					try {
						// name of remote server object bound to rmi registry
						String remoteName = "rmi://" + "localhost:2020" + "/CalendarService";
						// lookup WeatherServiceImpl remote object
						CalendarService calendarService =
						( CalendarService ) Naming.lookup( remoteName );

						//System.out.println(calendarService.toString()+"    ji");

						// get Calendar information from server

						ScheduelingEvent event=build_event();

						if(calendarService.update_Event(user_name,event))
						{
							JOptionPane.showMessageDialog(null,"All ok");
																			}
																			else
																			{
																				JOptionPane.showMessageDialog(null,"failed to update" );

									}


						} // end try
						// handle exception connecting to remote server
						catch ( ConnectException connectionException ) {
						System.err.println( "Connection to server failed. " +
						"Server may be temporarily unavailable." );
						connectionException.printStackTrace();
						}

						// handle exceptions communicating with remote object
						catch ( Exception exception ) {
							exception.printStackTrace();
							//System.out.println("Hi there");
				}

		}

	public void add_User(String his_name)
	{
			// connect to server and get Calendar information
				try {
					// name of remote server object bound to rmi registry
					String remoteName = "rmi://" + "localhost:2020" + "/CalendarService";
					// lookup WeatherServiceImpl remote object
					CalendarService calendarService =
					( CalendarService ) Naming.lookup( remoteName );

					//System.out.println(calendarService.toString()+"    ji");

						boolean res=calendarService.add_User(his_name);

					if(res){
													this.cmbUserName.removeAllItems();
													set_all_users();

													JOptionPane.showMessageDialog(null,"All ok");
												}
												else
												{
													JOptionPane.showMessageDialog(null,"failed to add "+his_name );

							}

					} // end try
					// handle exception connecting to remote server
					catch ( ConnectException connectionException ) {
					System.err.println( "Connection to server failed. " +
					"Server may be temporarily unavailable." );
					connectionException.printStackTrace();
					}

					// handle exceptions communicating with remote object
					catch ( Exception exception ) {
						exception.printStackTrace();
						//System.out.println("Hi there");
			}

	}
	public void remove_User(String his_name)
	{
			// connect to server and get Calendar information
				try {
					// name of remote server object bound to rmi registry
					String remoteName = "rmi://" + "localhost:2020" + "/CalendarService";
					// lookup WeatherServiceImpl remote object
					CalendarService calendarService =
					( CalendarService ) Naming.lookup( remoteName );

					//System.out.println(calendarService.toString()+"    ji");

					if(calendarService.isOwner(user_name))
					{
						if(calendarService.isOwner(his_name))
						{
							JOptionPane.showMessageDialog(null,his_name+"\nCannot be removed ;\nHe is the owner !");
						}
						else
						{

							boolean res=calendarService.remove_User(his_name);
							if(res)
							{
								this.cmbUserName.removeAllItems();
								set_all_users();

								JOptionPane.showMessageDialog(null,"All ok");
							}
							else
							{
								JOptionPane.showMessageDialog(null,"failed to remove "+his_name );

							}
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null,"You are not allowed to remove a user" );
					}

					} // end try
					// handle exception connecting to remote server
					catch ( ConnectException connectionException ) {
					System.err.println( "Connection to server failed. " +
					"Server may be temporarily unavailable." );
					connectionException.printStackTrace();
					}

					// handle exceptions communicating with remote object
					catch ( Exception exception ) {
						exception.printStackTrace();
						//System.out.println("Hi there");
			}

	}

String select_user()
{
	// connect to server and get Calendar information
					try {
						// name of remote server object bound to rmi registry
						String remoteName = "rmi://" + "localhost:2020" + "/CalendarService";
						// lookup WeatherServiceImpl remote object
						CalendarService calendarService =
						( CalendarService ) Naming.lookup( remoteName );

						//System.out.println(calendarService.toString()+"    ji");

						ArrayList arr=calendarService.getAllUsers();

						UserChooser userChooser1=new UserChooser();

						return userChooser1.showSelect(arr);

						} // end try
						// handle exception connecting to remote server
						catch ( ConnectException connectionException ) {
						System.err.println( "Connection to server failed. " +
						"Server may be temporarily unavailable." );
						connectionException.printStackTrace();
						}

						// handle exceptions communicating with remote object
						catch ( Exception exception ) {
							exception.printStackTrace();
							//System.out.println("Hi there");
				}

				return "";
}

String input_user()
{
	return JOptionPane.showInputDialog(//Object message,Object initialSelectionValue)
		"Enter User name :",
		"");
}

/*
public void mouseClicked(MouseEvent e)
{}

public void mousePressed(MouseEvent e)
{}

public void mouseReleased(MouseEvent e)
{}

public void mouseEntered(MouseEvent e)
{}

public void mouseExited(MouseEvent e)
{}

*/

public void set_all_users()
{
	//new String[]{this.user_name}

	try {
		// name of remote server object bound to rmi registry
		String remoteName = "rmi://" + "localhost:2020" + "/CalendarService";
		// lookup WeatherServiceImpl remote object
		CalendarService calendarService =
		( CalendarService ) Naming.lookup( remoteName );

		//System.out.println(calendarService.toString()+"    ji");

		// get Calendar information from server

		ArrayList users =calendarService.getAllUsers();

		//int c=users.size();
		//JOptionPane.showMessageDialog(null,c.toString());// "Welcome\nto\nJava\nProgramming!" );

		 this.cmbUserName.removeAll();

		if(users.size()> 0)
		{
			//cmbUserName.addItem();
			//System.out.println("hi");

			//JOptionPane.showMessageDialog(null,"hi");
			//label1.setText("hi");

			Iterator  iter=users.iterator(); for ( ; iter.hasNext() ;) { this.cmbUserName.addItem(iter.next().toString()); }
		}
		else
		{
			//JOptionPane.showMessageDialog(null,"bye");
			//label1.setText("bye");

			//this.cmbUserName.addItem(this.user_name);
		}

		} // end try
		// handle exception connecting to remote server
		catch ( ConnectException connectionException ) {
		System.err.println( "Connection to server failed. " +
		"Server may be temporarily unavailable." );
		connectionException.printStackTrace();
		}

		// handle exceptions communicating with remote object
		catch ( Exception exception ) {
			exception.printStackTrace();
			//System.out.println("Hi there");
	}
}

// execute WeatherServiceClient
public static void main( String args[] )
{


CalendarServiceClient client = null;
// if no sever IP address or host name specified,
// use "localhost:2020"; otherwise use specified host
if ( args.length == 0 )
client = new CalendarServiceClient( "localhost:2020" );
else
client = new CalendarServiceClient( args[ 0 ] );
// configure and display application window
client.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
client.pack();


		client.setSize(425,500);
		client.setResizable( false );
		client.setVisible( true );

		//client.set_all_users();
}
}
