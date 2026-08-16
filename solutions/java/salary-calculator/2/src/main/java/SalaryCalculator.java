public class SalaryCalculator {

    private static final int MIN_DAYS_SKIPPED_FOR_PENALTY = 5;
    private static final double ABSENCE_PENALTY = 0.15;

    private static final int MIN_PRODUCTS_FOR_BONUS = 20;
    private static final int BONUS_PER_PRODUCT_ABOVE_THRESHOLD = 13;
    private static final int BONUS_PER_PRODUCT_BELOW_THRESHOLD = 10;

    private static final double BASE_SALARY = 1000.00;
    private static final double MAX_SALARY = 2000.00;

    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= MIN_DAYS_SKIPPED_FOR_PENALTY
                ? 1.0 - ABSENCE_PENALTY
                : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= MIN_PRODUCTS_FOR_BONUS
                ? BONUS_PER_PRODUCT_ABOVE_THRESHOLD
                : BONUS_PER_PRODUCT_BELOW_THRESHOLD;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary =
                BASE_SALARY * salaryMultiplier(daysSkipped)
                + bonusForProductsSold(productsSold);

        return Math.min(salary, MAX_SALARY);
    }
}