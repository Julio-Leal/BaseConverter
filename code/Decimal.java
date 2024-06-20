public class Decimal{
    private int decimal;

    public Decimal(){
        this.decimal = 0;
    }

    public void converterBinario(String num){
        
        if(num.matches("[01]+")){
            this.decimal = Integer.parseInt(num, 2);

            System.out.println("O número binário "+num+" em decimal equivale a:\n"+this.decimal);
        } else
        System.out.println("O tipo informado não pertence a base binária!");
    }
}
