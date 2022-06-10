package br.edu.ifnmg.poo.seminario.interpreter;

public class ExpressionDay extends Expression {

    @Override
    public void avaliar(Context context) {

        String expressao = context.getExpressao();

        Integer dia = context.getData().getDayOfMonth();

        context.setExpressao(expressao.replace("DD", dia.toString()));
    }

}
