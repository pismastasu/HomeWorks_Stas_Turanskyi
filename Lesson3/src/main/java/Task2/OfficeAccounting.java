package Task2;

/**
 * Created by Stanislav on 30.07.2016.
 */
public class OfficeAccounting {
    String holderName;
    Short holderId;
    String itemName;
    float itemPrice;

    class Holder {
        private String holderName;
        private Short holderId;
        private String itemName;
        private float itemPrice;
    }

    public Holder(){
        this.holderName ="";
        this.holderId = 0;
        this.itemName ="";
        this.itemPrice = 0f;
    }

    public OfficeAccounting (Short holderId , String holderName, String itemName, int itemPrice) {
        this.holderId = holderId;
        this.holderName = holderName;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public String getHolderName(){
        return this.holderName;
    }

    public String setHolderName(String holderName){
        return this.holderName;
    }

    public Short getHolderId(){
        return this.holderId;
    }

    public Short setHolderId(Short holderId){
        return this.holderId;
    }

    public String getItemName){
        return this.itemName;
    }

    public String setItemName(String itemName){
        return this.itemName;
    }

    public double getItemPrice(float itemPrice){
        return this.itemPrice;
    }

    public double setItemPrice(float itemPrice){
        return this.itemPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OfficeAccounting that = (OfficeAccounting) o;

        if (Float.compare(that.itemPrice, itemPrice) != 0) return false;
        if (holderName != null ? !holderName.equals(that.holderName) : that.holderName != null) return false;
        if (holderId != null ? !holderId.equals(that.holderId) : that.holderId != null) return false;
        if (itemName != null ? !itemName.equals(that.itemName) : that.itemName != null) return false;
        return getItemName != null ? getItemName.equals(that.getItemName) : that.getItemName == null;

    }

    @Override
    public int hashCode() {
        int result = holderName != null ? holderName.hashCode() : 0;
        result = 31 * result + (holderId != null ? holderId.hashCode() : 0);
        result = 31 * result + (itemName != null ? itemName.hashCode() : 0);
        result = 31 * result + (itemPrice != +0.0f ? Float.floatToIntBits(itemPrice) : 0);
        result = 31 * result + (getItemName != null ? getItemName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OfficeAccounting{" +
                "holderName='" + holderName + '\'' +
                ", holderId=" + holderId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }


    public static void main (String[] args)
    {
        System.out.println("Filling Data...");

    }


}
