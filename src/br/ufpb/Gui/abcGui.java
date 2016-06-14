package br.ufpb.Gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorListener;

import java.awt.GridLayout;
import java.awt.CardLayout;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import java.awt.Font;
import java.awt.event.ComponentListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class abcGui extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JPanel painel_Card ;
	private JPanel painel_principal_1;
	private JLabel lblParaIniciarA;
	private JLabel imagem1;
	private JLabel lendo_e_aprendendo;
	private JPanel painel_principal_2;
	private JLabel questao_1;
	private JLabel lblAssociAImagem;
	private JLabel maca;
	private JPanel painel_visualizar_resp;
	private JPanel painel_Branco;
	private JPanel painel_Resposta_Correta;
	private JLabel acertou;
	private JPanel painel_Resposta_Incorreta;
	private JLabel errou;
	private JButton btnConfirmar;
	private JLabel ceta_Voltar;
	private JRadioButton rdbtnMaa;
	private JRadioButton rdbtnBola;
	private JRadioButton rdbtnPipa;
	private JButton btnIniciar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new abcGui();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					abcGui frame = new abcGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public abcGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		painel_Card = new JPanel();
		contentPane.add(painel_Card, "name_482960321172065");
		painel_Card.setLayout(new CardLayout(0, 0));
		
		painel_principal_1 = new JPanel();
		painel_principal_1.setBackground(Color.white);
		painel_Card.add(painel_principal_1, "name_483037384530442");
		painel_principal_1.setLayout(null);
		
		lblParaIniciarA = new JLabel("Para iniciar a atividade clique no bot\u00E3o abaixo");
		lblParaIniciarA.setFont(new Font("Schadow BT", Font.PLAIN, 15));
		lblParaIniciarA.setBounds(163, 317, 316, 14);
		painel_principal_1.add(lblParaIniciarA);
		
		imagem1 = new JLabel("");
		imagem1.setBounds(204, 95, 259, 224);
		imagem1.setIcon(new ImageIcon(abcGui.class.getResource("/br/ufpb/imagens/tela inicial OK4.png")));
		painel_principal_1.add(imagem1);
		
		lendo_e_aprendendo = new JLabel("");
		lendo_e_aprendendo.setBounds(163, 36, 316, 79);
		lendo_e_aprendendo.setIcon(new ImageIcon(abcGui.class.getResource("/br/ufpb/imagens/ok.png")));
		painel_principal_1.add(lendo_e_aprendendo);
		
		btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(this);
		
		painel_principal_1.add(btnIniciar);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnIniciar.setBounds(260, 345, 89, 23);
		setVisible(true);
		
		
		painel_principal_2 = new JPanel();
		painel_principal_2.setBackground(Color.white);
		painel_Card.add(painel_principal_2, "name_483063105272881");
		painel_principal_2.setLayout(null);
		setVisible(true);
		
		
		questao_1 = new JLabel("");
		questao_1.setBounds(10, 11, 53, 49);
		questao_1.setIcon(new ImageIcon(abcGui.class.getResource("/br/ufpb/imagens/1.png")));
		painel_principal_2.add(questao_1);
		
		lblAssociAImagem = new JLabel("Associe a imagem à sua palavra:");
		lblAssociAImagem.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblAssociAImagem.setBounds(82, 23, 232, 25);
		painel_principal_2.add(lblAssociAImagem);
		
		maca = new JLabel("");
		maca.setBounds(235, 67, 261, 210);
		maca.setIcon(new ImageIcon(abcGui.class.getResource("/br/ufpb/imagens/maça.png")));
		painel_principal_2.add(maca);
		
		painel_visualizar_resp = new JPanel();
		painel_visualizar_resp.setBounds(281, 307, 60, 75);
		painel_principal_2.add(painel_visualizar_resp);
		painel_visualizar_resp.setLayout(new CardLayout(0, 0));
		
		painel_Branco = new JPanel();
		painel_Branco.setBackground(Color.white);
		painel_visualizar_resp.add(painel_Branco, "name_873283180977272");
		
		painel_Resposta_Correta = new JPanel();
		painel_Resposta_Correta.setBackground(Color.white);
		painel_visualizar_resp.add(painel_Resposta_Correta, "name_873283209061149");
		painel_Resposta_Correta.setLayout(null);
		
		acertou = new JLabel("");
		acertou.setBounds(0, 0, 60, 68);
		acertou.setIcon(new ImageIcon(abcGui.class.getResource("/br/ufpb/imagens/rosto feliz 1.png")));
		painel_Resposta_Correta.add(acertou);

		
		painel_Resposta_Incorreta = new JPanel();
		painel_Resposta_Incorreta.setBackground(Color.white);
		painel_visualizar_resp.add(painel_Resposta_Incorreta, "name_873311628480901");
		painel_Resposta_Incorreta.setLayout(null);
		
		errou = new JLabel("");
		errou.setBounds(0, 11, 60, 53);
		errou.setIcon(new ImageIcon(abcGui.class.getResource("/br/ufpb/imagens/rosto triste 1.png")));
		painel_Resposta_Incorreta.add(errou);
		
		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(null);
		btnConfirmar.setBounds(535, 335, 89, 23);
		painel_principal_2.add(btnConfirmar);
		
		ceta_Voltar = new JLabel("");
		ceta_Voltar.setBounds(40, 347, 42, 35);
		ceta_Voltar.setIcon(new ImageIcon(abcGui.class.getResource("/br/ufpb/imagens/ceta voltar 1.png")));
		painel_principal_2.add(ceta_Voltar);
		
		rdbtnMaa = new JRadioButton("Ma\u00E7a");
		rdbtnMaa.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		rdbtnMaa.setBounds(131, 270, 98, 23);
		rdbtnMaa.setBackground(Color.white);
		painel_principal_2.add(rdbtnMaa);
		
		rdbtnBola = new JRadioButton("Bola");
		rdbtnBola.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		rdbtnBola.setBounds(297, 270, 109, 23);
		rdbtnBola.setBackground(Color.WHITE);
		painel_principal_2.add(rdbtnBola);
		
		rdbtnPipa = new JRadioButton("Pipa");
		rdbtnPipa.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		rdbtnPipa.setBounds(435, 270, 109, 23);
		rdbtnPipa.setBackground(Color.white);
		painel_principal_2.add(rdbtnPipa);
		
		
	}

	public void actionPerformed(ActionEvent evento){
		
		CardLayout cl = (CardLayout) (painel_Card.getLayout());
		
		
		if(evento.getSource() == btnIniciar){
			JOptionPane.showMessageDialog(null, "deu crt");
			cl.show(painel_principal_2, "name_483063105272881");
			JPanel p = new JPanel();
			p.setLayout(cl);
			setContentPane(p);
			
		}
	}
}
