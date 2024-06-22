import java.util.List;
import java.util.ArrayList;

public class Decimal implements Base {
    private int binarioDecimal;
    private List<Integer> listaDecimal;
    private String resultado;

    public Decimal() {
        this.binarioDecimal = 0;
        this.listaDecimal = new ArrayList<Integer>();
        this.resultado = "";
    }

    @Override
    public String converterDecimal(String num) {
        return null; 
    }

    public String converterBinario(String num) {
        if (num.matches("[01]+")) {
            this.binarioDecimal = Integer.parseInt(num, 2);

            this.resultado = String.valueOf(binarioDecimal);
        } else {
            this.resultado = "O tipo informado não pertence a base BINÁRIA!";
        }

        return this.resultado;
    }

    public String converterOctal(String num) {
        int tempInt;
        char tempChar;

        if (num.matches("[0-7]+")) {
            listaDecimal.clear();
            for (int i = 0; i < num.length(); i++) {
                tempChar = num.charAt(i);
                tempInt = Character.getNumericValue(tempChar);
                listaDecimal.add(tempInt * (int) Math.pow(8.0, num.length() - 1 - i));
            }
            this.resultado = String.valueOf(this.somarConversao());
        } else {
            this.resultado = "O tipo informado não pertence a base OCTAL";
        }

        return this.resultado;
    }

    public String converterHexadecimal(String num) {
        int tempInt;
        char tempChar;

        if (num.matches("[0-9A-Fa-f]+")) {
            listaDecimal.clear();
            for (int i = 0; i < num.length(); i++) {
                tempChar = num.charAt(i);
                switch (tempChar) {
                    case 'A': tempInt = 10; break;
                    case 'B': tempInt = 11; break;
                    case 'C': tempInt = 12; break;
                    case 'D': tempInt = 13; break;
                    case 'E': tempInt = 14; break;
                    case 'F': tempInt = 15; break;
                    default: tempInt = Character.getNumericValue(tempChar);
                }
                listaDecimal.add(tempInt * (int) Math.pow(16, num.length() - 1 - i));
            }

            this.resultado = String.valueOf(this.somarConversao());
        } else {
            this.resultado = "O tipo informado não pertence a base HEXADECIMAL";
        }

        return this.resultado;
    }

    private int somarConversao() {
        int soma = 0;
        for (int i : listaDecimal) {
            soma += i;
        }
        return soma;
    }

    public String getResultado() {
        return resultado;
    }
}
