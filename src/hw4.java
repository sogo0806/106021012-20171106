
import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int x = sca.nextInt();
        int y = sca.nextInt();
        switch (x){
            case 1:
                if (y>=21&&y<=31){
                    System.out.println("Aquarius");
                }
                if (y<=20){
                    System.out.println("Capricorn");
                }
                break;
            case 2:
                if (y<=18){
                    System.out.println("Aquarius");
                }
                if (y>=19&&y<=28){
                    System.out.println("Pisces");
                }
                break;
            case 3:
                if (y<=20){
                    System.out.println("Pisces");
                }
                if (y>=21&&y<=31){
                    System.out.println("Aries");
                }
                break;
            case 4:
                if (y<=20){
                    System.out.println("Aries");
                }
                if (y>=21&&y<=30){
                    System.out.println("Taurus");
                }
                break;
            case 5:
                if (y<=21){
                    System.out.println("Taurus");
                }
                if (y>=22&&y<=31){
                    System.out.println("Gemini");
                }
                break;
            case 6:
                if (y<=21){
                    System.out.println("Gemini");
                }
                if (y>=22&&y<=30){
        System.out.println("Cancer");
        }
        break;
        case 7:
        if (y<=22){
        System.out.println("Cancer");
        }
        if (y>=23&&y<=31){
        System.out.println("Leo");
        }
        break;
        case 8:
        if (y<=23){
        System.out.println("Leo");
        }
        if (y>=24&&y<=31){
        System.out.println("Virgo");
        }
        break;
        case 9:
        if (y<=23){
        System.out.println("Virgo");
        }
        if (y>=24&&y<=30){
        System.out.println("Libra");
        }
        break;
        case 10:
        if (y<=23){
        System.out.println("Libra");
        }
        if (y>=24&&y<=31){
        System.out.println("Scorpio");
        }
        break;
        case 11:
        if (y<=22){
        System.out.println("Scorpio");
        }
        if (y>=23&&y<=30){
        System.out.println("Sagittarius");
        }
        break;
        case 12:
        if (y<=21){
        System.out.println("Sagittarius");
        }
        if (y>=22&&y<=31){
        System.out.println("Capricorn");
        }
        }

        }
        }