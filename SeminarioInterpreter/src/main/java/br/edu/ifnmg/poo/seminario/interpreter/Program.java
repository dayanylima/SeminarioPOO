package br.edu.ifnmg.poo.seminario.interpreter;

/**
 *
 * @author dayany
 */
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Expression> expressoes = new ArrayList<>();

        Context context = new Context(LocalDateTime.now());

        System.out.println("Data atual : " + context.getData());
        System.out.println();
        System.out.println("Selecione formato que deseja usar: ");
        System.out.println("MM-DD-YYYY ou YYYY-MM-DD ou DD-MM-YYYY");
        context.setExpressao(sc.nextLine().toUpperCase());

        String[] formato = context.getExpressao().split("-");

        for (var item : formato) {

            if ("DD".equals(item)) {
                expressoes.add(new ExpressionDay());
            } else if ("MM".equals(item)) {
                expressoes.add(new ExpressionMonth());
            } else if ("YYYY".equals(item)) {
                expressoes.add(new ExpressionYear());
            }

        }

        expressoes.add(new Separador());

        for (var obj : expressoes) {

            obj.avaliar(context);

        }

        System.out.println();
        System.out.println("Data na expressão escolhida: " + context.getExpressao());

    }
}
