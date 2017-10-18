public class Calculator {
    private double num1;
    private double num2;

    public Calculator(double a, double b){
        this.num1 = a;
        this.num2 = b;
    }

    public double add(){
        return num1 + num2;
    }

    public double subtract(){
        return num1 - num2;
    }

    public double multiply(){
        return num1 * num2;
    }

    public double divide(){
        return num1 / num2;
    }
}
