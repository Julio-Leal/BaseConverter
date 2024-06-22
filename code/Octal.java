public class Octal implements Base{
    private String resultado;
    private StringBuilder octal;

    public Octal(){
        this.resultado = "";
        this.octal = new StringBuilder();
    }

    @Override
    public String converterOctal(String num) {
        return null;
    }

    @Override
    public String converterDecimal(String num) {

        if(num.matches("\\d+")){

            int numInteiro = Integer.parseInt(num);
            int resto;

            do{

                resto = numInteiro % 8;
                numInteiro /= 8;
                octal.append(resto);

            }while(numInteiro != 0);

            this.resultado = octal.reverse().toString();

        } else  

            this.resultado = "O tipo informado não pertence a base Decimal!";

        return this.resultado;
    }

    @Override
    public String converterHexadecimal(String num) {

        if(num.matches("[0-9A-Fa-f]+")){

            String hexadecimalDecimal;
            String decimalOctal;

            Decimal decimal = new Decimal();
            hexadecimalDecimal = decimal.converterHexadecimal(num);
            decimalOctal = this.converterDecimal(hexadecimalDecimal);

            this.resultado = decimalOctal;

        } else

            this.resultado = "O tipo informado não pertence a base Hexadecimal!";

        return this.resultado;
    }

    public String getResultado(){
        return this.resultado;
    }

}
