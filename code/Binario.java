public class Binario implements Base {
    private StringBuilder binario;
    private String resultado;

    public Binario() {
        this.resultado = "";
        this.binario = new StringBuilder();
    }

    @Override
    public String converterHexadecimal(String num) {
        return null;
    }

    @Override
    public String converterDecimal(String num) {
        if (num.matches("\\d+")) {
            int numInteiro = Integer.parseInt(num);
            int resto;

            do {

                resto = numInteiro % 2;
                numInteiro = numInteiro / 2;
                binario.append(resto);

            } while (numInteiro != 0);

            this.resultado = binario.reverse().toString(); 

        } else 
            this.resultado = "O tipo informado não pertence a base decimal!";

        return this.resultado;
    }

    @Override
    public String converterOctal(String num) {
        int i;
        char tempChar;

        if(num.matches("[0-7]+")){
            for(i=0; i<num.length();i++){
                tempChar = num.charAt(i);
                binario.append(compararValores(tempChar));
            }

            this.resultado = binario.toString();
        } else
            this.resultado = "O timpo informado não pertence a base Octal!";
        
        return this.resultado;
    }
    
    //submethod from converterOctal()
    public String compararValores(char valor){
        String retorno = "";
        switch(valor){
            case '0': retorno = "000"; break;
            case '1': retorno = "001"; break;
            case '2': retorno = "010"; break;
            case '3': retorno = "011"; break;
            case '4': retorno = "100"; break;
            case '5': retorno = "101"; break;
            case '6': retorno = "110"; break;
            case '7': retorno = "111"; break;
        }
        return retorno;
    }

    public String getResultado() {
        return this.resultado;
    }

}
