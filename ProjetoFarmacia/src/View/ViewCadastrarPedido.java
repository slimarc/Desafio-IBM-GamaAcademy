package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import BDController.Sistema;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import javax.swing.JCheckBox;

public class ViewCadastrarPedido extends JPanel {
	private JTextField campo_nomeProduto;
	private JTextField campo_descricao;
	private JTextField campo_precoCadastro;
	private JTextField campo_estoque;
	private JTextField campo_flagRemedio;
	private JTextField campo_flagGenerico;

	/**
	 * Create the panel.
	 * @throws ParseException 
	 */
	public ViewCadastrarPedido() throws ParseException {
		Sistema executar = new Sistema();
		executar.conectar(); 

		setBounds(0, 0, 547, 568);
		setBackground(new Color(217, 217, 217));
		setLayout(null);
		
		JTextField campo_cliente = new JTextField();
		campo_cliente.setBounds(12, 299, 116, 25);
		add(campo_cliente);
		campo_cliente.setColumns(10);
		
		JTextField inputCampo_produto = new JTextField();
		inputCampo_produto.setBounds(12, 232, 116, 25);
		add(inputCampo_produto);
		inputCampo_produto.setColumns(10);
		
		JTextField campo_total = new JTextField();
		campo_total.setBounds(431, 299, 94, 25);
		add(campo_total);
		campo_total.setColumns(10);
		
		JTextField campo_unt = new JTextField();
		campo_unt.setBounds(231, 299, 94, 25);
		add(campo_unt);
		campo_unt.setColumns(10);
		
		JTextField campo_desconto = new JTextField();
		campo_desconto.setBounds(331, 299, 94, 25);
		add(campo_desconto);

		
		JLabel lblNewLabel = new JLabel("Código do cliente:");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel.setBounds(12, 282, 131, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Código do produto:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(12, 214, 122, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Data:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(135, 282, 46, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Valor unitário:");
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(231, 282, 92, 14);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Desconto:");
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(331, 282, 75, 14);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Valor final:");
		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(431, 282, 75, 14);
		add(lblNewLabel_5); 
		
		JFormattedTextField campo_data = new JFormattedTextField();
		campo_data.setBounds(135, 299, 86, 25);
		MaskFormatter mask_data = new MaskFormatter("##/##/####");
		mask_data.install(campo_data);
		add(campo_data);
		
		JTextField campo_nome = new JTextField();
		campo_nome.setBounds(253, 232, 272, 25);
		add(campo_nome);
		campo_nome.setColumns(10);
		
		JLabel campo_nomeProd = new JLabel("Nome:");
		campo_nomeProd.setFont(new Font("Dialog", Font.PLAIN, 14));
		campo_nomeProd.setBounds(253, 214, 255, 14);
		add(campo_nomeProd);
		
		JLabel lblNewLabel_6 = new JLabel("Qtd.:");
		lblNewLabel_6.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(346, 441, 46, 14);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Valor unt.:");
		lblNewLabel_7.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(266, 441, 67, 14);
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Valor total:");
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(422, 439, 86, 19);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Nota fiscal:");
		lblNewLabel_9.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(12, 441, 90, 14);
		add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Código do pedido:");
		lblNewLabel_10.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(127, 441, 116, 14);
		add(lblNewLabel_10);
		
		JFormattedTextField campo_numsequencial = new JFormattedTextField();
		campo_numsequencial.setBounds(12, 459, 102, 25);
		add(campo_numsequencial);
		
		JTextField campo_idcompra = new JTextField();
		campo_idcompra.setBounds(127, 459, 122, 25);
		campo_idcompra.setColumns(10);
		add(campo_idcompra);
		
		JTextField campo_valodesc = new JTextField();
		campo_valodesc.setBounds(266, 459, 67, 25);
		campo_valodesc.setColumns(10);
		add(campo_valodesc);
		
		JTextField campo_qtd = new JTextField();
		campo_qtd.setBounds(345, 459, 67, 25);
		campo_qtd.setColumns(10);
		add(campo_qtd);
		
		JTextField campo_valTotal = new JTextField();
		campo_valTotal.setBounds(422, 459, 103, 25);
		campo_valTotal.setColumns(10);
		add(campo_valTotal);
		
		JPanel btn_cadastrar = new JPanel();
		btn_cadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(campo_cliente.getText().trim().equals("") || inputCampo_produto.getText().trim().equals("") || campo_data.getText().trim().equals("") || campo_unt.getText().trim().equals("") || campo_desconto.getText().trim().equals("") || campo_total.getText().trim().equals("")){
					JOptionPane.showMessageDialog(btn_cadastrar, "Preencha todos os campos!");
			}else {
					executar.postPedido(campo_cliente.getText(), inputCampo_produto.getText(), campo_data.getText(),  campo_unt.getText(), campo_desconto.getText(), campo_total.getText());
					String search = campo_idcompra.getText();
					campo_idcompra.setText(executar.getCodCompra(search));			
					JOptionPane.showMessageDialog(btn_cadastrar, "Pedido cadastrado!");
				 }
			}
		});
		btn_cadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_cadastrar.setBackground(new Color(70, 130, 180));
		btn_cadastrar.setBounds(215, 334, 103, 33);
		btn_cadastrar.setBackground(new Color(32, 92, 109));
		add(btn_cadastrar);
		btn_cadastrar.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("CADASTRAR");
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		lblNewLabel_11.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(10, 9, 85, 14);
		btn_cadastrar.add(lblNewLabel_11);
		
		JPanel btn_insereCompra = new JPanel();
		btn_insereCompra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String search = campo_idcompra.getText();
				campo_valodesc.setText(executar.getPrecoCompra(search));
			}
		});
		
		btn_insereCompra.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_insereCompra.setLayout(null);
		btn_insereCompra.setBackground(new Color(70, 130, 180));
		btn_insereCompra.setBounds(146, 511, 103, 33);
		btn_insereCompra.setBackground(new Color(32, 92, 109));
		add(btn_insereCompra);
		
		JLabel lblNewLabel_11_1 = new JLabel("INSERIR");
		lblNewLabel_11_1.setForeground(Color.WHITE);
		lblNewLabel_11_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_11_1.setBounds(25, 9, 53, 14);
		
		btn_insereCompra.add(lblNewLabel_11_1);
		
		JPanel btn_salvar = new JPanel();
		btn_salvar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(campo_numsequencial.getText().trim().equals("") || campo_idcompra.getText().trim().equals("") || inputCampo_produto.getText().trim().equals("") || campo_valodesc.getText().trim().equals("") || campo_qtd.getText().trim().equals("")){
					JOptionPane.showMessageDialog(btn_salvar, "Preencha todos os campos!");
				}else {
					if(executar.postCompra(campo_numsequencial.getText(), campo_idcompra.getText(), inputCampo_produto.getText(), campo_qtd.getText(), campo_valodesc.getText()) != false) {
						JOptionPane.showMessageDialog(btn_salvar, "Pedido cadastrado!");
					}else {
						JOptionPane.showMessageDialog(btn_salvar, "Estoque insuficiente!");
					}
					
				 }
			}
		});
		
		btn_salvar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_salvar.setLayout(null);
		btn_salvar.setBounds(270, 511, 103, 33);
		btn_salvar.setBackground(new Color(32, 92, 109));
		add(btn_salvar);
		
		JLabel lblNewLabel_11_2 = new JLabel("SALVAR");
		lblNewLabel_11_2.setForeground(Color.WHITE);
		lblNewLabel_11_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_11_2.setBounds(24, 9, 54, 14);
		btn_salvar.add(lblNewLabel_11_2);
		
		JPanel btn_buscarProduto = new JPanel();
		btn_buscarProduto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String search = inputCampo_produto.getText();
				if(inputCampo_produto.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(btn_buscarProduto, "Preencha o campo");
				}else {
					campo_nome.setText(executar.getProdutoNomeID(search));
					campo_unt.setText(executar.getProdutoPrecoID(search));
					campo_total.setText(executar.getProdutoPrecoFinalID(search));
					campo_desconto.setText(executar.getProdutoPrecoDescontoID(search));
				}
			}
		});
		btn_buscarProduto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_buscarProduto.setBounds(139, 235, 104, 22);
		btn_buscarProduto.setBackground(new Color(32, 92, 109));
		add(btn_buscarProduto);
		
		JLabel lblNewLabel_12 = new JLabel("BUSCAR PRODUTO");
		lblNewLabel_12.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_12.setForeground(new Color(255, 255, 255));
		lblNewLabel_12.setBackground(new Color(255, 255, 255));
		btn_buscarProduto.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel(">>CADASTRAR PEDIDO<<");
		lblNewLabel_13.setFont(new Font("Artifakt Element Black", Font.PLAIN, 17));
		lblNewLabel_13.setBounds(165, 175, 260, 43);
		lblNewLabel_13.setForeground(new Color(32, 92, 109));

		add(lblNewLabel_13);
		
		JLabel lblNewLabel_13_1 = new JLabel(">>GERAR NOTA FISCAL<<");
		lblNewLabel_13_1.setForeground(new Color(32, 92, 109));
		lblNewLabel_13_1.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_13_1.setBounds(162, 387, 260, 43);
		add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_13_2 = new JLabel(">>CADASTRAR PRODUTO<<");
		lblNewLabel_13_2.setForeground(new Color(32, 92, 109));
		lblNewLabel_13_2.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_13_2.setBounds(146, 0, 260, 43);
		add(lblNewLabel_13_2);
		
		campo_nomeProduto = new JTextField();
		campo_nomeProduto.setColumns(10);
		campo_nomeProduto.setBounds(12, 65, 136, 25);
		add(campo_nomeProduto);
		
		JLabel campo_nomeProd_1 = new JLabel("Nome:");
		campo_nomeProd_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		campo_nomeProd_1.setBounds(10, 47, 116, 14);
		add(campo_nomeProd_1);
		
		campo_descricao = new JTextField();
		campo_descricao.setColumns(10);
		campo_descricao.setBounds(162, 65, 363, 25);
		add(campo_descricao);
		
		JLabel campo_nomeProd_1_1 = new JLabel("Descrição:");
		campo_nomeProd_1_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		campo_nomeProd_1_1.setBounds(162, 47, 102, 14);
		add(campo_nomeProd_1_1);
		
		campo_precoCadastro = new JTextField();
		campo_precoCadastro.setColumns(10);
		campo_precoCadastro.setBounds(10, 131, 133, 25);
		add(campo_precoCadastro);
		
		JLabel campo_nomeProd_1_2 = new JLabel("Preço unitário:");
		campo_nomeProd_1_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		campo_nomeProd_1_2.setBounds(10, 115, 122, 14);
		add(campo_nomeProd_1_2);
		
		campo_estoque = new JTextField();
		campo_estoque.setColumns(10);
		campo_estoque.setBounds(171, 131, 133, 25);
		add(campo_estoque);
		
		JLabel campo_nomeProd_1_2_1 = new JLabel("Estoque:");
		campo_nomeProd_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		campo_nomeProd_1_2_1.setBounds(170, 115, 116, 14);
		add(campo_nomeProd_1_2_1);
		
		
		JPanel btn_inserirProduto = new JPanel();
		btn_inserirProduto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				executar.postProduto(campo_nomeProduto.getText(), campo_descricao.getText(), campo_precoCadastro.getText(), campo_estoque.getText(), campo_flagRemedio.getText(), campo_flagGenerico.getText());
			}
		});
		btn_inserirProduto.setBackground(new Color(32, 92, 109));
		btn_inserirProduto.setBounds(433, 131, 92, 25);
		add(btn_inserirProduto);
		
		JLabel lblNewLabel_12_1 = new JLabel("SALVAR");
		lblNewLabel_12_1.setForeground(Color.WHITE);
		lblNewLabel_12_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_12_1.setBackground(Color.WHITE);
		btn_inserirProduto.add(lblNewLabel_12_1);
		
		JCheckBox check_Generico = new JCheckBox("Genérico");
		check_Generico.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(check_Generico.isSelected()) {
					campo_flagGenerico.setText("s");
				}else {
					campo_flagGenerico.setText("n");
				}			
			}
		});
		check_Generico.setBounds(328, 132, 97, 23);
		add(check_Generico);
		
		campo_flagGenerico = new JTextField();
		campo_flagGenerico.setColumns(10);
		campo_flagGenerico.setBounds(333, 140, 10, 9);
		add(campo_flagGenerico);
		
		JCheckBox check_remedio = new JCheckBox("Remédio");
		check_remedio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(check_remedio.isSelected()) {
					campo_flagRemedio.setText("s");
				}else {
					campo_flagRemedio.setText("n");
				}
			}
		});
		check_remedio.setBounds(328, 106, 97, 23);
		add(check_remedio);
		
		campo_flagRemedio = new JTextField();
		campo_flagRemedio.setBounds(333, 113, 10, 9);
		add(campo_flagRemedio);
		campo_flagRemedio.setColumns(10);
		

	}
}
