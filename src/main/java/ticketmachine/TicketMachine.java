package ticketmachine;

public class TicketMachine {
    private final int price;
    private int balance;
    private int total;

    public TicketMachine(int ticketCost) {
        if (ticketCost <= 0) {
            throw new IllegalArgumentException("Ticket price must be positive");
        }
        price = ticketCost;
        balance = 0;
        total = 0;
    }

    public int getPrice() {
        return price;
    }

    public int getTotal() {
        return total;
    }

    public int getBalance() {
        return balance;
    }

    public void insertMoney(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Inserted amount must be positive");
        }
        balance += amount;
    }

    public int refund() {
        int refundAmount = balance;
        System.out.println("Je vous rends : " + refundAmount + " centimes");
        balance = 0;
        return refundAmount;
    }

    public boolean printTicket() {
        if (balance < price) {
            System.out.println("Montant insuffisant pour imprimer un ticket !");
            return false;
        }

        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        total += price;
        balance -= price;
        return true;
    }
}
