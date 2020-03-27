package exerciciolista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioList {
    
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Quantos Empregados registrados:");
        int registrados = scanf.nextInt();
        List<Employee> list = new ArrayList<>();
        
        for (int i = 0; i < registrados; i++) {
            System.out.println("#1 Employee: (name/id/salario)");
            list.add(new Employee(scanf.next(), scanf.nextInt(), scanf.nextDouble()));
        }
        
        System.out.println("Entre com o id para aumentar seu salario: ");
        int id = scanf.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        
        if(emp == null){
            System.out.println("Este id nao existe: ");
        }else{
            System.out.println("Entre com a porcentagem: ");
            double porcentagem = scanf.nextDouble();
            emp.aumentaSalario(porcentagem);
        }
        list.forEach(System.out::println);
        
        
    }
}
