import java.time.LocalDate;
import java.time.Period;

public class Galinha2 {
    private String nome;
    private int idade;
    private String cor;

    

    public void calcularIdadeGalinha(String dataNascimento){
        Period period = Period.between(LocalDate.parse(dataNascimento), LocalDate.now());

        System.out.println("A galinha " + getNome() +" tem " + period.getYears()+" anos  e " + period.getMonths() + " meses de idade");
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public int getIdade() {
        return idade;
    }



    public void setIdade(int idade) {
        this.idade = idade;
    }



    public String getCor() {
        return cor;
    }



    public void setCor(String cor) {
        this.cor = cor;
    }

}
