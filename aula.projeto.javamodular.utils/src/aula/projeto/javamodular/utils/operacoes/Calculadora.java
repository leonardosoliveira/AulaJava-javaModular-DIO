package aula.projeto.javamodular.utils.operacoes;

import aula.projeto.javamodular.utils.operacoes.internal.DivHelper;
import aula.projeto.javamodular.utils.operacoes.internal.MultHelper;
import aula.projeto.javamodular.utils.operacoes.internal.SubHelper;
import aula.projeto.javamodular.utils.operacoes.internal.SumHelper;

public class Calculadora {


    private DivHelper divHelper;
    private MultHelper multHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;


    public Calculadora(){
        divHelper = new DivHelper();
        multHelper = new MultHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();
    }


    public int div(int a, int b){
        return divHelper.execute(a,b);
    }

    public int mult(int a, int b){
        return multHelper.execute(a,b);
    }

    public int sub(int a ,int b){
        return subHelper.execute(a,b);
    }

    public int sun(int a, int b){
        return sumHelper.execute(a,b);
    }
}
