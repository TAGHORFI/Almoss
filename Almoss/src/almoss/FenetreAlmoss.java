package almoss;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class FenetreAlmoss extends JFrame{
	public static final long serialVersionUID= 2005L;
	private PanelAlmoss onglets;
	
	public FenetreAlmoss(){
		this.setTitle("Almoss");
	    this.setSize(700, 600);
	    this.setLocationRelativeTo(null);
	    MenuBarAlmoss menu = new MenuBarAlmoss();
	    setJMenuBar(menu);
	    onglets = new PanelAlmoss();
	    /* test de l'onglet */
	    //JTabbedPane onglet= new JTabbedPane();
	    this.setContentPane(onglets);               
	    this.setVisible(true);
	}

}
