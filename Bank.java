class Bank {
    String bankName;
    String branch;
    int numberOfAccounts;
    int numberOfEmployees;
    String managerName;
    boolean hasATM;
    boolean hasOnlineBanking;
    int establishedYear;
    double minimumBalance;
    String bankType;

    static String country = "India";
    static String serviceType = "Finance";

    public String openAccount(String customerName) {
        System.out.println("Account Opened: " + customerName);
        return customerName;
    }

    public double deposit(double amount) {
        System.out.println("Amount Deposited: " + amount);
        return amount;
    }

    public double withdraw(double amount) {
        System.out.println("Amount Withdrawn: " + amount);
        return amount;
    }

    public boolean closeAccount(boolean status) {
        System.out.println("Account Closed: " + status);
        return status;
    }

    public boolean approveLoan(boolean status) {
        System.out.println("Loan Approved: " + status);
        return status;
    }

    public String assignManager(String name) {
        System.out.println("Manager Assigned: " + name);
        return name;
    }

    public boolean openBank(boolean status) {
        System.out.println("Bank Open: " + status);
        return status;
    }

    public int calculateTotalAccounts(int total) {
        System.out.println("Total Accounts: " + total);
        return total;
    }

    public boolean maintainSecurity(boolean status) {
        System.out.println("Security Maintained: " + status);
        return status;
    }

    public String announceScheme(String scheme) {
        System.out.println("Scheme Announced: " + scheme);
        return scheme;
    }
}