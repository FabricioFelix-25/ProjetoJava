public class Conditional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;


        String tipoPlano = "normal";

        if (anoDeLancamento >= 2022){
            System.out.println("lançamento que todos estao curtindo");
        } else {
            System.out.println("filme retro que vale a pena");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")){
        System.out.println("filme liberado");
        }else {
            System.out.println("este filme precisa de uma assinatura plus");
        }
    }
}
