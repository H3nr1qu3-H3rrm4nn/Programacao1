public class App {
    public static void main(String[] args) throws Exception{


            Galinha2 carijo = new Galinha2();
            
            carijo.setNome("Carijó");
            carijo.setIdade(32);
            carijo.setCor("Carijó");

            System.out.println("Eu cadastrei a galinha " + carijo.getNome());

            //System.out.println("A galinha "+ carijo.getNome() + " tem "+ carijo.getIdade() + " anos de idade e sua cor é "+ carijo.getCor());

            //galinha2.calcularIdadeGalinha("2000-06-10");

            Galinha2 mimosa = new Galinha2();

            mimosa.setNome("Mimosa");
            mimosa.setIdade(5);
            mimosa.setCor("Azul");

            System.out.println("Eu cadastrei a galinha " + mimosa.getNome());
    }
}
