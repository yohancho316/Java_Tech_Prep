package Technical_Interviews;

public class Arete_Exercise_Three {

    // Juice Class
    public static class Juice {

        // Juice Class Member Properties
        private String name;
        private double capacity;


        // Default Constructor w/ No Arguments (Default Juice is Orange Juice)
        public Juice()
        {
            this.name = "Orange";
            this.capacity = 1.0;
        }


        // Overloaded Constructor w/ Primitive Type Arguments
        public Juice(String _name, double _capacity)
        {

            // Check if String Argument is Null. Throw the NullPointerException Runtime Exception if True
            if(_name == null) throw new NullPointerException("Input cannot be Null");


            // Check if String Argument is Empty. Throw the Illegal Argument Runtime Exception if True.
            if(_name.isEmpty()) throw new IllegalArgumentException("Name cannot be an Empty String");


            // Check if Capacity is a Valid Non-Negative Value. Throw the Illegal Argument Runtime Exception if True.
            if(_capacity < 0.0000001) throw new IllegalArgumentException("Capacity cannot be Negative");


            this.name = _name;
            this.capacity = _capacity;
        }


        // Overloaded Constructor w/ 2 Juice Type Objects
        public Juice(Juice obj_1, Juice obj_2)
        {

            // Check if Juice Objects are Null. Throw the NullPointerException Runtime Exception if True
            if((obj_1 == null) || (obj_2 == null)) throw new NullPointerException("Object cannot be Null");


            // Check if Juice Object Name Property are Empty. Throw the Illegal Argument Runtime Exception if True.
            if((obj_1.name.isEmpty() || (obj_2.name.isEmpty()))) throw new IllegalArgumentException("Name cannot be an Empty String");


            // Check if Capacity is a Valid Non-Negative Value. Throw the Illegal Argument Runtime Exception if True.
            if((obj_1.capacity  < 0.0000001) || (obj_2.capacity  < 0.0000001)) throw new IllegalArgumentException("Capacity cannot be Negative");


            // Concatenate the Two Juice Object Names
            this.name = mergeNames(obj_1.name, obj_2.name);


            // Sum the Two Juice Contents
            this.capacity = mergeLiquids(obj_1.capacity, obj_2.capacity);
        }


        // Set Name Method
        public void setName(String _name)
        {

            // Check if String Argument is Null.  Throw the NullPointerException Runtime Exception if True
            if(_name == null) throw new NullPointerException("Input cannot be Null");


            // Check if String Argument is Empty. Throw the Illegal Argument Runtime Exception if True.
            if(_name.isEmpty()) throw new IllegalArgumentException("Name cannot be an Empty String");


            this.name = _name;
        }


        // Set Capacity Method
        public void setCapacity(double _capacity)
        {

            // Check if Capacity is a Valid Non-Negative Value. Throw the Illegal Argument Runtime Exception if True.
            if(_capacity < 0.0000001) throw new IllegalArgumentException("Capacity cannot be Negative");

            this.capacity = _capacity;
        }


        // Get Name Method
        public String getName()
        {
            return this.name;
        }


        // Get Capacity Method
        public double getCapacity()
        {
            return this.capacity;
        }


        // Perform String Concatenation Method
        public String mergeNames(String name1, String name2)
        {

            // Check if String Arguments are Null. Throw the NullPointerException Runtime Exception if True
            if((name1 == null) || (name2 == null)) throw new NullPointerException("Input cannot be Null");


            // Check if String Arguments are Empty. Throw the Illegal Argument Runtime Exception if True.
            if((name1.isEmpty()) || (name2.isEmpty())) throw new IllegalArgumentException("Name cannot be an Empty String");


            return name1 + "&" + name2;
        }


        // Add Liquid Capacities Method
        public double mergeLiquids(double amount1, double amount2)
        {

            // Check if Capacity are Valid Non-Negative Values. Throw the Illegal Argument Runtime Exception if True.
            if((amount1  < 0.0000001) || (amount2  < 0.0000001)) throw new IllegalArgumentException("Capacity cannot be Negative");


            return amount1 + amount2;
        }
    }

    public static void main(String[] args) {

        Juice orange_juice = new Juice("Orange", 1.0);
        Juice apple_juice = new Juice("Apple", 2.5);
        Juice orangeApple = new Juice(orange_juice, apple_juice);
        System.out.println(orangeApple.getName());
        System.out.println(orangeApple.getCapacity());

    }
}
