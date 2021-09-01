enum Gender {
		MALE, FEMALE
	}
    enum WeekDay { 
    	SUN, MON, TUE, WED, THU, FRI, SAT
   	}
    enum WeekDay2 { 
    	SUN(100), MON(200), TUE(5000), WED(10000), THU(3000), FRI(8000), SAT(1000);
    	private final int number;
    	WeekDay2(int number) {
    		this.number = number;
    	}
		public int getNumber() {
			return number;
		}
    }
    enum Planet {
        MERCURY (3.303e+23, 2.4397e6),
        VENUS   (4.869e+24, 6.0518e6),
        EARTH   (5.976e+24, 6.37814e6),
        MARS    (6.421e+23, 3.3972e6),
        JUPITER (1.9e+27,   7.1492e7),
        SATURN  (5.688e+26, 6.0268e7),
        URANUS  (8.686e+25, 2.5559e7),
        NEPTUNE (1.024e+26, 2.4746e7);

        private final double mass;   // in kilograms
        private final double radius; // in meters
        Planet(double mass, double radius) {
            this.mass = mass;
            this.radius = radius;
        }
        private double mass() { return mass; }
        private double radius() { return radius; }

        // universal gravitational constant  (m3 kg-1 s-2)
        public static final double G = 6.67300E-11;

        public double surfaceGravity() {
            return G * mass / (radius * radius);
        }
        
        public double surfaceWeight(double otherMass) {
            return otherMass * surfaceGravity();
        }
    }

	enum Geometry {
		SPHERE(1),
		CONE(2),
		CYLINDER(3),
		RECTANGULAR_PRISM(4),
		SQUARE_PYRAMID(5),
		ISOSCELES_TRIANGULAR_PRISM(6);
		
		private int type;
		
		private Geometry(int type) {
			this.type = type;
		}
			
		public static Geometry valueOf(int value) {
			switch(value) {
			case 1:
				return SPHERE;
			case 2:
				return CONE;
			case 3:
				return CYLINDER;
			case 4:
				return RECTANGULAR_PRISM;
			case 5:
				return SQUARE_PYRAMID;
			case 6:
				return ISOSCELES_TRIANGULAR_PRISM;
			}
			return null;
		}
		
		public int getType() {
			return type;
		}
	}

	enum Operation {
		PLUS,
		MINUS,
		TIMES,
		DIVIDE;

		double calculate(double x, double y) {
			switch (this) {
				case PLUS:
					return x + y;
				case MINUS:
					return x - y;
				case TIMES:
					return x * y;
				case DIVIDE:
					return x / y;
				default:
					throw new AssertionError("Unknown operations " + this);
			}
		}
	}
	
public class Enum {
    public static void main(String args[]) {
    	
		for (Gender gen : Gender.values()) {
	           System.out.println("Gender " + gen);
	    }
		
		for (WeekDay day : WeekDay.values()) {
	       	switch (day) {
		    	case SUN: System.out.println("WeekDay " + day); break;
		    	case MON: System.out.println("WeekDay " + day); break;
		    	case TUE: System.out.println("WeekDay " + day); break;
		    	case WED: System.out.println("WeekDay " + day); break;
		    	case THU: System.out.println("WeekDay " + day); break;
		    	case FRI: System.out.println("WeekDay " + day); break;
		    	case SAT: System.out.println("WeekDay " + day); break;
	    	}
		}    	   
		System.out.println("WeekDay FirstDay = " + WeekDay.SUN);
		System.out.println("WeekDay Mon = " + WeekDay.MON);
		System.out.println("WeekDay Fri = " + WeekDay.FRI);

		for (WeekDay2 d : WeekDay2.values()) {
	           System.out.printf("WeekDay2 = %d%n", d.getNumber());
	    }
		
        for (Planet p : Planet.values()) {
           System.out.printf("Planet %s surface gravity is %f%n",
                             p, p.surfaceGravity());
        }

		for (Geometry geo : Geometry.values()) {
           System.out.println("Geometry " + geo + " " + geo.getType());
		}
		
		for (int i = 1; i<=6; i++) {
			System.out.println("Geometry " + Geometry.valueOf(i));
		}
		
		for (Operation op : Operation.values()) {
	           System.out.println("Operation " + op);
    	}
		double result = Operation.PLUS.calculate(1, 2);
        System.out.println(result); //3.0
		result = Operation.MINUS.calculate(1, 2);
        System.out.println(result); //-1.0
		result = Operation.TIMES.calculate(1, 2);
        System.out.println(result); //2.0
		result = Operation.DIVIDE.calculate(1, 2);
        System.out.println(result); //0.5
	}
}
