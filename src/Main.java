public class Main {
    public static void main(String[] args) {
        var box1 = 78.2;
        System.out.println ("вес 1го боксера " + box1  +  " кг");
        var box2 = 82.7;
        System.out.println ("вес 2го боксера " + box2  +  " кг");
        var allBox = box1 + box2;
        System.out.println ("вес 2х боксеров " + allBox  +  " кг");
        var raznica = box2 - box1;
        System.out.println ("разница между боксерами " + raznica  +  " кг");
        var sootnosh = (box2-box1) * 100 / box1;
        System.out.println ("разница между боксерами " + sootnosh + " %");

        var vsegoChasov = 640;
        System.out.println ("всего часов " + vsegoChasov);
        var kagdii = 8;
        System.out.println ("каждый работает " + kagdii + " часов");
        var vsego = vsegoChasov / kagdii;
        System.out.println ("всего работников " + vsego);


        var dopRab = vsego + 94;
        System.out.println ("стало работников " + dopRab);
        var vsegoChasov2 = dopRab * kagdii;
        System.out.println ("Если в компании работает " + dopRab + " человека," + " то " + vsegoChasov2 + " часа надо поделить между работниками");
    }
}