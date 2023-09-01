import javax.imageio.plugins.bmp.BMPImageWriteParam;

public class Main {
    public static void main(String[] args) {
         BmiService service = new BmiService();
        int weightInKg = 100;
        double heightInMeters =1.75;
        int bmi = service.calculate(weightInKg , heightInMeters);
        System.out.println(bmi);
    }
}
