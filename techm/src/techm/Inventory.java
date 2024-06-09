package techm;
import java.util.*;
public class Inventory {
	    private String inventoryId;
	    private int maximumQuantity;
	    private int currentQuantity;
	    private int threshold;

	    public String getInventoryId() {
	        return inventoryId;
	    }

	    public void setInventoryId(String inventoryId) {
	        this.inventoryId = inventoryId;
	    }

	    public int getMaximumQuantity() {
	        return maximumQuantity;
	    }

	    public void setMaximumQuantity(int maximumQuantity) {
	        this.maximumQuantity = maximumQuantity;
	    }

	    public int getCurrentQuantity() {
	        return currentQuantity;
	    }

	    public void setCurrentQuantity(int currentQuantity) {
	        this.currentQuantity = currentQuantity;
	    }

	    public int getThreshold() {
	        return threshold;
	    }

	    public void setThreshold(int threshold) {
	        this.threshold = threshold;
	    }
	}

	