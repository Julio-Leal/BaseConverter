import java.util.List;
import java.util.ArrayList;

public class Hexadecimal implements Base{
    private StringBuilder decimalHexadecimal;
    private List<Integer> resto;
    private String resultado;

    public Hexadecimal (){
        this.decimalHexadecimal = new StringBuilder();
        this.resto = new ArrayList<Integer> ();
    }

    @Override
    public String converterHexadecimal(String num) {
        return null;
    }

    @Override
    public String converterDecimal(String num){
        if(num.matches("\\d+")){
            int numInteger = Integer.parseInt(num);

            do{

                this.resto.add(numInteger%16);
                numInteger /= 16;

            }while(numInteger != 0);

            for(Integer valor : resto){
                if (valor < 10) {
                    decimalHexadecimal.append(String.valueOf(valor));
                } else {
                    char hexChar = (char) ('A' + (valor - 10));
                    decimalHexadecimal.append(String.valueOf(hexChar));
                }
            }

            this.resultado = decimalHexadecimal.reverse().toString();
        } else  
            this.resultado = "O tipo informado não pertence a base DECIMAL";
        
        return this.resultado;
    }

    @Override
    public String converterOctal(String num){
        String octalBinario;
        String binarioDecimal;

        if(num.matches("[0-7]+")){
            Binario binario = new Binario();
            Decimal decimal = new Decimal();

            octalBinario = binario.converterOctal(num);
            binarioDecimal = decimal.converterBinario(octalBinario);

            this.resultado = converterDecimal(binarioDecimal);
        } else
            resultado = "O timpo informado não pertence a base Octal";

        return this.resultado;
    }

    public String getResultado(){
        return this.resultado;
    }
}
