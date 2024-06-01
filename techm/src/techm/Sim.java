package techm;
import java.util.*;
public class Sim {
		    private int simId;
		    private String customerName;
		    private double balance;
		    private double ratePerSecond;
		    private String circle;
		    public Sim(int simId, String customerName, double balance, double ratePerSecond, String circle) {
		        this.simId = simId;
		        this.customerName = customerName;
		        this.balance = balance;
		        this.ratePerSecond = ratePerSecond;
		        this.circle = circle;
		    }
		    public int getSimId() {
		        return simId;
		    }

		    public void setSimId(int simId) {
		        this.simId = simId;
		    }

		    public String getCustomerName() {
		        return customerName;
		    }

		    public void setCustomerName(String customerName) {
		        this.customerName = customerName;
		    }

		    public double getBalance() {
		        return balance;
		    }

		    public void setBalance(double balance) {
		        this.balance = balance;
		    }

		    public double getRatePerSecond() {
		        return ratePerSecond;
		    }

		    public void setRatePerSecond(double ratePerSecond) {
		        this.ratePerSecond = ratePerSecond;
		    }

		    public String getCircle() {
		        return circle;
		    }

		    public void setCircle(String circle) {
		        this.circle = circle;
		    }

		    @Override
		    public String toString() {
		        return simId + " " + customerName + " " + circle + " " + ratePerSecond;
		    }
		

		
		    public static Sim[] transferCircle(Sim[] sims, String circle1, String circle2) {
		        List<Sim> result = new ArrayList<>();
		        for (Sim sim : sims) {
		            if (sim.getCircle().equals(circle1)) {
		                sim.setCircle(circle2);
		                result.add(sim);
		            }
		        }
		        result.sort(Comparator.comparingDouble(Sim::getRatePerSecond).reversed());
		        return result.toArray(new Sim[0]);
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        Sim[] sims = new Sim[5];
		        for (int i = 0; i < 5; i++) {
		            int simId = scanner.nextInt();
		            String customerName = scanner.next();
		            double balance = scanner.nextDouble();
		            double ratePerSecond = scanner.nextDouble();
		            String circle = scanner.next();
		            sims[i] = new Sim(simId, customerName, balance, ratePerSecond, circle);
		        }

		        String circle1 = scanner.next();
		        String circle2 = scanner.next();

		        Sim[] result = transferCircle(sims, circle1, circle2);
		        for (Sim sim : result) {
		            System.out.println(sim);
		        }

		        scanner.close();
		    }
		}


