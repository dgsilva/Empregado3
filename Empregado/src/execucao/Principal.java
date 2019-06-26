package execucao;

import javax.swing.JOptionPane;

import modelo.Emprega;

public class Principal {

	public static void main(String[] args) {
		Emprega em = new Emprega();
		em.setSalb1(Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario :")));
		em.setSalb2(Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario empregado 2 : ")));
		System.out.println(" 1 empregado salario foi descontado:" + em.desc());
		System.out.println("2 empregado foi acrescentado: " + em.acre());
		System.out.println("Salario final do primeiro é : " + em.novodesc());
		System.out.println(("Salario final do segundo é : " + em.novoacre()));
	}
}
