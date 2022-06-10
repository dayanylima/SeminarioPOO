package br.edu.ifnmg.poo.seminario.interpreter;

/**
 *
 * @author dayan
 */
public class ExpressionDay extends Expression {

    @Override
    public void interpret(Context context) {

        String expressao = context.getExpressao();

        Integer dia = context.getData().getDayOfMonth();

        context.setExpressao(expressao.replace("DD", dia.toString()));
    }

}
