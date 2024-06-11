package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefalist;

    public ListaTarefa() {
        this.tarefalist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefalist.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
       List<Tarefa> tarefaParaRemover  = new ArrayList<>();
       for (Tarefa t : tarefalist) {
           if(t.getDescricao().equalsIgnoreCase(descricao)){
               tarefaParaRemover.add(t);
           }
       }
       tarefalist.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefalist.size();
    }

    public void obterDescricaoTarefa() {
        System.out.println(tarefalist);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("A");
        listaTarefa.adicionarTarefa("B");
        listaTarefa.adicionarTarefa("C");

        System.out.println(listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricaoTarefa();
        listaTarefa.removerTarefa("A");

        System.out.println(listaTarefa.obterNumeroTotalTarefas());
    }
}
