import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public abstract class Transport {
    private String brand;
    private String model;

    public Transport(String brand,String model){
        this.brand=validateCarParameters(brand);
        this.model=validateCarParameters(model);
        }

        public static String validateCarParameters(String value){return value==null ? "не указано": value;}

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
    public abstract void start();
}
