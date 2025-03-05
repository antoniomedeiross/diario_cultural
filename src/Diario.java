import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Diario {
    public static void main(String[] args) {
        String year = "2020";
        LocalDate data = LocalDate.ofEpochDay(LocalDate.now().getYear());
        if(year.matches("[0-9]{4}") && data.isAfter(LocalDate.parse(year))){
            System.out.println(year);
        } else {
            System.out.println("Padrão de ano inválido");
        }
    }
}