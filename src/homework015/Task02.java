package homework015;

/**
 * FileName: Task01
 * Author:   Andriy Vulook
 * Date:     05.03.2023 01:51
 * Description: ClassRoom and Pupil
 */

class Pupil {
    public void study() {
        System.out.println("Pupil studies.");
    }

    public void read() {
        System.out.println("Pupil reads.");
    }

    public void write() {
        System.out.println("Pupil writes.");
    }

    public void relax() {
        System.out.println("Pupil relaxes.");
    }
}

class ExcellentPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("Excellent Pupil studies very well.");
    }

    @Override
    public void read() {
        System.out.println("Excellent Pupil reads very well.");
    }

    @Override
    public void write() {
        System.out.println("Excellent Pupil writes very well.");
    }

    @Override
    public void relax() {
        System.out.println("Excellent Pupil relaxes very rarely.");
    }
}

class GoodPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("Good Pupil studies well.");
    }

    @Override
    public void read() {
        System.out.println("Good Pupil reads well.");
    }

    @Override
    public void write() {
        System.out.println("Good Pupil writes well.");
    }

    @Override
    public void relax() {
        System.out.println("Good Pupil relaxes sometimes.");
    }
}


class BadPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("Bad Pupil hardly studies.");
    }

    @Override
    public void read() {
        System.out.println("Bad Pupil hardly reads.");
    }

    @Override
    public void write() {
        System.out.println("Bad Pupil hardly writes.");
    }

    @Override
    public void relax() {
        System.out.println("Bad Pupil relaxes too much.");
    }

}

class ClassRoom {
    protected Pupil pup1;
    protected Pupil pup2;
    protected Pupil pup3;
    protected Pupil pup4;

    public ClassRoom(Pupil pup1, Pupil pup2) {
        this.pup1 = pup1;
        this.pup2 = pup2;
        this.pup3 = new Pupil();
        this.pup4 = new Pupil();
    }

    public ClassRoom(Pupil pup1, Pupil pup2, Pupil pup3) {
        this.pup1 = pup1;
        this.pup2 = pup2;
        this.pup3 = pup3;
        this.pup4 = new Pupil();
    }

    public ClassRoom(Pupil pup1, Pupil pup2, Pupil pup3, Pupil pup4) {
        this.pup1 = pup1;
        this.pup2 = pup2;
        this.pup3 = pup3;
        this.pup4 = pup4;
    }

    public void study() {
        System.out.print("1. ");
        pup1.study();
        System.out.print("2. ");
        pup2.study();
        System.out.print("3. ");
        pup3.study();
        System.out.print("4. ");
        pup4.study();
    }

    public void read() {
        System.out.print("1. ");
        pup1.read();
        System.out.print("2. ");
        pup2.read();
        System.out.print("3. ");
        pup3.read();
        System.out.print("4. ");
        pup4.read();
    }

    public void write() {
        System.out.print("1. ");
        pup1.write();
        System.out.print("2. ");
        pup2.write();
        System.out.print("3. ");
        pup3.write();
        System.out.print("4. ");
        pup4.write();
    }

    public void relax() {
        System.out.print("1. ");
        pup1.relax();
        System.out.print("2. ");
        pup2.relax();
        System.out.print("3. ");
        pup3.relax();
        System.out.print("4. ");
        pup4.relax();
    }

}

public class Task02 {

    public static void main(String[] args) {

        Pupil pupil1 = new ExcellentPupil();
        Pupil pupil2 = new GoodPupil();
        Pupil pupil3 = new GoodPupil();
        Pupil pupil4 = new BadPupil();

        System.out.println(pupil1.toString());

        ClassRoom classRoom1 = new ClassRoom(pupil1, pupil2, pupil3, pupil4);
        System.out.println("\n-------------------------------------");
        System.out.println("A class №1 (average grades)");
        classRoom1.study();
        classRoom1.read();
        classRoom1.write();
        classRoom1.relax();

        ClassRoom classRoom2 = new ClassRoom(pupil2, pupil2, pupil3);
        System.out.println("\n-------------------------------------");
        System.out.println("A class №2 (excellent grades)");
        classRoom2.study();
        classRoom2.read();
        classRoom2.write();
        classRoom2.relax();

        ClassRoom classRoom3 = new ClassRoom(pupil4, pupil4);
        System.out.println("\n-------------------------------------");
        System.out.println("A class №3 (low grades)");
        classRoom3.study();
        classRoom3.read();
        classRoom3.write();
        classRoom3.relax();
    }

}
