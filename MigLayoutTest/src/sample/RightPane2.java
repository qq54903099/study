package sample;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import net.miginfocom.swing.MigLayout;

public class RightPane2 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4596994277212950197L;
	
	private JPanel contentPane = new JPanel(new MigLayout());
	
	private JPanel mainPane;
	
	
	public RightPane2(){
		
		
		mainPane = createMainPane();
		this.contentPane.add(mainPane);
		this.add(contentPane);
		
		
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private JPanel createMainPane() {
		
		JPanel pane = new JPanel(new MigLayout("wrap","[]unrel[]unrel[]unrel[]","[]unrel[]unrel[]"));
		
		//l_logicAddr: t_logicAddr
		//l_lastHeart: l_lastHeartV	 l_lastRecvGprs: l_lastRecvGprs
		//l_bwinfo   : t_area
		//         	   b_button
		
		pane.add(Constant.createLabel("�ն��߼���ַ:"),"r");
		pane.add(Constant.createTextField("",20,false),"wrap,l");
		pane.add(Constant.createLabel("���һ������ʱ��:"),"r");
		pane.add(Constant.createTextField("",20,false),"split,l");
		pane.add(Constant.createLabel("���һ��GPRSʱ��:"));
		pane.add(Constant.createTextField("",20,false),"wrap,l");
		pane.add(Constant.createLabel("������Ϣ:"),"r");
		pane.add(Constant.createTextAreaScroll("", 20, 60, true),"wrap");
		pane.add(contentPane.add(Constant.createButton("��ֹ��ʾ", false)),"skip");
		
		
		return pane;
	}

	public static void main(String[] args) {


		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception ex) {
					ex.printStackTrace();
				}

				new RightPane2();
			}
		});
	
	
	}



	
	
}