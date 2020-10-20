package aula6.exercise3;

import java.util.HashSet;
import java.util.Set;

public class RH implements IRH {
	
	private Set<Funcionario> funcionarios = new HashSet<>();

	@Override
	public double valorBonus(Funcionario funcionario) {
	    
	    if(funcionario.getFaltasNoAno() < 2) {
	    	return funcionario.getSalario()*0.30;
	    }else if(funcionario.getFaltasNoAno() <= 4) {
	    	return funcionario.getSalario()*0.15;
	    }else {
	    	return funcionario.getSalario()*0.05;
	    }
	    
	}

	@Override
	public void mostrarBonusTodosFuncionarios() {
		
		funcionarios.forEach(x -> {
			
			System.out.println("nome: " + x.getNome() + " valor do bônus: " + valorBonus(x));
			
		});
		
	}

	@Override
	public void adicionarFuncionario(Funcionario funcionario) {
		
		if(funcionarios.add(funcionario)) {
			System.out.println("Funcionario adicionado com sucesso!!!");
		}else {
			System.out.println("Funcionario já existe!!!");
		}
		
	}

	@Override
	public void removerFuncionario(Funcionario funcionario) {
		
		if (funcionarios.remove(funcionario)) {
			System.out.println("Funcionario removido com sucesso!!!");
		}else {
			System.out.println("Funcionario não existe para ser removido!!!");
		}
		
	}

	
}
