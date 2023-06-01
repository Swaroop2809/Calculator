class Calculator {
        private double result;

        public Calculator() {
            result = 0.0;
        }

        public double getResult() {
            return result;
        }

        public void clearResult() {
            result = 0.0;
        }

        public void add(double num) {
            result += num;
        }

        public void subtract(double num) {
            result -= num;
        }

        public void multiply(double num) {
            result *= num;
        }
    

        public void divide(double num) {
            if (num != 0.0) {
                result /= num;
            } else {
                System.out.println("Error: Cannot divide by zero.");
            }
        }
    

    public static void main(String[] args) {
        Calculator calc =new Calculator();

        calc.add(5.0);
        System.out.println("Result: " + calc.getResult()); // Output: 5.0

        calc.subtract(2.5);
        System.out.println("Result: " + calc.getResult()); // Output: 2.5

        calc.multiply(3);
        System.out.println("Result: " + calc.getResult()); // Output: 7.5

        calc.divide(2);
        System.out.println("Result: " + calc.getResult()); // Output: 3.75

        calc.clearResult();
        System.out.println("Result: " + calc.getResult()); // Output: 0.0
    }

}
