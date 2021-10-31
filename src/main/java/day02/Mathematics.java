package day02;

public class Mathematics {

    public boolean isPrime(int number){

        if (numberOfDivisor(number) == 2){
            return true;
        }
        return false;
    }

    public int numberOfDivisor(int number){

        int result = 0;

        for (int i = 1; i <= number; i++){
            if (number % i == 0){
                result++;
            }
        }
        return result;
    }
}
