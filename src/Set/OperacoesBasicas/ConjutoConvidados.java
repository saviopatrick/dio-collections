package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjutoConvidados {
    private Set<Convidado> convidadoSet;
    public ConjutoConvidados() {
        convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjutoConvidados conjutoConvidados = new ConjutoConvidados();


        conjutoConvidados.adicionarConvidado("nome1", 10);
        conjutoConvidados.adicionarConvidado("nome1", 11);
        conjutoConvidados.adicionarConvidado("nome2", 13);
        conjutoConvidados.adicionarConvidado("nome4", 11);
        conjutoConvidados.adicionarConvidado("nome5", 15);
        conjutoConvidados.exibirConvidados();
        System.out.println(conjutoConvidados.contarConvidados());
        conjutoConvidados.removerConvidado(10);
        System.out.println(conjutoConvidados.contarConvidados());
    }
}
