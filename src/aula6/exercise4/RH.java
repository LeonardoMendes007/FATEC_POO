package aula6.exercise4;

import java.util.HashSet;
import java.util.Set;



public class RH implements IRH {
	
	private Set<Funcionario> funcionarios = new HashSet<>();

	@Override
	public double valorBonus(Funcionario funcionario) {
		
		double percent = 0;
	    
	    if(funcionario.getFaltasNoAno() < 2) {
	    	percent = 0.30;
	    }else if(funcionario.getFaltasNoAno() <= 4) {
	    	percent = 0.15;
	    }else {
	    	percent = 0.05;
	    }
	    
	    if(funcionario.getUltimaNotaAvaliacao() > 7) {
	    	percent += 0.30;
	    }else if(funcionario.getUltimaNotaAvaliacao() >= 5) {
	    	percent += 0.15;
	    }else {
	    	percent += 0.05;
	    }
	    
	    return (percent*funcionario.getSalario());
	    
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