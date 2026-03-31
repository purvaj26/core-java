public class CalculatorRunner {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.add(7));
        System.out.println(calc.add(15));

        System.out.println(calc.add(8,2));
        System.out.println(calc.add(9,1));

        System.out.println(calc.add(4,5,6));
        System.out.println(calc.add(7,8,9));

        System.out.println(calc.add(2,4,6,8));
        System.out.println(calc.add(1,3,5,7));

        System.out.println(calc.add(10,20,30,40,50));
        System.out.println(calc.add(5,10,15,20,25));

        System.out.println(calc.add(3,6,9,12,15,18));
        System.out.println(calc.add(2,4,6,8,10,12));

        System.out.println(calc.add(11,22,33,44,55,66,77));
        System.out.println(calc.add(7,14,21,28,35,42,49));

        System.out.println(calc.add(1,3,5,7,9,11,13,15));
        System.out.println(calc.add(2,4,6,8,10,12,14,16));

        System.out.println(calc.add(9,18,27,36,45,54,63,72,81));
        System.out.println(calc.add(8,16,24,32,40,48,56,64,72));

        System.out.println(calc.add(5,10,15,20,25,30,35,40,45,50));
        System.out.println(calc.add(6,12,18,24,30,36,42,48,54,60));

        
        System.out.println(calc.sub(50,20));
        System.out.println(calc.sub(100,40));

        System.out.println(calc.sub(60,10,5));
        System.out.println(calc.sub(80,20,10));

        
        System.out.println(calc.mul(5,6));
        System.out.println(calc.mul(7,8));

        System.out.println(calc.mul(2,5,7));
        System.out.println(calc.mul(3,6,9));
    }
}