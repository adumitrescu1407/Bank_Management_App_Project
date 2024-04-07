package pojo;

public abstract class TradeAccount {

    private String id;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // CONSTRUCTOR

    public TradeAccount(String id) {
        this.setId(id);
    }

    public abstract TradeAccount clone();

}