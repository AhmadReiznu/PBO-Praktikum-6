public class praktikum_6_no_2 {
    public static void main(String[] args) {

        System.out.println("=== Pesawat ===");
        Flyer airplane = new Airplane();
        System.out.println(airplane.takeOff());
        System.out.println(airplane.land());
        System.out.println(airplane.fly());

        System.out.println("\n=== Burung ===");
        Flyer bird = new Bird();
        System.out.println(bird.takeOff());
        System.out.println(bird.land());
        System.out.println(bird.fly());
        System.out.println(((Bird) bird).buildNest());
        System.out.println(((Bird) bird).layEggs());

        System.out.println("\n=== Superman ===");
        Flyer superman = new Superman();
        System.out.println(superman.takeOff());
        System.out.println(superman.land());
        System.out.println(superman.fly());
        System.out.println(((Superman) superman).leapBuilding());
        System.out.println(((Superman) superman).stopBullet());

    }
}

interface Flyer{
    String takeOff();
    String land();
    String fly();
}

class Airplane implements Flyer {

    @Override
    public String takeOff() {
        return "+ Pesawat Lepas Landas Dari Bandara Surabaya Ke Bandara Singapore";
    }

    @Override
    public String land() {
        return "+ Pesawat Berhasil Mendarat Di Bandara Singapore";
    }

    @Override
    public String fly() {
        return "+ Pesawat Terbang Selama 3 Jam";
    }
}

class Bird implements Flyer{

    @Override
    public String takeOff() {
        return "+ Burung Elang Terbang Dari Ketinggian 1000 Meter Diatas Permukaan Laut";
    }

    @Override
    public String land() {
        return "+ Burung Elang Mendarat Tepat Pada Batang Pohon";
    }

    @Override
    public String fly() {
        return "+ Burung Elang Terbang Selama 1 Jam";
    }

    public String buildNest() {
        return "+ Burung Elang Membangun Sarangnya Di Bukit";
    }

    public String layEggs() {
        return "+ Burung Elang Mengerami Telurnya";
    }
}

class Superman implements Flyer {

    @Override
    public String takeOff() {
        return "+ Superman Terbang Dengan Sangat Cepat Menuju Tempat Terjadinya Perampokan";
    }

    @Override
    public String land() {
        return "+ Superman Mendarat Di Tempat Terjadinya Perampokan";
    }

    @Override
    public String fly() {
        return "+ Superman Terbang Dengan Kecepatan 100 Km/jam";
    }

    public String leapBuilding() {
        return "+ Superman Terbang Melewati Banyak Gedung Tinggi";
    }

    public String stopBullet() {
        return "+ Superman Tidak Bisa Ditembak Peluru";
    }
}
