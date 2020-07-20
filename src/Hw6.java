public class Hw6 {

    static class Animal {

        public String name;
        public int run;

        public Animal() {
        }

        public Animal(String name) {
            this.name = name;
        }

        public void animalInfo() {
            System.out.println();

        }
    }

    static class Cat extends Animal {

        protected boolean sweem;
        int jump;


        public Cat(String name, int run, boolean sweem, int jump) {
            this.name = name;
            this.run = run;
            this.sweem = sweem;
            this.jump = jump;
        }


        public void catInfo() {
            System.out.println("CatName: " + name + " /RunLimit: " + run + " meters/" + " /Sweem:" + sweem + " /Jump: " + jump + " meters/");
        }
    }

    static class Dog extends Animal {

        public double jump;
        public int sweem;

        public Dog(String name, int run, int sweem, double jump) {
            this.name = name;
            this.run = run;
            this.sweem = sweem;
            this.jump = jump;
        }

        public void dogInfo() {
            System.out.println("DogName: " + name + " /RunLimit: " + run + " meters/" + " /Sweem:" + sweem + " /Jump: " + jump + " meters/");
        }
    }

    public static class Main {
        public static void main(String[] args) {

            Animal animal = new Animal("CatsCategory");
            Cat cat = new Cat("Barsik", 200, false, 2);
            animal.animalInfo();
            cat.animalInfo();
            cat.catInfo();

            Animal danimal = new Animal("Dogs");
            Dog dog = new Dog("Sharik", 500, 10, 0.5);
            danimal.animalInfo();
            dog.animalInfo();
            dog.dogInfo();

        }
    }
}