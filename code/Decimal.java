import java.util.List;
import java.util.ArrayList;

public class Decimal{
    private int binarioDecimal;
    private List<Integer> listaDecimal;

    public Decimal(){
        this.binarioDecimal = 0;
        this.listaDecimal = new ArrayList<Integer> ();
    }
    //Conversão de binário para decimal;
    public void converterBinario(String num){

        if(num.matches("[01]+")){
            this.binarioDecimal = Integer.parseInt(num, 2);

            System.out.println("O número binário "+num+" em decimal equivale a:\n"+this.binarioDecimal);
        } else
            System.out.println("O tipo informado não pertence a base BINÁRIA!");

    }

    //Conversão de Octal para decimal
    public void converterOctal(String num){
        int i, tempInt;
        char tempChar;

        if(num.matches("[0-7]+")){
            listaDecimal.clear();

            for(i=0;i < num.length();i++){
                tempChar = num.charAt(i);
                tempInt = Character.getNumericValue(tempChar);
                listaDecimal.add(tempInt*(int)Math.pow(8.0, num.length() - 1 - i));
            }

            System.out.println("O número octal "+num+" em decimal é: \n"+this.somarConversao());

        } else
            System.out.println("O tipo informado não pertence a base OCTAL");
    }

    private int somarConversao(){
        int soma = 0;

        for(int i : listaDecimal){
            soma += i;
        }

        return soma;
    }

    public void converterHexadecimal(String num){
        int i, tempInt;
        char tempChar;
        
        if(num.matches("[0-9A-Fa-f]+")){
            listaDecimal.clear();

            for(i=0;i < num.length();i++){
                tempChar = num.charAt(i);
                switch(tempChar){
                    case 'A':
                        tempInt = 10;
                        break;
                    case 'B':
                        tempInt = 11;
                        break;
                    case 'C':
                        tempInt = 12;
                        break;
                    case 'D':
                        tempInt = 13;
                        break;
                    case 'E':
                        tempInt = 14;
                        break;
                    case 'F':
                        tempInt = 15;
                        break;
                    default: 
                        tempInt = Character.getNumericValue(tempChar);
                }

                listaDecimal.add(tempInt*(int)Math.pow(16, num.length() - 1 - i));
            }

            System.out.println("O número HEXADECIMAL "+num+" em decimal é: \n"+this.somarConversao());
            
        } else  
            System.out.println("O tipo informado não pertence a base HEXADECIMAL");
    }

    
}
