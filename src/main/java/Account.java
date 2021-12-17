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
            updateBalance(quantity);
        }
    }

    public void withdrawQuantity(double withdrawnQuantity){
        if((quantity-withdrawnQuantity)>0 && withdrawnQuantity>0){
            updateBalance(withdrawnQuantity*-1);
        }else{
            setQuantity(0);
        }
    }

    private void updateBalance(double quantityAddedOrWithdrawn){
            quantity += quantityAddedOrWithdrawn;
    }

}
