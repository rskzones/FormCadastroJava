package cadastro;

import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;



import cadastro.CadastroPessoaFisica;

public class CadastroPessoaFisica extends JFrame{
	
	JRadioButton[] rdnSexo =  new JRadioButton[2];
	ButtonGroup btnGrupo = new ButtonGroup();
	
	public CadastroPessoaFisica(){
		super ("Cadastro de Pessoa Física");
		
		Container painel = this.getContentPane();
		
		
		JTextField txtNome = new JTextField (); 
		JTextField txtEndereco = new JTextField (); 
		JTextField txtBairro = new JTextField (); 
		JTextField txtCEP = new JTextField (); 
		JTextField txtCidade = new JTextField (); 
		JTextField txtEstado = new JTextField (); 
		JTextField txtTelefone = new JTextField (); 
		JTextField txtCelular = new JTextField (); 
		JTextField txtRG = new JTextField (); 
		JTextField txtCPF = new JTextField (); 
		
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
		
		
		JButton btnEnviar = new JButton("Enviar");
		JButton btnLimpar = new JButton("Limpar");

		
		//TEXT FIELD - CAMPOS
		
		painel.add(txtNome);
		txtNome.setBounds(120,40,400,30);
		
		painel.add(txtEndereco);
		txtEndereco.setBounds(120,80,400,30);
		
		painel.add(txtBairro);
		txtBairro.setBounds(120,120,300,30);
		
		painel.add(txtCEP);
		txtCEP.setBounds(120,160,200,30);
		
		painel.add(txtCidade);
		txtCidade.setBounds(120,200,300,30);
		
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

		
		painel.add(txtTelefone);
		txtTelefone.setBounds(120,280,200,30);
		
		painel.add(txtCelular);
		txtCelular.setBounds(120,320,200,30);
		
		painel.add(txtRG);
		txtRG.setBounds(120,360,200,30);
		
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
		
		painel.add(btnEnviar);
		btnEnviar.setBounds(200, 500, 100, 40);
		
		painel.add(btnLimpar);
		btnLimpar.setBounds(320, 500, 100, 40);
		
	
		painel.setLayout(null);
		this.setVisible(true);
		this.setSize(600, 800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main (String args[]){
		
		CadastroPessoaFisica cad = new CadastroPessoaFisica();
		
		
	}
}


