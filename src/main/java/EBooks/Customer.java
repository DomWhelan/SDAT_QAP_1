package EBooks;

public class Customer {

    private String userName;
    private String email;
    private String creditNum = "";
    private Boolean subscriptionStatus;
    public static int customerCount = 0;

    public Customer(){
        this.userName = "User";
        this.email = "";
        this.subscriptionStatus = false;
        customerCount++;
    }

    public Customer(String userName, String userEmail){
        this.userName = userName;
        this.email = userEmail;
        this.subscriptionStatus = false;
        customerCount++;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public Boolean methodOfPayVerify(){
        return !this.creditNum.equals("");
    }

    public Boolean getSubscriptionStatus() {
        return subscriptionStatus;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void subscribe(String credNumber){
        this.creditNum = credNumber;
        this.subscriptionStatus = true;
    }

    public void unSubscribe(){
        this.creditNum = "";
        this.subscriptionStatus = false;
    }
}
