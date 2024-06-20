import java.util.List;
import java.util.ArrayList;

public class Decimal{
    private int binarioDecimal;
    private List<Integer> octalDecimal;

    public Decimal(){
        this.binarioDecimal = 0;
        this.octalDecimal = new ArrayList<Integer> ();
    }

    public void converterBinario(String num){

        if(num.matches("[01]+")){
            this.binarioDecimal = Integer.parseInt(num, 2);

            System.out.println("O número binário "+num+" em decimal equivale a:\n"+this.binarioDecimal);
        } else
            System.out.println("O tipo informado não pertence a base BINÁRIA!");

    }

    public void converterOctal(String num){
        int i, tempInt;
        char tempChar;

        if(num.matches("[0-7]+")){
            octalDecimal.clear();

            for(i=0;i < num.length();i++){
                tempChar = num.charAt(i);
                tempInt = Character.getNumericValue(tempChar);
                octalDecimal.add(tempInt*(int)Math.pow(8.0, num.length() - 1 - i));
            }

            System.out.println("O número octal "+num+" em decimal é: \n"+this.somarConversaoOctal());

        } else
            System.out.println("O tipo informado não pertence a base OCTAL");
    }

    private int somarConversaoOctal(){
        int soma = 0;

        for(int i : octalDecimal){
            soma += i;
        }

        return soma;
    }
}
