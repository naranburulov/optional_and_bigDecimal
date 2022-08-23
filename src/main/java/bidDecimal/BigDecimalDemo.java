package bidDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {

    public static void main(String[] args) {

        double amount1 = 374.56;
        double amount2 = 374.26;
        System.out.println(amount1-amount2);    //0.30

        BigDecimal b1 = new BigDecimal("374.56");
        BigDecimal b2 = new BigDecimal("374.26");
        BigDecimal b3 = BigDecimal.valueOf(374.56);
        BigDecimal b4 = BigDecimal.TEN;
        BigDecimal b5 = BigDecimal.ONE;

        System.out.println(b1.subtract(b2));        // can not do b1-b2, because they are objects
        System.out.println(b1.add(BigDecimal.TEN));
        System.out.println(b1.multiply(new BigDecimal("15.00")));
        System.out.println(b1.multiply(BigDecimal.valueOf(15.56)));

        System.out.println("Scaling");

        BigDecimal num1 = new BigDecimal("23.122");
        System.out.println(num1.setScale(1, RoundingMode.CEILING));
        System.out.println(num1.setScale(1, RoundingMode.FLOOR));
        System.out.println(num1.setScale(2, RoundingMode.FLOOR));
        System.out.println(num1.setScale(2, RoundingMode.CEILING));
        System.out.println(num1.setScale(2, RoundingMode.UP));
        System.out.println(num1.setScale(2, RoundingMode.DOWN));

        //Do not use equals() anymore. Instead use compareTo()
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2")));
        System.out.println(new BigDecimal("3").compareTo(new BigDecimal("2")));
        System.out.println(new BigDecimal("1").compareTo(new BigDecimal("2")));







    }
}

class Employee{
    private String name;
    private BigDecimal salary;
//  private double salary;     never use double anymore, use BigDecimal instead
}
