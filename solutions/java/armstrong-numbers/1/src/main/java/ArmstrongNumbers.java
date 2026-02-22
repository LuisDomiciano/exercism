class ArmstrongNumbers {
    boolean isArmstrongNumber(int numberToCheck) {
        if (numberToCheck < 10) return true;
        
        int copy = numberToCheck;
        int digits = 0;
        int temp = numberToCheck;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }
        temp = numberToCheck;
        int sum = 0;
        while(temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }
            sum += power;
            if (sum > copy) return false;
            temp /= 10;
        }
        return sum == copy;
    }
}
