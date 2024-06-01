package techm;

public class TravelAgencies {
	    private int regNo;
	    private String agencyName;
	    private String packageType;
	    private int price;
	    private boolean flightFacility;
	    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
	        this.regNo = regNo;
	        this.agencyName = agencyName;
	        this.packageType = packageType;
	        this.price = price;
	        this.flightFacility = flightFacility;
	    }
	    public int getRegNo() {
	        return regNo;
	    }

	    public void setRegNo(int regNo) {
	        this.regNo = regNo;
	    }

	    public String getAgencyName() {
	        return agencyName;
	    }

	    public void setAgencyName(String agencyName) {
	        this.agencyName = agencyName;
	    }

	    public String getPackageType() {
	        return packageType;
	    }

	    public void setPackageType(String packageType) {
	        this.packageType = packageType;
	    }

	    public int getPrice() {
	        return price;
	    }

	    public void setPrice(int price) {
	        this.price = price;
	    }

	    public boolean isFlightFacility() {
	        return flightFacility;
	    }

	    public void setFlightFacility(boolean flightFacility) {
	        this.flightFacility = flightFacility;
	    }

	    public static void main(String[] args) {
	        TravelAgencies[] agencies = new TravelAgencies[4];
	        agencies[0] = new TravelAgencies(123, "A2Z Agency", "Platinum", 50000, true);
	        agencies[1] = new TravelAgencies(345, "SSS Agency", "Gold", 30000, false);
	        agencies[2] = new TravelAgencies(987, "Cox and Kings", "Diamond", 40000, true);
	        agencies[3] = new TravelAgencies(888, "Global Tours", "Silver", 20000, false);
	        int highestPackagePrice = findAgencyWithHighestPackagePrice(agencies);
	        System.out.println(highestPackagePrice);

	        TravelAgencies result = agencyDetailsForGivenIdAndType(agencies, 987, "Diamond");
	        if (result != null) {
	            System.out.println(result.getAgencyName() + ":" + result.getPrice());
	        } else {
	            System.out.println("No matching agency found.");
	        }
	    }

	    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] agencies) {
	        int maxPrice = Integer.MIN_VALUE;
	        for (TravelAgencies agency : agencies) {
	            if (agency.getPrice() > maxPrice) {
	                maxPrice = agency.getPrice();
	            }
	        }
	        return maxPrice;
	    }

	    public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] agencies, int regNo, String packageType) {
	        for (TravelAgencies agency : agencies) {
	            if (agency.isFlightFacility() &&
	                agency.getRegNo() == regNo &&
	                agency.getPackageType().equalsIgnoreCase(packageType)) {
	                return agency;
	            }
	        }
	        return null;
	    }
	}

