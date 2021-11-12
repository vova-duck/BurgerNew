package HomeWork11;

public class Burger {
public String type = "Burger";
    public String bun = "bun";
    public String cheese = "cheese";
    public int cutlet = 1;
    public int souse ;
    public String green = "green";


        public Burger() {
            this.type = "Low calories burger";

        }




    public Burger(int souse){
        this.type = "Basic burger";
        this.bun = "bun";
        this.cheese = "cheese";
        this.cutlet = 1;
        this.souse = souse;
        this.green = "green";



    }
    public Burger ( int souse,int cutlet){
        this.type = "Custom meat burger";
        this.bun = "buns";
        this.cheese = "cheese";
        this.cutlet = cutlet;
        this.souse = souse;
        this.green = "green";


    }



        @Override
        public String toString() {
            return this.type + " consists of " + this.bun + " " + "" + this.cheese + " "+ this.cutlet + " cutlet " +" and " +  this.souse + " portion of secret souse";
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Burger)) {
                return false;
            }
            Burger burger = (Burger) obj;
          return   this.cutlet==burger.cutlet&&this.souse==burger.souse;

        }
    }



