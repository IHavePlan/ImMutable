public class Main {
    public static void main(String[] arg){
        DogImm dog1 = new DogImm("Собака",15);
        System.out.println(dog1);

        DogMut dog2 = new DogMut();
        dog2.setAge(23);
        dog2.setName("Другая собака");
        System.out.println(dog2);
    }
}
