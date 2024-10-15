import java.time.LocalDate;
import java.time.Period;

public class Galinha2 {
    private String nome;
    private int idade;
    private String cor;

    public void salvarGalinha(){
        System.out.println("Eu salvei a galinha.");
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nomeMetodo){
        nome = nomeMetodo;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idadeMetodo){
        idade = idadeMetodo;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String corMetodo){
        cor = corMetodo;
    }

    public void calcularIdadeGalinha(String dataNascimento){
        Period period = Period.between(LocalDate.parse(dataNascimento), LocalDate.now());

        System.out.println("A galinha " + getNome() +" tem " + period.getYears()+" anos  e " + period.getMonths() + " meses de idade");
    }

}
