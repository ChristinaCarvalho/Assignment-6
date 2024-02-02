public class Animal {

    public void isMammal() {
        System.out.println("This is the public method: isMammal() from class Animal");
    }
    
    public void mate(){
        System.out.println("This is the public method: mate() from class Animal");
    }    

    public static void main(String[] args) throws Exception {
        int age;
        String gender;

        Animal myAnimal = new Animal();
        Fish myFish = new Fish();
        Zebra myZebra = new Zebra();

        myAnimal.isMammal();
        myAnimal.mate();
        myZebra.run();        
    }
}
