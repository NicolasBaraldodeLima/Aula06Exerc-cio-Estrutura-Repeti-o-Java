public class Aula06EstruturasDeRepeticao04 {

    public static void main(String[] args) {
        // Dado o valor de um carro, descubra o quanto ele pode ser parcelado
        // Condição valorParcela >= 1000

        double valorTotal = 3000;
        for (int parcela = 1; parcela < valorTotal ; parcela++) {
            double valorParcela = valorTotal / parcela;

            if (valorParcela < 1000) {
                break;
            }

            System.out.println("Parcela " + parcela+ " R$ " + valorParcela);
            
        }
    }
}
