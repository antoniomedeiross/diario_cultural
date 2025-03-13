import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Diario {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Ana");
        nomes.add("Belo");
        nomes.add("Belo");
        nomes.add("Belo");
        nomes.add("Belo");

        for(String nome : nomes) {
            System.out.println(nome);
        }
    }
}