class BankAccount {
    public static void main(String[] args) {

        byte branchCode = 12;
        short pin = 1234;
        int balance = 75000;
        long accountNumber = 987654321012L;
        float interestRate = 6.5f;
        double loanAmount = 250000.50;
        char accountType = 'S';
        boolean isActive = true;
        String bankName = "SBI";

        System.out.println("Branch Code: " + branchCode);
        System.out.println("PIN: " + pin);
        System.out.println("Balance: " + balance);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Account Type: " + accountType);
        System.out.println("Active: " + isActive);
        System.out.println("Bank Name: " + bankName);
    }
}