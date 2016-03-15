package Lab5;



/**
 * @author Lleyn
 */
public class Lab5 {
        public static class Circle {
        double x,y;
        double r;
            public Circle() {
                x = Staff.Input.integer();
                y = Staff.Input.integer();
                r = Staff.Input.integer();
            }

            /**
             * Можно инициализировать переменную типа Circle с параметрами
             * @param a Координата х
             * @param b Координата y
             * @param c Радиус круга
             */
            public Circle(double a, double b, double c){
                x = a;
                y = b;
                r = c;
            }

            /**
             *
             * @return Длина окружности
             */
            public double circuit(){
                return 2*r*Math.PI;
            }

            /**
             * Перемещает центр окружности в случайную точку в квадрате с диагональю (-99;-99)(99;99)
             */
            public void move() {
                x = (double)Math.random()*199-99;
                y = (double)Math.random()*199-99;
            }
            public void print(){
                System.out.println("Окружность с центром ("+x+";"+y+") и радиусом "+r);
            }

            /**
             *
             * @param b Окружность до которой необхоимо проверить расстояние
             * @return Расстояние до центра 2-й окружности
             */
            public double length(Circle b){
                double c = x-b.x;
                double d = y-b.y;
                return (Math.sqrt(c*c+d*d));
            }

            /**
             * Проверка касаемости окружностей в 1 точке
             * @param b Проверяемая на касание окружность
             */
            public void touch(Circle b){
                double c = x-b.x;
                double d = y-b.y;
                if ((Math.sqrt(c*c+d*d) == (r+b.r))||(Math.abs(r-b.r) == Math.sqrt(c*c+d*d))){
                    System.out.println("Окружности касаются в 1 точке.");
                }
                else  {
                    System.out.println("Окружности не касаются в 1 точке.");
                }
            }
    }

    public static void main(String[] args) {
        Circle a = new Circle();
        Circle b = new Circle();
        a.print();
        b.print();
        a.touch(b);
    }
}
