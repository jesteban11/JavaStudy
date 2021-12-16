public class Account {

    String owner;
    double quantity;


    public Account(String owner) {
        this.owner = owner;
    }

    public Account(String owner, double quantityAdded) {
        this.owner = owner;
        addQuantity(quantityAdded);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void addQuantity(double quantity){
        if(quantity>0){
            this.quantity += quantity;
        }
    }

    public void withdrawQuantity(double withdrawnQuantity){
        double balance = calculateBalance(withdrawnQuantity, getQuantity());
        if(balance>0){
            setQuantity(balance);
        }else{
            setQuantity(0);
        }
    }

    private double calculateBalance(double withdrawnQuantity, double currentQuantity){
        return currentQuantity-withdrawnQuantity;
    }

}
