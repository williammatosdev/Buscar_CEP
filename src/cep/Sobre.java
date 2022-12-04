package cep;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import java.net.URI;

import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setResizable(false);
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setBounds(150, 150, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar CEP - Ver 1.0");
		lblNewLabel.setBounds(42, 23, 163, 13);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("@Autor William Matos");
		lblNewLabel_1.setBounds(42, 62, 185, 13);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblGitHub = new JLabel("GitHub:");
		lblGitHub.setBounds(42, 109, 65, 13);
		getContentPane().add(lblGitHub);
		
		JLabel lblService = new JLabel("williammatosdev");
		lblService.setToolTipText("Repositories");
		lblService.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://github.com/williammatosdev?tab=repositories");
			}
		});
		lblService.setForeground(SystemColor.textHighlight);
		lblService.setBounds(102, 109, 103, 13);
		getContentPane().add(lblService);
		
		JButton btnGitHub = new JButton("");
		btnGitHub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://github.com/williammatosdev/Buscar_CEP.git");
			}
		});
		btnGitHub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGitHub.setToolTipText("Projeto");
		btnGitHub.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		btnGitHub.setBounds(35, 184, 48, 48);
		getContentPane().add(btnGitHub);
		
		JButton btnLinkedin = new JButton("");
		btnLinkedin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://www.linkedin.com/in/william-matos-machado-627206221/");
			}
		});
		btnLinkedin.setToolTipText("Linkedin");
		btnLinkedin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLinkedin.setIcon(new ImageIcon(Sobre.class.getResource("/img/834713_linkedin_icon.png")));
		btnLinkedin.setBounds(122, 184, 48, 48);
		getContentPane().add(btnLinkedin);
		
		JLabel lblWebService = new JLabel("Web Service:");
		lblWebService.setBounds(42, 147, 86, 13);
		getContentPane().add(lblWebService);
		
		JLabel lblNewLabel_2 = new JLabel("republicavirtual.com");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://www.republicavirtual.com.br");
			}
		});
		lblNewLabel_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_2.setBounds(127, 147, 137, 13);
		getContentPane().add(lblNewLabel_2);

	}//fim do construtor
	
	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
