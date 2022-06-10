package br.edu.ifnmg.poo.seminario.interpreter;

/**
 *
 * @author dayany
 */
public class ExpressionMonth extends Expression {

    @Override
    public void avaliar(Context context) {

        String expressao = context.getExpressao();

        Integer mes = context.getData().getMonthValue();

        context.setExpressao(expressao.replace("MM", mes.toString()));
    }

}
