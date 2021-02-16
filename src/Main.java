import kg.megacom.VolumeOfCylinder;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VolumeOfCylinder volumeOfCylinder1 = new VolumeOfCylinder(3,11);
        VolumeOfCylinder volumeOfCylinder2 = new VolumeOfCylinder(-6,11);
        VolumeOfCylinder volumeOfCylinder3 = new VolumeOfCylinder(11,11);
        VolumeOfCylinder volumeOfCylinder4 = new VolumeOfCylinder(-5,11);
        VolumeOfCylinder volumeOfCylinder5 = new VolumeOfCylinder(22,11);

        ArrayList<VolumeOfCylinder> arrayList = new ArrayList<>();
        arrayList.add(volumeOfCylinder1);
        arrayList.add(volumeOfCylinder2);
        arrayList.add(volumeOfCylinder3);
        arrayList.add(volumeOfCylinder4);
        arrayList.add(volumeOfCylinder5);

        for (VolumeOfCylinder s : arrayList) {
            System.out.println(s.m3());
        }
    }
}