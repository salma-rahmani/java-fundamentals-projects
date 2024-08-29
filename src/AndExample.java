public class AndExample {



        public static void main(String[] args) {
            int numberOne = 10;
            int numberTwo = 20;
            int numberThree = 25;
            int numberFour = 25;

            int resultOne = numberOne + numberTwo;
            int resultTwo = numberThree + numberFour;

            boolean isEqual = (resultOne == resultTwo) && (numberOne == numberFour);

            System.out.println(" Is equal ?" + isEqual);

        }
    }

