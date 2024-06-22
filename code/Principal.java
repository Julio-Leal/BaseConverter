public class Principal {
    public static void main(String[] args) {
        gui.Screen janelaPrincipal = new gui.Screen();

        Binario binario = new Binario();

        binario.calcularConversao("1979");
        
        Decimal decimal = new Decimal();
        decimal.converterBinario("11110111011");

        decimal.converterOctal("54721");

        decimal.converterHexadecimal("24FED");
    }   
}
