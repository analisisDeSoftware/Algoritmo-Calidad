package algoritmo;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Interfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private int seg = 0;
	private int exa = 0;
	private int ade = 0;
	private int uti = 0;
	private int com = 0;
	private int tol = 0;
	private int err = 0;
	private int ana = 0;
	private int mod = 0;
	private int est = 0;
	private int ent = 0;
	private int ope = 0;
	private int atr = 0;
	private int ada = 0;
	private int ins = 0;
	private JPanel contentPane;
	private JLabel txtFuncionalidad;
	private JLabel txtSeguridadDeAcceso;
	private JLabel txtExactitud;
	private JLabel txtAdecuacin;
	private JLabel txtEficiencia;
	private JLabel txtUtilizacinDeRecursos;
	private JLabel txtComportamientoTemporal;
	private JLabel txtFiabilidad;
	private JLabel txtToleranciaAFallos;
	private JLabel txtCapacidadDeRecuperacin;
	private JLabel txtMantenibilidad;
	private JLabel txtCapacidadDeSer;
	private JLabel txtCapacidadDeSer_1;
	private JLabel txtEstabilidad;
	private JLabel txtUsabilidad;
	private JLabel txtCapacidadDeSer_2;
	private JLabel txtCapacidadDeSer_3;
	private JLabel txtCapacidadDeSer_4;
	private JLabel txtPortabilidad;
	private JLabel txtAdaptabilidad;
	private JLabel txtInstabilidad;
	private JLabel lblResultado;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_0;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_1;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_2;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_3;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_4;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_5;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_6;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_7;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_8;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_9;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_10;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_11;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_12;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_13;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Interfaz() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 723);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtFuncionalidad = new JLabel();
		txtFuncionalidad.setForeground(Color.WHITE);
		txtFuncionalidad.setText("Funcionalidad");
		txtFuncionalidad.setBounds(10, 10, 94, 22);
		contentPane.add(txtFuncionalidad);
		
		txtEficiencia = new JLabel();
		txtEficiencia.setText("Eficiencia");
		txtEficiencia.setForeground(new Color(255, 255, 255));
		txtEficiencia.setBounds(10, 118, 94, 22);
		contentPane.add(txtEficiencia);
		
		txtFiabilidad = new JLabel();
		txtFiabilidad.setForeground(Color.WHITE);
		txtFiabilidad.setText("Fiabilidad");
		txtFiabilidad.setBounds(10, 199, 94, 22);
		contentPane.add(txtFiabilidad);
		
		txtMantenibilidad = new JLabel();
		txtMantenibilidad.setForeground(Color.WHITE);
		txtMantenibilidad.setText("Mantenibilidad");
		txtMantenibilidad.setBounds(10, 280, 94, 22);
		contentPane.add(txtMantenibilidad);
		
		txtUsabilidad = new JLabel();
		txtUsabilidad.setForeground(Color.WHITE);
		txtUsabilidad.setText("Usabilidad");
		txtUsabilidad.setBounds(10, 388, 94, 22);
		contentPane.add(txtUsabilidad);
		
		txtPortabilidad = new JLabel();
		txtPortabilidad.setForeground(Color.WHITE);
		txtPortabilidad.setText("Portabilidad");
		txtPortabilidad.setBounds(10, 496, 94, 22);
		contentPane.add(txtPortabilidad);
		
		txtSeguridadDeAcceso = new JLabel();
		txtSeguridadDeAcceso.setForeground(Color.WHITE);
		txtSeguridadDeAcceso.setText("Seguridad de acceso");
		txtSeguridadDeAcceso.setBounds(41, 37, 234, 22);
		contentPane.add(txtSeguridadDeAcceso);
		
		txtExactitud = new JLabel();
		txtExactitud.setForeground(Color.WHITE);
		txtExactitud.setText("Exactitud");
		txtExactitud.setBounds(41, 64, 234, 22);
		contentPane.add(txtExactitud);
		
		txtAdecuacin = new JLabel();
		txtAdecuacin.setForeground(Color.WHITE);
		txtAdecuacin.setText("Adecuación");
		txtAdecuacin.setBounds(41, 91, 234, 22);
		contentPane.add(txtAdecuacin);
		
		txtUtilizacinDeRecursos = new JLabel();
		txtUtilizacinDeRecursos.setForeground(Color.WHITE);
		txtUtilizacinDeRecursos.setText("Utilización de recursos");
		txtUtilizacinDeRecursos.setBounds(41, 145, 234, 22);
		contentPane.add(txtUtilizacinDeRecursos);
		
		txtComportamientoTemporal = new JLabel();
		txtComportamientoTemporal.setForeground(Color.WHITE);
		txtComportamientoTemporal.setText("Comportamiento temporal");
		txtComportamientoTemporal.setBounds(41, 172, 234, 22);
		contentPane.add(txtComportamientoTemporal);
		
		txtToleranciaAFallos = new JLabel();
		txtToleranciaAFallos.setForeground(Color.WHITE);
		txtToleranciaAFallos.setText("Tolerancia a fallos");
		txtToleranciaAFallos.setBounds(41, 226, 234, 22);
		contentPane.add(txtToleranciaAFallos);
		
		txtCapacidadDeRecuperacin = new JLabel();
		txtCapacidadDeRecuperacin.setForeground(Color.WHITE);
		txtCapacidadDeRecuperacin.setText("Capacidad de recuperación de errores");
		txtCapacidadDeRecuperacin.setBounds(41, 253, 234, 22);
		contentPane.add(txtCapacidadDeRecuperacin);
		
		txtCapacidadDeSer = new JLabel();
		txtCapacidadDeSer.setForeground(Color.WHITE);
		txtCapacidadDeSer.setText("Capacidad de ser analizado");
		txtCapacidadDeSer.setBounds(41, 307, 234, 22);
		contentPane.add(txtCapacidadDeSer);
		
		txtCapacidadDeSer_1 = new JLabel();
		txtCapacidadDeSer_1.setForeground(Color.WHITE);
		txtCapacidadDeSer_1.setText("Capacidad de ser modificado");
		txtCapacidadDeSer_1.setBounds(41, 334, 234, 22);
		contentPane.add(txtCapacidadDeSer_1);
		
		txtEstabilidad = new JLabel();
		txtEstabilidad.setForeground(Color.WHITE);
		txtEstabilidad.setText("Estabilidad");
		txtEstabilidad.setBounds(41, 361, 234, 22);
		contentPane.add(txtEstabilidad);
		
		txtCapacidadDeSer_2 = new JLabel();
		txtCapacidadDeSer_2.setForeground(Color.WHITE);
		txtCapacidadDeSer_2.setText("Capacidad de ser entendido");
		txtCapacidadDeSer_2.setBounds(41, 415, 234, 22);
		contentPane.add(txtCapacidadDeSer_2);
		
		txtCapacidadDeSer_3 = new JLabel();
		txtCapacidadDeSer_3.setForeground(Color.WHITE);
		txtCapacidadDeSer_3.setText("Capacidad de ser operado");
		txtCapacidadDeSer_3.setBounds(41, 442, 234, 22);
		contentPane.add(txtCapacidadDeSer_3);
		
		txtCapacidadDeSer_4 = new JLabel();
		txtCapacidadDeSer_4.setForeground(Color.WHITE);
		txtCapacidadDeSer_4.setText("Capacidad de ser atractivo");
		txtCapacidadDeSer_4.setBounds(41, 469, 234, 22);
		contentPane.add(txtCapacidadDeSer_4);
		
		txtAdaptabilidad = new JLabel();
		txtAdaptabilidad.setForeground(Color.WHITE);
		txtAdaptabilidad.setText("Adaptabilidad");
		txtAdaptabilidad.setBounds(41, 523, 234, 22);
		contentPane.add(txtAdaptabilidad);
		
		txtInstabilidad = new JLabel();
		txtInstabilidad.setForeground(Color.WHITE);
		txtInstabilidad.setText("Instabilidad");
		txtInstabilidad.setBounds(41, 550, 234, 22);
		contentPane.add(txtInstabilidad);
		
		JButton btnCalcular = new JButton("Calcular Calidad");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mostrarResultado();
			}
		});
		btnCalcular.setBounds(164, 585, 131, 25);
		contentPane.add(btnCalcular);
		
		lblResultado = new JLabel("");
		lblResultado.setBounds(10, 627, 432, 41);
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setForeground(Color.WHITE);
		lblResultado.setFont(new Font("Segoe UI", Font.PLAIN, 26));
		contentPane.add(lblResultado);
		
		comboBox_0 = new JComboBox();
		comboBox_0.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				seg = comboBox_0.getSelectedIndex()*2;
			}
		});
		comboBox_0.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtSeguridadDeAcceso.setForeground(Color.GREEN);
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtSeguridadDeAcceso.setForeground(Color.WHITE);
			}
		});
		comboBox_0.setModel(new DefaultComboBoxModel(new String[] {"No aceptable", "Medianamente aceptable", "Aceptable"}));
		comboBox_0.setBounds(274, 37, 170, 22);
		contentPane.add(comboBox_0);
		
		comboBox_1 = new JComboBox();
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				exa = comboBox_1.getSelectedIndex();
			}
		});
		comboBox_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtExactitud.setForeground(Color.GREEN);
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtExactitud.setForeground(Color.WHITE);
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"No aceptable", "Medianamente aceptable", "Aceptable"}));
		comboBox_1.setBounds(274, 64, 170, 22);
		contentPane.add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				ade = comboBox_2.getSelectedIndex();
			}
		});
		comboBox_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtAdecuacin.setForeground(Color.GREEN);
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtAdecuacin.setForeground(Color.WHITE);
			}
		});
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"No aceptable", "Medianamente aceptable", "Aceptable"}));
		comboBox_2.setBounds(274, 91, 170, 22);
		contentPane.add(comboBox_2);
		
		comboBox_3 = new JComboBox();
		comboBox_3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				uti = comboBox_3.getSelectedIndex()*2;
			}
		});
		comboBox_3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtUtilizacinDeRecursos.setForeground(Color.GREEN);
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtUtilizacinDeRecursos.setForeground(Color.WHITE);
			}
		});
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"No aceptable", "Medianamente aceptable", "Aceptable"}));
		comboBox_3.setBounds(274, 145, 170, 22);
		contentPane.add(comboBox_3);
		
		comboBox_4 = new JComboBox();
		comboBox_4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				com = comboBox_4.getSelectedIndex();
			}
		});
		comboBox_4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtComportamientoTemporal.setForeground(Color.GREEN);
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtComportamientoTemporal.setForeground(Color.WHITE);
			}
		});
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"No aceptable", "Medianamente aceptable", "Aceptable"}));
		comboBox_4.setBounds(274, 172, 170, 22);
		contentPane.add(comboBox_4);
		
		comboBox_5 = new JComboBox();
		comboBox_5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				tol = comboBox_5.getSelectedIndex()*2;
			}
		});
		comboBox_5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtToleranciaAFallos.setForeground(Color.GREEN);
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtToleranciaAFallos.setForeground(Color.WHITE);
			}
		});
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"No aceptable", "Medianamente aceptable", "Aceptable"}));
		comboBox_5.setBounds(274, 226, 170, 22);
		contentPane.add(comboBox_5);
		
		comboBox_6 = new JComboBox();
		comboBox_6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				err = comboBox_6.getSelectedIndex();
			}
		});
		comboBox_6.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtCapacidadDeRecuperacin.setForeground(Color.GREEN);
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtCapacidadDeRecuperacin.setForeground(Color.WHITE);
			}
		});
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"No aceptable", "Medianamente aceptable", "Aceptable"}));
		comboBox_6.setBounds(274, 253, 170, 22);
		contentPane.add(comboBox_6);
		
		comboBox_7 = new JComboBox();
		comboBox_7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				ana = comboBox_7.getSelectedIndex();
			}
		});
		comboBox_7.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtCapacidadDeSer.setForeground(Color.GREEN);
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtCapacidadDeSer.setForeground(Color.WHITE);
			}
		});
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"No aceptable", "Medianamente aceptable", "Aceptable"}));
		comboBox_7.setBounds(274, 307, 170, 22);
		contentPane.add(comboBox_7);
		
		comboBox_8 = new JComboBox();
		comboBox_8.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				mod = comboBox_8.getSelectedIndex();
			}
		});
		comboBox_8.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtCapacidadDeSer_1.setForeground(Color.GREEN);
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtCapacidadDeSer_1.setForeground(Color.WHITE);
			}
		});
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"No aceptable", "Medianamente aceptable", "Aceptable"}));
		comboBox_8.setBounds(274, 334, 170, 22);
		contentPane.add(comboBox_8);
		
		comboBox_9 = new JComboBox();
		comboBox_9.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				est = comboBox_9.getSelectedIndex()*2;
			}
		});
		comboBox_9.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtEstabilidad.setForeground(Color.GREEN);
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtEstabilidad.setForeground(Color.WHITE);
			}
		});
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"No aceptable", "Medianamente aceptable", "Aceptable"}));
		comboBox_9.setBounds(274, 361, 170, 22);
		contentPane.add(comboBox_9);
		
		comboBox_10 = new JComboBox();
		comboBox_10.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				ent = comboBox_10.getSelectedIndex();
			}
		});
		comboBox_10.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtCapacidadDeSer_2.setForeground(Color.GREEN);
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtCapacidadDeSer_2.setForeground(Color.WHITE);
			}
		});
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"No aceptable", "Medianamente aceptable", "Aceptable"}));
		comboBox_10.setBounds(274, 415, 170, 22);
		contentPane.add(comboBox_10);
		
		comboBox_11 = new JComboBox();
		comboBox_11.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				ope = comboBox_11.getSelectedIndex();
			}
		});
		comboBox_11.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtCapacidadDeSer_3.setForeground(Color.GREEN);
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtCapacidadDeSer_3.setForeground(Color.WHITE);
			}
		});
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"No aceptable", "Medianamente aceptable", "Aceptable"}));
		comboBox_11.setBounds(274, 442, 170, 22);
		contentPane.add(comboBox_11);
		
		comboBox_12 = new JComboBox();
		comboBox_12.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				atr = comboBox_12.getSelectedIndex()*2;
			}
		});
		comboBox_12.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtCapacidadDeSer_4.setForeground(Color.GREEN);
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtCapacidadDeSer_4.setForeground(Color.WHITE);
			}
		});
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"No aceptable", "Medianamente aceptable", "Aceptable"}));
		comboBox_12.setBounds(274, 469, 170, 22);
		contentPane.add(comboBox_12);
		
		comboBox_13 = new JComboBox();
		comboBox_13.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				ada = comboBox_13.getSelectedIndex()*2;
			}
		});
		comboBox_13.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtAdaptabilidad.setForeground(Color.GREEN);
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtAdaptabilidad.setForeground(Color.WHITE);
			}
		});
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"No aceptable", "Medianamente aceptable", "Aceptable"}));
		comboBox_13.setBounds(274, 523, 170, 22);
		contentPane.add(comboBox_13);
		
		comboBox_14 = new JComboBox();
		comboBox_14.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				ins = comboBox_14.getSelectedIndex();
			}
		});
		comboBox_14.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtInstabilidad.setForeground(Color.GREEN);
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtInstabilidad.setForeground(Color.WHITE);
			}
		});
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"No aceptable", "Medianamente aceptable", "Aceptable"}));
		comboBox_14.setBounds(274, 550, 170, 22);
		contentPane.add(comboBox_14);
	}
	
	public void mostrarResultado() {
		// Es satisfactorio
		if (calcularResultado() >= 30) {
			lblResultado.setForeground(Color.GREEN);
			lblResultado.setText("ES SATISFACTORIO " + calcularResultado() + "/42");
		} else {
			lblResultado.setForeground(Color.RED);
			lblResultado.setText("NO ES SATISFACTORIO " + calcularResultado() + "/42");			
		}
	}

	private int calcularResultado() {
		return seg+exa+ade+uti+com+tol+err+ana+mod+est+ent+ope+atr+ada+ins;
	}
}
