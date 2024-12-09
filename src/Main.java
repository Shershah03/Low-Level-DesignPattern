import com.design.pattern.strategy.SportyVehicle;
import com.design.pattern.strategy.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehicle vehicle=new SportyVehicle();
        vehicle.drive();
    }
}