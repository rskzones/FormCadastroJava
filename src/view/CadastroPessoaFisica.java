package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import view.CadastroPessoaFisica;

import javax.swing.JRadioButton;

public class CadastroPessoaFisica extends JFrame{
	
	JRadioButton[] rdnSexo =  new JRadioButton[2];
	ButtonGroup btnGrupo = new ButtonGroup();
	
	MaskFormatter formatCEP = null;
	MaskFormatter formatTel = null;
	MaskFormatter formatCel = null;
	MaskFormatter formatRG = null;
	MaskFormatter formatCPF = null;
	
	model.CadastroPessoaFisica PessoaFisica = new model.CadastroPessoaFisica();
	
	public CadastroPessoaFisica(){
		super ("Cadastro de Pessoa Física");
		
		Container painel = this.getContentPane();
		
		
		JTextField txtNome = new JTextField (); 
		JTextField txtEndereco = new JTextField (); 
		JTextField txtBairro = new JTextField (); 
		
		JFormattedTextField txtCEP = null;
		
		JTextField txtCidade = new JTextField ();
		
		JFormattedTextField txtTelefone = null;
		
		JFormattedTextField txtCelular = null; 
		
		JFormattedTextField txtRG = null;
		
		JFormattedTextField txtCPF = null; 
		
		JLabel lblNome = new JLabel();
		JLabel lblEndereco = new JLabel();
		JLabel lblBairro = new JLabel();
		JLabel lblCEP = new JLabel();
		JLabel lblCidade = new JLabel();
		JLabel lblEstado = new JLabel();
		JLabel lblTelefone = new JLabel();
		JLabel lblCelular = new JLabel();
		JLabel lblRG = new JLabel();
		JLabel lblCPF = new JLabel();
		JLabel lblSexo = new JLabel();
		
		//ComboBox - ESTADOS
		
		JComboBox cboEstado = new JComboBox();
		
		rdnSexo[0] = new JRadioButton("Masculino");
		rdnSexo[1] = new JRadioButton("Feminino");
		
		btnGrupo.add(rdnSexo[0]);
		btnGrupo.add(rdnSexo[1]);
		
		
		JButton btnSalvar = new JButton("Salvar");
		JButton btnImprimir = new JButton("Imprimir");

		
		//TEXT FIELD - CAMPOS
		
		painel.add(txtNome);
		txtNome.setBounds(120,40,400,30);
		
		painel.add(txtEndereco);
		txtEndereco.setBounds(120,80,400,30);
		
		painel.add(txtBairro);
		txtBairro.setBounds(120,120,300,30);
		
			try{
				formatCEP = new MaskFormatter("#####-###");
				txtCEP = new JFormattedTextField(formatCEP);
			}catch (Exception ex){
				ex.printStackTrace();
			}
		
		painel.add(txtCEP);
		txtCEP.setBounds(120,160,200,30);
		
		painel.add(txtCidade);
		txtCidade.setBounds(120,200,300,30);
		
		//ComboBox - Estado 
		
		painel.add(cboEstado);
		cboEstado.setBounds(120,240,150,30);
			cboEstado.addItem("Acre");
			cboEstado.addItem("Alagoas");
			cboEstado.addItem("Amapá");
			cboEstado.addItem("Amazonas");
			cboEstado.addItem("Bahia");
			cboEstado.addItem("Ceará");
			cboEstado.addItem("Distrito Federal");
			cboEstado.addItem("Espírito Santo");
			cboEstado.addItem("Goiás");
			cboEstado.addItem("Maranhão");
			cboEstado.addItem("Mato Grosso");
			cboEstado.addItem("Mato Grosso do Sul");
			cboEstado.addItem("Minas Gerais");
			cboEstado.addItem("Pará");
			cboEstado.addItem("Paraíba");
			cboEstado.addItem("Paraná");
			cboEstado.addItem("Pernambuco");
			cboEstado.addItem("Rio de Janeiro");
			cboEstado.addItem("Rio Grande do Norte");
			cboEstado.addItem("Rio Grande do Sul");
			cboEstado.addItem("Rondônia");
			cboEstado.addItem("Roraima");
			cboEstado.addItem("Santa Catarina");
			cboEstado.addItem("São Paulo");
			cboEstado.addItem("Sergipe");
			cboEstado.addItem("Tocantins");

		//TXTCELULAR - Com MaskFormatter	
			
			try{
				formatTel = new MaskFormatter(" (##)####-#### ");
				txtTelefone = new JFormattedTextField(formatTel);
			}catch (Exception ex){
				ex.printStackTrace();
			}
		
		painel.add(txtTelefone);
		txtTelefone.setBounds(120,280,200,30);
		
		//TXTCELULAR - Com MaskFormatter	
		
			try{
				formatCel = new MaskFormatter(" (##)#####-#### ");
				txtCelular = new JFormattedTextField(formatCel);
			}catch (Exception ex){
				ex.printStackTrace();
			}
		
		painel.add(txtCelular);
		txtCelular.setBounds(120,320,200,30);
		
		//TXTRG - Com MaskFormatter	
		
			try{
				formatRG = new MaskFormatter("##.###.###-A");
				txtRG = new JFormattedTextField(formatRG);
			}catch (Exception ex){
				ex.printStackTrace();
			}
		
		painel.add(txtRG);
		txtRG.setBounds(120,360,200,30);
		
		//TXTCPF - Com MaskFormatter	
		
			try{
				formatCPF = new MaskFormatter("###.###.###-##");
				txtCPF = new JFormattedTextField(formatCPF);
			}catch (Exception ex){
				ex.printStackTrace();
			}
			
		painel.add(txtCPF);
		txtCPF.setBounds(120,400,200,30);
		
		//TEXT LABELS - DESCRIÇÕES
		
		painel.add(lblNome);
		lblNome.setText("Nome: ");
		lblNome.setBounds(40,40,400,30);
		
		painel.add(lblEndereco);
		lblEndereco.setText("Endereço: ");
		lblEndereco.setBounds(40,80,400,30);
		
		painel.add(lblBairro);
		lblBairro.setText("Bairro: ");
		lblBairro.setBounds(40,120,400,30);
		
		painel.add(lblCEP);
		lblCEP.setText("CEP: ");
		lblCEP.setBounds(40,160,400,30);
		
		painel.add(lblCidade);
		lblCidade.setText("Cidade: ");
		lblCidade.setBounds(40,200,400,30);
		
		painel.add(lblEstado);
		lblEstado.setText("Estado: ");
		lblEstado.setBounds(40,240,400,30);
		
		painel.add(lblTelefone);
		lblTelefone.setText("Telefone: ");
		lblTelefone.setBounds(40,280,400,30);
		
		painel.add(lblCelular);
		lblCelular.setText("Celular: ");
		lblCelular.setBounds(40,320,400,30);
		
		painel.add(lblRG);
		lblRG.setText("RG: ");
		lblRG.setBounds(40,360,400,30);
		
		painel.add(lblCPF);
		lblCPF.setText("CPF: ");
		lblCPF.setBounds(40,400,400,30);
		
		painel.add(lblSexo);
		lblSexo.setText("Sexo: ");
		lblSexo.setBounds(40,445,400,30);
		
		//RadioButtons
		
		rdnSexo[0].setBounds(120,440,100,40);
	    painel.add(rdnSexo[0]);
	    rdnSexo[1].setBounds(220,440,100,40);
	    painel.add(rdnSexo[1]);
	    
		// Buttons
		
		painel.add(btnSalvar);
		btnSalvar.setBounds(200, 500, 100, 40);
		btnSalvar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				PessoaFisica.setNome(txtNome.getText());
				PessoaFisica.setEndereco(txtEndereco.getText());
				PessoaFisica.setBairro(txtBairro.getText());
				//PessoaFisica.setCep(txtCEP.getText());
				PessoaFisica.setCidade(txtCidade.getText());
				//PessoaFisica.setTelefone(txtTelefone.getText());
				//PessoaFisica.setCelular(txtCelular.getText());
				//PessoaFisica.setRg(txtRG.getText());
				//PessoaFisica.setCpf(txtCPF.getText());
			}
		});
		
		painel.add(btnImprimir);
		btnImprimir.setBounds(320, 500, 100, 40);
			
		
		//PAINEL SET
		
		painel.setLayout(null);
		this.setVisible(true);
		this.setSize(600, 650);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main (String args[]){
		
		CadastroPessoaFisica cad = new CadastroPessoaFisica();
		
		
	}
}


