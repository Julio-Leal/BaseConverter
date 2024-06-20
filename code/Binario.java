
import java.util.ArrayList;
import java.util.List;

public class Binario implements Base{
    private List<Integer> binario;
    
    public Binario() {
        this.binario = new ArrayList<Integer> ();
    }

    public void calcularConversao(String num){
        int numInteiro, resto;
        
        if(num.matches("\\d+")){
            numInteiro = Integer.parseInt(num); 
            binario.clear();

            do{

                resto = numInteiro%2;
                numInteiro = numInteiro/2;
                binario.add(resto);

            }while(numInteiro != 0);
            
            System.out.println("O número "+num+" equivale a :");
            this.listarSequencia();
        }else 
            System.out.println("O tipo informado não pertence a base decimal!");
    }

    private void listarSequencia(){
        int i;

        for(i = binario.size() - 1 ; i >=0 ;i--){
            System.out.printf("%d", binario.get(i));
        }

        System.out.println();
    }
}
