import java.util.Random;

public class Main {


    public static void main(String[] args) {

        System.out.println(ageOfHuman(27,25));
        System.out.println(ageOfHuman(50, 40));
        System.out.println(ageOfHuman(43, 48));
        System.out.println(ageOfHuman(20,16));
        System.out.println(ageOfHuman(18,54));

        System.out.println(ageOfHuman(-10, generateRandomAge()));

    }


    public static String ageOfHuman(int temperature, int age){
     if(age > 19 && age < 45 && temperature > -19 && temperature < 30) {
         return "1 Можно идти гулять!";
     }else if (age < 20  && temperature >= 0 && temperature < 28){
         return "2 Можно идти гулять!";
     }else if (age > 45 && temperature >= -10 && temperature < 25){
         return "3 Можно идти гулять!";
     }else {
         return "Оставайтесь дома!";
     }


    }


    public static int generateRandomAge(){
        Random random = new Random();

        return random.nextInt(80);
    }


}