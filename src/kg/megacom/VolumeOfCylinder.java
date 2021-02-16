package kg.megacom;

public class VolumeOfCylinder {
    private double r;
    private double h;

    public VolumeOfCylinder(){
    }
    public VolumeOfCylinder(double r, double h){
        this.r = r;
        this.h = h;
    }

    public double m3(){
        double summ = 3.1415*(r*r)*h;
        if (r < 0 || h < 0) {
            try {
                throw new NegativeValueException("'a' or 'b' less than 0");
            } catch (NegativeValueException e) {
                System.out.println("Attention!");
                e.printMessage();
            }
            double summ1 = -summ;
            System.out.println("Exception: Inside method print: " + summ1);
        } else {
            System.out.println("Right! Inside method print: " + summ);
        }
        return summ;
    }

//    public double print(double r, double h) {
//        double summ = 3.1415 * (r * r) * h;
//        if (r < 0 || h < 0) {
//            try {
//                throw new NegativeValueException("a or b less than 0");
//            } catch (NegativeValueException e) {
//                System.out.println("Attention!");
//                e.printMessage();
//            }
//            double summ1 = -summ;
//            System.out.println("Exception: Inside method print: " + summ1);
//        }else
//        System.out.println("Inside method print: " + summ);
//        return summ;
//    }

//    private void testWith() {
//        try {
//            throw new NegativeValueException("a or b less than 0");
//        } catch (NegativeValueException e) {
//            System.out.println("Attention!");
//            e.printMessage();
//        }
//    }
//
//    public double test(double r, double h) {
//        double summ = 3.1415*(r*r)*h;
//        if(r < 0 || h < 0){
//            testWith();
//        }else
//            return summ;
//        return summ;
//    }
}
