package calc;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = -6875824872680525637L;
	
	Container c ;
	SpringLayout sp ;
	JLabel la ;
	JLabel m ;
	JButton k_1 ;
	JButton k_2 ;
	JButton k_3 ;
	JButton k_4 ;
	JButton k_5 ;
	JButton k_6 ;
	JButton k_7 ;
	JButton k_8 ;
	JButton k_9 ;
	JButton k_0 ;
	JButton dot ;
	JButton plus ;
	JButton min ;
	JButton multi ;
	JButton divide ;
	JButton pow ;
	JButton sqrt ;
	JButton result ;
	JButton clear ;
	JButton mr ;
	JButton mc ;
	JButton mp ;
	JButton mm ;
	JButton back ;
	double result_num ;
	int counter = 0 ;
	boolean bool = false ;
	double mem = 0 ;
	int find = 0 ;
	boolean doub = false ;
	
	void DrawCalc() {
		
		setTitle( "JCalculator" ) ;
		setLocation( 500 , 400 ) ;
		setPreferredSize( new Dimension( 475 , 570 ) ) ;
		
		////////////////////////////////////////////////////////////////////////////
		
		c = getContentPane() ;
		
		////////////////////////////////////////////////////////////////////////////
		
		sp = new SpringLayout() ;
		
		////////////////////////////////////////////////////////////////////////////
		
		setLayout( sp ) ;
		c.setBackground( Color.GRAY ) ;
		setResizable( false ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Labels
		
		la = new JLabel("0") ;
		c.add( la ) ;
		la.setForeground( Color.CYAN ) ;
		la.setFont( new Font( "OCR A Extended" , Font.BOLD , 20 ) ) ;
		
		m = new JLabel("") ;
		c.add( m ) ;
		m.setFont( new Font( "" , Font.BOLD , 19 ) ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Buttons
		
		k_1 = new JButton( "1" ) ;
		c.add( k_1 ) ;
		k_1.setFont( new Font( "OCR A Extended" , Font.BOLD , 20 ) ) ;
				
		k_2 = new JButton( "2" ) ;
		c.add( k_2 ) ;
		k_2.setFont( new Font( "OCR A Extended" , Font.BOLD , 20 ) ) ;
		
		k_3 = new JButton( "3" ) ;
		c.add( k_3 ) ;
		k_3.setFont( new Font( "OCR A Extended" , Font.BOLD , 20 ) ) ;
		
		k_4 = new JButton( "4" ) ;
		c.add( k_4 ) ;
		k_4.setFont( new Font( "OCR A Extended" , Font.BOLD , 20 ) ) ;
		
		k_5 = new JButton( "5" ) ;
		c.add( k_5 ) ;
		k_5.setFont( new Font( "OCR A Extended" , Font.BOLD , 20 ) ) ;
		
		k_6 = new JButton( "6" ) ;
		c.add( k_6 ) ;
		k_6.setFont( new Font( "OCR A Extended" , Font.BOLD , 20 ) ) ;
		
		k_7 = new JButton( "7" ) ;
		c.add( k_7 ) ;
		k_7.setFont( new Font( "OCR A Extended" , Font.BOLD , 20 ) ) ;
		
		k_8 = new JButton( "8" ) ;
		c.add( k_8 ) ;
		k_8.setFont( new Font( "OCR A Extended" , Font.BOLD , 20 ) ) ;
		
		k_9 = new JButton( "9" ) ;
		c.add( k_9 ) ;
		k_9.setFont( new Font( "OCR A Extended" , Font.BOLD , 20 ) ) ;
		
		k_0 = new JButton( "0" ) ;
		c.add( k_0 ) ;
		k_0.setFont( new Font( "OCR A Extended" , Font.BOLD , 20 ) ) ;
		
		dot = new JButton( "." ) ;
		c.add( dot ) ;
		dot.setFont( new Font( "OCR A Extended" , Font.BOLD , 20 ) ) ;
		
		plus = new JButton( "+" ) ;
		c.add( plus ) ;
		plus.setFont( new Font( "OCR A Extended" , 0 , 20 ) ) ;
		
		min = new JButton( "-" ) ;
		c.add( min ) ;
		min.setFont( new Font( "OCR A Extended" , 0 , 20 ) ) ;
		
		multi = new JButton( "*" ) ;
		c.add( multi ) ;
		multi.setFont( new Font( "OCR A Extended" , 0 , 15 ) ) ;
		
		divide = new JButton( "/" ) ;
		c.add( divide ) ;
		divide.setFont( new Font( "OCR A Extended" , 0 , 20 ) ) ;
		
		pow = new JButton( "^" ) ;
		c.add( pow ) ;
		pow.setFont( new Font( "OCR A Extended" , 0 , 20 ) ) ;
		
		sqrt = new JButton("v-") ;
		c.add( sqrt ) ;
		sqrt.setFont( new Font( "OCR A Extended" , 0 , 20 ) ) ;
		
		result = new JButton( "=" ) ;
		c.add( result ) ;
		result.setFont( new Font( "OCR A Extended" , 0 , 15 ) ) ;
		
		clear = new JButton( "Clear" ) ;
		c.add( clear ) ;
		clear.setFont( new Font( "" , 0 , 15 ) ) ;
		
		mr = new JButton( "MR" ) ;
		c.add( mr ) ;
		mr.setFont( new Font( "" , 0 , 15 ) ) ;
		
		mc = new JButton( "MC" ) ;
		c.add( mc ) ;
		mc.setFont( new Font( "" , 0 , 15 ) ) ;
		
		mp = new JButton( "M+" ) ;
		c.add( mp ) ;
		mp.setFont( new Font( "" , 0 , 15 ) ) ;
		
		mm = new JButton( "M-" ) ;
		c.add( mm ) ;
		mm.setFont( new Font( "" , 0 , 15 ) ) ;
		
		back = new JButton( "BkSp" ) ;
		c.add( back ) ;
		back.setFont( new Font( "" , 0 , 15 ) ) ;
		
		setFocusable(true);
		
		////////////////////////////////////////////////////////////////////////////
		//Labels
		
		sp.putConstraint( SpringLayout.WEST , la , 20 , SpringLayout.WEST , c ) ;
		sp.putConstraint( SpringLayout.EAST , la , 425 , SpringLayout.WEST , la ) ;
		sp.putConstraint( SpringLayout.NORTH , la , 20 , SpringLayout.NORTH , c ) ;
		sp.putConstraint( SpringLayout.SOUTH , la , 20 , SpringLayout.NORTH , la ) ;
		
		sp.putConstraint( SpringLayout.WEST , m , 45 , SpringLayout.EAST , pow ) ;
		sp.putConstraint( SpringLayout.NORTH , m , 41 , SpringLayout.SOUTH , la ) ;
		sp.putConstraint( SpringLayout.SOUTH , m , 20 , SpringLayout.NORTH , m ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Buttons
		
		sp.putConstraint( SpringLayout.WEST , k_1 , 20 , SpringLayout.WEST , c ) ;
		sp.putConstraint( SpringLayout.EAST , k_1 , 70 , SpringLayout.WEST , k_1 ) ;
		sp.putConstraint( SpringLayout.NORTH , k_1 , 20 , SpringLayout.SOUTH , back ) ;
		sp.putConstraint( SpringLayout.SOUTH , k_1 , 70 , SpringLayout.NORTH , k_1 ) ;
		
		sp.putConstraint( SpringLayout.WEST , k_2 , 90 , SpringLayout.WEST , k_1 ) ;
		sp.putConstraint( SpringLayout.EAST , k_2 , 70 , SpringLayout.WEST , k_2 ) ;
		sp.putConstraint( SpringLayout.NORTH , k_2 , 20 , SpringLayout.SOUTH , clear ) ;
		sp.putConstraint( SpringLayout.SOUTH , k_2 , 70 , SpringLayout.NORTH , k_2 ) ;
		
		sp.putConstraint( SpringLayout.WEST , k_3 , 90 , SpringLayout.WEST , k_2 ) ;
		sp.putConstraint( SpringLayout.EAST , k_3 , 70 , SpringLayout.WEST , k_3 ) ;
		sp.putConstraint( SpringLayout.NORTH , k_3 , 20 , SpringLayout.SOUTH , sqrt ) ;
		sp.putConstraint( SpringLayout.SOUTH , k_3 , 70 , SpringLayout.NORTH , k_3 ) ;
		
		sp.putConstraint( SpringLayout.WEST , k_4 , 20 , SpringLayout.WEST , c ) ;
		sp.putConstraint( SpringLayout.EAST , k_4 , 70 , SpringLayout.WEST , k_4 ) ;
		sp.putConstraint( SpringLayout.NORTH , k_4 , 20 , SpringLayout.SOUTH , k_1 ) ;
		sp.putConstraint( SpringLayout.SOUTH , k_4 , 70 , SpringLayout.NORTH , k_4 ) ;
		
		sp.putConstraint( SpringLayout.WEST , k_5 , 90 , SpringLayout.WEST , k_4 ) ;
		sp.putConstraint( SpringLayout.EAST , k_5 , 70 , SpringLayout.WEST , k_5 ) ;
		sp.putConstraint( SpringLayout.NORTH , k_5 , 20 , SpringLayout.SOUTH , k_2 ) ;
		sp.putConstraint( SpringLayout.SOUTH , k_5 , 70 , SpringLayout.NORTH , k_5 ) ;
		
		sp.putConstraint( SpringLayout.WEST , k_6 , 90 , SpringLayout.WEST , k_5 ) ;
		sp.putConstraint( SpringLayout.EAST , k_6 , 70 , SpringLayout.WEST , k_6 ) ;
		sp.putConstraint( SpringLayout.NORTH , k_6 , 20 , SpringLayout.SOUTH , k_3 ) ;
		sp.putConstraint( SpringLayout.SOUTH , k_6 , 70 , SpringLayout.NORTH , k_6 ) ;
		
		sp.putConstraint( SpringLayout.WEST , k_7 , 20 , SpringLayout.WEST , c ) ;
		sp.putConstraint( SpringLayout.EAST , k_7 , 70 , SpringLayout.WEST , k_7 ) ;
		sp.putConstraint( SpringLayout.NORTH , k_7 , 20 , SpringLayout.SOUTH , k_4 ) ;
		sp.putConstraint( SpringLayout.SOUTH , k_7 , 70 , SpringLayout.NORTH , k_7 ) ;
		
		sp.putConstraint( SpringLayout.WEST , k_8 , 90 , SpringLayout.WEST , k_7 ) ;
		sp.putConstraint( SpringLayout.EAST , k_8 , 70 , SpringLayout.WEST , k_8 ) ;
		sp.putConstraint( SpringLayout.NORTH , k_8 , 20 , SpringLayout.SOUTH , k_5 ) ;
		sp.putConstraint( SpringLayout.SOUTH , k_8 , 70 , SpringLayout.NORTH , k_8 ) ;
		
		sp.putConstraint( SpringLayout.WEST , k_9 , 90 , SpringLayout.WEST , k_8 ) ;
		sp.putConstraint( SpringLayout.EAST , k_9 , 70 , SpringLayout.WEST , k_9 ) ;
		sp.putConstraint( SpringLayout.NORTH , k_9 , 20 , SpringLayout.SOUTH , k_6 ) ;
		sp.putConstraint( SpringLayout.SOUTH , k_9 , 70 , SpringLayout.NORTH , k_9 ) ;
		
		sp.putConstraint( SpringLayout.WEST , k_0 , 90 , SpringLayout.WEST , dot ) ;
		sp.putConstraint( SpringLayout.EAST , k_0 , 70 , SpringLayout.WEST , k_0 ) ;
		sp.putConstraint( SpringLayout.NORTH , k_0 , 20 , SpringLayout.SOUTH , k_8 ) ;
		sp.putConstraint( SpringLayout.SOUTH , k_0 , 70 , SpringLayout.NORTH , k_0 ) ;
		
		sp.putConstraint( SpringLayout.WEST , plus , 90 , SpringLayout.WEST , k_3 ) ;
		sp.putConstraint( SpringLayout.EAST , plus , 70 , SpringLayout.WEST , plus ) ;
		sp.putConstraint( SpringLayout.NORTH , plus , 20 , SpringLayout.SOUTH , pow ) ;
		sp.putConstraint( SpringLayout.SOUTH , plus , 70 , SpringLayout.NORTH , plus ) ;
		
		sp.putConstraint( SpringLayout.WEST , min , 90 , SpringLayout.WEST , k_6 ) ;
		sp.putConstraint( SpringLayout.EAST , min , 70 , SpringLayout.WEST , min ) ;
		sp.putConstraint( SpringLayout.NORTH , min , 20 , SpringLayout.SOUTH , plus ) ;
		sp.putConstraint( SpringLayout.SOUTH , min , 70 , SpringLayout.NORTH , min ) ;
		
		sp.putConstraint( SpringLayout.WEST , multi , 90 , SpringLayout.WEST , k_9 ) ;
		sp.putConstraint( SpringLayout.EAST , multi , 70 , SpringLayout.WEST , multi ) ;
		sp.putConstraint( SpringLayout.NORTH , multi , 20 , SpringLayout.SOUTH , min ) ;
		sp.putConstraint( SpringLayout.SOUTH , multi , 70 , SpringLayout.NORTH , multi ) ;
		
		sp.putConstraint( SpringLayout.WEST , divide , 90 , SpringLayout.WEST , result ) ;
		sp.putConstraint( SpringLayout.EAST , divide , 70 , SpringLayout.WEST , divide ) ;
		sp.putConstraint( SpringLayout.NORTH , divide , 20 , SpringLayout.SOUTH , multi ) ;
		sp.putConstraint( SpringLayout.SOUTH , divide , 70 , SpringLayout.NORTH , divide ) ;
		
		sp.putConstraint( SpringLayout.WEST , pow , 20 , SpringLayout.EAST , sqrt ) ;
		sp.putConstraint( SpringLayout.EAST , pow , 70 , SpringLayout.WEST , pow ) ;
		sp.putConstraint( SpringLayout.NORTH , pow , 20 , SpringLayout.SOUTH , la ) ;
		sp.putConstraint( SpringLayout.SOUTH , pow , 70 , SpringLayout.NORTH , pow ) ;
		
		sp.putConstraint( SpringLayout.WEST , sqrt , 20 , SpringLayout.EAST , clear ) ;
		sp.putConstraint( SpringLayout.EAST , sqrt , 70 , SpringLayout.WEST , sqrt ) ;
		sp.putConstraint( SpringLayout.NORTH , sqrt , 20 , SpringLayout.SOUTH , la ) ;
		sp.putConstraint( SpringLayout.SOUTH , sqrt , 70 , SpringLayout.NORTH , sqrt ) ;
		
		sp.putConstraint( SpringLayout.WEST , result , 90 , SpringLayout.WEST , k_0 ) ;
		sp.putConstraint( SpringLayout.EAST , result , 70 , SpringLayout.WEST , result ) ;
		sp.putConstraint( SpringLayout.NORTH , result , 20 , SpringLayout.SOUTH , k_9 ) ;
		sp.putConstraint( SpringLayout.SOUTH , result , 70 , SpringLayout.NORTH , result ) ;
		
		sp.putConstraint( SpringLayout.WEST , dot , 20 , SpringLayout.WEST , c ) ;
		sp.putConstraint( SpringLayout.EAST , dot , 70 , SpringLayout.WEST , dot ) ;
		sp.putConstraint( SpringLayout.NORTH , dot , 20 , SpringLayout.SOUTH , k_7 ) ;
		sp.putConstraint( SpringLayout.SOUTH , dot , 70 , SpringLayout.NORTH , dot ) ;
		
		sp.putConstraint( SpringLayout.WEST , clear , 20 , SpringLayout.EAST , back ) ;
		sp.putConstraint( SpringLayout.EAST , clear , 70 , SpringLayout.WEST , clear ) ;
		sp.putConstraint( SpringLayout.NORTH , clear , 20 , SpringLayout.SOUTH , la ) ;
		sp.putConstraint( SpringLayout.SOUTH , clear , 70 , SpringLayout.NORTH , clear ) ;
		
		sp.putConstraint( SpringLayout.WEST , mp , 90 , SpringLayout.WEST , plus ) ;
		sp.putConstraint( SpringLayout.EAST , mp , 70 , SpringLayout.WEST , mp ) ;
		sp.putConstraint( SpringLayout.NORTH , mp , 50 , SpringLayout.SOUTH , m ) ;
		sp.putConstraint( SpringLayout.SOUTH , mp , 70 , SpringLayout.NORTH , mp ) ;
		
		sp.putConstraint( SpringLayout.WEST , mm , 90 , SpringLayout.WEST , min ) ;
		sp.putConstraint( SpringLayout.EAST , mm , 70 , SpringLayout.WEST , mm ) ;
		sp.putConstraint( SpringLayout.NORTH , mm , 20 , SpringLayout.SOUTH , mp ) ;
		sp.putConstraint( SpringLayout.SOUTH , mm , 70 , SpringLayout.NORTH , mm ) ;
		
		sp.putConstraint( SpringLayout.WEST , mr , 90 , SpringLayout.WEST , multi ) ;
		sp.putConstraint( SpringLayout.EAST , mr , 70 , SpringLayout.WEST , mr ) ;
		sp.putConstraint( SpringLayout.NORTH , mr , 20 , SpringLayout.SOUTH , mm ) ;
		sp.putConstraint( SpringLayout.SOUTH , mr , 70 , SpringLayout.NORTH , mr ) ;
		
		sp.putConstraint( SpringLayout.WEST , mc , 90 , SpringLayout.WEST , divide ) ;
		sp.putConstraint( SpringLayout.EAST , mc , 70 , SpringLayout.WEST , mc ) ;
		sp.putConstraint( SpringLayout.NORTH , mc , 20 , SpringLayout.SOUTH , mr ) ;
		sp.putConstraint( SpringLayout.SOUTH , mc , 70 , SpringLayout.NORTH , mc ) ;
		
		sp.putConstraint( SpringLayout.WEST , back , 20 , SpringLayout.WEST , c ) ;
		sp.putConstraint( SpringLayout.EAST , back , 70 , SpringLayout.WEST , back ) ;
		sp.putConstraint( SpringLayout.NORTH , back , 20 , SpringLayout.SOUTH , la ) ;
		sp.putConstraint( SpringLayout.SOUTH , back , 70 , SpringLayout.NORTH , back ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key 1
		
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == KeyEvent.VK_1){
		            
					if ( bool ) {
						
						la.setText( "0" ) ;
						result_num = 0 ;
						bool = false ;
						
					}
					
					if ( la.getText().substring( 0 , 1 ) == "0" ) {
						
						la.setText( "" ) ;
						
					}
				
					la.setText( la.getText() + "1" ) ;
					
		         }
			}
		});
		
		k_1.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) { }
			public void mousePressed(MouseEvent arg0) { }
			public void mouseExited(MouseEvent arg0) { }
			public void mouseEntered(MouseEvent arg0) { }
			public void mouseClicked(MouseEvent arg0) { 
				
				if ( bool ) {
					
					la.setText( "0" ) ;
					result_num = 0 ;
					bool = false ;
					
				}
				
				if ( la.getText().substring( 0 , 1 ) == "0" ) {
					
					la.setText( "" ) ;
					
				}
			
				la.setText( la.getText() + "1" ) ;
			
			}
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key 2
		
		k_2.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
				
				if ( bool ) {
					
					la.setText( "0" ) ;
					result_num = 0 ;
					bool = false ;
					
				}
				
				if ( la.getText().substring( 0 , 1 ) == "0" ) {
					
					la.setText( "" ) ;
					
				}
			
				la.setText( la.getText() + "2" ) ;
			
			}
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key 3
		
		k_3.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
				
				if ( bool ) {
					
					la.setText( "0" ) ;
					result_num = 0 ;
					bool = false ;
					
				}
				
				if ( la.getText().substring( 0 , 1 ) == "0" ) {
					
					la.setText( "" ) ;
					
				}
			
				la.setText( la.getText() + "3" ) ;
			
			}
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key 4
		
		k_4.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
				
				if ( bool ) {
					
					la.setText( "0" ) ;
					result_num = 0 ;
					bool = false ;
					
				}
				
				if ( la.getText().substring( 0 , 1 ) == "0" ) {
					
					la.setText( "" ) ;
					
				}
			
				la.setText( la.getText() + "4" ) ;
			
			}
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key 5
		
		k_5.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
				
				if ( bool ) {
					
					la.setText( "0" ) ;
					result_num = 0 ;
					bool = false ;
					
				}
				
				if ( la.getText().substring( 0 , 1 ) == "0" ) {
					
					la.setText( "" ) ;
					
				}
			
				la.setText( la.getText() + "5" ) ;
			
			}
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key 6
		
		k_6.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
				
				if ( bool ) {
					
					la.setText( "0" ) ;
					result_num = 0 ;
					bool = false ;
					
				}
				
				if ( la.getText().substring( 0 , 1 ) == "0" ) {
					
					la.setText( "" ) ;
					
				}
			
				la.setText( la.getText() + "6" ) ;
			
			}
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key 7
		
		k_7.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
				
				if ( bool ) {
					
					la.setText( "0" ) ;
					result_num = 0 ;
					bool = false ;
					
				}
				
				if ( la.getText().substring( 0 , 1 ) == "0" ) {
					
					la.setText( "" ) ;
					
				}
			
				la.setText( la.getText() + "7" ) ;
			
			}
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key 8
		
		k_8.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
				
				if ( bool ) {
					
					la.setText( "0" ) ;
					result_num = 0 ;
					bool = false ;
					
				}
				
				if ( la.getText().substring( 0 , 1 ) == "0" ) {
					
					la.setText( "" ) ;
					
				}
			
				la.setText( la.getText() + "8" ) ;
			
			}
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key 9
		
		k_9.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
				
				if ( bool ) {
					
					la.setText( "0" ) ;
					result_num = 0 ;
					bool = false ;
					
				}
				
				if ( la.getText().substring( 0 , 1 ) == "0" ) {
					
					la.setText( "" ) ;
					
				}
			
				la.setText( la.getText() + "9" ) ;
			
			}
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key 0
		
		k_0.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
				
				if ( bool ) {
					
					la.setText( "0" ) ;
					result_num = 0 ;
					bool = false ;
					
				}
				
				if ( la.getText().substring( 0 , 1 ) == "0" ) {
					
					la.setText( "" ) ;
					
				}
			
				la.setText( la.getText() + "0" ) ;
			
			}
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key .
		
		dot.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
				
				if ( bool ) {
					
					la.setText( "0" ) ;
					result_num = 0 ;
					bool = false ;
					
				}
				
				la.setText( la.getText() + "." ) ;
			
			}
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key +
		
		plus.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
				
				if ( la.getText().indexOf( " " ) == -1 ) {
					
					doub = true ;
					
				}
				
				if ( doub ) {
					
					la.setText( la.getText() + " + " ) ;
					doub = false ;
					
				}
			
			}
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key -
		
		min.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
			
				if ( la.getText().indexOf( " " ) == -1 ) {
					
					doub = true ;
					
				}
				
				if ( doub ) {
					
					la.setText( la.getText() + " - " ) ;
					doub = false ;
					
				}
			
			}
			
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key *
		
		multi.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
			
				if ( la.getText().indexOf( " " ) == -1 ) {
					
					doub = true ;
					
				}
				
				if ( doub ) {
					
					la.setText( la.getText() + " * " ) ;
					doub = false ;
					
				}
			
			}
			
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key /
		
		divide.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
			
				if ( la.getText().indexOf( " " ) == -1 ) {
					
					doub = true ;
					
				}
				
				if ( doub ) {
					
					la.setText( la.getText() + " / " ) ;
					doub = false ;
					
				}
			
			}
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key ^
		
		pow.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
				
				if ( la.getText().indexOf( " " ) == -1 ) {
					
					doub = true ;
					
				}
				
				if ( doub ) {
					
					la.setText( la.getText() + " ^ " ) ;
					doub = false ;
					
				}
			
			}
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key √
		
		sqrt.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
			
				String first_s = new String( ) ;
				
				int i = la.getText().indexOf( " " ) ;
				
				if ( i == -1 ) {
					
					
					first_s = la.getText().substring( 0 ) ;
					Double first = new Double( Double.parseDouble( first_s ) ) ;
					result_num = Math.sqrt( first ) ;
					la.setText( result_num + "" ) ;
					
				}
				
				else {
					
					int j = la.getText().indexOf( " " , i+3 ) ;
					
					if ( j == -1 ) {
						
						first_s = la.getText().substring( i+2 ) ;
						Double first = new Double( Double.parseDouble( first_s ) ) ;
						result_num = Math.sqrt( first ) ;
						System.out.println( result_num ) ;
						System.out.println( la.getText().substring( 0 , i ) ) ;
						la.setText( la.getText().substring( 0 , i+3 ) + result_num ) ;
						
					}
					
					else {
						
						first_s = la.getText().substring( j+2 ) ;
						Double first = new Double( Double.parseDouble( first_s ) ) ;
						result_num = Math.sqrt( first ) ;
						la.setText( result_num + "" ) ;
						
					}
					
				}
				
			}
			
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key Result
		
		result.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
				
				for ( int i = 0 ; i < la.getText().length() ; i++ ) {
					
					if ( la.getText().charAt(i) == ' ' ) {
						
						if ( counter == 0 ) {
							
							counter++ ;
							
							bool = true ;
							
							String first_s = new String( ) ;
							first_s = la.getText().substring( 0 , i ) ;
							Double first = new Double( Double.parseDouble( first_s ) ) ;
							
							String second_s = new String( ) ;
							second_s = la.getText().substring( i+3 ) ;
							Double second = new Double( Double.parseDouble( second_s ) ) ;
							
							if ( la.getText().substring( i , i+3 ).equals( " + " ) ) {
								
								result_num = first + second ;
								
							}
							
							else if ( la.getText().substring( i , i+3 ).equals( " - " ) ) {
								
								result_num = first - second ;
								
							}
							
							else if ( la.getText().substring( i , i+3 ).equals( " * " ) ) {
								
								result_num = first * second ;
								
							}
							
							else if ( la.getText().substring( i , i+3 ).equals( " / " ) ) {
								
								result_num = first / second ;
								
							}
							
							else if ( la.getText().substring( i , i+3 ).equals( " ^ " ) ) {
								
								result_num = Math.pow( first , second ) ;
								
							}
							
							else if ( la.getText().substring( i , i+3 ).equals( " √ " ) ) {
								
								result_num = Math.sqrt( first ) ;
								
							}
							
						}
						
						else {
							
							counter = 0 ;
							
						}
							
					}
					
				}
				
				la.setText( la.getText() + " = " + result_num ) ;
				
			}
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key Clear
		
		clear.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
			
				la.setText( "0" ) ;
				result_num = 0 ;
			
			}
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key M+
		
		mp.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {}
			public void mouseClicked(MouseEvent arg0) {
				
				int i = la.getText().indexOf( " " ) ;
				
				if ( i == -1 ) {
					
					String memo = new String() ;
					memo = la.getText().substring( 0 ) ;
					Double second = new Double( Double.parseDouble( memo ) ) ;
					mem += second ;
					m.setText( "M" ) ;
					
				}
				
				else {
					
					int j = la.getText().indexOf( " " , i+3 ) ;
					
					if ( j == -1 ) {
						
						String memo = new String() ;
						memo = la.getText().substring( i+2 ) ;
						Double second = new Double( Double.parseDouble( memo ) ) ;
						mem += second ;
						m.setText( "M" ) ;
						
					}
					
					else {
						
						String memo = new String() ;
						memo = la.getText().substring( j+2 ) ;
						Double second = new Double( Double.parseDouble( memo ) ) ;
						mem += second ;
						m.setText( "M" ) ;
						
					}
					
				}
				
				System.out.println( mem ) ;
						
			}
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key M-
		
		mm.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
			
				int i = la.getText().indexOf( " " ) ;
				
				if ( i == -1 ) {
					
					String memo = new String() ;
					memo = la.getText().substring( 0 ) ;
					Double second = new Double( Double.parseDouble( memo ) ) ;
					mem -= second ;
					
				}
				
				else {
					
					int j = la.getText().indexOf( " " , i+3 ) ;
					
					if ( j == -1 ) {
						
						String memo = new String() ;
						memo = la.getText().substring( i+2 ) ;
						Double second = new Double( Double.parseDouble( memo ) ) ;
						mem -= second ;
						
					}
					
					else {
						
						String memo = new String() ;
						memo = la.getText().substring( j+2 ) ;
						Double second = new Double( Double.parseDouble( memo ) ) ;
						mem -= second ;
						
					}
					
				}
				
				System.out.println( mem ) ;
				
			}
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key MR
		
		mr.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
				
				if ( bool ) {
					
					la.setText( "0" ) ;
					result_num = 0 ;
					bool = false ;
					
				}
				
				if ( la.getText().substring( 0 , 1 ) == "0" ) {
					
					la.setText( "" ) ;
					
				}

				la.setText( la.getText() + mem ) ;
			
			}
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key MC
		
		mc.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
			
				mem = 0 ;
				m.setText( "" ) ;
			
			}
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		//Key <--
		
		back.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent arg0) {
				
				if ( !la.getText().equals( "0" ) ){
					
					if ( la.getText().charAt( la.getText().length()-1 ) == ' ' ) {
						
						la.setText( la.getText().substring( 0 , la.getText().length()-3 ) ) ;
						
					}
					
					else {
				
						la.setText( la.getText().substring( 0 , la.getText().length()-1 ) ) ;
					
					}
					
				}
				
				if ( la.getText().length() == 0 ) {
					
					la.setText( "0" ) ;
					
				}
			
			}
			
		} ) ;
		
		////////////////////////////////////////////////////////////////////////////
		
		pack() ;
		setVisible( true ) ;
		
		////////////////////////////////////////////////////////////////////////////
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;
		
		////////////////////////////////////////////////////////////////////////////
		
	}

}
